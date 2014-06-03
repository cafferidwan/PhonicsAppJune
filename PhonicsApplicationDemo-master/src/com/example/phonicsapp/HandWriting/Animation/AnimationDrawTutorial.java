package com.example.phonicsapp.HandWriting.Animation;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.PathModifier;
import org.andengine.entity.modifier.PathModifier.IPathModifierListener;
import org.andengine.entity.modifier.PathModifier.Path;
import org.andengine.entity.sprite.AnimatedSprite;

import com.example.phonicsapp.R;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureA;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureAa;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureAakar;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureAkar;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureBo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureCho;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureDo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureDoh;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureE;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureEkar;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureGo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureHo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureKho;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureKo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureLo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureMo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureNo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructurePo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureRaw;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureTalibaSha;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureTo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureToh;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureU;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureUkar;
import com.example.phonicsapp.HandWriting.banglaletterwriting.GameActivity;
import com.example.phonicsapp.HandWriting.banglaletterwriting.NumberSprites;
import com.example.phonicsapp.HandWriting.banglaletterwriting.StructureDrawAnimation;

public class AnimationDrawTutorial 
{
	
	public static double animatedChalk1Time = 2.5, 
						 animatedChalk2Time = 5.0,
						 animatedChalk3Time = 2.0, 
						 animatedChalk4Time = 4.0; 
	
	public static void setAnimatedChalkTime(double time1, double time2, double time3, double time4)
	{
		AnimationDrawTutorial.animatedChalk1Time = time1;
		AnimationDrawTutorial.animatedChalk2Time = time2;
		AnimationDrawTutorial.animatedChalk3Time = time3;
		AnimationDrawTutorial.animatedChalk4Time = time4;
	}
	
	
	//animation for drawing with chalk during monkey tutorial
	public static void animatedChalk1(final int numberOfLines, 
			
			float x1, float y1, float x2, float y2, 
			
			final float xA1, final float yA1, final float xA2, final float yA2,final float xA3, final float yA3,
			final float xA4, final float yA4, final float xA5,final float yA5, final float xA6, final float yA6,
			final float xA7, final float yA7, final float xA8, final float yA8, final float xA9, final float yA9,
			final float xA10, final float yA10, final float xA11, final float yA11,final float xA12, final float yA12,
			final float xA13, final float yA13,
			
			final float xB1, final float yB1, final float xB2, final float yB2, final float xB3, final float yB3,
			final float xB4, final float yB4, 
			
			final float xC1, final float yC1, final float xC2, final float yC2)
	{
		Path chalkPath = null;
		
		chalkPath = new Path(2)
		.to(x1, y1).to(x2, y2);
		
		
		GameActivity.rectangle.registerEntityModifier(new PathModifier((float)animatedChalk1Time, chalkPath, null, new IPathModifierListener()
		{
			@Override
			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				GameActivity.monkeyTutorialStart = 1;
				
				//disabling the touch
				GameActivity.isActionMoving = false;
			}

			@Override
			public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			{

			}

			@Override
			public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) 
			{

			}

			@Override
			public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				
				GameActivity.monkeyTutorialStart = 0;
				
				//move to the next step of drawing with chalk
				AnimationDrawTutorial.animatedChalk2(
					numberOfLines, 
					xA1, yA1, xA2, yA2, xA3, yA3, xA4, yA4,
					xA5, yA5, xA6, yA6, xA7, yA7, xA8, yA8,
					xA9, yA9, xA10, yA10, xA11, yA11, xA12, 
					yA12, xA13, yA13,
					
					xB1, yB1, xB2, yB2, xB3, yB3,
					xB4, yB4, 
					
					xC1, yC1, xC2, yC2);
			}
		}));
	}
	
	//animation for drawing with chalk during monkey tutorial
	public static void animatedChalk2(final int numberOfLines,
			
			final float x1, final float y1, final float x2, final float y2
			, final float x3, final float y3, final float x4, final float y4, final float x5, final float y5
			, final float x6, final float y6, final float x7, final float y7, float x8, float y8, float x9,float y9
			, final float x10, final float y10, final float x11, final float y11
			, final float x12, final float y12, final float x13, final float y13,
			
			  final float xB1, final float yB1, final float xB2, final float yB2, final float xB3
			, final float yB3, final float xB4, final float yB4
			
			, final float xC1, final float yC1, final float xC2, final float yC2)
	{
		Path chalkPath2 = new Path(13)
		.to(x1 , y1 ).to(x2, y2).to(x3, y3).to(x4, y4).to(x5, y5)
		.to(x6, y6).to(x7, y7).to(x8, y8).to(x9, y9).to(x10, y10)
		.to(x11, y11).to(x12, y12).to(x13, y13)
		;
		
		GameActivity.rectangle.registerEntityModifier(new PathModifier((float)animatedChalk2Time, chalkPath2, null, new IPathModifierListener()
		{
			@Override
			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				GameActivity.monkeyTutorialStart = 1;
			}

			@Override
			public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			{

			}

			@Override
			public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) 
			{

			}

			@Override
			public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
			{ 
				GameActivity.monkeyTutorialStart = 0;
				
				if(numberOfLines>2)
				{
					//move to the next step of drawing with chalk
					AnimationDrawTutorial.animatedChalk3(numberOfLines,
							
							xB1, yB1, xB2, yB2, xB3, yB3, xB4, yB4,
					
							xC1, yC1, xC2, yC2);
				}
				else
				{
					//if it is the first line, only then play the first line animation, only for letter mo
					if(GameActivity.letter==1)
					{
						//after finishing the tutorial remove the chalk draw
						GameActivity.mScene.registerUpdateHandler(new TimerHandler((float) 1, new ITimerCallback() 
						{
									@Override
									public void onTimePassed(TimerHandler pTimerHandler)
									{
										// TODO Auto-generated method stub
										removeTutorialDraw(1);
									}
						}));
					}
					else
					{ 
						GameActivity.mScene.registerUpdateHandler(new TimerHandler((float) 1, new ITimerCallback() 
						{
									@Override
									public void onTimePassed(TimerHandler pTimerHandler)
									{
										// TODO Auto-generated method stub
										removeTutorialDraw(2);
									}
						}));
					}
				}
			}
		}));
	}
	
	//animation for drawing with chalk during monkey tutorial
	public static void animatedChalk3(final int numberOfLines,
			
			float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4
			
			, final float xC1, final float yC1, final float xC2, final float yC2)
	{
		Path chalkPath2 = new Path(4)
		.to(x1 , y1 ).to(x2, y2).to(x3, y3).to(x4, y4)
		;
		
		GameActivity.rectangle.registerEntityModifier(new PathModifier((float)animatedChalk3Time, chalkPath2, null, new IPathModifierListener()
		{
			@Override
			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				GameActivity.monkeyTutorialStart = 1;
			}

			@Override
			public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			{

			}

			@Override
			public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) 
			{

			}

			@Override
			public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
			{ 
				GameActivity.monkeyTutorialStart = 0;
				
				if(numberOfLines>3)
				{
					
				
					//after finishing the tutorial remove the chalk draw
					//move to the next step of drawing with chalk
					AnimationDrawTutorial.animatedChalk4(numberOfLines,
					xC1, yC1, xC2, yC2);
				}
				else
				{
					//after finishing the tutorial remove the chalk draw
					GameActivity.mScene.registerUpdateHandler(new TimerHandler((float) 1, new ITimerCallback() 
					{
								@Override
								public void onTimePassed(TimerHandler pTimerHandler)
								{
									// TODO Auto-generated method stub
									removeTutorialDraw(2);
								}
					}));
				}
				
			}
		}));
	}

	//animation for drawing with chalk during monkey tutorial
	public static void animatedChalk4(final int numberOfLines,
			
			float x1, float y1, float x2, float y2)
	{
		Path chalkPath2 = new Path(2)
		.to(x1 , y1 ).to(x2, y2)
		;
		
		GameActivity.rectangle.registerEntityModifier(new PathModifier((float)animatedChalk4Time, chalkPath2, null, new IPathModifierListener()
		{
			@Override
			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				GameActivity.monkeyTutorialStart = 1;
			}

			@Override
			public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			{

			}

			@Override
			public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) 
			{

			}

			@Override
			public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
			{ 
				GameActivity.monkeyTutorialStart = 0;
				
				//after finishing the tutorial remove the chalk draw
				GameActivity.mScene.registerUpdateHandler(new TimerHandler((float) 1, new ITimerCallback() 
				{
							@Override
							public void onTimePassed(TimerHandler pTimerHandler)
							{
								// TODO Auto-generated method stub
								removeTutorialDraw(2);
							}
				}));
			}
		}));
	}
	
	
	// remove the chalk draw during monkey tutorial
	public static void removeTutorialDraw(int a)
	{
		for(int i = 0; i<= GameActivity.bCounter; i++)
		{
			GameActivity.mScene.detachChild(GameActivity.tutorialWhiteChalk[i]);
		}
		GameActivity.bCounter = 0;
		
		//first time call
		if(a==1)
		{
			//play sound
			GameActivity.audioPlay = true;
			NumberSprites.playAudio(R.raw.hw_mo);
			
			GameActivity.mScene.registerUpdateHandler(new TimerHandler((float) 3, new ITimerCallback() 
			{
						@Override
						public void onTimePassed(TimerHandler pTimerHandler)
						{
							// TODO Auto-generated method stub
							
							//disabling the touch mode
							GameActivity.isHandTutorialActive = true;
							
							//start first line animation cursor tutorial
							createNumberSpriteAndCursor(1);
						}
			}));
		}
		//second time call
		else if(a==2) 
		{
			//createNumberSpriteAndCursor(2);
			
			//enabling the touch mode
			GameActivity.isActionMoving = true;
			GameActivity.isHandTutorialActive = false;
			
			if(GameActivity.letter == 1)
			{
				//create number with cursor
				LetterStructureMo.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 2)
			{
				//create number with cursor
				LetterStructureAa.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 3)
			{
				//create number with cursor
				LetterStructureE.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 4)
			{
				//create number with cursor
				LetterStructureRaw.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 5)
			{
				//create number with cursor
				LetterStructureKo.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 6)
			{
				//create number with cursor
				LetterStructureBo.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 7)
			{
				//create number with cursor
				LetterStructureTalibaSha.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 8)
			{
				//create number with cursor
				LetterStructureLo.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 9)
			{
				//create number with cursor
				LetterStructurePo.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 10)
			{
				//create number with cursor
				LetterStructureGo.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 11)
			{
				//create number with cursor
				LetterStructureHo.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 12)
			{
				//create number with cursor
				LetterStructureKho.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 13)
			{
				//create number with cursor
				LetterStructureCho.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 14)
			{
				//create number with cursor
				LetterStructureNo.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 15)
			{
				//create number with cursor
				LetterStructureA.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 16)
			{
				//create number with cursor
				LetterStructureDo.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 17)
			{
				//create number with cursor
				LetterStructureU.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 18)
			{
				//create number with cursor
				LetterStructureTo.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 19)
			{
				//create number with cursor
				LetterStructureToh.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 20)
			{
				//create number with cursor
				LetterStructureDoh.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 21)
			{
				//create number with cursor
				LetterStructureUkar.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 22)
			{
				//create number with cursor
				LetterStructureEkar.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 23)
			{
				//create number with cursor
				LetterStructureAkar.createNumberSpriteAndCursor();
			}
			else if(GameActivity.letter == 24)
			{
				//create number with cursor
				LetterStructureAakar.createNumberSpriteAndCursor();
			}
		}
	}
	
	//create numberSprite and cursor
	public static void createNumberSpriteAndCursor(int a)
	{
		 
		//creating the first line of numbers
		GameActivity.spriteCounterLimit = 4;
		StructureDrawAnimation.scale(GameActivity.moOutLineX + 70 - 100, GameActivity.moOutLineY - 50, 1);
				
		//creating the fish cursor
		GameActivity.cursor = new AnimatedSprite(GameActivity.moOutLineX, GameActivity.moOutLineY, 
				GameActivity.mFishTextureRegion, GameActivity.vertexBufferObjectManager);
		GameActivity.cursor.animate(new long[]{100, 100, 100, 100, 100, 100}, 0, 5, true);
		GameActivity.cursor.setZIndex(3);
		GameActivity.mScene.attachChild(GameActivity.cursor);
				
		//setting the cursor to top of first number sprite
		NumberSprites.setCursorPosition(GameActivity.numberSprites[1]);
				
		if(a==1)
		{
			//go to the next step or move the animated fish 
			animatedCursor(GameActivity.moOutLineX-10, 
					GameActivity.moOutLineY-30, 
					GameActivity.moOutLineX+180, 
					GameActivity.moOutLineY-30);
		}

	}
	
	//moving the cursor with animation
	public static void animatedCursor(float x1, float y1, float x2, float y2)
	{
		Path chalkPath = null;
		
		chalkPath = new Path(2)
		.to(x1, y1).to(x2, y2);
		
		
		GameActivity.cursor.registerEntityModifier(new PathModifier((float)2.0, chalkPath, null, new IPathModifierListener()
		{
			@Override
			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				GameActivity.monkeyTutorialStart = 2;
			}

			@Override
			public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			{

			}

			@Override
			public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) 
			{

			}

			@Override
			public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				//play sound
				GameActivity.audioPlay = true;
				NumberSprites.playAudio(R.raw.hw_mo);
				
				//after moving the cursor/fish with removing the number sprites
				GameActivity.mScene.registerUpdateHandler(new TimerHandler((float) 3, new ITimerCallback() 
				{
							@Override
							public void onTimePassed(TimerHandler pTimerHandler)
							{
								// TODO Auto-generated method stub
								GameActivity.monkeyTutorialStart = 0;
								GameActivity.mScene.detachChild(GameActivity.cursor);
								GameActivity.mScene.detachChild(GameActivity.numberSprites[4]);
								
								GameActivity.spriteCounter = 1;
								//remove the draw
								removeTutorialDraw(2);
							}
				}));
		
			}
		}));
	}
	
	//Timer for drawing during monkey Tutorial
	public static void animationDrawTimer()
	{
		
		GameActivity.timer1 = new TimerHandler((float) 1.0f/120,true, new ITimerCallback() 
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler) 
			{
				// TODO Auto-generated method stub 
				
				//starting the first step with monkey tutorial
				if(GameActivity.monkeyTutorialStart == 1 )
				{
					//calling for drawing first line of monkey tutorial draw
					MonkeyTutorial.monkeyTutorialAnimationDraw(GameActivity.rectangle.getX()+20 ,
							GameActivity.rectangle.getY() +20);
				}
				//drawing the second time with removing number sprite
				else if(GameActivity.monkeyTutorialStart == 2 )
				{
					MonkeyTutorial.monkeyTutorialAnimationDraw(GameActivity.cursor.getX()+20 ,
							GameActivity.cursor.getY()+20);
				}
				
			}
		});
	}
}
