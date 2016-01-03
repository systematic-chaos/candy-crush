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

public interface _ServerOperationsNC {
	boolean joinTeam(Ice.Identity id, String nick, int team);

	void teamComplete(Ice.Identity id);

	void movementProposal(Ice.Identity id, Movement mov);

	void message(Ice.Identity id, String msg);

	void leaveGame(Ice.Identity id);
}
