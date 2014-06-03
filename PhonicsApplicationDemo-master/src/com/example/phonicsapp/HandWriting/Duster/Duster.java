package com.example.phonicsapp.HandWriting.Duster;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.PathModifier;
import org.andengine.entity.modifier.PathModifier.IPathModifierListener;
import org.andengine.entity.modifier.PathModifier.Path;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.util.debug.Debug;
import org.andengine.util.modifier.ease.EaseBounceOut;

import com.example.phonicsapp.HandWriting.banglaletterwriting.GameActivity;
import com.example.phonicsapp.HandWriting.banglaletterwriting.HandWritingMenu;

import android.content.Intent;

public class Duster
{

	//create duster
	public static void createDuster()
	{
		GameActivity.duster = new Sprite(GameActivity.CAMERA_WIDTH/2+100, -400, 
				GameActivity.mDusterTextureRegion, GameActivity.vertexBufferObjectManager)
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
			{
				switch (pSceneTouchEvent.getAction())
				{
				case TouchEvent.ACTION_DOWN:
					
					//if the pop up is active, then disabling the book icon from pressing again
					if(GameActivity.isPopupActive == false)
					{
						//when duster icon pressed start finish duster animation 
						GameActivity.dusterFinishCounter++;
					
						Debug.d("dustercounter:"+GameActivity.dusterCounter);
						if(GameActivity.dusterFinishCounter==1)
						{	
							if(GameActivity.handTutorial!=null)
							{
								if(GameActivity.handTutorial.hasParent() == true)
								{
									GameActivity.mScene.detachChild(GameActivity.handTutorial);
								}
							}
							
							if(GameActivity.duster.hasParent() == true)
							{
								GameActivity.mScene.detachChild(GameActivity.duster);
							}
							finishDuster();
						}
					}
					
					break;

				case TouchEvent.ACTION_UP:

					break;

				}

				return true;
			}
		};
		GameActivity.duster.setScale((float) 0.5);
		GameActivity.mScene.registerTouchArea(GameActivity.duster);
		GameActivity.mScene.attachChild(GameActivity.duster);
		GameActivity.duster.setZIndex(4);
		
	}
	
	//start duster animation
	public static void startDuster()
	{
		Path createDusterPath = new Path(2).to(GameActivity.CAMERA_WIDTH/2+100, -300)
				.to(GameActivity.CAMERA_WIDTH/2+190,GameActivity.CAMERA_HEIGHT/2);

	
		GameActivity.duster.registerEntityModifier(new PathModifier((float) 1.3,
				createDusterPath, null, new IPathModifierListener() 
		{
					@Override
					public void onPathStarted(final PathModifier pPathModifier,
							final IEntity pEntity)
					{
						
					}

					@Override
					public void onPathWaypointStarted( final PathModifier pPathModifier,
							final IEntity pEntity, final int pWaypointIndex) 
					{

					}

					@Override
					public void onPathWaypointFinished( final PathModifier pPathModifier,
							final IEntity pEntity, final int pWaypointIndex) 
					{

					}

					@Override
					public void onPathFinished( final PathModifier pPathModifier,
							final IEntity pEntity) 
					{

					}
				}, EaseBounceOut.getInstance()));
	}
	
	//for deleting all the white chalks and fish cursor
	public static void delete()
	{
		for(int i=0; i<=GameActivity.aCounter; i++)
		{
			GameActivity.mScene.detachChild(GameActivity.whiteChalk[i]);
		}
//		MainActivity.aCounter = 0 ;
//		MainActivity.mScene.detachChild(MainActivity.cursor);

//		MainActivity.spriteCounter = 1;
//		AnimationDrawTutorial.createNumberSpriteAndCursor(2);
	}
	
	//Sliding monkey hand animation for restarting the application
	public static void finishDuster() 
	{

		GameActivity.slidingScreen = new Sprite(0, -800, GameActivity.mSlidingScreenTextureRegion, GameActivity.vertexBufferObjectManager);
		GameActivity.mScene.attachChild(GameActivity.slidingScreen);
			
		Path finishingPath = new Path(2).to(-1200, -100).to(0, -100);

		GameActivity.slidingScreen.registerEntityModifier(new PathModifier((float) 1.8, finishingPath, null, new IPathModifierListener()
		{
				@Override
				public void onPathStarted(final PathModifier pPathModifier,final IEntity pEntity) 
				{
					
					delete();
					GameActivity.mScene.clearEntityModifiers();
//					GameActivity.mScene.detachChildren();
					GameActivity.mScene.detachSelf();
					//GameActivity.mScene.dispose();
					
					//Restarting the activity
					GameActivity.mScene.registerUpdateHandler(new TimerHandler((float)2.2, new ITimerCallback() 
					{
								
						@Override
						public void onTimePassed(TimerHandler pTimerHandler)
						{
							// TODO Auto-generated method stub
							
									
							//Resetting the stars
							GameActivity.aCounter=0;
							
							GameActivity.mScene.detachChild(GameActivity.handTutorial);
							GameActivity.mScene.unregisterUpdateHandler(GameActivity.timer1);
							
							//if the letter is Aa, then start Aakar after it
							if(HandWritingMenu.letterNumber == 2)
							{
								 HandWritingMenu.letterNumber = 24;
							}
							//if the letter is A, then start Akar after it
							else if(HandWritingMenu.letterNumber == 15)
							{
								 HandWritingMenu.letterNumber = 23;
							}
							//if the letter is E, then start Ekar after it
							else if(HandWritingMenu.letterNumber == 3)
							{
								 HandWritingMenu.letterNumber = 22;
							}
							//if the letter is U, then start Ukar after it
							else if(HandWritingMenu.letterNumber == 17)
							{
								 HandWritingMenu.letterNumber = 21;
							}
							GameActivity.MainActivityInstace.finish();
							GameActivity.MainActivityInstace.startActivity(new Intent(GameActivity.MainActivityInstace.getBaseContext(),
									GameActivity.class));
						}
					}));
				}
	 
						@Override
						public void onPathWaypointStarted(final PathModifier pPathModifier,final IEntity pEntity, final int pWaypointIndex) 
						{
							
						}

						@Override
						public void onPathWaypointFinished(final PathModifier pPathModifier,final IEntity pEntity, final int pWaypointIndex) 
						{

						}

						@Override
						public void onPathFinished(final PathModifier pPathModifier,final IEntity pEntity)
						{
							
						}
					}));
		}
}
