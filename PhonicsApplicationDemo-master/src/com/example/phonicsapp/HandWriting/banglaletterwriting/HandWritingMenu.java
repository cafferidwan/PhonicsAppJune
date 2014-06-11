package com.example.phonicsapp.HandWriting.banglaletterwriting;

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

import com.example.accountSystem.AccountDisplayPage;
import com.example.accountSystem.AdminPanel;
import com.example.phonicsapp.MenuPage;
import com.example.phonicsapp.SetMenuLetters;


import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.Display;

public class HandWritingMenu extends SimpleBaseGameActivity implements IOnSceneTouchListener
{

	public static int CAMERA_WIDTH, CAMERA_HEIGHT;
	public Camera mCamera;
	public static Scene menuScene;
	public static VertexBufferObjectManager vertexBufferObjectManager;
	public static HandWritingMenu MenuInstace;

	// Menu Items
	public static BitmapTextureAtlas mBitmapTextureAtlasMenuBackground;
	public static ITextureRegion mMenuBackGroundTextureRegion;
	
	public static BitmapTextureAtlas[][] mBitmapTextureAtlasMenuLetters = new BitmapTextureAtlas[50][50];
	public static ITextureRegion[][] mMenuTextureRegionMenuLetters = new ITextureRegion[50][50];

	public static Sprite[][] handWritingMenuLettersLock = new Sprite[50][50];
	public static Sprite[] handWritingLock = new Sprite[50];
	
	public static Sprite menuBackground;
	public static Sprite[][] menuLetters = new Sprite[50][50];
	public static int letterNumber, handwritingMenuLettersCounters;
	public static int menuLetterBhandWritingLockSize;
	
	
	public static BitmapTextureAtlas mBitmapTextureAtlasHandwritingLettersLock ;
	public static ITextureRegion mTextureRegionHandwritingLettersLock ;
	
	public static Sprite[] handWritingLetter = new Sprite[50];

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
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/");
		mBitmapTextureAtlasMenuBackground = new BitmapTextureAtlas(
				this.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
		mMenuBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasMenuBackground, this,
						"JungleBG.png", 0, 0, 1, 1);

		BitmapTextureAtlasTextureRegionFactory
				.setAssetBasePath("iWriteGFX/MenuLetters/");
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 4; j++)
			{
				mBitmapTextureAtlasMenuLetters[i][j] = new BitmapTextureAtlas(
						this.getTextureManager(), 400, 400,
						TextureOptions.BILINEAR);
				mMenuTextureRegionMenuLetters[i][j] = BitmapTextureAtlasTextureRegionFactory
						.createTiledFromAsset(
								mBitmapTextureAtlasMenuLetters[i][j], this, i
										+ "" + j + ".png", 0, 0, 1, 1);
			}
		}

		
	
		// Menu
		mBitmapTextureAtlasMenuBackground.load();
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=4; j++)
			{
				mBitmapTextureAtlasMenuLetters[i][j].load();
			}
		}
		
		//Lock icons
		BitmapTextureAtlasTextureRegionFactory
		.setAssetBasePath("Assets/");
		mBitmapTextureAtlasHandwritingLettersLock = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
					
		mTextureRegionHandwritingLettersLock= BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasHandwritingLettersLock, this, "lock.png", 0, 0, 1, 1);
		mBitmapTextureAtlasHandwritingLettersLock.load();

	}

	@Override
	protected Scene onCreateScene()
	{
		// TODO Auto-generated method stub

		menuScene = new Scene();
		menuScene.setOnSceneTouchListener(this);

		menuLetterBhandWritingLockSize = 80;
		
		menuBackground = new Sprite(0, 0, mMenuBackGroundTextureRegion, vertexBufferObjectManager);
		menuBackground.setHeight(CAMERA_HEIGHT);
		menuBackground.setWidth(CAMERA_WIDTH);
		menuScene.attachChild(menuBackground);
		
		//set the menu letters
		SetMenuLetters.setHandWritingMenuLetterIcon();
		
		checkAdmin();
		
		
		return menuScene;
	}

	public void checkAdmin()
	{
		//if the user is player
		if(AdminPanel.adminEnable == false)
		{
			//lock icons
			setHandWritingLockIcon();
			
			if(AccountDisplayPage.accountNumber==0)
			{
				handwritingMenuLettersCounters = loadSavedPreferences("0");
				Debug.d("letterCounter:"+handwritingMenuLettersCounters);
			}
			else if(AccountDisplayPage.accountNumber==1)
			{
				handwritingMenuLettersCounters = loadSavedPreferences("1");
				Debug.d("letterCounter:"+handwritingMenuLettersCounters);
			}
			else if(AccountDisplayPage.accountNumber==2)
			{
				handwritingMenuLettersCounters = loadSavedPreferences("2");
				Debug.d("letterCounter:"+handwritingMenuLettersCounters);
			}
			else if(AccountDisplayPage.accountNumber==3)
			{
				handwritingMenuLettersCounters = loadSavedPreferences("3");
				Debug.d("letterCounter:"+handwritingMenuLettersCounters);
			}
			else if(AccountDisplayPage.accountNumber==4)
			{
				handwritingMenuLettersCounters = loadSavedPreferences("4");
				Debug.d("letterCounter:"+handwritingMenuLettersCounters);
			}
			else if(AccountDisplayPage.accountNumber==5)
			{
				handwritingMenuLettersCounters = loadSavedPreferences("5");
				Debug.d("letterCounter:"+handwritingMenuLettersCounters);
			}
			
			//Exclude the extra count of the assessment part from menu page
			if(handwritingMenuLettersCounters>=5 && handwritingMenuLettersCounters<11)
			{
				handwritingMenuLettersCounters = handwritingMenuLettersCounters-1;
			}
			else if(handwritingMenuLettersCounters>=11 && handwritingMenuLettersCounters<17)
			{
				handwritingMenuLettersCounters = handwritingMenuLettersCounters-2;
			}
			else if(handwritingMenuLettersCounters>=17 && handwritingMenuLettersCounters<=23)
			{
				handwritingMenuLettersCounters = handwritingMenuLettersCounters-3;
			}
			

			if(handwritingMenuLettersCounters<=19)
			{
				for(int i=0;i<=handwritingMenuLettersCounters;i++)
				{
					handWritingLock[i].setVisible(false);
					menuScene.registerTouchArea(handWritingLetter[i]);
				}
			}
			else if(handwritingMenuLettersCounters==20 || handwritingMenuLettersCounters > 20)
			{
				for(int i=0;i<=19;i++)
				{
					handWritingLock[i].setVisible(false);
					menuScene.registerTouchArea(handWritingLetter[i]);
				}
//				finish();
//				startActivity(new Intent(getBaseContext(), MenuPage.class));
			}
		}
		//if the user is admin
		else if(AdminPanel.adminEnable == true)
		{
			for(int i=0; i<=19; i++)
			{
				menuScene.registerTouchArea(handWritingLetter[i]);
			}
		}
		
	}

	public static boolean setMenuLetter(TouchEvent pSceneTouchEvent,int row, int column)
	{
		return pSceneTouchEvent.getX()- menuLetters[row][column].getWidth()/2> menuLetters[1][1].getX()-50 &&
		pSceneTouchEvent.getX()-menuLetters[row][column].getWidth()/2<menuLetters[row][column].getX()+menuLetterBhandWritingLockSize &&
		pSceneTouchEvent.getY()-menuLetters[row][column].getHeight()/2>menuLetters[row][column].getY()-60 &&
		pSceneTouchEvent.getY()-menuLetters[row][column].getHeight()/2<menuLetters[row][column].getY()+menuLetterBhandWritingLockSize;
	}
	 
	public static void setStartActivity(int number, int row, int column)
	{
		menuLetters[row][column].setScale((float) 0.55);
		letterNumber = number;
		MenuInstace.startActivity(new Intent(MenuInstace.getBaseContext(), GameActivity.class)); 
		MenuInstace.finish();
	}
	
	//set the handWritingLock icon
	public static void setHandWritingLockIcon()
	{
		for(int k=1; k<=5; k++)
		{
			for(int l=1; l<=4; l++) 
			{
				handWritingMenuLettersLock[k][l] = new Sprite(k*130-120, l*100-120, mTextureRegionHandwritingLettersLock,
						vertexBufferObjectManager);
				handWritingMenuLettersLock[k][l].setScale((float) 0.4);
				menuScene.attachChild(handWritingMenuLettersLock[k][l]);
				//menuScene.registerTouchArea(handWritingMenuLettersLock[k][l]);
			} 
		}
		
		handWritingLock[0] =  handWritingMenuLettersLock[1][1];
		handWritingLock[1] =  handWritingMenuLettersLock[2][1];
		handWritingLock[2] =  handWritingMenuLettersLock[3][1];
		handWritingLock[3] =  handWritingMenuLettersLock[4][1];
		handWritingLock[4] =  handWritingMenuLettersLock[5][1];
		
		handWritingLock[5] =  handWritingMenuLettersLock[1][2];
		handWritingLock[6] =  handWritingMenuLettersLock[2][2];
		handWritingLock[7] =  handWritingMenuLettersLock[3][2];
		handWritingLock[8] =  handWritingMenuLettersLock[4][2];
		handWritingLock[9] =  handWritingMenuLettersLock[5][2];
		
		handWritingLock[10] =  handWritingMenuLettersLock[1][3];
		handWritingLock[11] =  handWritingMenuLettersLock[2][3];
		handWritingLock[12] =  handWritingMenuLettersLock[3][3];
		handWritingLock[13] =  handWritingMenuLettersLock[4][3];
		handWritingLock[14] =  handWritingMenuLettersLock[5][3];
		
		handWritingLock[15] =  handWritingMenuLettersLock[1][4];
		handWritingLock[16] =  handWritingMenuLettersLock[2][4];
		handWritingLock[17] =  handWritingMenuLettersLock[3][4];
		handWritingLock[18] =  handWritingMenuLettersLock[4][4];
		handWritingLock[19] =  handWritingMenuLettersLock[5][4];
		
	}
	
	public static int loadSavedPreferences(String key)
	{
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MenuInstace);
		return sharedPreferences.getInt(key, 0);
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