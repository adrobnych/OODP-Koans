package com.tdl.oodpkoans.creational.builder;

import java.util.List;

public class TrainBuilder {

	private Train train = new Train();
	
	public Train getTrain() {
		return train;
	}

	void addEngine(){
		train.getTrainItems().add(new Engine());
	}
	
	void addTank(){
		train.getTrainItems().add(new Tank());
	}
	
	void addCouch(){
		train.getTrainItems().add(new Couch());
	}
	
	void addWagonTimber(){
		train.getTrainItems().add(new WagonTimber());
	}
	
	void assignDirection(String dir){
		train.setDirection(dir);
	}
	

}
