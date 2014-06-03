package com.example.phonicsapp.boxGame;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;

public class TimerHandlers
{

	public static void checkObjectCollisions() 
	{

		// timer1 for checking if the any object collides with the box
		BoxGameActivity.timer1 = new TimerHandler(1.0f / 120, true, new ITimerCallback() 
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler) 
			{
				// TODO Auto-generated method stub

				// Mula
				if (Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj1) == 1
						|| Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj1) == 2)
				{
					BoxGameActivity.openedBox.setVisible(true);
					BoxGameActivity.closedBox.setVisible(false);

					if (Objects.touchFlag == false)
					{
						Functions.fadeOut(BoxGameActivity.obj1);
					}
				}
				// Ma
				else if (Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj2) == 1
						|| Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj2) == 2)
				{
					if (BoxGameActivity.disableCol == 0) 
					{
						BoxGameActivity.openedBox.setVisible(true);
						BoxGameActivity.closedBox.setVisible(false);

						if (Objects.touchFlag == false)
						{
							Functions.fadeOut(BoxGameActivity.obj2);
						}
					} 
					else 
					{
						BoxGameActivity.openedBox.setVisible(false);
						BoxGameActivity.closedBox.setVisible(true);
					}
				}

				// Mohis
				else if (Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj3) == 1
						|| Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj3) == 2)
				{
					BoxGameActivity.openedBox.setVisible(true);
					BoxGameActivity.closedBox.setVisible(false);

					if (Objects.touchFlag == false) 
					{
						Functions.fadeOut(BoxGameActivity.obj3);
					}
				}

				// Megh
				else if (Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj4) == 1
						|| Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj4) == 2) 
				{
					BoxGameActivity.openedBox.setVisible(true);
					BoxGameActivity.closedBox.setVisible(false);

					if (Objects.touchFlag == false) 
					{
						Functions.fadeOut(BoxGameActivity.obj4);
					}
				}

				// Moi
				else if (Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj5) == 1
						|| Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj5) == 2) 
				{
					BoxGameActivity.openedBox.setVisible(true);
					BoxGameActivity.closedBox.setVisible(false);

					if (Objects.touchFlag == false) 
					{
						Functions.fadeOut(BoxGameActivity.obj5);
					}
				}

				// Mama
				else if (Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj6) == 1
						|| Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.obj6) == 2) 
				{ 
					BoxGameActivity.openedBox.setVisible(true);
					BoxGameActivity.closedBox.setVisible(false);

					if (Objects.touchFlag == false)
					{
						Functions.fadeOut(BoxGameActivity.obj6);
					}
				}

				else if (Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.wrongObj1) == 1
						|| Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.wrongObj1) == 2) 
				{
					BoxGameActivity.openedBox.setVisible(true);
					BoxGameActivity.closedBox.setVisible(false);

					if (Objects.touchFlag == false) 
					{
						// Create jump
						Functions.jump(BoxGameActivity.wrongObj1, 0);
					}
				}

				// Keram board
				else if (Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.wrongObj2) == 1
						|| Functions.collisoinCheck(BoxGameActivity.closedBox, BoxGameActivity.wrongObj2) == 2)
				{
					if (BoxGameActivity.disableCol == 0)
					{
						BoxGameActivity.openedBox.setVisible(true);
						BoxGameActivity.closedBox.setVisible(false);

						if (Objects.touchFlag == false) 
						{
							// Create jump
							Functions.jump(BoxGameActivity.wrongObj2, 1);
						}
					} 
					else 
					{
						BoxGameActivity.openedBox.setVisible(false);
						BoxGameActivity.closedBox.setVisible(true);
					}
				}

				else 
				{
					BoxGameActivity.openedBox.setVisible(false);
					BoxGameActivity.closedBox.setVisible(true);
				}
				
				
				// if all the items are in the box
				if (!(BoxGameActivity.obj3.getX() >= 0) && !(BoxGameActivity.obj2.getX() >= 0)
						&& !(BoxGameActivity.obj6.getX() >= 0) && !(BoxGameActivity.obj4.getX() >= 0)
						&& !(BoxGameActivity.obj1.getX() >= 0) && !(BoxGameActivity.obj5.getX() >= 0))
				{
					BoxGameActivity.counter++;
					if (BoxGameActivity.counter == 1) 
					{
						BoxGameActivity.startActivity();
					}
				}

			}
		});
		
		BoxGameActivity.mScene.registerUpdateHandler(BoxGameActivity.timer1);
	}

	//Exchange wrong objects with right ones
	public static void ExchangeObjects() 
	{
		// Exchange the wrong objects with right one
		BoxGameActivity.timer2 = new TimerHandler((float) 5, true, new ITimerCallback() 
		{
					@Override
					public void onTimePassed(TimerHandler pTimerHandler)
					{
						// TODO Auto-generated method stub

						if (Objects.touchFlag1 == false)
						{
							if (!(BoxGameActivity.obj1.getX() >= 0)|| !(BoxGameActivity.wrongObj1.getX() >= 0)) 
							{
								// Log.d("a.x",""+a.getX());
								// Log.d("b.x",""+b.getX());
							}
							else
							{
								Functions.ExchangePosition(
										BoxGameActivity.obj1,
										BoxGameActivity.wrongObj1);
								Functions.ExchangePosition(
										BoxGameActivity.wrongObj1,
										BoxGameActivity.obj1);
							}
						}

					}
				});
		BoxGameActivity.mScene.registerUpdateHandler(BoxGameActivity.timer2);

		// Exchange the wrong objects with right one
		BoxGameActivity.timer3 = new TimerHandler((float) 3.5, true, new ITimerCallback()
		{
					@Override
					public void onTimePassed(TimerHandler pTimerHandler) 
					{
						// TODO Auto-generated method stub

						if (Objects.touchFlag2 == false)
						{
							if (!(BoxGameActivity.obj2.getX() >= 0)
									|| !(BoxGameActivity.wrongObj2.getX() >= 0)) 
							{
								// Log.d("a.x",""+a.getX());
								// Log.d("b.x",""+b.getX());
							} 
							else
							{
								Functions.ExchangePosition(
										BoxGameActivity.obj2,
										BoxGameActivity.wrongObj2);
								Functions.ExchangePosition(
										BoxGameActivity.wrongObj2,
										BoxGameActivity.obj2);
							}

						}
					}
				});
		BoxGameActivity.mScene.registerUpdateHandler(BoxGameActivity.timer3);
	}
}
