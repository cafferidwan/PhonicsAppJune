package com.example.phonicsapp;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.IOnSceneTouchListener;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.debug.Debug;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.MenuInflater;

import com.example.accountSystem.AccountDisplayPage;
import com.example.phonicsapp.HandWriting.banglaletterwriting.GameActivity;
import com.example.phonicsapp.animatedBook.AnimatedBookActivity;
import com.example.phonicsapp.boxGame.BoxGameActivity;
import com.example.phonicsapp.monkeyGame.MonkeyGameActivity;

public class MenuPage extends SimpleBaseGameActivity implements IOnSceneTouchListener
{

	public static int CAMERA_WIDTH, CAMERA_HEIGHT;
	public Camera mCamera;
	public static Scene menuScene;
	public static VertexBufferObjectManager vertexBufferObjectManager;
	public static MenuPage MenuInstace;

	// Menu Items
	public static BitmapTextureAtlas mBitmapTextureAtlasMenuBackground;
	public static ITextureRegion mMenuBackGroundTextureRegion;
	
	public static BitmapTextureAtlas[][] mBitmapTextureAtlasMenuLetters = new BitmapTextureAtlas[50][50];
	public static ITextureRegion[][] mMenuTextureRegionMenuLetters = new ITextureRegion[50][50];

	public static BitmapTextureAtlas mBitmapTextureAtlasMenuLettersLock ;
	public static ITextureRegion  mMenuTextureRegionMenuLettersLock ;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasAssessmentLettersLock ;
	public static ITextureRegion mTextureRegionAssessmentLettersLock ;
	public static BitmapTextureAtlas mBitmapTextureAtlasAssessmentLetters;
	public static ITextureRegion mTextureRegionAssessmentLetters ;
	
	
	public static Sprite menuBackground;
	public static Sprite[][] menuLetters = new Sprite[50][50];
	public static Sprite[] letter = new Sprite[50];
	public static Sprite[][] menuLettersLock = new Sprite[50][50];
	public static Sprite[] lock = new Sprite[50];
	//assessment letters
	public static Sprite[] assessmentLetters = new Sprite[50];
	public static Sprite[] assessmentLettersLock = new Sprite[50] ;
			
	//public int i,j;
	public static int letterNumber;
	public int menuLetterBlockSize;
	public static int counter;
	public static boolean letterEnable;
	
	@Override
	public void onBackPressed()
	{
	   
//	    BoxGameActivity.super.onBackPressed();
		finish();
		//startActivity(new Intent(getBaseContext(), GameMainPage.class));
	}
	
	@Override
	public EngineOptions onCreateEngineOptions() 
	{
		// TODO Auto-generated method stub
		MenuInstace = this;
		Display display = getWindowManager().getDefaultDisplay();
//		CAMERA_HEIGHT = display.getHeight();
//		CAMERA_WIDTH = display.getWidth();
		CAMERA_HEIGHT = 454;
		CAMERA_WIDTH = 800;

		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);

		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,
				new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
	}

	@Override
	protected void onCreateResources() 
	{
		// TODO Auto-generated method stub

		// Menu images
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("Assets/");
		mBitmapTextureAtlasMenuBackground = new BitmapTextureAtlas(
				this.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
		mMenuBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasMenuBackground, this,
				"JungleBG.png", 0, 0, 1, 1);

		mBitmapTextureAtlasMenuLettersLock = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200,
				TextureOptions.BILINEAR);
		mMenuTextureRegionMenuLettersLock= BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
				mBitmapTextureAtlasMenuLettersLock, this, "lock.png", 0, 0, 1, 1);
		
		
		BitmapTextureAtlasTextureRegionFactory
				.setAssetBasePath("Assets/MenuLetters/");
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 4; j++)
			{
				mBitmapTextureAtlasMenuLetters[i][j] = new BitmapTextureAtlas(
						this.getTextureManager(), 200, 200,TextureOptions.BILINEAR);
				
				mMenuTextureRegionMenuLetters[i][j] = BitmapTextureAtlasTextureRegionFactory
						.createTiledFromAsset(mBitmapTextureAtlasMenuLetters[i][j], this, i
										+ "" + j + ".png", 0, 0, 1, 1);
			}
		}
		
		//assessment letters
		mBitmapTextureAtlasAssessmentLetters = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
					
		mTextureRegionAssessmentLetters= BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasAssessmentLetters, this, "11.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasAssessmentLettersLock = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
					
		mTextureRegionAssessmentLettersLock= BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasAssessmentLettersLock, this, "12.png", 0, 0, 1, 1);
							
		
		mBitmapTextureAtlasMenuBackground.load();
		
		// Menu
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=4; j++)
			{
				mBitmapTextureAtlasMenuLetters[i][j].load();
			}
		}

		// Menu Lock
		mBitmapTextureAtlasMenuLettersLock.load();
		
		//assessment letters
		mBitmapTextureAtlasAssessmentLetters.load();
		mBitmapTextureAtlasAssessmentLettersLock.load();
	}

	@Override
	protected Scene onCreateScene()
	{
		// TODO Auto-generated method stub

		menuScene = new Scene();
		menuScene.setOnSceneTouchListener(this);

		menuLetterBlockSize = 80;
		
		menuBackground = new Sprite(0, 0, mMenuBackGroundTextureRegion, vertexBufferObjectManager);
		menuBackground.setHeight(CAMERA_HEIGHT);
		menuBackground.setWidth(CAMERA_WIDTH);
		menuScene.attachChild(menuBackground);
		
		//setMenuLetter
		setMenuLetter();
		//set the lock icon
		setLock();
		
		//Load menu locked and unlocked letters according to the users
		if(AccountDisplayPage.accountNumber==0)
		{
			counter = loadSavedPreferences("0");
			Debug.d("letterCounter:"+counter);
		}
		else if(AccountDisplayPage.accountNumber==1)
		{
			counter = loadSavedPreferences("1");
			Debug.d("letterCounter:"+counter);
		}
		else if(AccountDisplayPage.accountNumber==2)
		{
			counter = loadSavedPreferences("2");
			Debug.d("letterCounter:"+counter);
		}
		else if(AccountDisplayPage.accountNumber==3)
		{
			counter = loadSavedPreferences("3");
			Debug.d("letterCounter:"+counter);
		}
		else if(AccountDisplayPage.accountNumber==4)
		{
			counter = loadSavedPreferences("4");
			Debug.d("letterCounter:"+counter);
		}
		else if(AccountDisplayPage.accountNumber==5)
		{
			counter = loadSavedPreferences("5");
			Debug.d("letterCounter:"+counter);
		}

		if(counter!=24)
		{
			for(int i=0;i<=counter;i++)
			{
				lock[i].setVisible(false);
				menuScene.registerTouchArea(letter[i]);
			}
		}
		else if(counter==23 || counter > 23)
		{
			for(int i=0;i<=23;i++)
			{
				lock[i].setVisible(false);
				menuScene.registerTouchArea(letter[i]);
			}
//			finish();
//			startActivity(new Intent(getBaseContext(), MenuPage.class));
		}
		return menuScene;
	}
	
	//set the lock icon
	public static void setLock()
	{
		for(int m=1; m<=4; m++) 
		{
			menuLettersLock[6][m] = new Sprite(630, m*100-120, mTextureRegionAssessmentLettersLock,
					vertexBufferObjectManager);
			menuLettersLock[6][m].setScale((float) 0.4);
			menuScene.attachChild(menuLettersLock[6][m]);
			//menuScene.registerTouchArea(menuLettersLock[k][l]);
		} 
		
		for(int k=1; k<=5; k++)
		{
			for(int l=1; l<=4; l++) 
			{
				menuLettersLock[k][l] = new Sprite(k*130-150, l*100-120, mMenuTextureRegionMenuLettersLock,
						vertexBufferObjectManager);
				menuLettersLock[k][l].setScale((float) 0.4);
				menuScene.attachChild(menuLettersLock[k][l]);
				//menuScene.registerTouchArea(menuLettersLock[k][l]);
			} 
		}
		
		lock[0] =  menuLettersLock[1][1];
		lock[1] =  menuLettersLock[2][1];
		lock[2] =  menuLettersLock[3][1];
		lock[3] =  menuLettersLock[4][1];
		lock[4] =  menuLettersLock[5][1];
		lock[5] =  menuLettersLock[6][1];
		
		lock[6] =  menuLettersLock[1][2];
		lock[7] =  menuLettersLock[2][2];
		lock[8] =  menuLettersLock[3][2];
		lock[9] =  menuLettersLock[4][2];
		lock[10] =  menuLettersLock[5][2];
		lock[11] =  menuLettersLock[6][2];
		
		lock[12] =  menuLettersLock[1][3];
		lock[13] =  menuLettersLock[2][3];
		lock[14] =  menuLettersLock[3][3];
		lock[15] =  menuLettersLock[4][3];
		lock[16] =  menuLettersLock[5][3];
		lock[17] =  menuLettersLock[6][3];
		
		lock[18] =  menuLettersLock[1][4];
		lock[19] =  menuLettersLock[2][4];
		lock[20] =  menuLettersLock[3][4];
		lock[21] =  menuLettersLock[4][4];
		lock[22] =  menuLettersLock[5][4];
		lock[23] =  menuLettersLock[6][4];
		
	}
	
	public boolean setMenuLetter(TouchEvent pSceneTouchEvent,int row, int column)
	{
		return pSceneTouchEvent.getX()- menuLetters[row][column].getWidth()/2> menuLetters[1][1].getX()-50 &&
				pSceneTouchEvent.getX()-menuLetters[row][column].getWidth()/2<menuLetters[row][column].getX()+menuLetterBlockSize &&
				pSceneTouchEvent.getY()-menuLetters[row][column].getHeight()/2>menuLetters[row][column].getY()-60 &&
				pSceneTouchEvent.getY()-menuLetters[row][column].getHeight()/2<menuLetters[row][column].getY()+menuLetterBlockSize;
	}
	
	//starting activity on clicking menu letters accordingly
	public void setStartActivity(int number, int row, int column)
	{
		letterNumber = number;
		
		Debug.d("Letter Numberrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr:"+letterNumber);
		menuLetters[row][column].setScale((float) 0.55);
		
		//setting unlock flag for unlocking the letters
		if(menuLetters[row][column]==letter[counter])
		{
			letterEnable = true;
			count();
		} 
		else 
		{
			letterEnable = false;
		}
		
		
//		if(letterNumber == 31)
//		{
//			//go to assessment part1
//			//call count() from there before finish() method
//		}
//		else if(letterNumber == 32)
//		{
//			//go to assessment part2
//			//call count() from there before finish() method
//		}
//		else if(letterNumber == 33)
//		{
//			//go to assessment part3
//			//call count() from there before finish() method
//		}
//		else if(letterNumber == 34)
//		{
//			//go to assessment part4
//			//call count() from there before finish() method
//		}
//		else
//		{
		
		
//		Intent intent = new Intent(getBaseContext(), AnimatedBookActivity.class);
//		intent.putExtra("val",letterNumber);
//		startActivity(intent);

//		startActivity(new Intent(getBaseContext(), BoxGameActivity.class));
			
//		startActivity(new Intent(getBaseContext(), MonkeyGameActivity.class));
		startActivity(new Intent(getBaseContext(), MenuPage.class));
		finish();
//		}
	}
	
	//Unlock the letters according to the users
	public static void count()
	{
		if(letterEnable ==true)
		{
			if(AccountDisplayPage.accountNumber==0)
			{
				counter++;
				Debug.d("countersssssssssssssssss:"+counter);
				savePreferences("0",counter); 
			}
			else if(AccountDisplayPage.accountNumber==1)
			{
				counter++;
				Debug.d("countersssssssssssssssss:"+counter);
				savePreferences("1",counter); 
			}
			else if(AccountDisplayPage.accountNumber==2)
			{
				counter++;
				Debug.d("countersssssssssssssssss:"+counter);
				savePreferences("2",counter); 
			}
			else if(AccountDisplayPage.accountNumber==3)
			{
				counter++;
				Debug.d("countersssssssssssssssss:"+counter);
				savePreferences("3",counter); 
			}
			else if(AccountDisplayPage.accountNumber==4)
			{
				counter++;
				Debug.d("countersssssssssssssssss:"+counter);
				savePreferences("4",counter); 
			}
			else if(AccountDisplayPage.accountNumber==5)
			{
				counter++;
				Debug.d("countersssssssssssssssss:"+counter);
				savePreferences("5",counter); 
			}
		}
	}
	
	public static int loadSavedPreferences(String key)
	{
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MenuInstace);
		return sharedPreferences.getInt(key, 0);
	}

	public static void savePreferences(String key, int value)
	{
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MenuInstace);
		Editor editor = sharedPreferences.edit();
		editor.putInt(key, value);
		editor.commit();
	}

	public void setMenuLetter()
	{
		for(int l=1; l<=4; l++)
		{
			menuLetters[6][l] = new Sprite(630, l*100-120, mTextureRegionAssessmentLetters,
					vertexBufferObjectManager)
			{
				@Override
				public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
				{
					switch (pSceneTouchEvent.getAction()) 
					{
					case TouchEvent.ACTION_DOWN:
					
						if(setMenuLetter(pSceneTouchEvent, 6,1)== true)
						{
							setStartActivity(31,6,1);
						}
						else if(setMenuLetter(pSceneTouchEvent, 6,2)== true)
						{
							setStartActivity(32,6,2);
						}
						else if(setMenuLetter(pSceneTouchEvent, 6,3)== true)
						{
							setStartActivity(33,6,3);
						}
						else if(setMenuLetter(pSceneTouchEvent, 6,4)== true)
						{
							setStartActivity(34,6,4);
						}
						
						break;
					}
					return true;
				}
			};
			
			menuScene.attachChild(menuLetters[6][l]);
			menuLetters[6][l].setScale((float) 0.4);
		}
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=4; j++) 
			{
				menuLetters[i][j] = new Sprite(i*130-150, j*100-120, mMenuTextureRegionMenuLetters[i][j],
						vertexBufferObjectManager)
				{
					@Override
					public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
					{
						switch (pSceneTouchEvent.getAction()) 
						{
						case TouchEvent.ACTION_DOWN:
							
							//1.Mo 2.Aa 3.e 4.Raw 5.Ko 6.Bo 7.TalibaSha 8.Lo 9.Po 10.Go 11.Ho
							//12.Kho 13.Cho 14.No 15.A 16.Do 17.U 18.To 19.Toh 20.Doh 21.Ukar
							//22.Ekar 23.Akar 24.Aakar
						
							//Mo
							if(setMenuLetter(pSceneTouchEvent, 1,1)== true)
							{
								setStartActivity(1,1,1);
							}
							//Aa
							else if(setMenuLetter(pSceneTouchEvent, 2,1)== true)
							{
								setStartActivity(2,2,1); 
							}
							//Lo
							else if(setMenuLetter(pSceneTouchEvent, 3,1)== true)
							{
								setStartActivity(8,3,1); 
							} 
							//Ko
							else if(setMenuLetter(pSceneTouchEvent, 4,1)== true)
							{
								setStartActivity(5,4,1); 
							}
							//To
							else if(setMenuLetter(pSceneTouchEvent, 5,1)== true)
							{
								setStartActivity(18,5,1); 
							}
							
							////////////////////
							//Bo
							else if(setMenuLetter(pSceneTouchEvent, 1,2)== true)
							{
								setStartActivity(6,1,2); 
							}
							//No
							else if(setMenuLetter(pSceneTouchEvent, 2,2)== true)
							{
								setStartActivity(14,2,2); 
							}
							//Cho
							else if(setMenuLetter(pSceneTouchEvent, 3,2)== true)
							{
								setStartActivity(13,3,2); 
							}
							//E
							else if(setMenuLetter(pSceneTouchEvent, 4,2)== true)
							{
								setStartActivity(3,4,2); 
							}
							//Po
							else if(setMenuLetter(pSceneTouchEvent, 5,2)== true)
							{
								setStartActivity(9,5,2); 
							}
							
							
							///////////////////////////
							//Ro
							else if(setMenuLetter(pSceneTouchEvent, 1,3)== true)
							{
								setStartActivity(4,1,3); 
							}
							//TalibaSha
							else if(setMenuLetter(pSceneTouchEvent, 2,3)== true)
							{
								setStartActivity(7,2,3); 
							}
							//Do
							else if(setMenuLetter(pSceneTouchEvent, 3,3)== true)
							{
								setStartActivity(16,3,3); 
							}
							//A
							else if(setMenuLetter(pSceneTouchEvent, 4,3)== true)
							{
								setStartActivity(15,4,3); 
							}
							//Doh
							else if(setMenuLetter(pSceneTouchEvent, 5,3)== true)
							{
								setStartActivity(20,5,3); 
							}
							
							///////////////////////////
							//Toh
							else if(setMenuLetter(pSceneTouchEvent, 1,4)== true)
							{
								setStartActivity(19,1,4); 
							}
							//Kho
							else if(setMenuLetter(pSceneTouchEvent, 2,4)== true)
							{
								setStartActivity(12,2,4); 
							}
							//U
							else if(setMenuLetter(pSceneTouchEvent, 3,4)== true)
							{
								setStartActivity(17,3,4); 
							}
							//Go
							else if(setMenuLetter(pSceneTouchEvent, 4,4)== true)
							{
								setStartActivity(10,4,4); 
							}
							//Ho
							else if(setMenuLetter(pSceneTouchEvent, 5,4)== true)
							{
								setStartActivity(11,5,4); 
//								setStartActivity(24,5,4); 
							}
							
							
						break;
						case TouchEvent.ACTION_UP:
		
						break;
						}
						return true;
					}
			
				};
				menuLetters[i][j].setScale((float) 0.4);
				//menuScene.registerTouchArea(menuLetters[i][j]);
				menuScene.attachChild(menuLetters[i][j]);
				
				letter[0] =  menuLetters[1][1];
				letter[1] =  menuLetters[2][1];
				letter[2] =  menuLetters[3][1];
				letter[3] =  menuLetters[4][1];
				letter[4] =  menuLetters[5][1];
				letter[5] =  menuLetters[6][1];
				
				letter[6] =  menuLetters[1][2];
				letter[7] =  menuLetters[2][2];
				letter[8] =  menuLetters[3][2];
				letter[9] =  menuLetters[4][2];
				letter[10] =  menuLetters[5][2];
				letter[11] =  menuLetters[6][2];
				
				letter[12] =  menuLetters[1][3];
				letter[13] =  menuLetters[2][3];
				letter[14] =  menuLetters[3][3];
				letter[15] =  menuLetters[4][3];
				letter[16] =  menuLetters[5][3];
				letter[17] =  menuLetters[6][3];
				
				letter[18] =  menuLetters[1][4];
				letter[19] =  menuLetters[2][4];
				letter[20] =  menuLetters[3][4];
				letter[21] =  menuLetters[4][4];
				letter[22] =  menuLetters[5][4];
				letter[23] =  menuLetters[6][4];
				
			}
			
		}
		
	}
	
	@Override
	public boolean onSceneTouchEvent(Scene pScene, TouchEvent pSceneTouchEvent)
	{
		// TODO Auto-generated method stub
		if (pSceneTouchEvent.isActionDown()) 
		{
			return true;
		}
		else if (pSceneTouchEvent.isActionMove())
		{
			
			return true;
		}

		else if (pSceneTouchEvent.isActionUp()) 
		{
			return true;
		}
		return true;
	}
}