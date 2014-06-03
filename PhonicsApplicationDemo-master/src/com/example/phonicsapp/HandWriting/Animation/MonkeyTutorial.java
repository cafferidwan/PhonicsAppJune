package com.example.phonicsapp.HandWriting.Animation;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.PathModifier;
import org.andengine.entity.modifier.PathModifier.IPathModifierListener;
import org.andengine.entity.modifier.PathModifier.Path;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.util.modifier.ease.EaseBounceOut;

import com.example.phonicsapp.R;
import com.example.phonicsapp.HandWriting.banglaletterwriting.GameActivity;
import com.example.phonicsapp.HandWriting.banglaletterwriting.NumberSprites;

public class MonkeyTutorial 
{

	//creating monkeyTutorial
	public static void monkeyTutorialCreate()
	{
		GameActivity.monkeyTutorial = new AnimatedSprite(100, -800, GameActivity.mMonkeyTextureRegion,
				GameActivity.vertexBufferObjectManager) 
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, 
					final float pTouchAreaLocalY) 
			{
				switch (pSceneTouchEvent.getAction())
				{
				case TouchEvent.ACTION_DOWN: 
				{

				}
					break;

				case TouchEvent.ACTION_UP:

					break;

				}

				return true;
			}
		};
		
		//animating the monkey tutorial
		GameActivity.monkeyTutorial.animate(new long[] { 50, 50, 50, 50, 50, 4000,
				50, 50, 50, 50 }, 0, 9, true);
		GameActivity.monkeyTutorial.setScale((float) 0.6);
		GameActivity.mScene.registerTouchArea(GameActivity.monkeyTutorial);
		GameActivity.mScene.attachChild(GameActivity.monkeyTutorial);
		
	}

	
	//starting the monkey tutorial
	public static void monkeyTutorialstart(final int numberOfLines, 
			
			final float xA1, final float yA1, final float xA2, final float yA2,

			final float x1, final float y1, final float x2, final float y2,final float x3, final float y3,
			final float x4, final float y4, final float x5,final float y5, final float x6, final float y6,
			final float x7, final float y7, final float x8, final float y8, final float x9, final float y9,
			final float x10, final float y10, final float x11, final float y11,final float x12, final float y12,
			final float x13, final float y13,
			
			final float xB1, final float yB1, final float xB2, final float yB2,final float xB3, final float yB3,
			final float xB4, final float yB4,
			
			final float xC1, final float yC1, final float xC2, final float yC2
			)
	{

		Path createMonkeyPath = new Path(2).to(100, -600).to(0, -230);

		GameActivity.monkeyTutorial.registerEntityModifier(new PathModifier(
				(float) 4.3, createMonkeyPath, null, new IPathModifierListener() 
				{
					@Override
					public void onPathStarted(final PathModifier pPathModifier,
							final IEntity pEntity)
					{
						
					}

					@Override
					public void onPathWaypointStarted(final PathModifier pPathModifier,
							final IEntity pEntity, final int pWaypointIndex) 
					{

					}

					@Override
					public void onPathWaypointFinished(final PathModifier pPathModifier,
							final IEntity pEntity, final int pWaypointIndex) 
					{

					}

					@Override
					public void onPathFinished(final PathModifier pPathModifier,
							final IEntity pEntity) 
					{
						// adding some delay
						GameActivity.mScene.registerUpdateHandler(new TimerHandler(
										(float) 3.0, new ITimerCallback() 
										{
											@Override
											public void onTimePassed(TimerHandler pTimerHandler) 
											{
												// TODO Auto-generated method stub

												// draw the animation tutorial
												AnimationDrawTutorial.animatedChalk1(
														numberOfLines,
														
														xA1, yA1, xA2, yA2,
														
														x1, y1, x2, y2, x3, y3, x4, y4,
														x5, y5, x6, y6, x7, y7, x8, y8,
														x9, y9, x10, y10, x11, y11, x12, 
														y12, x13, y13,
														
														xB1, yB1, xB2, yB2, xB3, yB3,
														xB4, yB4,
														
														xC1, yC1, xC2, yC2
														);
											}
										}));

					}
				}, EaseBounceOut.getInstance()));
	}

	
	// monkey tutorial animation draw
	public static void monkeyTutorialAnimationDraw(float x, float y)
	{
		GameActivity.bCounter++;
		GameActivity.tutorialWhiteChalk[GameActivity.bCounter] = new Sprite(x,y, 
				GameActivity.mWhiteChalkTextureRegion, GameActivity.vertexBufferObjectManager);
		GameActivity.tutorialWhiteChalk[GameActivity.bCounter].setZIndex(2);
		GameActivity.mScene.attachChild(GameActivity.tutorialWhiteChalk[GameActivity.bCounter]);
		GameActivity.tutorialWhiteChalk[GameActivity.bCounter].setScale((float) 0.6);
		GameActivity.mScene.sortChildren();
		//Debug.d("bCounter:" + MainActivity.bCounter);

		// removing number sprite during the tutorial
		for (int a = 1; a < 4; a++)
		{
			if (GameActivity.numberSprites[a] != null)
			{
				if (GameActivity.tutorialWhiteChalk[GameActivity.bCounter].getX() >
				GameActivity.numberSprites[a].getX() + 60)
				{
					GameActivity.mScene.detachChild(GameActivity.numberSprites[a]);
				}
			}
		}
		
		
	}
	
	
}
