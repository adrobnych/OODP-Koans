package com.tdl.oodpkoans.creational.builder;

import java.util.ArrayList;
import java.util.List;

import com.tdl.oodpkoans.COUT;

public class Train {
	
	private String direction;
	
	private List<TrainItem> trainItems = new ArrayList<>();

	public List<TrainItem> getTrainItems() {
		return trainItems;
	}

	void describeTrain(){
		StringBuilder sb = new StringBuilder();
		sb.append("Train");
		sb.append(" ");
		sb.append(direction);
		sb.append(" ");
		for(TrainItem ti : trainItems)
			sb.append(ti.describe());
		COUT.println(sb.toString());
	}
	
	void addConductors(){
		for(TrainItem ti : trainItems)
			if(ti.getClass().getName().equals("com.tdl.oodpkoans.creational.builder.Couch"))
				((Couch)ti).addConductor();
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
}
