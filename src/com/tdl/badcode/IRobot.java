package com.tdl.badcode;



public class IRobot {
	
	enum Emotion{
		FUN, ANGRY, COMMUNICATIVE, SILENT, DRUNK, DISSAPOINTED 
	} 
	
	Emotion currentEmotion = Emotion.SILENT;
	
	void something_happen(String event){
		if(event == "ANOTHER_COMMUNICATIVE_ROBOT_APPEARED"){
			if(currentEmotion == Emotion.FUN){
				System.out.println("Say some random joke");
				currentEmotion = Emotion.COMMUNICATIVE;
			}
			if(currentEmotion == Emotion.SILENT){
				System.out.println("Say some random joke");
				currentEmotion = Emotion.COMMUNICATIVE;
			}
			if(currentEmotion == Emotion.DRUNK){
				lookUpAndRunFeature("SOME_FLIRTING");
			}
			if(currentEmotion == Emotion.ANGRY){
				lookUpAndRunFeature("SHOW_MIDDLE_FINGER");
				currentEmotion = Emotion.SILENT;
			}
		}
		if(event == "ANOTHER_ANGRY_ROBOT_APPEARED"){
			if(currentEmotion == Emotion.FUN){
				currentEmotion = Emotion.DISSAPOINTED;
			}
			if(currentEmotion == Emotion.SILENT){
				System.out.println("Say some random joke");
				currentEmotion = Emotion.COMMUNICATIVE;
			}
			if(currentEmotion == Emotion.DRUNK){
				lookUpAndRunFeature("SOME_FLIRTING");
			}
			if(currentEmotion == Emotion.ANGRY){
				lookUpAndRunFeature("SHOW_MIDDLE_FINGER");
				currentEmotion = Emotion.SILENT;
			}
		}
		if(event == "ANOTHER_COMMUNICATIVE_ROBOT_SOUNDED_SOME_JOKE"){
			if(currentEmotion == Emotion.FUN){
				System.out.println("Say some random joke");
				currentEmotion = Emotion.FUN;
			}
			if(currentEmotion == Emotion.SILENT){
				System.out.println("Say some random joke");
				currentEmotion = Emotion.COMMUNICATIVE;
			}
			if(currentEmotion == Emotion.DRUNK){
				lookUpAndRunFeature("SOME_FLIRTING");
			}
			if(currentEmotion == Emotion.ANGRY){
				currentEmotion = Emotion.COMMUNICATIVE;
			}
		}
		//...
	}

	private void lookUpAndRunFeature(String featureName) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {


	}

}
