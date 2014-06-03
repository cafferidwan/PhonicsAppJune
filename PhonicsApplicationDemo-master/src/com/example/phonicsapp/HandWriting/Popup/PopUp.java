package com.example.phonicsapp.HandWriting.Popup;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.Entity;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.PathModifier;
import org.andengine.entity.modifier.PathModifier.IPathModifierListener;
import org.andengine.entity.modifier.PathModifier.Path;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.util.modifier.ease.EaseBounceOut;

import com.example.phonicsapp.HandWriting.banglaletterwriting.GameActivity;

public class PopUp
{
	public static IEntity popUpArea;
	public static int popValue = 0;
	static Path createPopUpPath ;

	//create book icon
	public static void createBookIcon() 
	{
		//creating pop up after book icon
		GameActivity.mScene.registerUpdateHandler(new TimerHandler((float) 0.5, new ITimerCallback()
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler) 
			{
				// TODO Auto-generated method stub
				createPopUp();
			}
		}));
				
		// create book icon
		GameActivity.bookIcon = new Sprite(0, GameActivity.CAMERA_HEIGHT - 200, 
				GameActivity.mBookIconRegion, GameActivity.vertexBufferObjectManager) 
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, 
					final float pTouchAreaLocalY)
			{
				switch (pSceneTouchEvent.getAction()) 
				{
				case TouchEvent.ACTION_DOWN:

					GameActivity.mScene.registerUpdateHandler(new TimerHandler((float) 0.6, new ITimerCallback() {
						
						@Override
						public void onTimePassed(TimerHandler pTimerHandler) 
						{
							// TODO Auto-generated method stub
							popValue = 1;
							
							//if the pop up is active, then disabling the book icon from pressing again
							if(GameActivity.isPopupActive == false && GameActivity.textureRegion!=null)
							{
								startPopUp(0);
							}
							
						}
					}));

					break;

				case TouchEvent.ACTION_UP:

					break;

				}

				return true;
			}
		};
		GameActivity.mScene.registerTouchArea(GameActivity.bookIcon);
		GameActivity.bookIcon.setScale((float) 0.6);
		GameActivity.mScene.attachChild(GameActivity.bookIcon);
		GameActivity.mScene.sortChildren();
		
	}
	
	//creating the pop up
	public static void createPopUp()
	{
		
		//creating pop up area
		popUpArea = new Entity(100, GameActivity.CAMERA_HEIGHT + 100);
		GameActivity.mScene.attachChild(popUpArea);
		popUpArea.setZIndex(5);
		
		//creating pop up window
		GameActivity.createPopUp = new Sprite(-500, -300, GameActivity.mCreatePopUpRegion,
				GameActivity.vertexBufferObjectManager);
		GameActivity.createPopUp.setScale((float) 0.5);
		popUpArea.attachChild(GameActivity.createPopUp);

		//creating right board for showing the perfect letter
		GameActivity.board = new Sprite(180, -300, GameActivity.mPopUpBlackBoardTextureRegion,
				GameActivity.vertexBufferObjectManager);
		GameActivity.board.setScale((float) 0.6);
		popUpArea.attachChild(GameActivity.board);
		
		//creating left side board for showing the drawn letter
		GameActivity.board = new Sprite(-180, -300, GameActivity.mPopUpBlackBoardTextureRegion,
				GameActivity.vertexBufferObjectManager);
		GameActivity.board.setScale((float) 0.6);
		popUpArea.attachChild(GameActivity.board);

		//creating correct letter
		//Mo
		if(GameActivity.letter == 1)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mMoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Aa
		else if(GameActivity.letter == 2)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mAaFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//E
		else if(GameActivity.letter == 3)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mEFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Raw
		else if(GameActivity.letter == 4)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mRawFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Ko
		else if(GameActivity.letter == 5)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mKoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Bo
		else if(GameActivity.letter == 6)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mBoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Talibasha
		else if(GameActivity.letter == 7)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mTalibashaFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Lo
		else if(GameActivity.letter == 8)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mLoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Po
		else if(GameActivity.letter == 9)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mPoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Go
		else if(GameActivity.letter == 10)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mGoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Ho
		else if(GameActivity.letter == 11)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mHoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Kho
		else if(GameActivity.letter == 12)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mKhoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Kho
		else if(GameActivity.letter == 13)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mChoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//No
		else if(GameActivity.letter == 14)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mNoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//A
		else if(GameActivity.letter == 15)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mAFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Do
		else if(GameActivity.letter == 16)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mDoFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//U
		else if(GameActivity.letter == 17)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mUFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//To
		else if(GameActivity.letter == 18)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mToFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Toh
		else if(GameActivity.letter == 19)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mTohFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Doh
		else if(GameActivity.letter == 20)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mDohFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Ukar
		else if(GameActivity.letter == 21)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mUkarFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Ekar
		else if(GameActivity.letter == 22)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mEkarFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Akar
		else if(GameActivity.letter == 23)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mAkarFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		//Aakar
		else if(GameActivity.letter == 24)
		{
			GameActivity.correctLetter = new Sprite(270, -130, GameActivity.mAakarFilledTextureRegion,
					GameActivity.vertexBufferObjectManager);
		}
		GameActivity.correctLetter.setScale((float) 0.4);
		popUpArea.attachChild(GameActivity.correctLetter);
		
	

		
		//closing the pop up window by pressing cross button
		GameActivity.cross = new Sprite(530, -150, GameActivity.mCrossRegion,
				GameActivity.vertexBufferObjectManager) 
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
			{
				switch (pSceneTouchEvent.getAction())
				{
				case TouchEvent.ACTION_DOWN:

					//when the handtutorial is inactive, then it works
					if(GameActivity.isHandTutorialActive == false)
					{
						popValue = 2;
					
						startPopUp(1);
					}

					break;

				case TouchEvent.ACTION_UP:

					break;

				}

				return true;
			}
		};
		GameActivity.mScene.registerTouchArea(GameActivity.cross);
		GameActivity.cross.setScale((float) 0.3);
		popUpArea.attachChild(GameActivity.cross);
	}

	//pop up function for up and down
	public static void startPopUp(final int upDown) 
	{

		GameActivity.popUpValue = upDown;

		// Down to up or opening pop up
		if (upDown == 0) 
		{
			GameActivity.isPopupActive = true;
			//Disabling the home button
			GameActivity.mScene.unregisterTouchArea(GameActivity.homeButton);

			createPopUpPath = new Path(2).to(100,
					GameActivity.CAMERA_HEIGHT + 500).to(100, 100);
		}
		// Up to down or closing pop up
		else if (upDown == 1) 
		{
			//Making the home button run again
			GameActivity.mScene.registerTouchArea(GameActivity.homeButton);
			
			createPopUpPath = new Path(2).to(100, 100).to(100,
					GameActivity.CAMERA_HEIGHT + 500);
			
			
			//create home button if not created
			if(GameActivity.isHomeButtonCreated == false)
			{
				GameActivity.isHomeButtonCreated = true;
				GameActivity.homeButton.setVisible(true);
			}
			
		}

		// If screen shot taken, then show screen shot of drawn image
		if (GameActivity.changeTexture == 1) 
		{
			GameActivity.drawnPicture = new Sprite(20, -10, GameActivity.textureRegion,
					GameActivity.vertexBufferObjectManager);
//			GameActivity.drawnPicture.setScale((float) 0.8);
			GameActivity.drawnPicture.setWidth(190);
			GameActivity.drawnPicture.setHeight(170);
			popUpArea.attachChild(GameActivity.drawnPicture);
		}

		popUpArea.registerEntityModifier(new PathModifier((float) 1.3,
				createPopUpPath, null, new IPathModifierListener() 
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
						if(upDown == 1)
						{
							GameActivity.isPopupActive = false;
						}
					}
				}, EaseBounceOut.getInstance()));
	}
}
