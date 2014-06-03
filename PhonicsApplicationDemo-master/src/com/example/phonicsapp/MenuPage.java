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
import android.view.Display;

import com.example.phonicsapp.animatedBook.AnimatedBookActivity;
import com.example.phonicsapp.boxGame.BoxGameActivity;
import com.example.phonicsapp.monkeyGame.MonkeyGameActivity;

public class MenuPage extends SimpleBaseGameActivity implements IOnSceneTouchListener
{

	public static int CAMERA_WIDTH, CAMERA_HEIGHT;
	public Camera mCamera;
	public Scene menuScene;
	public VertexBufferObjectManager vertexBufferObjectManager;
	public MenuPage MenuInstace;

	// Menu Items
	public static BitmapTextureAtlas mBitmapTextureAtlasMenuBackground;
	public static ITextureRegion mMenuBackGroundTextureRegion;
	
	public static BitmapTextureAtlas[][] mBitmapTextureAtlasMenuLetters = new BitmapTextureAtlas[50][50];
	public static ITextureRegion[][] mMenuTextureRegionMenuLetters = new ITextureRegion[50][50];

//	public static BitmapTextureAtlas mBitmapTextureAtlasMenuLettersLock ;
//	public static ITextureRegion  mMenuTextureRegionMenuLettersLock ;
	
	public static Sprite menuBackground;
	public static Sprite[][] menuLetters = new Sprite[50][50];
//	public static Sprite[][] menuLettersLock = new Sprite[50][50];
	public int i,j;
	public static int letterNumber;
	public int menuLetterBlockSize;
	
	@Override
	public void onBackPressed()
	{
	   
//	    BoxGameActivity.super.onBackPressed();
		finish();
		startActivity(new Intent(getBaseContext(), GameMainPage.class));
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


//		mBitmapTextureAtlasMenuLettersLock = new BitmapTextureAtlas(
//				this.getTextureManager(), 400, 400,
//				TextureOptions.BILINEAR);
//		mMenuTextureRegionMenuLettersLock= BitmapTextureAtlasTextureRegionFactory
//				.createTiledFromAsset(
//				mBitmapTextureAtlasMenuLettersLock, this, "lock.png", 0, 0, 1, 1);
		
		BitmapTextureAtlasTextureRegionFactory
				.setAssetBasePath("Assets/MenuLetters/");
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

		// Menu Lock
//		mBitmapTextureAtlasMenuLettersLock.load();

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
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=4; j++) 
			{
				menuLetters[i][j] = new Sprite(i*130-120, j*100-120, mMenuTextureRegionMenuLetters[i][j],
						vertexBufferObjectManager)
				{
					@Override
					public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
					{
						switch (pSceneTouchEvent.getAction()) 
						{
						case TouchEvent.ACTION_DOWN:
							
//							Debug.d("Touch:"+(pSceneTouchEvent.getX()- this.getWidth()/2));
//							Debug.d("Letter2.x:"+menuLetters[2][2].getX());
//							Debug.d("Letter2.y:"+menuLetters[2][2].getY());
							
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
				menuScene.registerTouchArea(menuLetters[i][j]);
				menuScene.attachChild(menuLetters[i][j]);
				
				
//				for(int k=1; k<=4; k++)
//				{
//					for(int l=1; l<=4; l++) 
//					{
//						menuLettersLock[k][l] = new Sprite(k*130+10, l*100-120, mMenuTextureRegionMenuLettersLock,
//								vertexBufferObjectManager);
//						menuLettersLock[k][l].setScale((float) 0.4);
//						menuScene.attachChild(menuLettersLock[k][l]);
//					}
//				}
				
			}
		}
		return menuScene;
	}

	public boolean setMenuLetter(TouchEvent pSceneTouchEvent,int row, int column)
	{
		return pSceneTouchEvent.getX()- menuLetters[row][column].getWidth()/2> menuLetters[1][1].getX()-50 &&
				pSceneTouchEvent.getX()-menuLetters[row][column].getWidth()/2<menuLetters[row][column].getX()+menuLetterBlockSize &&
				pSceneTouchEvent.getY()-menuLetters[row][column].getHeight()/2>menuLetters[row][column].getY()-60 &&
				pSceneTouchEvent.getY()-menuLetters[row][column].getHeight()/2<menuLetters[row][column].getY()+menuLetterBlockSize;
	}
	
	public void setStartActivity(int number, int row, int column)
	{
		letterNumber = number;
		
//		Debug.d("Letter Numbernnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn:"+letterNumber);
		
//		if(letterNumber == 1 ||letterNumber == 6|| letterNumber == 4 || letterNumber == 19 )
//		{ 
			menuLetters[row][column].setScale((float) 0.55);
//			Intent intent = new Intent(getBaseContext(), AnimatedBookActivity.class);
//			intent.putExtra("val",letterNumber);
//			startActivity(intent);

			startActivity(new Intent(getBaseContext(), BoxGameActivity.class));
			
//			startActivity(new Intent(getBaseContext(), MonkeyGameActivity.class));
			finish();
//		} 
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