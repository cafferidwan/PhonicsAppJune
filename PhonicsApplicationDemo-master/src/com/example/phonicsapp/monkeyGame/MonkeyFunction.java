package com.example.phonicsapp.monkeyGame;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.PathModifier;
import org.andengine.entity.modifier.PathModifier.IPathModifierListener;
import org.andengine.entity.modifier.PathModifier.Path;
import org.andengine.entity.sprite.Sprite;
import org.andengine.util.modifier.ease.EaseSineInOut;

public class MonkeyFunction 
{

	//add banana when touched the correct letter
	public static void addFace(final float pX, final float pY) 
	{
		MonkeyGameActivity.distance = (float) (MonkeyGameActivity.CAMERA_WIDTH/5.3 );
		MonkeyGameActivity.mFaceCount = MonkeyGameActivity.mFaceCount+MonkeyGameActivity.distance;
		MonkeyGameActivity.aCount = MonkeyGameActivity.aCount+1;
		MonkeyGameActivity.bananaValue = 0;
		
		//if 5 banana is added then game over
		if(MonkeyGameActivity.aCount==5)
		{

			MonkeyGameActivity.mScene.clearUpdateHandlers();
			MonkeyGameActivity.mScene.clearEntityModifiers();
			MonkeyGameActivity.mScene.clearTouchAreas();
			MonkeyGameActivity.mScene.clearChildScene();
			//Finishing the game
			MonkeyGameActivity.mScene.registerUpdateHandler(new TimerHandler(2, new ITimerCallback() 
			{
				
				@Override
				public void onTimePassed(TimerHandler pTimerHandler)
				{
					// TODO Auto-generated method stub
					MonkeyGameActivity.aCount = 0;
					MonkeyGameActivity.mFaceCount = -100;
					MonkeyGameActivity.startActivity();
				}
			}));
		}
			Path bananaPath = null ;
			//change reward object according to the letter
			
			//if letter are mo, aa, lo, ko, to
			if(MonkeyGameActivity.monkeyGameMenuLetterSelector==1||MonkeyGameActivity.monkeyGameMenuLetterSelector==2||MonkeyGameActivity.monkeyGameMenuLetterSelector==5||
					MonkeyGameActivity.monkeyGameMenuLetterSelector==8||MonkeyGameActivity.monkeyGameMenuLetterSelector==18)
			{
				MonkeyGameActivity.position[MonkeyGameActivity.aCount] = new Sprite(0, 50 , MonkeyGameActivity.mFaceTextureRegionBanana,MonkeyGameActivity.vbo); 
				MonkeyGameActivity.position[MonkeyGameActivity.aCount].setWidth(MonkeyGameActivity.ImageWidthObjects-22);
				MonkeyGameActivity.position[MonkeyGameActivity.aCount].setHeight(MonkeyGameActivity.ImageHeightObjects-22);
			
				bananaPath = new Path(2).to(MonkeyGameActivity.CAMERA_WIDTH/2, -100).to(MonkeyGameActivity.mFaceCount, MonkeyGameActivity.CAMERA_HEIGHT - MonkeyGameActivity.CAMERA_HEIGHT/3 + 30 );
			}
			//if letter are raw, talibasha, do, a, doh
			else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==4||MonkeyGameActivity.monkeyGameMenuLetterSelector==7||MonkeyGameActivity.monkeyGameMenuLetterSelector==15||
					MonkeyGameActivity.monkeyGameMenuLetterSelector==16||MonkeyGameActivity.monkeyGameMenuLetterSelector==20)
			{
				MonkeyGameActivity.position[MonkeyGameActivity.aCount] = new Sprite(0, 50 , MonkeyGameActivity.mFaceTextureRegionCup,MonkeyGameActivity.vbo); 
			
				MonkeyGameActivity.position[MonkeyGameActivity.aCount].setWidth(MonkeyGameActivity.ImageWidthObjects+10);
				MonkeyGameActivity.position[MonkeyGameActivity.aCount].setHeight(MonkeyGameActivity.ImageHeightObjects+10);
			
				bananaPath = new Path(2).to(MonkeyGameActivity.CAMERA_WIDTH/2, -100).to(MonkeyGameActivity.mFaceCount, MonkeyGameActivity.CAMERA_HEIGHT - MonkeyGameActivity.CAMERA_HEIGHT/3 + 30 );
			}
			//if letter are bo, no, cho, e, po
			else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==3||MonkeyGameActivity.monkeyGameMenuLetterSelector==6||MonkeyGameActivity.monkeyGameMenuLetterSelector==9||
					MonkeyGameActivity.monkeyGameMenuLetterSelector==13||MonkeyGameActivity.monkeyGameMenuLetterSelector==14)
			{
				MonkeyGameActivity.position[MonkeyGameActivity.aCount] = new Sprite(0, 50 , MonkeyGameActivity.mFaceTextureRegionFish,MonkeyGameActivity.vbo); 
		
				MonkeyGameActivity.position[MonkeyGameActivity.aCount].setWidth(MonkeyGameActivity.ImageWidthObjects-22);
				MonkeyGameActivity.position[MonkeyGameActivity.aCount].setHeight(MonkeyGameActivity.ImageHeightObjects-22);
			
				bananaPath = new Path(2).to(MonkeyGameActivity.CAMERA_WIDTH/2, -100).to(MonkeyGameActivity.mFaceCount, MonkeyGameActivity.CAMERA_HEIGHT - MonkeyGameActivity.CAMERA_HEIGHT/3 -20 );
			}
			//if letter are toh, kho, u, go, ho
			else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==19||MonkeyGameActivity.monkeyGameMenuLetterSelector==12||MonkeyGameActivity.monkeyGameMenuLetterSelector==17||
					MonkeyGameActivity.monkeyGameMenuLetterSelector==10||MonkeyGameActivity.monkeyGameMenuLetterSelector==11)
			{
				MonkeyGameActivity.position[MonkeyGameActivity.aCount] = new Sprite(0, 50 , MonkeyGameActivity.mFaceTextureRegionAlien,MonkeyGameActivity.vbo); 
			
				MonkeyGameActivity.position[MonkeyGameActivity.aCount].setWidth(MonkeyGameActivity.ImageWidthObjects+10);
				MonkeyGameActivity.position[MonkeyGameActivity.aCount].setHeight(MonkeyGameActivity.ImageHeightObjects+10);
			
				bananaPath = new Path(2).to(MonkeyGameActivity.CAMERA_WIDTH/2, -100).to(MonkeyGameActivity.mFaceCount, MonkeyGameActivity.CAMERA_HEIGHT - MonkeyGameActivity.CAMERA_HEIGHT/3 + 30 );
			}
			MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.position[MonkeyGameActivity.aCount]);
			MonkeyGameActivity.position[MonkeyGameActivity.aCount].setZIndex(1);
			MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.position[MonkeyGameActivity.aCount]);
			MonkeyGameActivity.mScene.sortChildren();
			
			
			MonkeyGameActivity.position[MonkeyGameActivity.aCount].registerEntityModifier(new PathModifier((float) 1, bananaPath, null, new IPathModifierListener() 
			{
				@Override
				public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
				{
					//Debug.d("onPathStarted");
				}

				@Override
				public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
				{
					//Debug.d("onPathWaypointStarted:  " + pWaypointIndex);
				}

				@Override
				public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) 
				{
					//Debug.d("onPathWaypointFinished: " + pWaypointIndex);
				}

				@Override
				public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity)
				{
					//Debug.d("onPathFinished");
					
				}
			}, EaseSineInOut.getInstance()));
		}

	//monkey before taking the object
	public static void monkey1()
	{
		//load monkey according to the level
		
		//if letter are mo, aa, lo, ko, to
		if(MonkeyGameActivity.monkeyGameMenuLetterSelector==1||MonkeyGameActivity.monkeyGameMenuLetterSelector==2||MonkeyGameActivity.monkeyGameMenuLetterSelector==5||
				MonkeyGameActivity.monkeyGameMenuLetterSelector==8||MonkeyGameActivity.monkeyGameMenuLetterSelector==18)
		{
			MonkeyGameActivity.monkey1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutBanana,
					MonkeyGameActivity.vbo);
		}
		//if letter are raw, talibasha, do, a, doh
		else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==4||MonkeyGameActivity.monkeyGameMenuLetterSelector==7||MonkeyGameActivity.monkeyGameMenuLetterSelector==15||
				MonkeyGameActivity.monkeyGameMenuLetterSelector==16||MonkeyGameActivity.monkeyGameMenuLetterSelector==20)
		{
			MonkeyGameActivity.monkey1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutCup,
					MonkeyGameActivity.vbo);
		}
		//if letter are bo, no, cho, e, po
		else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==3||MonkeyGameActivity.monkeyGameMenuLetterSelector==6||MonkeyGameActivity.monkeyGameMenuLetterSelector==9||
				MonkeyGameActivity.monkeyGameMenuLetterSelector==13||MonkeyGameActivity.monkeyGameMenuLetterSelector==14)
		{
			MonkeyGameActivity.monkey1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutFish,
					MonkeyGameActivity.vbo);
		}
		//if letter are toh, kho, u, go, ho
		else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==19||MonkeyGameActivity.monkeyGameMenuLetterSelector==12||MonkeyGameActivity.monkeyGameMenuLetterSelector==17||
				MonkeyGameActivity.monkeyGameMenuLetterSelector==10||MonkeyGameActivity.monkeyGameMenuLetterSelector==11)
		{
			MonkeyGameActivity.monkey1 = new Sprite(0, 50, MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutAlien,
					MonkeyGameActivity.vbo);
		}
		
		MonkeyGameActivity.monkey1.setWidth(MonkeyGameActivity.ImageWidth);
		MonkeyGameActivity.monkey1.setHeight(MonkeyGameActivity.ImageHeight);
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.monkey1);
		MonkeyGameActivity.monkey1.setVisible(true);
		
		MonkeyGameActivity.value = 0;
		
		final Path monkey1Path = new Path(2).to(MonkeyGameActivity.CAMERA_WIDTH/2,-400).to(MonkeyGameActivity.position[MonkeyGameActivity.aCount].getX(),(float) (MonkeyGameActivity.position[MonkeyGameActivity.aCount].getY()-MonkeyGameActivity.CAMERA_HEIGHT/1.4)); 
		MonkeyGameActivity.monkey1.registerEntityModifier(new PathModifier((float) 1.4, monkey1Path, null, new IPathModifierListener() 
		{
			@Override
			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				//Debug.d("onPathStarted");
			}

			@Override
			public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			{
				//Debug.d("onPathWaypointStarted:  " + pWaypointIndex);
				
			}

			@Override
			public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			{
				//Debug.d("onPathWaypointFinished: " + pWaypointIndex);
			}

			@Override
			public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity)
			{
				//Debug.d("onPathFinished");
				MonkeyGameActivity.monkey1.setVisible(false);
				MonkeyGameActivity.mFaceCount=MonkeyGameActivity.mFaceCount-MonkeyGameActivity.distance;
				
				monkey2();
			}
		}, EaseSineInOut.getInstance()));
	}
	
	//monkey after taking the object
	public static void monkey2()
	{
		//load monkey and reward object according to the level
		
		//if letter are mo, aa, lo, ko, to
		if(MonkeyGameActivity.monkeyGameMenuLetterSelector==1||MonkeyGameActivity.monkeyGameMenuLetterSelector==2||MonkeyGameActivity.monkeyGameMenuLetterSelector==5||
				MonkeyGameActivity.monkeyGameMenuLetterSelector==8||MonkeyGameActivity.monkeyGameMenuLetterSelector==18)
		{
			MonkeyGameActivity.monkey2 = new Sprite(MonkeyGameActivity.position[MonkeyGameActivity.aCount].getX(), 
					(float) (MonkeyGameActivity.position[MonkeyGameActivity.aCount].getY()-MonkeyGameActivity.CAMERA_HEIGHT/1.4),
					MonkeyGameActivity.mFaceTextureRegionMonkeyWithBanana, MonkeyGameActivity.vbo);
		}
		//if letter are raw, talibasha, do, a, doh
		else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==4||MonkeyGameActivity.monkeyGameMenuLetterSelector==7||MonkeyGameActivity.monkeyGameMenuLetterSelector==15||
				MonkeyGameActivity.monkeyGameMenuLetterSelector==16||MonkeyGameActivity.monkeyGameMenuLetterSelector==20)
		{
			MonkeyGameActivity.monkey2 = new Sprite(MonkeyGameActivity.position[MonkeyGameActivity.aCount].getX(), 
					(float) (MonkeyGameActivity.position[MonkeyGameActivity.aCount].getY()-MonkeyGameActivity.CAMERA_HEIGHT/1.4),
					MonkeyGameActivity.mFaceTextureRegionMonkeyWithCup, MonkeyGameActivity.vbo);
		}
		//if letter are bo, no, cho, e, po
		else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==3||MonkeyGameActivity.monkeyGameMenuLetterSelector==6||MonkeyGameActivity.monkeyGameMenuLetterSelector==9||
				MonkeyGameActivity.monkeyGameMenuLetterSelector==13||MonkeyGameActivity.monkeyGameMenuLetterSelector==14)
		{
			MonkeyGameActivity.monkey2 = new Sprite(MonkeyGameActivity.position[MonkeyGameActivity.aCount].getX(), 
					(float) (MonkeyGameActivity.position[MonkeyGameActivity.aCount].getY()-MonkeyGameActivity.CAMERA_HEIGHT/1.4),
					MonkeyGameActivity.mFaceTextureRegionMonkeyWithFish, MonkeyGameActivity.vbo);
		}
		//if letter are toh, kho, u, go, ho
		else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==19||MonkeyGameActivity.monkeyGameMenuLetterSelector==12||MonkeyGameActivity.monkeyGameMenuLetterSelector==17||
				MonkeyGameActivity.monkeyGameMenuLetterSelector==10||MonkeyGameActivity.monkeyGameMenuLetterSelector==11)
		{
			MonkeyGameActivity.monkey2 = new Sprite(MonkeyGameActivity.position[MonkeyGameActivity.aCount].getX(), 
					(float) (MonkeyGameActivity.position[MonkeyGameActivity.aCount].getY()-MonkeyGameActivity.CAMERA_HEIGHT/1.4),
					MonkeyGameActivity.mFaceTextureRegionMonkeyWithAlien, MonkeyGameActivity.vbo);
		}
		
		
		MonkeyGameActivity.monkey2.setWidth(MonkeyGameActivity.ImageWidth);
		MonkeyGameActivity.monkey2.setHeight(MonkeyGameActivity.ImageHeight);
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.monkey2);
		
		final Path monkey2Path = new Path(2).to(MonkeyGameActivity.position[MonkeyGameActivity.aCount].getX(),(float) (MonkeyGameActivity.position[MonkeyGameActivity.aCount].getY()-MonkeyGameActivity.CAMERA_HEIGHT/1.4)).to(MonkeyGameActivity.CAMERA_WIDTH/2,-600);
		MonkeyGameActivity.monkey2.registerEntityModifier(new PathModifier((float)1.5, monkey2Path, null, new IPathModifierListener()
		{
			@Override
			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				//Debug.d("onPathStarted");
			}
			@Override
			public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) 
			{
				//Debug.d("onPathWaypointStarted:  " + pWaypointIndex);
				
			}
			@Override
			public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) 
			{
				//Debug.d("onPathWaypointFinished: " + pWaypointIndex);
			}

			@Override
			public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				//Debug.d("onPathFinished");
				MonkeyGameActivity.monkey2.setVisible(false);
			}
		}, EaseSineInOut.getInstance()));
		
		MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.position[MonkeyGameActivity.aCount]);
		MonkeyGameActivity.position[MonkeyGameActivity.aCount]=null;
		MonkeyGameActivity.aCount = MonkeyGameActivity.aCount - 1;
	}
}
