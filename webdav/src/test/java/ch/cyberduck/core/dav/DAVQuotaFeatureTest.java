package ch.cyberduck.core.dav;

/*
 * Copyright (c) 2002-2016 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
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
 */

import ch.cyberduck.core.features.Quota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DAVQuotaFeatureTest extends AbstractDAVTest {

    @Test
    public void testGet() throws Exception {
        final Quota.Space quota = new DAVQuotaFeature(session).get();
        assertNotNull(quota);
        assertEquals(Long.MAX_VALUE, quota.available, 0L);
        assertEquals(0L, quota.used, 0L);
    }
}
