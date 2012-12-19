package com.tdl.badcode;

import java.util.ArrayList;
import java.util.List;

enum TownHosts{
	Knight, Necromancer;
}


abstract class Warior{
	
}

abstract class EntryWarior extends Warior{
	static public int growSpeed = 20;
	static public int force = 10;
}

abstract class MiddleWarior extends Warior{
	static public int growSpeed = 10;
	static public int force = 50;
}

abstract class SuperWarior extends Warior{
	static public int growSpeed = 2;
	static public int force = 500;
}

class Peasant extends EntryWarior{
	
}

class Skeleton extends EntryWarior{
	
}

class Druid extends MiddleWarior{
	
}

class Vampir extends MiddleWarior{
	
}

class Angel extends SuperWarior{
	
}

class Daemon extends SuperWarior{
	
}



class Town{
	TownHosts host;
	List<Warior> population = new ArrayList<>();
	
	void growPopulation(){
		if(host == TownHosts.Knight){
			for(int i=0; i<EntryWarior.growSpeed; i++)
				population.add(new Peasant());
			for(int i=0; i<MiddleWarior.growSpeed; i++)
				population.add(new Druid());
			for(int i=0; i<SuperWarior.growSpeed; i++)
				population.add(new Angel());
		}
		if(host == TownHosts.Necromancer){
			for(int i=0; i<EntryWarior.growSpeed; i++)
				population.add(new Skeleton());
			for(int i=0; i<MiddleWarior.growSpeed; i++)
				population.add(new Vampir());
			for(int i=0; i<SuperWarior.growSpeed; i++)
				population.add(new Daemon());
		}	
	}
}


public class HMM {
	public static void main(String[] args){
		
		List<Town> towns = new ArrayList<>();
		Town Gorgulia = new Town();
		Gorgulia.host = TownHosts.Necromancer;
		towns.add(Gorgulia);
		Town Sheer = new Town();
		Sheer.host = TownHosts.Knight;
		towns.add(Sheer);
		
		for(Town t : towns)
			t.growPopulation();
	}

}
