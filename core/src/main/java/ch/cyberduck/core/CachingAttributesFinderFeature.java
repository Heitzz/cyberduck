package ch.cyberduck.core;

/*
 * Copyright (c) 2002-2021 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.exception.NotfoundException;
import ch.cyberduck.core.features.AttributesFinder;
import ch.cyberduck.core.shared.ListFilteringFeature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CachingAttributesFinderFeature implements AttributesFinder {
    private static final Logger log = LogManager.getLogger(CachingAttributesFinderFeature.class);

    private final Cache<Path> cache;
    private final AttributesFinder delegate;

    public CachingAttributesFinderFeature(final Cache<Path> cache, final AttributesFinder delegate) {
        this.cache = cache;
        this.delegate = delegate;
    }

    @Override
    public PathAttributes find(final Path file, final ListProgressListener listener) throws BackgroundException {
        if(file.isRoot()) {
            return delegate.find(file, listener);
        }
        if(cache.isValid(file.getParent())) {
            final AttributedList<Path> list = cache.get(file.getParent());
            final Path found = list.find(new ListFilteringFeature.ListFilteringPredicate(Protocol.Case.sensitive, file));
            if(null != found) {
                if(log.isDebugEnabled()) {
                    log.debug(String.format("Return cached attributes %s for %s", found.attributes(), file));
                }
                return found.attributes();
            }
            if(log.isDebugEnabled()) {
                log.debug(String.format("Cached directory listing does not contain %s", file));
            }
            throw new NotfoundException(file.getAbsolute());
        }
        final CachingListProgressListener caching = new CachingListProgressListener(cache);
        try {
            return delegate.find(file, caching);
        }
        finally {
            caching.finish();
        }
    }
}
