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

public final class ServerPrxHelper extends Ice.ObjectPrxHelperBase implements
		ServerPrx {
	private static final String __joinTeam_name = "joinTeam";

	public boolean joinTeam(Ice.Identity id, String nick, int team) {
		return joinTeam(id, nick, team, null, false);
	}

	public boolean joinTeam(Ice.Identity id, String nick, int team,
			java.util.Map<String, String> __ctx) {
		return joinTeam(id, nick, team, __ctx, true);
	}

	private boolean joinTeam(Ice.Identity id, String nick, int team,
			java.util.Map<String, String> __ctx, boolean __explicitCtx) {
		if (__explicitCtx && __ctx == null) {
			__ctx = _emptyContext;
		}
		final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper
				.get(this, "joinTeam", __ctx);
		int __cnt = 0;
		try {
			while (true) {
				Ice._ObjectDel __delBase = null;
				try {
					__checkTwowayOnly("joinTeam");
					__delBase = __getDelegate(false);
					_ServerDel __del = (_ServerDel) __delBase;
					return __del.joinTeam(id, nick, team, __ctx, __observer);
				} catch (IceInternal.LocalExceptionWrapper __ex) {
					__handleExceptionWrapper(__delBase, __ex, __observer);
				} catch (Ice.LocalException __ex) {
					__cnt = __handleException(__delBase, __ex, null, __cnt,
							__observer);
				}
			}
		} finally {
			if (__observer != null) {
				__observer.detach();
			}
		}
	}

	public Ice.AsyncResult begin_joinTeam(Ice.Identity id, String nick, int team) {
		return begin_joinTeam(id, nick, team, null, false, null);
	}

	public Ice.AsyncResult begin_joinTeam(Ice.Identity id, String nick,
			int team, java.util.Map<String, String> __ctx) {
		return begin_joinTeam(id, nick, team, __ctx, true, null);
	}

	public Ice.AsyncResult begin_joinTeam(Ice.Identity id, String nick,
			int team, Ice.Callback __cb) {
		return begin_joinTeam(id, nick, team, null, false, __cb);
	}

	public Ice.AsyncResult begin_joinTeam(Ice.Identity id, String nick,
			int team, java.util.Map<String, String> __ctx, Ice.Callback __cb) {
		return begin_joinTeam(id, nick, team, __ctx, true, __cb);
	}

	public Ice.AsyncResult begin_joinTeam(Ice.Identity id, String nick,
			int team, Callback_Server_joinTeam __cb) {
		return begin_joinTeam(id, nick, team, null, false, __cb);
	}

	public Ice.AsyncResult begin_joinTeam(Ice.Identity id, String nick,
			int team, java.util.Map<String, String> __ctx,
			Callback_Server_joinTeam __cb) {
		return begin_joinTeam(id, nick, team, __ctx, true, __cb);
	}

	private Ice.AsyncResult begin_joinTeam(Ice.Identity id, String nick,
			int team, java.util.Map<String, String> __ctx,
			boolean __explicitCtx, IceInternal.CallbackBase __cb) {
		__checkAsyncTwowayOnly(__joinTeam_name);
		IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(
				this, __joinTeam_name, __cb);
		try {
			__result.__prepare(__joinTeam_name, Ice.OperationMode.Normal,
					__ctx, __explicitCtx);
			IceInternal.BasicStream __os = __result
					.__startWriteParams(Ice.FormatType.DefaultFormat);
			id.__write(__os);
			__os.writeString(nick);
			__os.writeInt(team);
			__result.__endWriteParams();
			__result.__send(true);
		} catch (Ice.LocalException __ex) {
			__result.__exceptionAsync(__ex);
		}
		return __result;
	}

	public boolean end_joinTeam(Ice.AsyncResult __result) {
		Ice.AsyncResult.__check(__result, this, __joinTeam_name);
		boolean __ok = __result.__wait();
		try {
			if (!__ok) {
				try {
					__result.__throwUserException();
				} catch (Ice.UserException __ex) {
					throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
				}
			}
			IceInternal.BasicStream __is = __result.__startReadParams();
			boolean __ret;
			__ret = __is.readBool();
			__result.__endReadParams();
			return __ret;
		} catch (Ice.LocalException ex) {
			Ice.Instrumentation.InvocationObserver __obsv = __result
					.__getObserver();
			if (__obsv != null) {
				__obsv.failed(ex.ice_name());
			}
			throw ex;
		}
	}

	private static final String __leaveGame_name = "leaveGame";

	public void leaveGame(Ice.Identity id) {
		leaveGame(id, null, false);
	}

	public void leaveGame(Ice.Identity id, java.util.Map<String, String> __ctx) {
		leaveGame(id, __ctx, true);
	}

	private void leaveGame(Ice.Identity id,
			java.util.Map<String, String> __ctx, boolean __explicitCtx) {
		if (__explicitCtx && __ctx == null) {
			__ctx = _emptyContext;
		}
		final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper
				.get(this, "leaveGame", __ctx);
		int __cnt = 0;
		try {
			while (true) {
				Ice._ObjectDel __delBase = null;
				try {
					__delBase = __getDelegate(false);
					_ServerDel __del = (_ServerDel) __delBase;
					__del.leaveGame(id, __ctx, __observer);
					return;
				} catch (IceInternal.LocalExceptionWrapper __ex) {
					__handleExceptionWrapper(__delBase, __ex, __observer);
				} catch (Ice.LocalException __ex) {
					__cnt = __handleException(__delBase, __ex, null, __cnt,
							__observer);
				}
			}
		} finally {
			if (__observer != null) {
				__observer.detach();
			}
		}
	}

	public Ice.AsyncResult begin_leaveGame(Ice.Identity id) {
		return begin_leaveGame(id, null, false, null);
	}

	public Ice.AsyncResult begin_leaveGame(Ice.Identity id,
			java.util.Map<String, String> __ctx) {
		return begin_leaveGame(id, __ctx, true, null);
	}

	public Ice.AsyncResult begin_leaveGame(Ice.Identity id, Ice.Callback __cb) {
		return begin_leaveGame(id, null, false, __cb);
	}

	public Ice.AsyncResult begin_leaveGame(Ice.Identity id,
			java.util.Map<String, String> __ctx, Ice.Callback __cb) {
		return begin_leaveGame(id, __ctx, true, __cb);
	}

	public Ice.AsyncResult begin_leaveGame(Ice.Identity id,
			Callback_Server_leaveGame __cb) {
		return begin_leaveGame(id, null, false, __cb);
	}

	public Ice.AsyncResult begin_leaveGame(Ice.Identity id,
			java.util.Map<String, String> __ctx, Callback_Server_leaveGame __cb) {
		return begin_leaveGame(id, __ctx, true, __cb);
	}

	private Ice.AsyncResult begin_leaveGame(Ice.Identity id,
			java.util.Map<String, String> __ctx, boolean __explicitCtx,
			IceInternal.CallbackBase __cb) {
		IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(
				this, __leaveGame_name, __cb);
		try {
			__result.__prepare(__leaveGame_name, Ice.OperationMode.Normal,
					__ctx, __explicitCtx);
			IceInternal.BasicStream __os = __result
					.__startWriteParams(Ice.FormatType.DefaultFormat);
			id.__write(__os);
			__result.__endWriteParams();
			__result.__send(true);
		} catch (Ice.LocalException __ex) {
			__result.__exceptionAsync(__ex);
		}
		return __result;
	}

	public void end_leaveGame(Ice.AsyncResult __result) {
		__end(__result, __leaveGame_name);
	}

	private static final String __message_name = "message";

	public void message(Ice.Identity id, String msg) {
		message(id, msg, null, false);
	}

	public void message(Ice.Identity id, String msg,
			java.util.Map<String, String> __ctx) {
		message(id, msg, __ctx, true);
	}

	private void message(Ice.Identity id, String msg,
			java.util.Map<String, String> __ctx, boolean __explicitCtx) {
		if (__explicitCtx && __ctx == null) {
			__ctx = _emptyContext;
		}
		final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper
				.get(this, "message", __ctx);
		int __cnt = 0;
		try {
			while (true) {
				Ice._ObjectDel __delBase = null;
				try {
					__delBase = __getDelegate(false);
					_ServerDel __del = (_ServerDel) __delBase;
					__del.message(id, msg, __ctx, __observer);
					return;
				} catch (IceInternal.LocalExceptionWrapper __ex) {
					__handleExceptionWrapper(__delBase, __ex, __observer);
				} catch (Ice.LocalException __ex) {
					__cnt = __handleException(__delBase, __ex, null, __cnt,
							__observer);
				}
			}
		} finally {
			if (__observer != null) {
				__observer.detach();
			}
		}
	}

	public Ice.AsyncResult begin_message(Ice.Identity id, String msg) {
		return begin_message(id, msg, null, false, null);
	}

	public Ice.AsyncResult begin_message(Ice.Identity id, String msg,
			java.util.Map<String, String> __ctx) {
		return begin_message(id, msg, __ctx, true, null);
	}

	public Ice.AsyncResult begin_message(Ice.Identity id, String msg,
			Ice.Callback __cb) {
		return begin_message(id, msg, null, false, __cb);
	}

	public Ice.AsyncResult begin_message(Ice.Identity id, String msg,
			java.util.Map<String, String> __ctx, Ice.Callback __cb) {
		return begin_message(id, msg, __ctx, true, __cb);
	}

	public Ice.AsyncResult begin_message(Ice.Identity id, String msg,
			Callback_Server_message __cb) {
		return begin_message(id, msg, null, false, __cb);
	}

	public Ice.AsyncResult begin_message(Ice.Identity id, String msg,
			java.util.Map<String, String> __ctx, Callback_Server_message __cb) {
		return begin_message(id, msg, __ctx, true, __cb);
	}

	private Ice.AsyncResult begin_message(Ice.Identity id, String msg,
			java.util.Map<String, String> __ctx, boolean __explicitCtx,
			IceInternal.CallbackBase __cb) {
		IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(
				this, __message_name, __cb);
		try {
			__result.__prepare(__message_name, Ice.OperationMode.Normal, __ctx,
					__explicitCtx);
			IceInternal.BasicStream __os = __result
					.__startWriteParams(Ice.FormatType.DefaultFormat);
			id.__write(__os);
			__os.writeString(msg);
			__result.__endWriteParams();
			__result.__send(true);
		} catch (Ice.LocalException __ex) {
			__result.__exceptionAsync(__ex);
		}
		return __result;
	}

	public void end_message(Ice.AsyncResult __result) {
		__end(__result, __message_name);
	}

	private static final String __movementProposal_name = "movementProposal";

	public void movementProposal(Ice.Identity id, Movement mov) {
		movementProposal(id, mov, null, false);
	}

	public void movementProposal(Ice.Identity id, Movement mov,
			java.util.Map<String, String> __ctx) {
		movementProposal(id, mov, __ctx, true);
	}

	private void movementProposal(Ice.Identity id, Movement mov,
			java.util.Map<String, String> __ctx, boolean __explicitCtx) {
		if (__explicitCtx && __ctx == null) {
			__ctx = _emptyContext;
		}
		final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper
				.get(this, "movementProposal", __ctx);
		int __cnt = 0;
		try {
			while (true) {
				Ice._ObjectDel __delBase = null;
				try {
					__delBase = __getDelegate(false);
					_ServerDel __del = (_ServerDel) __delBase;
					__del.movementProposal(id, mov, __ctx, __observer);
					return;
				} catch (IceInternal.LocalExceptionWrapper __ex) {
					__handleExceptionWrapper(__delBase, __ex, __observer);
				} catch (Ice.LocalException __ex) {
					__cnt = __handleException(__delBase, __ex, null, __cnt,
							__observer);
				}
			}
		} finally {
			if (__observer != null) {
				__observer.detach();
			}
		}
	}

	public Ice.AsyncResult begin_movementProposal(Ice.Identity id, Movement mov) {
		return begin_movementProposal(id, mov, null, false, null);
	}

	public Ice.AsyncResult begin_movementProposal(Ice.Identity id,
			Movement mov, java.util.Map<String, String> __ctx) {
		return begin_movementProposal(id, mov, __ctx, true, null);
	}

	public Ice.AsyncResult begin_movementProposal(Ice.Identity id,
			Movement mov, Ice.Callback __cb) {
		return begin_movementProposal(id, mov, null, false, __cb);
	}

	public Ice.AsyncResult begin_movementProposal(Ice.Identity id,
			Movement mov, java.util.Map<String, String> __ctx, Ice.Callback __cb) {
		return begin_movementProposal(id, mov, __ctx, true, __cb);
	}

	public Ice.AsyncResult begin_movementProposal(Ice.Identity id,
			Movement mov, Callback_Server_movementProposal __cb) {
		return begin_movementProposal(id, mov, null, false, __cb);
	}

	public Ice.AsyncResult begin_movementProposal(Ice.Identity id,
			Movement mov, java.util.Map<String, String> __ctx,
			Callback_Server_movementProposal __cb) {
		return begin_movementProposal(id, mov, __ctx, true, __cb);
	}

	private Ice.AsyncResult begin_movementProposal(Ice.Identity id,
			Movement mov, java.util.Map<String, String> __ctx,
			boolean __explicitCtx, IceInternal.CallbackBase __cb) {
		IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(
				this, __movementProposal_name, __cb);
		try {
			__result.__prepare(__movementProposal_name,
					Ice.OperationMode.Normal, __ctx, __explicitCtx);
			IceInternal.BasicStream __os = __result
					.__startWriteParams(Ice.FormatType.DefaultFormat);
			id.__write(__os);
			mov.__write(__os);
			__result.__endWriteParams();
			__result.__send(true);
		} catch (Ice.LocalException __ex) {
			__result.__exceptionAsync(__ex);
		}
		return __result;
	}

	public void end_movementProposal(Ice.AsyncResult __result) {
		__end(__result, __movementProposal_name);
	}

	private static final String __teamComplete_name = "teamComplete";

	public void teamComplete(Ice.Identity id) {
		teamComplete(id, null, false);
	}

	public void teamComplete(Ice.Identity id,
			java.util.Map<String, String> __ctx) {
		teamComplete(id, __ctx, true);
	}

	private void teamComplete(Ice.Identity id,
			java.util.Map<String, String> __ctx, boolean __explicitCtx) {
		if (__explicitCtx && __ctx == null) {
			__ctx = _emptyContext;
		}
		final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper
				.get(this, "teamComplete", __ctx);
		int __cnt = 0;
		try {
			while (true) {
				Ice._ObjectDel __delBase = null;
				try {
					__delBase = __getDelegate(false);
					_ServerDel __del = (_ServerDel) __delBase;
					__del.teamComplete(id, __ctx, __observer);
					return;
				} catch (IceInternal.LocalExceptionWrapper __ex) {
					__cnt = __handleExceptionWrapperRelaxed(__delBase, __ex,
							null, __cnt, __observer);
				} catch (Ice.LocalException __ex) {
					__cnt = __handleException(__delBase, __ex, null, __cnt,
							__observer);
				}
			}
		} finally {
			if (__observer != null) {
				__observer.detach();
			}
		}
	}

	public Ice.AsyncResult begin_teamComplete(Ice.Identity id) {
		return begin_teamComplete(id, null, false, null);
	}

	public Ice.AsyncResult begin_teamComplete(Ice.Identity id,
			java.util.Map<String, String> __ctx) {
		return begin_teamComplete(id, __ctx, true, null);
	}

	public Ice.AsyncResult begin_teamComplete(Ice.Identity id, Ice.Callback __cb) {
		return begin_teamComplete(id, null, false, __cb);
	}

	public Ice.AsyncResult begin_teamComplete(Ice.Identity id,
			java.util.Map<String, String> __ctx, Ice.Callback __cb) {
		return begin_teamComplete(id, __ctx, true, __cb);
	}

	public Ice.AsyncResult begin_teamComplete(Ice.Identity id,
			Callback_Server_teamComplete __cb) {
		return begin_teamComplete(id, null, false, __cb);
	}

	public Ice.AsyncResult begin_teamComplete(Ice.Identity id,
			java.util.Map<String, String> __ctx,
			Callback_Server_teamComplete __cb) {
		return begin_teamComplete(id, __ctx, true, __cb);
	}

	private Ice.AsyncResult begin_teamComplete(Ice.Identity id,
			java.util.Map<String, String> __ctx, boolean __explicitCtx,
			IceInternal.CallbackBase __cb) {
		IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(
				this, __teamComplete_name, __cb);
		try {
			__result.__prepare(__teamComplete_name,
					Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
			IceInternal.BasicStream __os = __result
					.__startWriteParams(Ice.FormatType.DefaultFormat);
			id.__write(__os);
			__result.__endWriteParams();
			__result.__send(true);
		} catch (Ice.LocalException __ex) {
			__result.__exceptionAsync(__ex);
		}
		return __result;
	}

	public void end_teamComplete(Ice.AsyncResult __result) {
		__end(__result, __teamComplete_name);
	}

	public static ServerPrx checkedCast(Ice.ObjectPrx __obj) {
		ServerPrx __d = null;
		if (__obj != null) {
			if (__obj instanceof ServerPrx) {
				__d = (ServerPrx) __obj;
			} else {
				if (__obj.ice_isA(ice_staticId())) {
					ServerPrxHelper __h = new ServerPrxHelper();
					__h.__copyFrom(__obj);
					__d = __h;
				}
			}
		}
		return __d;
	}

	public static ServerPrx checkedCast(Ice.ObjectPrx __obj,
			java.util.Map<String, String> __ctx) {
		ServerPrx __d = null;
		if (__obj != null) {
			if (__obj instanceof ServerPrx) {
				__d = (ServerPrx) __obj;
			} else {
				if (__obj.ice_isA(ice_staticId(), __ctx)) {
					ServerPrxHelper __h = new ServerPrxHelper();
					__h.__copyFrom(__obj);
					__d = __h;
				}
			}
		}
		return __d;
	}

	public static ServerPrx checkedCast(Ice.ObjectPrx __obj, String __facet) {
		ServerPrx __d = null;
		if (__obj != null) {
			Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
			try {
				if (__bb.ice_isA(ice_staticId())) {
					ServerPrxHelper __h = new ServerPrxHelper();
					__h.__copyFrom(__bb);
					__d = __h;
				}
			} catch (Ice.FacetNotExistException ex) {
			}
		}
		return __d;
	}

	public static ServerPrx checkedCast(Ice.ObjectPrx __obj, String __facet,
			java.util.Map<String, String> __ctx) {
		ServerPrx __d = null;
		if (__obj != null) {
			Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
			try {
				if (__bb.ice_isA(ice_staticId(), __ctx)) {
					ServerPrxHelper __h = new ServerPrxHelper();
					__h.__copyFrom(__bb);
					__d = __h;
				}
			} catch (Ice.FacetNotExistException ex) {
			}
		}
		return __d;
	}

	public static ServerPrx uncheckedCast(Ice.ObjectPrx __obj) {
		ServerPrx __d = null;
		if (__obj != null) {
			if (__obj instanceof ServerPrx) {
				__d = (ServerPrx) __obj;
			} else {
				ServerPrxHelper __h = new ServerPrxHelper();
				__h.__copyFrom(__obj);
				__d = __h;
			}
		}
		return __d;
	}

	public static ServerPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet) {
		ServerPrx __d = null;
		if (__obj != null) {
			Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
			ServerPrxHelper __h = new ServerPrxHelper();
			__h.__copyFrom(__bb);
			__d = __h;
		}
		return __d;
	}

	public static final String[] __ids = { "::Ice::Object",
			"::candycrush::Server" };

	public static String ice_staticId() {
		return __ids[1];
	}

	protected Ice._ObjectDelM __createDelegateM() {
		return new _ServerDelM();
	}

	protected Ice._ObjectDelD __createDelegateD() {
		return new _ServerDelD();
	}

	public static void __write(IceInternal.BasicStream __os, ServerPrx v) {
		__os.writeProxy(v);
	}

	public static ServerPrx __read(IceInternal.BasicStream __is) {
		Ice.ObjectPrx proxy = __is.readProxy();
		if (proxy != null) {
			ServerPrxHelper result = new ServerPrxHelper();
			result.__copyFrom(proxy);
			return result;
		}
		return null;
	}

	public static final long serialVersionUID = 0L;
}