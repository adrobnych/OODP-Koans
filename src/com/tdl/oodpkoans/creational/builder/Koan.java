package com.tdl.oodpkoans.creational.builder;

/*
 * 
 * 
 * 
 */


import static org.junit.Assert.*;

import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;


public class Koan extends TDLKoan{	
	@Test
	public void talk_to_master(){
		TrainBuilder tb = new TrainBuilder();
		tb.addEngine();
		tb.addEngine();
		tb.addTank();
		tb.addTank();
		tb.addWagonTimber();
		tb.addCouch();
		tb.addCouch();
		tb.addCouch();
		tb.addEngine();
		tb.addEngine();
		tb.assignDirection("KyivOdessa"); 
		
		Train KyivOdessa = tb.getTrain();
		KyivOdessa.addConductors();
		
		KyivOdessa.describeTrain();
		
		assertEquals(___, COUT.getLastLines(4));
		
	}
}