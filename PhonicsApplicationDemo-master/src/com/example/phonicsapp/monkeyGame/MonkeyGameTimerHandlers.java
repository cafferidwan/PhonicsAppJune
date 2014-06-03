package com.example.phonicsapp.monkeyGame;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;

public class MonkeyGameTimerHandlers 
{

	// selecting random items
	public static void selectRandromObjects() 
	{
		//Choosing random items and playing
		MonkeyGameActivity.timer1 = new TimerHandler(5, true,new ITimerCallback() 
		{
					@Override
					public void onTimePassed(TimerHandler pTimerHandler)
					{
						// TODO Auto-generated method stub

						// Loading the Objects according to the game letter
						LoadObject.LoadObjects(MonkeyGameActivity.monkeyGameMenuLetterSelector);

						MonkeyGameActivity.randomItem = (int) (Math.random() * 12);
						MonkeyGameActivity.randomItem1 = (int) (Math.random() * 12);
						if (MonkeyGameActivity.randomItem == MonkeyGameActivity.randomItem1)
						{
							MonkeyGameActivity.randomItem1 = MonkeyGameActivity.randomItem1 + 2;
						}

						if (MonkeyGameActivity.randomItem == 0
								&& MonkeyGameActivity.randomItem1 == 1
								|| MonkeyGameActivity.randomItem == 1
								&& MonkeyGameActivity.randomItem1 == 0) 
						{
							MonkeyGameActivity.randomItem1 = MonkeyGameActivity.randomItem1 + 2;
						}
						
						if(MonkeyGameActivity.monkeyGameMenuLetterSelector==1)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==2)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==3)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==4)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==5)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==6)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==7)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==8)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==9)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==10)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==11)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==12)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==13)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==14)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==15)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==16)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==17)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==18)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==19)
						{
							setLevelObject();
						}
						else if(MonkeyGameActivity.monkeyGameMenuLetterSelector==20)
						{
							setLevelObject();
						}

		
					}
				});
		
		MonkeyGameActivity.mScene.registerUpdateHandler(MonkeyGameActivity.timer1);
	}
	
	//setting the line(stright/zig zag) of objects according to the level
	public static void setLevelObject()
	{
		
		switch (MonkeyGameActivity.randomItem) 
		{
		case 0:
			GameObjects.wrongObj1(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;

		case 1:
			GameObjects.wrongObj2(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;
			
		case 2:
			GameObjects.wrongObj3(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;

		case 3:
			GameObjects.wrongObj4(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;
		
		case 4:
			GameObjects.wrongObj5(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;
		
		case 5:
			GameObjects.wrongObj6(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;	
		case 6:
			GameObjects.obj1(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;

		case 7:
			GameObjects.obj2(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;

		case 8:
			GameObjects.obj3(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;

		case 9:
			GameObjects.obj4(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;

		case 10:
			GameObjects.obj5(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;
	
		case 11:
			GameObjects.obj6(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 1);
			break;


		default:
			// GameObjects.obj3(2,1);
			break;
		}

		switch (MonkeyGameActivity.randomItem1)
		{
		case 0:
			GameObjects.wrongObj1(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;

		case 1:
			GameObjects.wrongObj2(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;
		
		case 2:
			GameObjects.wrongObj3(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;

		case 3:
			GameObjects.wrongObj4(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;

		case 4:
			GameObjects.wrongObj5(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;

		case 5:
			GameObjects.wrongObj6(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;
			
		case 6:
			GameObjects.obj1(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;

		case 7:
			GameObjects.obj2(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;

		case 8:
			GameObjects.obj3(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;

		case 9:
			GameObjects.obj4(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;
		
		case 10:
			GameObjects.obj5(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;

		case 11:
			GameObjects.obj6(MonkeyGameActivity.monkeyGameLevelSelector1[MonkeyGameActivity.monkeyGameMenuLetterSelector], 2);
			break;

		default:
			// GameObjects.obj3(2,2);
			break;
		}
	}
}
