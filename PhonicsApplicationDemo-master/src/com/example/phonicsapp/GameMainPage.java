package com.example.phonicsapp;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.color.Color;

import StatusBarController.StatusBar;
import android.content.Context;
import android.content.Intent;
import android.view.Display;

import com.example.phonicsapp.HandWriting.banglaletterwriting.HandWritingMenu;
import com.example.phonicsapp.animatedBook.AnimatedBookActivity;
import com.example.phonicsapp.boxGame.BoxGameActivity;
import com.example.phonicsapp.monkeyGame.MonkeyGameActivity;
import com.example.phonicsapp.wordbuilding.BaseActivity;


public class GameMainPage extends SimpleBaseGameActivity
{

	static int CAMERA_WIDTH;
	static int CAMERA_HEIGHT;

	public Camera mCamera;
	public static Scene mScene;
	static Context context;
	
	public static GameMainPage GameMainPageInstace;
	
	public static ITextureRegion mKolomTextureRegion, mBoardTextureRegion, mParrotTextureRegion;
	
	public static ITextureRegion mbackGroundTextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasBackGround, mBitmapTextureAtlasBackGround2,
									 mBitmapTextureAtlasKolom, mBitmapTextureAtlasBoard,
									 mBitmapTextureAtlasParrot, mBitmapTextureAtlasLetterMo;
	
	public static Sprite backGround, backGround2;
	public static Sprite parrot, board, monkey;
	
	public static VertexBufferObjectManager vertexBufferObjectManager;
	
	public static GameMainPage getSharedInstances()
	{
		return GameMainPageInstace;
	}
	
	@Override
	public EngineOptions onCreateEngineOptions()
	{
		// TODO Auto-generated method stub
		GameMainPageInstace = this;
		Display display = getWindowManager().getDefaultDisplay();
//		CAMERA_HEIGHT = display.getHeight();
//		CAMERA_WIDTH = display.getWidth();
		CAMERA_HEIGHT = 454;
		CAMERA_WIDTH = 800;
		//StatusBar.hideStatusBar();
		StatusBar.showStatusBar();
		
		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		
		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
	}

	@Override
	protected void onCreateResources() 
	{
		// TODO Auto-generated method stub
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("Assets/");

		mBitmapTextureAtlasBackGround2 = new BitmapTextureAtlas(this.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
		mBitmapTextureAtlasBackGround = new BitmapTextureAtlas(this.getTextureManager(), 1600, 868, TextureOptions.BILINEAR);
		mBitmapTextureAtlasKolom = new BitmapTextureAtlas(this.getTextureManager(), 135, 283, TextureOptions.BILINEAR);
		mBitmapTextureAtlasBoard= new BitmapTextureAtlas(this.getTextureManager(), 200, 204, TextureOptions.BILINEAR);
		mBitmapTextureAtlasParrot = new BitmapTextureAtlas(this.getTextureManager(), 275, 174, TextureOptions.BILINEAR);
		mBitmapTextureAtlasLetterMo = new BitmapTextureAtlas(this.getTextureManager(), 100, 100, TextureOptions.BILINEAR);
		
		mbackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(mBitmapTextureAtlasBackGround, this,
				"startingPageBG.png", 0, 0,  1, 1);
		mKolomTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(mBitmapTextureAtlasKolom, this,
				"monkey.png", 0, 0,  1, 1);
		mBoardTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(mBitmapTextureAtlasBoard, this,
				"board.png", 0, 0,  1, 1);
		mParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(mBitmapTextureAtlasParrot, this,
				"parrot.png", 0, 0,  1, 1);
		
		mBitmapTextureAtlasBackGround.load();
		mBitmapTextureAtlasBackGround2.load();
		mBitmapTextureAtlasKolom.load();
		mBitmapTextureAtlasBoard.load();
		mBitmapTextureAtlasParrot.load();
		mBitmapTextureAtlasLetterMo.load();
		
	}

	@Override
	protected Scene onCreateScene()
	{
		// TODO Auto-generated method stub
		
		mScene = new Scene();
		mScene.setBackground(new Background(Color.WHITE));
		mScene.setTouchAreaBindingOnActionDownEnabled(true);
		
		GameMainPage.context = getApplicationContext();
		
		backGround = new Sprite(0, 0, mbackGroundTextureRegion, getVertexBufferObjectManager());
		backGround.setHeight(CAMERA_HEIGHT);
		backGround.setWidth(CAMERA_WIDTH);
		mScene.attachChild(backGround);
		
		parrot = new Sprite(0, CAMERA_HEIGHT/2-150, mParrotTextureRegion, getVertexBufferObjectManager())
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
			{
				switch (pSceneTouchEvent.getAction()) 
				{
					case TouchEvent.ACTION_DOWN:
					
						this.setScale((float) 1.2);
						
//						mScene = new MenuPage();
//						setCurrentScene(mScene);
						startActivity();
						
					break;
					
					case TouchEvent.ACTION_UP:
						
						this.setScale((float) 1.0);
						
					break;
				}

				return true;
			}
		};
		mScene.registerTouchArea(parrot);
		mScene.attachChild(parrot);
		parrot.setWidth(CAMERA_WIDTH/3.0f);
		parrot.setHeight(CAMERA_HEIGHT/2.5f);
		
		monkey = new Sprite(CAMERA_WIDTH/2 - 20, 0, mKolomTextureRegion, getVertexBufferObjectManager())
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
			{
				switch (pSceneTouchEvent.getAction()) 
				{
				case TouchEvent.ACTION_DOWN:

					this.setScale((float) 1.1);
					startActivityForMonkey();
					
				break;
				case TouchEvent.ACTION_UP:
					
					this.setScale((float) 1.0);
					
				break;
				}

				return true;
			}
		};
		mScene.registerTouchArea(monkey);
		mScene.attachChild(monkey);
//		monkey.setWidth(CAMERA_WIDTH/6.6f);
//		monkey.setHeight((float) (CAMERA_HEIGHT/2.2));

		board = new Sprite(CAMERA_WIDTH-230, CAMERA_HEIGHT/2-20, mBoardTextureRegion, getVertexBufferObjectManager())
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
			{
				switch (pSceneTouchEvent.getAction()) 
				{
				case TouchEvent.ACTION_DOWN:
					this.setScale((float) 1.1);
					startActivityWordBuild();
				break;
				case TouchEvent.ACTION_UP:
					
					this.setScale((float) 1.0);
				break;
				}

				return true;
			}
		};
		mScene.registerTouchArea(board);
		mScene.attachChild(board);
//		board.setWidth(CAMERA_WIDTH/5.3f);
//		board.setHeight(CAMERA_HEIGHT/2.2f);
		
		vertexBufferObjectManager = getVertexBufferObjectManager();
		
		return mScene;
	}
 
	void startActivity()
	{
		finish();
//		startActivity(new Intent(this, AnimatedBookActivity.class));
		startActivity(new Intent(this, MenuPage.class));
	}
	
	void startActivityForMonkey()
	{
		finish();
//		startActivity(new Intent(this, AnimatedBookActivity.class));
		startActivity(new Intent(this, HandWritingMenu.class));
	}
	
	public void setCurrentScene(Scene scene)
	{
		mScene = scene;
		getEngine().setScene(mScene);
	}
	public void startActivityWordBuild()
	{
		finish();
		startActivity(new Intent(getBaseContext(), BaseActivity.class));
	}

}
