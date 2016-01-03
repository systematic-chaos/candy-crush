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

public interface _ClientOperations {
	void newParticipant(String nick, int team, Ice.Current __current);

	void participantLeft(String nick, int team, Ice.Current __current);

	void startGame(Ice.Current __current);

	void endGame(int team, Ice.Current __current);

	void setBoard(int[][] boardValues, Ice.Current __current);

	void turn(int team, Ice.Current __current);

	void log(String message, Ice.Current __current);

	void customLog(String message, int code, Ice.Current __current);

	void logStatus(String statusMessage, Ice.Current __current);

	void makeMovement(Movement mov, Ice.Current __current);

	void fillNewSquares(Square[] newSquares, Ice.Current __current);

	void score(int team, int scored, Ice.Current __current);

	void receiveMessage(String from, String message, Ice.Current __current);
}
