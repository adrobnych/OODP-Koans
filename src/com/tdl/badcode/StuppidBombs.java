package com.tdl.badcode;

//Change Request:
//	
//	Guys, are you really smart?
//	We're writing Game about good boys who deactivate bombs!
//	We need deactivate bombs at runtime under user control.
//	And don't forget: bad guys are still there and they activate bombs in random order

class RedButton{
	static boolean on = false;
	static boolean isOn(){return on;}
	static void On(){on = true;}
}


class BombA implements Runnable{
	public void explode(){
		System.out.println("boom as BombA");
	}

	private boolean threadDone = false;

    public void done() {
        threadDone = true;
    }
    
	@Override
	public void run() {
		while(!threadDone){
			if(RedButton.isOn())
			{	explode();
				threadDone = true;
			}	
		}
	}
}

class BombB implements Runnable{
	public void explode(){
		System.out.println("boom as BombB");
	}
	
	private boolean threadDone = false;

    public void done() {
        threadDone = true;
    }
    
    
	@Override
	public void run() {
		while(!threadDone){
			if(RedButton.isOn())
			{	explode();
				threadDone = true;
			}	
		}
	}
}

class BombC implements Runnable{
	public void explode(){
		System.out.println("boom as BombC");
	}
	
	private boolean threadDone = false;

    public void done() {
        threadDone = true;
    }
    
	@Override
	public void run() {
		while(!threadDone){
			if(RedButton.isOn())
			{	explode();
				threadDone = true;
			}	
		}
	}
}


public class StuppidBombs {

	public static void main(String[] args) {
			
		BombA a = new BombA();
		BombB b = new BombB();
		Thread t1 = new Thread(a);
		t1.start();
		Thread t2 = new Thread(b);
		t2.start();
		
		RedButton.On();
	}

}
