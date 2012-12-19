package com.tdl.combats.decorator_vs_builder;

// combat with com.tdl.oodpkoans.creational.builder;

interface TrainItem{
	String description();
}

abstract class TrainWrapper implements TrainItem{
	
	TrainItem end_of_train;
	
	public abstract String description();

	public void setHead(TrainItem end_of_train) {
		this.end_of_train = end_of_train;
	}
}


class Engine implements TrainItem{
	public String description(){
		return "Engine";
	}
}

class Coach extends TrainWrapper{
	
	Coach(TrainItem tc){
		this.end_of_train = tc;
	}
	
	public String description(){
		return end_of_train.description() + "Coach";
	}
}

class Tank extends TrainWrapper{
	
	Tank(TrainItem tc){
		this.end_of_train = tc;
	}
	
	public String description(){
		return end_of_train.description() + "Tank";
	}
}


class WagonTimber extends TrainWrapper{
	
	WagonTimber(TrainItem tc){
		this.end_of_train = tc;
	}
	
	public String description(){
		return end_of_train.description() + "WagonTimber";
	}
}

public class FunyTrains {

	public static void main(String[] args) {
		TrainItem KyivOdessa = new Coach(
				new Coach(new Coach(new Coach(new Coach(new Tank(new Tank(new Engine())))))));   //TrainWithEbgineTwoTanksAndFiveCoaches();
		System.out.println(KyivOdessa.description());
	} 

}
