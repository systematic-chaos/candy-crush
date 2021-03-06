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

public final class _ClientDelD extends Ice._ObjectDelD implements _ClientDel {
	public void customLog(final String message, final int code,
			java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "customLog", Ice.OperationMode.Normal, __ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.customLog(message, code, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void endGame(final int team, java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "endGame", Ice.OperationMode.Normal, __ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.endGame(team, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void fillNewSquares(final Square[] newSquares,
			java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "fillNewSquares",
				Ice.OperationMode.Idempotent, __ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.fillNewSquares(newSquares, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void log(final String message, java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "log", Ice.OperationMode.Normal, __ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.log(message, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void logStatus(final String statusMessage,
			java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "logStatus", Ice.OperationMode.Normal, __ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.logStatus(statusMessage, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void makeMovement(final Movement mov,
			java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "makeMovement", Ice.OperationMode.Normal,
				__ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.makeMovement(mov, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void newParticipant(final String nick, final int team,
			java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "newParticipant", Ice.OperationMode.Normal,
				__ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.newParticipant(nick, team, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void participantLeft(final String nick, final int team,
			java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "participantLeft", Ice.OperationMode.Normal,
				__ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.participantLeft(nick, team, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void receiveMessage(final String from, final String message,
			java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "receiveMessage", Ice.OperationMode.Normal,
				__ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.receiveMessage(from, message, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void score(final int team, final int scored,
			java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "score", Ice.OperationMode.Normal, __ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.score(team, scored, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void setBoard(final int[][] boardValues,
			java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "setBoard", Ice.OperationMode.Idempotent,
				__ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.setBoard(boardValues, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void startGame(java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "startGame", Ice.OperationMode.Normal, __ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.startGame(__current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}

	public void turn(final int team, java.util.Map<String, String> __ctx,
			Ice.Instrumentation.InvocationObserver __observer)
			throws IceInternal.LocalExceptionWrapper {
		final Ice.Current __current = new Ice.Current();
		__initCurrent(__current, "turn", Ice.OperationMode.Idempotent, __ctx);
		IceInternal.Direct __direct = null;
		try {
			__direct = new IceInternal.Direct(__current) {
				public Ice.DispatchStatus run(Ice.Object __obj) {
					Client __servant = null;
					if (__obj == null || __obj instanceof Client) {
						__servant = (Client) __obj;
					} else {
						throw new Ice.OperationNotExistException(__current.id,
								__current.facet, __current.operation);
					}
					__servant.turn(team, __current);
					return Ice.DispatchStatus.DispatchOK;
				}
			};
			try {
				Ice.DispatchStatus __status = __direct.getServant()
						.__collocDispatch(__direct);
				if (__status == Ice.DispatchStatus.DispatchUserException) {
					__direct.throwUserException();
				}
				assert __status == Ice.DispatchStatus.DispatchOK;
			} finally {
				__direct.destroy();
			}
		} catch (Ice.SystemException __ex) {
			throw __ex;
		} catch (java.lang.Throwable __ex) {
			IceInternal.LocalExceptionWrapper.throwWrapper(__ex);
		}
	}
}
