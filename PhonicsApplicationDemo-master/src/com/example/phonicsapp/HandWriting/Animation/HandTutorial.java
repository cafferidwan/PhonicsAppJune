package com.example.phonicsapp.HandWriting.Animation;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.AlphaModifier;
import org.andengine.entity.modifier.DelayModifier;
import org.andengine.entity.modifier.LoopEntityModifier;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.SequenceEntityModifier;
import org.andengine.entity.modifier.IEntityModifier.IEntityModifierListener;
import org.andengine.entity.sprite.Sprite;
import org.andengine.util.modifier.IModifier;

import com.example.phonicsapp.R;
import com.example.phonicsapp.HandWriting.Duster.Duster;
import com.example.phonicsapp.HandWriting.Popup.PopUp;
import com.example.phonicsapp.HandWriting.banglaletterwriting.GameActivity;
import com.example.phonicsapp.HandWriting.banglaletterwriting.NumberSprites;

public class HandTutorial
{
	public static LoopEntityModifier loopMod, loopMod1;

	//create handtutorial with alpha modifier
	public static void handTutorialCreate()
	{
		GameActivity.handTutorial = new Sprite(400, GameActivity.CAMERA_HEIGHT, GameActivity.mHandTutorialTextureRegion, 
				GameActivity.vertexBufferObjectManager);
		GameActivity.mScene.attachChild(GameActivity.handTutorial);
		GameActivity.handTutorial.setZIndex(6);
		GameActivity.handTutorial.setAlpha(0);
		
		AlphaModifier alphaMod = new AlphaModifier((float) 0.8, (float) 0, 1);
		DelayModifier delayMod = new DelayModifier((float) 0.00, new IEntityModifierListener()
		{ 

					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,
							IEntity arg1)  
					{

					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0,
							IEntity arg1)
					{
						// play sound
						GameActivity.audioPlay = true;
						NumberSprites.playAudio(R.raw.hw_three);
						
						//call the start animation 
						handTutorialStart(GameActivity.handTutorial.getX(), 
								GameActivity.handTutorial.getY(),
								GameActivity.bookIcon.getX()+70, 
								GameActivity.bookIcon.getY()+70);
					}
				});
		
		SequenceEntityModifier sequenceMod = new SequenceEntityModifier(alphaMod ,delayMod);
		GameActivity.handTutorial.registerEntityModifier(sequenceMod);
	}
	
	//handtutorial animation from creating to bookIcon
	public static void handTutorialStart(float x1, float y1, float x2, float y2)
	{
		MoveModifier moveMod = new MoveModifier(2, x1, x2, y1, y2);
		DelayModifier delayMod = new DelayModifier((float) 2, new IEntityModifierListener()
		{  

					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,
							IEntity arg1) 
					{
						GameActivity.isHandTutorialActive = true;
						GameActivity.mScene.sortChildren();
						
						//if the book icon is pressed and the pop up  is active
						//then change the animation and start another animation
						if(PopUp.popValue == 1)
						{
							GameActivity.handTutorial.unregisterEntityModifier(loopMod);
							
							// play sound
							GameActivity.audioPlay = true;
							NumberSprites.playAudio(R.raw.hw_four);
							HandTutorial.handTutorialStart2(GameActivity.handTutorial.getX(), 
									GameActivity.handTutorial.getY(), 150, 150);
						}
					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0,
							IEntity arg1)
					{
						
					}
				});
		
		SequenceEntityModifier sequenceMod = new SequenceEntityModifier(delayMod,moveMod);
		loopMod = new LoopEntityModifier(sequenceMod);
		
		GameActivity.handTutorial.registerEntityModifier(loopMod);
	}
	
	//handtutorial animation from bookIcon to showing written Mo in the popup
	public static void handTutorialStart2(float x1, float y1, float x2, float y2)
	{
		MoveModifier moveMod = new MoveModifier(1, x1, x2, y1, y2);
		DelayModifier delayMod = new DelayModifier((float) 2, new IEntityModifierListener()
		{  

					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,
							IEntity arg1) 
					{
						GameActivity.mScene.sortChildren();
					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0,
							IEntity arg1)
					{

						//animation from written Mo to right Mo
						GameActivity.mScene.registerUpdateHandler(new TimerHandler((float) 0.6, new ITimerCallback()
						{
							@Override
							public void onTimePassed(TimerHandler pTimerHandler)
							{
								// TODO Auto-generated method stub
								 handTutorialStart3(GameActivity.handTutorial.getX(),
										 GameActivity.handTutorial.getY(),
										 550, 150);
							}
						}));
					}
				});
		
		SequenceEntityModifier sequenceMod = new SequenceEntityModifier(delayMod,moveMod);
		GameActivity.handTutorial.registerEntityModifier(sequenceMod);
		
	}
	 
	////handtutorial animation from written Mo to right Mo
	public static void handTutorialStart3(float x1, float y1, float x2, float y2)
	{
		MoveModifier moveMod = new MoveModifier(1, x1, x2, y1, y2);
		DelayModifier delayMod = new DelayModifier((float) 2, new IEntityModifierListener()
		{  

					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,
							IEntity arg1) 
					{
						GameActivity.mScene.sortChildren();
					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0,
							IEntity arg1)
					{
						
						//animation from Mo to cross button
						GameActivity.mScene.registerUpdateHandler(new TimerHandler((float) 14, new ITimerCallback()
						{
							@Override
							public void onTimePassed(TimerHandler pTimerHandler)
							{
								// TODO Auto-generated method stub
								 handTutorialStart4(GameActivity.handTutorial.getX(),
										 GameActivity.handTutorial.getY(),
										 700, 50);
							}
						}));
					}
				});
		
		SequenceEntityModifier sequenceMod = new SequenceEntityModifier(delayMod,moveMod);
		GameActivity.handTutorial.registerEntityModifier(sequenceMod);
		
	}
	
	////handtutorial animation from Mo to cross button
	public static void handTutorialStart4(float x1, float y1, float x2, float y2)
	{
		MoveModifier moveMod = new MoveModifier(2, x1, x2, y1, y2);
		DelayModifier delayMod = new DelayModifier((float) 2, new IEntityModifierListener()
		{  
					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,
							IEntity arg1) 
					{
						GameActivity.mScene.sortChildren();
						
						if(PopUp.popValue == 2)
						{
							//removing the tutorial
							handTutorialStart5(GameActivity.handTutorial.getX(),
									 GameActivity.handTutorial.getY(),
									 670, 300);
							// play sound
							GameActivity.audioPlay = true;
							NumberSprites.playAudio(R.raw.hw_five);
						}
					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0,
							IEntity arg1)
					{
						GameActivity.isHandTutorialActive = false;
						
					}
				});
		
		SequenceEntityModifier sequenceMod = new SequenceEntityModifier(delayMod,moveMod);
		loopMod1 = new LoopEntityModifier(sequenceMod);
		
		GameActivity.handTutorial.registerEntityModifier(loopMod1);
		
	}
	
	//handtutorial from cross to starting the duster animation and showing it
	public static void handTutorialStart5(float x1, float y1, float x2, float y2)
	{
		MoveModifier moveMod = new MoveModifier(2, x1, x2, y1, y2);
		DelayModifier delayMod = new DelayModifier((float) 0.5, new IEntityModifierListener()
		{  
					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,
							IEntity arg1) 
					{
						GameActivity.handTutorial.unregisterEntityModifier(loopMod1);
						GameActivity.mScene.sortChildren();
						
					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0,
							IEntity arg1)
					{
						GameActivity.dusterCounter++;
						if(GameActivity.dusterCounter == 1)
						{
							//creating the duster
							Duster.createDuster();
							//Start the duster
							Duster.startDuster();
						}
						 
						//the handtutorial part ends
						GameActivity.isHandTutorialActive = false;
						
					}
				});
		
		SequenceEntityModifier sequenceMod = new SequenceEntityModifier(delayMod,moveMod);
		LoopEntityModifier loopMod2 = new LoopEntityModifier(sequenceMod);
		GameActivity.handTutorial.registerEntityModifier(loopMod2);
		
	}
	
}
