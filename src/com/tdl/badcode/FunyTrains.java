package com.tdl.badcode;

interface Train{
	void description();
}

class TrainWithEngine implements Train{
	public void description(){
		System.out.println("Engine");
	}
}

class TrainWithEngineAndCoach implements Train{
	public void description(){
		System.out.println("Engine Coach");
	}
}

class TrainWithEngineAndTwoTanks implements Train{
	public void description(){
		System.out.println("Engine Tank Tank");
	}
}

class TrainWithEngineWithWagonTimber implements Train{
	public void description(){
		System.out.println("Engine WagonTimber");
	}
}

class TrainWithEbgineTwoTanksAndFiveCoaches implements Train{
	public void description(){
		System.out.println("Engine Tank Tank Coach Coach Coach");
	}
}

public class FunyTrains {

	public static void main(String[] args) {
		Train KyivOdessa = new TrainWithEbgineTwoTanksAndFiveCoaches();
		KyivOdessa.description();
		Train KyivPoltava = new TrainWithEngine();
		KyivPoltava.description();
		//and so on
	} 

}
