package com.tdl.badcode;

import java.util.List;
import java.util.Map;
import java.util.Properties;

abstract class Market{
	public abstract void registerOfNewApp(String appName);
}


class AndroidMarket extends Market{  // Esseintial thing is that we will have only one object of this class
	private App[] apps;
	public void registerOfNewApp(String appName){
		//recording to apps
	}
}

class PlayStore extends Market{
	private List<App> applications;
	public void registerOfNewApp(String appName){
		// recording to applications
	}
}

class AppleStore extends Market{
	private Map<String, String> apps;
	public void registerOfNewApp(String appName){
		// record to apps
	}
}

class ChromeStore extends Market{
	private Properties gadgets;
	public void registerOfNewApp(String appName){
		// record to gadgets
	}
}

//other markets coming soon


class App{
	String name;
}

class SuperTetris extends App{
	public SuperTetris(Market android, Market play, Market apple, Market chrome){ // Open for Modification!!!
		//if(somecondition)
		  android.registerOfNewApp("SupaTertis");
		//if(somecondition)
		  apple.registerOfNewApp("Tetris II");
	}
}

class SuperMahjong extends App{
	public SuperMahjong(Market android, Market play, Market apple, Market chrome){
		//if(somecondition)
		  play.registerOfNewApp("SupaMH");
		//if(spmecondition)  
		  chrome.registerOfNewApp("Mahjong");
	}
}

public class TooManyMarkets {

	public static void main(String[] args) {
		Market androidMrkt = new AndroidMarket();
		Market playMrkt = new PlayStore();
		Market appleMrkt = new AppleStore();
		Market chromeMrkt = new ChromeStore();
		
		App superTetris = new SuperTetris(androidMrkt, playMrkt, appleMrkt, chromeMrkt);
		App superMahgong = new SuperMahjong(androidMrkt, playMrkt, appleMrkt, chromeMrkt);
		//..

	}

}
