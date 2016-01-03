// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `CandyCrush.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package candycrush;

public final class BoardMatrixHelper {
	public static void write(IceInternal.BasicStream __os, int[][] __v) {
		if (__v == null) {
			__os.writeSize(0);
		} else {
			__os.writeSize(__v.length);
			for (int __i0 = 0; __i0 < __v.length; __i0++) {
				BoardArrayHelper.write(__os, __v[__i0]);
			}
		}
	}

	public static int[][] read(IceInternal.BasicStream __is) {
		int[][] __v;
		final int __len0 = __is.readAndCheckSeqSize(1);
		__v = new int[__len0][];
		for (int __i0 = 0; __i0 < __len0; __i0++) {
			__v[__i0] = BoardArrayHelper.read(__is);
		}
		return __v;
	}
}