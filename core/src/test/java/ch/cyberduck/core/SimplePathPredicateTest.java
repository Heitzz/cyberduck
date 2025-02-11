package ch.cyberduck.core;

/*
 * Copyright (c) 2002-2017 iterate GmbH. All rights reserved.
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

import org.junit.Test;

import java.util.EnumSet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimplePathPredicateTest {

    @Test
    public void testPredicateTest() {
        final Path t = new Path("/f", EnumSet.of(Path.Type.file));
        assertTrue(new SimplePathPredicate(t).test(new Path("/f", EnumSet.of(Path.Type.file))));
        assertFalse(new SimplePathPredicate(t).test(new Path("/f/a", EnumSet.of(Path.Type.file))));
        assertFalse(new SimplePathPredicate(t).test(new Path("/f", EnumSet.of(Path.Type.directory))));
    }


    @Test
    public void testParent() {
        final Path t = new Path("/a/g/f-1", EnumSet.of(Path.Type.file));
        assertTrue(new SimplePathPredicate(t).isChild(new SimplePathPredicate(new Path("/a/g", EnumSet.of(Path.Type.file)))));
        assertTrue(new SimplePathPredicate(t).isChild(new SimplePathPredicate(new Path("/g", EnumSet.of(Path.Type.file)))));
        assertTrue(new SimplePathPredicate(t).isChild(new SimplePathPredicate(new Path("/", EnumSet.of(Path.Type.file)))));
        assertFalse(new SimplePathPredicate(t).isChild(new SimplePathPredicate(new Path("/a/g/f", EnumSet.of(Path.Type.file)))));
        assertFalse(new SimplePathPredicate(t).isChild(new SimplePathPredicate(new Path("/a/g/f-12", EnumSet.of(Path.Type.file)))));
        assertFalse(new SimplePathPredicate(t).isChild(new SimplePathPredicate(new Path("/a/g/a", EnumSet.of(Path.Type.file)))));
        assertFalse(new SimplePathPredicate(new Path("/", EnumSet.of(Path.Type.directory)))
                .isChild(new SimplePathPredicate(new Path("/", EnumSet.of(Path.Type.directory)))));
    }

    @Test
    public void testCollision() {
        final Path t = new Path("/d/2R", EnumSet.of(Path.Type.directory));
        assertFalse(new SimplePathPredicate(t).test(new Path("/d/33", EnumSet.of(Path.Type.directory))));
    }
}
