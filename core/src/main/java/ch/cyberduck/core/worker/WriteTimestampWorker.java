package ch.cyberduck.core.worker;

/*
 * Copyright (c) 2013 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to:
 * feedback@cyberduck.ch
 */

import ch.cyberduck.core.LocaleFactory;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.Session;
import ch.cyberduck.core.UserDateFormatterFactory;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.Timestamp;
import ch.cyberduck.core.transfer.TransferStatus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.MessageFormat;
import java.util.Objects;

public class WriteTimestampWorker extends Worker<Boolean> {
    private static final Logger log = LogManager.getLogger(WriteTimestampWorker.class);

    private final Path file;
    private final Long timestamp;

    public WriteTimestampWorker(final Path file, final Long timestamp) {
        this.file = file;
        this.timestamp = timestamp;
    }

    @Override
    public Boolean run(final Session<?> session) throws BackgroundException {
        final Timestamp feature = session.getFeature(Timestamp.class);
        if(log.isDebugEnabled()) {
            log.debug(String.format("Run with feature %s", feature));
        }
        feature.setTimestamp(file, new TransferStatus().withTimestamp(timestamp).withLockId(this.getLockId(file)));
        return true;
    }

    protected String getLockId(final Path file) {
        return null;
    }

    @Override
    public String getActivity() {
        return MessageFormat.format(LocaleFactory.localizedString("Changing timestamp of {0} to {1}", "Status"),
            file.getName(), UserDateFormatterFactory.get().getShortFormat(timestamp));
    }

    @Override
    public Boolean initialize() {
        return false;
    }

    @Override
    public boolean equals(final Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        final WriteTimestampWorker that = (WriteTimestampWorker) o;
        return Objects.equals(file, that.file) &&
            Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, timestamp);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WriteTimestampWorker{");
        sb.append("file=").append(file);
        sb.append(", timestamp=").append(timestamp);
        sb.append('}');
        return sb.toString();
    }

}
