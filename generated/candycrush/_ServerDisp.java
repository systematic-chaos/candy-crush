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

public abstract class _ServerDisp extends Ice.ObjectImpl implements Server {
	protected void ice_copyStateFrom(Ice.Object __obj)
			throws java.lang.CloneNotSupportedException {
		throw new java.lang.CloneNotSupportedException();
	}

	public static final String[] __ids = { "::Ice::Object",
			"::candycrush::Server" };

	public boolean ice_isA(String s) {
		return java.util.Arrays.binarySearch(__ids, s) >= 0;
	}

	public boolean ice_isA(String s, Ice.Current __current) {
		return java.util.Arrays.binarySearch(__ids, s) >= 0;
	}

	public String[] ice_ids() {
		return __ids;
	}

	public String[] ice_ids(Ice.Current __current) {
		return __ids;
	}

	public String ice_id() {
		return __ids[1];
	}

	public String ice_id(Ice.Current __current) {
		return __ids[1];
	}

	public static String ice_staticId() {
		return __ids[1];
	}

	public final boolean joinTeam(Ice.Identity id, String nick, int team) {
		return joinTeam(id, nick, team, null);
	}

	public final void leaveGame(Ice.Identity id) {
		leaveGame(id, null);
	}

	public final void message(Ice.Identity id, String msg) {
		message(id, msg, null);
	}

	public final void movementProposal(Ice.Identity id, Movement mov) {
		movementProposal(id, mov, null);
	}

	public final void teamComplete(Ice.Identity id) {
		teamComplete(id, null);
	}

	public static Ice.DispatchStatus ___joinTeam(Server __obj,
			IceInternal.Incoming __inS, Ice.Current __current) {
		__checkMode(Ice.OperationMode.Normal, __current.mode);
		IceInternal.BasicStream __is = __inS.startReadParams();
		Ice.Identity id;
		String nick;
		int team;
		id = new Ice.Identity();
		id.__read(__is);
		nick = __is.readString();
		team = __is.readInt();
		__inS.endReadParams();
		boolean __ret = __obj.joinTeam(id, nick, team, __current);
		IceInternal.BasicStream __os = __inS
				.__startWriteParams(Ice.FormatType.DefaultFormat);
		__os.writeBool(__ret);
		__inS.__endWriteParams(true);
		return Ice.DispatchStatus.DispatchOK;
	}

	public static Ice.DispatchStatus ___teamComplete(Server __obj,
			IceInternal.Incoming __inS, Ice.Current __current) {
		__checkMode(Ice.OperationMode.Idempotent, __current.mode);
		IceInternal.BasicStream __is = __inS.startReadParams();
		Ice.Identity id;
		id = new Ice.Identity();
		id.__read(__is);
		__inS.endReadParams();
		__obj.teamComplete(id, __current);
		__inS.__writeEmptyParams();
		return Ice.DispatchStatus.DispatchOK;
	}

	public static Ice.DispatchStatus ___movementProposal(Server __obj,
			IceInternal.Incoming __inS, Ice.Current __current) {
		__checkMode(Ice.OperationMode.Normal, __current.mode);
		IceInternal.BasicStream __is = __inS.startReadParams();
		Ice.Identity id;
		Movement mov;
		id = new Ice.Identity();
		id.__read(__is);
		mov = new Movement();
		mov.__read(__is);
		__inS.endReadParams();
		__obj.movementProposal(id, mov, __current);
		__inS.__writeEmptyParams();
		return Ice.DispatchStatus.DispatchOK;
	}

	public static Ice.DispatchStatus ___message(Server __obj,
			IceInternal.Incoming __inS, Ice.Current __current) {
		__checkMode(Ice.OperationMode.Normal, __current.mode);
		IceInternal.BasicStream __is = __inS.startReadParams();
		Ice.Identity id;
		String msg;
		id = new Ice.Identity();
		id.__read(__is);
		msg = __is.readString();
		__inS.endReadParams();
		__obj.message(id, msg, __current);
		__inS.__writeEmptyParams();
		return Ice.DispatchStatus.DispatchOK;
	}

	public static Ice.DispatchStatus ___leaveGame(Server __obj,
			IceInternal.Incoming __inS, Ice.Current __current) {
		__checkMode(Ice.OperationMode.Normal, __current.mode);
		IceInternal.BasicStream __is = __inS.startReadParams();
		Ice.Identity id;
		id = new Ice.Identity();
		id.__read(__is);
		__inS.endReadParams();
		__obj.leaveGame(id, __current);
		__inS.__writeEmptyParams();
		return Ice.DispatchStatus.DispatchOK;
	}

	private final static String[] __all = { "ice_id", "ice_ids", "ice_isA",
			"ice_ping", "joinTeam", "leaveGame", "message", "movementProposal",
			"teamComplete" };

	public Ice.DispatchStatus __dispatch(IceInternal.Incoming in,
			Ice.Current __current) {
		int pos = java.util.Arrays.binarySearch(__all, __current.operation);
		if (pos < 0) {
			throw new Ice.OperationNotExistException(__current.id,
					__current.facet, __current.operation);
		}

		switch (pos) {
		case 0: {
			return ___ice_id(this, in, __current);
		}
		case 1: {
			return ___ice_ids(this, in, __current);
		}
		case 2: {
			return ___ice_isA(this, in, __current);
		}
		case 3: {
			return ___ice_ping(this, in, __current);
		}
		case 4: {
			return ___joinTeam(this, in, __current);
		}
		case 5: {
			return ___leaveGame(this, in, __current);
		}
		case 6: {
			return ___message(this, in, __current);
		}
		case 7: {
			return ___movementProposal(this, in, __current);
		}
		case 8: {
			return ___teamComplete(this, in, __current);
		}
		}

		assert (false);
		throw new Ice.OperationNotExistException(__current.id, __current.facet,
				__current.operation);
	}

	protected void __writeImpl(IceInternal.BasicStream __os) {
		__os.startWriteSlice(ice_staticId(), -1, true);
		__os.endWriteSlice();
	}

	protected void __readImpl(IceInternal.BasicStream __is) {
		__is.startReadSlice();
		__is.endReadSlice();
	}

	public static final long serialVersionUID = 0L;
}
