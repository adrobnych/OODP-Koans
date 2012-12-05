package com.tdl.oodpkoans.behavioral.command;

/*
 * 
 * The Command Pattern encapsulates a request as an
 * object, thereby letting you parameterize other objects
 * with different requests, queue or log requests, and support
 * undoable operations.
 * 
 */


import static org.junit.Assert.*;
import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;



public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		 
		Light livingRoomLight = new Light("Living Room");
 
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
 
		remoteControl.onButtonWasPushed(0);
		assertEquals(___, COUT.getLastLine());
		remoteControl.offButtonWasPushed(0);
		assertEquals(___, COUT.getLastLine());
		COUT.println(remoteControl.toString());
		assertEquals(___, COUT.getLastLine());
		remoteControl.undoButtonWasPushed();
		assertEquals(___, COUT.getLastLine());
		remoteControl.offButtonWasPushed(0);
		assertEquals(___, COUT.getLastLine());
		remoteControl.onButtonWasPushed(0);
		assertEquals(___, COUT.getLastLine());
		COUT.println(remoteControl.toString());
		assertEquals(___, COUT.getLastLine());
		remoteControl.undoButtonWasPushed();
		assertEquals(___, COUT.getLastLine());

		CeilingFan ceilingFan = new CeilingFan("Living Room");
   
		CeilingFanMediumCommand ceilingFanMedium = 
				new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = 
				new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
  
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
   
		remoteControl.onButtonWasPushed(0);
		assertEquals(___, COUT.getLastLine());
		remoteControl.offButtonWasPushed(0);
		assertEquals(___, COUT.getLastLine());
		COUT.println(remoteControl.toString());
		assertEquals(___, COUT.getLastLine());
		remoteControl.undoButtonWasPushed();
		assertEquals(___, COUT.getLastLine());
  
		remoteControl.onButtonWasPushed(1);
		assertEquals(___, COUT.getLastLine());
		COUT.println(remoteControl.toString());
		assertEquals(___, COUT.getLastLine());
		remoteControl.undoButtonWasPushed();
		assertEquals(___, COUT.getLastLine());
		assertEquals(___, COUT.getLastLine());
	}
}