package com.example.phonicsapp.wordbuilding;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.MoveXModifier;

public class HelpMode {
	public static int level,helpI,helpSplitI,loopCounter;

	public static void startHelpMode(){
		helpI = 0;
		helpSplitI = 0;
		loopCounter = 2;
		level = Words.currentStage;
		for(int i=0; i< BaseActivity.markers.size();i++){
			if(!Words.secquenceContainer.get(Words.currentStage).contains(BaseActivity.markers.get(i))){
				BaseActivity.markers.get(i).disAppaire();
			}
		}
		reposition(Words.currentStage);
	}
	static void reposition(int level){
		int pos = Words.secquenceContainer.get(level).size();
		pos = BaseActivity.CAMERA_WIDTH /pos;
		for(int j=0;j<Words.secquenceContainer.get(level).size();j++){
			///Words.secquenceContainer.get(level).get(j).left = null;
			///Words.secquenceContainer.get(level).get(j).right = null;
			//Words.secquenceContainer.get(level).get(j).leftValue = -1;
			//Words.secquenceContainer.get(level).get(j).rightValue = 1;
			///MoveModifier mf = new MoveModifier(1.50f, Words.secquenceContainer.get(level).get(j).letter.getX(), (j*150)+pos-100, Words.secquenceContainer.get(level).get(j).letter.getY(), BaseActivity.CAMERA_HEIGHT - 150);
			//Words.secquenceContainer.get(level).get(j).letter.setPosition((j*150)+pos-150, BaseActivity.CAMERA_HEIGHT - 150);
			///Words.secquenceContainer.get(level).get(j).letter.registerEntityModifier(mf);
		}
		helpJoin();
	}
	static boolean helpJoin(){
		if(helpI ==Words.secquenceContainer.get(level).size()-1 ) {
			//helpSplit(Words.secquenceContainer.get(level).size()-1);
			helpI = 0;
			helpSplit(Words.secquenceContainer.get(level).size()-1);
			return true;
		}
			BaseActivity.mCurrentScene.registerUpdateHandler(new TimerHandler(3.0f, new ITimerCallback() {
				
				@Override
				public void onTimePassed(TimerHandler arg0) {
					
				///	MoveXModifier mf = new MoveXModifier(1.0f, Words.secquenceContainer.get(level).get(helpI+1).letter.getX(), Words.secquenceContainer.get(level).get(helpI).letter.getX()+100);
				///	Words.secquenceContainer.get(level).get(helpI+1).letter.registerEntityModifier(mf);
					helpI++;					
					helpJoin();
				}
			}));
			
			return true;
	}
	static boolean helpSplit(int i){ 
		helpI=i;
		if(helpI < 0 ) {
			//helpSplit(Words.secquenceContainer.get(level).size()-1);
			return true;
		}
			BaseActivity.mCurrentScene.registerUpdateHandler(new TimerHandler(1.3f, new ITimerCallback() {
				
				@Override
				public void onTimePassed(TimerHandler arg0) {
					
				///	MoveXModifier mf = new MoveXModifier(1.0f, Words.secquenceContainer.get(level).get(helpI).letter.getX(), Words.secquenceContainer.get(level).get(helpI).letter.getX()+50*helpI);
				///	Words.secquenceContainer.get(level).get(helpI).letter.registerEntityModifier(mf);
					helpI--;					
					helpSplit(helpI);
				}
			}));
			
			return true;
	}
}
