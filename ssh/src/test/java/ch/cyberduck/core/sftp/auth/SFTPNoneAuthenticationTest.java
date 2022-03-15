package ch.cyberduck.core.sftp.auth;

/*
 * Copyright (c) 2002-2017 iterate GmbH. All rights reserved.
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

import ch.cyberduck.core.DisabledCancelCallback;
import ch.cyberduck.core.DisabledLoginCallback;
import ch.cyberduck.core.exception.LoginFailureException;
import ch.cyberduck.core.sftp.AbstractSFTPTest;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class SFTPNoneAuthenticationTest extends AbstractSFTPTest {

    @Test(expected = LoginFailureException.class)
    @Ignore
    public void testAuthenticate() throws Exception {
        assertFalse(new SFTPNoneAuthentication(session.getClient()).authenticate(session.getHost(), new DisabledLoginCallback(), new DisabledCancelCallback()));
    }
}
