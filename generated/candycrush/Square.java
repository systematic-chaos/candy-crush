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

public class Square implements java.lang.Cloneable, java.io.Serializable {
	public int row;

	public int column;

	public int value;

	public Square() {
	}

	public Square(int row, int column, int value) {
		this.row = row;
		this.column = column;
		this.value = value;
	}

	public boolean equals(java.lang.Object rhs) {
		if (this == rhs) {
			return true;
		}
		Square _r = null;
		if (rhs instanceof Square) {
			_r = (Square) rhs;
		}

		if (_r != null) {
			if (row != _r.row) {
				return false;
			}
			if (column != _r.column) {
				return false;
			}
			if (value != _r.value) {
				return false;
			}

			return true;
		}

		return false;
	}

	public int hashCode() {
		int __h = 5381;
		__h = IceInternal.HashUtil.hashAdd(__h, "::candycrush::Square");
		__h = IceInternal.HashUtil.hashAdd(__h, row);
		__h = IceInternal.HashUtil.hashAdd(__h, column);
		__h = IceInternal.HashUtil.hashAdd(__h, value);
		return __h;
	}

	public java.lang.Object clone() {
		java.lang.Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException ex) {
			assert false; // impossible
		}
		return o;
	}

	public void __write(IceInternal.BasicStream __os) {
		__os.writeInt(row);
		__os.writeInt(column);
		__os.writeInt(value);
	}

	public void __read(IceInternal.BasicStream __is) {
		row = __is.readInt();
		column = __is.readInt();
		value = __is.readInt();
	}

	public static final long serialVersionUID = 1133398356L;
}
