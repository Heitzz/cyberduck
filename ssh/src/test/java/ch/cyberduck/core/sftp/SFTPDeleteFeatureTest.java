package ch.cyberduck.core.sftp;

/*
 * Copyright (c) 2002-2013 David Kocher. All rights reserved.
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
 * Bug fixes, suggestions and comments should be sent to feedback@cyberduck.ch
 */

import ch.cyberduck.core.DisabledLoginCallback;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.exception.NotfoundException;
import ch.cyberduck.core.features.Delete;
import ch.cyberduck.core.transfer.TransferStatus;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class SFTPDeleteFeatureTest extends AbstractSFTPTest {

    @Test(expected = NotfoundException.class)
    public void testDeleteNotFound() throws Exception {
        final Path test = new Path(new SFTPHomeDirectoryService(session).find(), "t", EnumSet.of(Path.Type.file));
        try {
            new SFTPDeleteFeature(session).delete(Collections.singletonList(test), new DisabledLoginCallback(), new Delete.DisabledCallback());
        }
        catch(NotfoundException e) {
            assertEquals("Cannot delete t.", e.getMessage());
            throw e;
        }

    }

    @Test
    public void testDeleteFolder() throws Exception {
        final Path folder = new Path(new SFTPHomeDirectoryService(session).find(), UUID.randomUUID().toString(), EnumSet.of(Path.Type.directory));
        new SFTPDirectoryFeature(session).mkdir(folder, new TransferStatus());
        final Path file = new Path(folder, UUID.randomUUID().toString(), EnumSet.of(Path.Type.file));
        new SFTPTouchFeature(session).touch(file, new TransferStatus());
        final Path subdir = new Path(folder, UUID.randomUUID().toString(), EnumSet.of(Path.Type.directory));
        new SFTPDirectoryFeature(session).mkdir(subdir, new TransferStatus());
        new SFTPDeleteFeature(session).delete(Arrays.asList(subdir, file, folder), new DisabledLoginCallback(), new Delete.DisabledCallback());
    }
}
