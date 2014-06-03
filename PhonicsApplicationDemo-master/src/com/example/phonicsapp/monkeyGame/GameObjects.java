package com.example.phonicsapp.monkeyGame;

import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.AlphaModifier;
import org.andengine.entity.modifier.PathModifier;
import org.andengine.entity.modifier.PathModifier.IPathModifierListener;
import org.andengine.entity.modifier.PathModifier.Path;
import org.andengine.entity.sprite.Sprite;
import org.andengine.util.modifier.ease.EaseSineInOut;

import com.example.phonicsapp.boxGame.BoxGameActivity;

public class GameObjects 
{
	static float ax, ay, bx, by;
	
	public static void createObjects(int a)
	{
		if(a==1||a==2||a==5||a==8||a==18)
		{
			MonkeyGameActivity.backGround = new Sprite(0, 0, MonkeyGameActivity.mJungleBackGroundTextureRegion,
					MonkeyGameActivity.MonkeyGameActivityActivity.getVertexBufferObjectManager());
			MonkeyGameActivity.backGround.setWidth(MonkeyGameActivity.CAMERA_WIDTH);
			MonkeyGameActivity.backGround.setHeight(MonkeyGameActivity.CAMERA_HEIGHT);
			MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.backGround);
		}
		else if(a==4||a==7||a==15||a==16||a==20)
		{
			MonkeyGameActivity.backGround = new Sprite(0, 0, MonkeyGameActivity.mUnderWaterBackGroundTextureRegion,
					MonkeyGameActivity.MonkeyGameActivityActivity.getVertexBufferObjectManager());
			MonkeyGameActivity.backGround.setWidth(MonkeyGameActivity.CAMERA_WIDTH);
			MonkeyGameActivity.backGround.setHeight(MonkeyGameActivity.CAMERA_HEIGHT);
			MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.backGround);
			//create box side layer
			for(int i=1;i<=5;i++)
			{
				MonkeyGameActivity.boxSide[i] = new Sprite(i*160-216, 256, MonkeyGameActivity.mBoxSideTextureRegion,
						MonkeyGameActivity.MonkeyGameActivityActivity.getVertexBufferObjectManager());
				MonkeyGameActivity.boxSide[i].setScale((float) 0.5);
				MonkeyGameActivity.boxSide[i].setZIndex(2);
//			MonkeyGameActivity.boxSide.setWidth(MonkeyGameActivity.CAMERA_WIDTH);
//			MonkeyGameActivity.boxSide.setHeight(MonkeyGameActivity.CAMERA_HEIGHT);
				MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.boxSide[i]);
				
			}
			
		}
		else if(a==6||a==3||a==9||a==13||a==14)
		{
			MonkeyGameActivity.backGround = new Sprite(0, 0, MonkeyGameActivity.mBeachBackGroundTextureRegion,
					MonkeyGameActivity.MonkeyGameActivityActivity.getVertexBufferObjectManager());
			MonkeyGameActivity.backGround.setWidth(MonkeyGameActivity.CAMERA_WIDTH);
			MonkeyGameActivity.backGround.setHeight(MonkeyGameActivity.CAMERA_HEIGHT);
			MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.backGround);
		}
		else if(a==19||a==10||a==11||a==12||a==17)
		{
			MonkeyGameActivity.backGround = new Sprite(0, 0, MonkeyGameActivity.mPlanetBackGroundTextureRegion,
					MonkeyGameActivity.MonkeyGameActivityActivity.getVertexBufferObjectManager());
			MonkeyGameActivity.backGround.setWidth(MonkeyGameActivity.CAMERA_WIDTH);
			MonkeyGameActivity.backGround.setHeight(MonkeyGameActivity.CAMERA_HEIGHT);
			MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.backGround);
		}
		
		
	}
	
	public static void fadeOut(final Sprite sprite)
	{
		if(sprite!= null)
		{
		AlphaModifier yourModifier = new AlphaModifier(1f, 0.5f, 0f)
		{
		        @Override
		        protected void onModifierStarted(IEntity pItem)
		        {
		                super.onModifierStarted(pItem);
		                // Your action after starting modifier
		                MonkeyGameActivity.mScene.unregisterTouchArea(sprite);
		        }
		       
		        @Override
		        protected void onModifierFinished(IEntity pItem)
		        {
		                super.onModifierFinished(pItem);
		                // Your action after finishing modifier
		                //MonkeyGameActivity.mScene.detachChild(sprite);
		        }
		};
		 
		sprite.registerEntityModifier(yourModifier);
		}
	}
	
	public static void obj1(int level, int number)
	{
		
		Path obj1Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			obj1Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				obj1Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				obj1Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
			
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.obj1);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.obj1);
		MonkeyGameActivity.obj1.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.obj1.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.obj1.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.obj1.registerEntityModifier(new PathModifier(4, obj1Path, null, new IPathModifierListener()
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
				MonkeyGameActivity.obj1.setVisible(false);
				new Runnable() 
				{
					public void run() 
					{
						//Debug.d("onPathFinished");
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.obj1);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	
	public static void obj2(int level, int number)
	{
		
		Path obj2Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			obj2Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				obj2Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				obj2Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.obj2);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.obj2);
		MonkeyGameActivity.obj2.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.obj2.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.obj2.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.obj2.registerEntityModifier(new PathModifier(4, obj2Path, null, new IPathModifierListener()
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
				MonkeyGameActivity.obj2.setVisible(false);
				new Runnable()
				{
					public void run()
					{
						//Debug.d("onPathFinished");
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.obj2);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	
	public static void obj3(int level, int number)
	{
		Path obj3Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			obj3Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				obj3Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				obj3Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.obj3);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.obj3);
		MonkeyGameActivity.obj3.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.obj3.setWidth(140);
//		MonkeyGameActivity.obj3.setHeight(77);
		
		
		MonkeyGameActivity.obj3.registerEntityModifier(new PathModifier(4, obj3Path, null, new IPathModifierListener()
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
				MonkeyGameActivity.obj3.setVisible(false);
				new Runnable()
				{
					public void run() 
					{
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.obj3);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	public static void obj4(int level, int number)
	{
		Path obj4Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			obj4Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				obj4Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				obj4Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.obj4);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.obj4);
		MonkeyGameActivity.obj4.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.obj4.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.obj4.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.obj4.registerEntityModifier(new PathModifier(4, obj4Path, null, new IPathModifierListener() 
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
				//MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.obj4);
				MonkeyGameActivity.obj4.setVisible(false);
				new Runnable() {
					public void run() 
					{
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.obj4);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	
	public static void obj5(int level, int number)
	{
		Path obj5Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			obj5Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				obj5Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				obj5Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.obj5);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.obj5);
		MonkeyGameActivity.obj5.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.obj5.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.obj5.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.obj5.registerEntityModifier(new PathModifier(4, obj5Path, null, new IPathModifierListener() 
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
				//MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.obj5);
				MonkeyGameActivity.obj5.setVisible(false);
				new Runnable() {
					public void run() 
					{
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.obj5);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	public static void obj6(int level, int number)
	{
		Path obj6Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			obj6Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				obj6Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				obj6Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.obj6);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.obj6);
		MonkeyGameActivity.obj6.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.obj6.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.obj6.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.obj6.registerEntityModifier(new PathModifier(4, obj6Path, null, new IPathModifierListener() 
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
				//MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.obj6);
				MonkeyGameActivity.obj6.setVisible(false);
				new Runnable() {
					public void run() 
					{
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.obj6);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	public static void wrongObj1(int level, int number)
	{
		Path wrongObj1Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			wrongObj1Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				wrongObj1Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				wrongObj1Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.wrongObj1);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.wrongObj1);
		MonkeyGameActivity.wrongObj1.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.wrongObj1.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.wrongObj1.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.wrongObj1.registerEntityModifier(new PathModifier(4, wrongObj1Path, null, new IPathModifierListener() 
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
				//MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.wrongObj1);
				MonkeyGameActivity.wrongObj1.setVisible(false);
				new Runnable() 
				{
					public void run()
					{
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.wrongObj1);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	
	public static void wrongObj2(int level, int number)
	{
	Path wrongObj2Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			wrongObj2Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				wrongObj2Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				wrongObj2Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.wrongObj2);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.wrongObj2);
		MonkeyGameActivity.wrongObj2.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.wrongObj2.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.wrongObj2.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.wrongObj2.registerEntityModifier(new PathModifier(4, wrongObj2Path, null, new IPathModifierListener() 
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
				MonkeyGameActivity.wrongObj2.setVisible(false);
				new Runnable() 
				{
					public void run()
					{
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.wrongObj2);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	
	public static void wrongObj3(int level, int number)
	{
	Path wrongObj3Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			wrongObj3Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				wrongObj3Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				wrongObj3Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.wrongObj3);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.wrongObj3);
		MonkeyGameActivity.wrongObj3.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.wrongObj3.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.wrongObj3.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.wrongObj3.registerEntityModifier(new PathModifier(4, wrongObj3Path, null, new IPathModifierListener() 
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
				MonkeyGameActivity.wrongObj3.setVisible(false);
				new Runnable() 
				{
					public void run()
					{
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.wrongObj3);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	
	public static void wrongObj4(int level, int number)
	{
	Path wrongObj4Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			wrongObj4Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				wrongObj4Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				wrongObj4Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.wrongObj4);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.wrongObj4);
		MonkeyGameActivity.wrongObj4.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.wrongObj4.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.wrongObj4.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.wrongObj4.registerEntityModifier(new PathModifier(4, wrongObj4Path, null, new IPathModifierListener() 
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
				MonkeyGameActivity.wrongObj4.setVisible(false);
				new Runnable() 
				{
					public void run()
					{
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.wrongObj4);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	public static void wrongObj5(int level, int number)
	{
	Path wrongObj5Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			wrongObj5Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				wrongObj5Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				wrongObj5Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.wrongObj5);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.wrongObj5);
		MonkeyGameActivity.wrongObj5.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.wrongObj5.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.wrongObj5.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.wrongObj5.registerEntityModifier(new PathModifier(4, wrongObj5Path, null, new IPathModifierListener() 
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
				MonkeyGameActivity.wrongObj5.setVisible(false);
				new Runnable() 
				{
					public void run()
					{
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.wrongObj5);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
	public static void wrongObj6(int level, int number)
	{
	Path wrongObj6Path = null;
		
		if(level == 0)
		{
			if(number == 1)
			{
				ax = -150;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
				
				bx = MonkeyGameActivity.CAMERA_WIDTH+20;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 20;
			}
			else if(number == 2)
			{
				ax = MonkeyGameActivity.CAMERA_WIDTH+20;
				ay = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
				
				bx = -150;
				by = MonkeyGameActivity.CAMERA_HEIGHT/2 - 170;
			}
			wrongObj6Path = new Path(2).to(ax, ay ).to(bx, by);
		}
		else if(level == 1)
		{
			if(number == 1)
			{
				wrongObj6Path = new Path(5).to(-20,0).to(MonkeyGameActivity.CAMERA_WIDTH/4, MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, 0).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3),MonkeyGameActivity.CAMERA_HEIGHT/2).
						to(MonkeyGameActivity.CAMERA_WIDTH+20, 0);
			}
			else if(number == 2)
			{
				wrongObj6Path = new Path(5).to(MonkeyGameActivity.CAMERA_WIDTH+20,MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH*(4/3), 0).
						to(MonkeyGameActivity.CAMERA_WIDTH/2, MonkeyGameActivity.CAMERA_HEIGHT/2).to(MonkeyGameActivity.CAMERA_WIDTH /4, 0).
						to(-20, MonkeyGameActivity.CAMERA_HEIGHT/2);
			}
		}
		
		MonkeyGameActivity.mScene.attachChild(MonkeyGameActivity.wrongObj6);
		MonkeyGameActivity.mScene.registerTouchArea(MonkeyGameActivity.wrongObj6);
		MonkeyGameActivity.wrongObj6.setScale((float) MonkeyGameActivity.monkeyGameObjectScale);
//		MonkeyGameActivity.wrongObj6.setWidth(MonkeyGameActivity.ImageWidthObjects);
//		MonkeyGameActivity.wrongObj6.setHeight(MonkeyGameActivity.ImageHeightObjects);
		
		MonkeyGameActivity.wrongObj6.registerEntityModifier(new PathModifier(4, wrongObj6Path, null, new IPathModifierListener() 
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
				MonkeyGameActivity.wrongObj6.setVisible(false);
				new Runnable() 
				{
					public void run()
					{
						MonkeyGameActivity.mScene.detachChild(MonkeyGameActivity.wrongObj6);
					}
				};
			}
		}, EaseSineInOut.getInstance()));
		
	}
}
