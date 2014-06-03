package com.example.phonicsapp.HandWriting.banglaletterwriting;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;
import org.andengine.engine.options.resolutionpolicy.FixedResolutionPolicy;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.primitive.Rectangle;
import org.andengine.entity.scene.IOnSceneTouchListener;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;
import org.andengine.entity.util.ScreenCapture;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.andengine.opengl.texture.atlas.buildable.builder.BlackPawnTextureAtlasBuilder;
import org.andengine.opengl.texture.atlas.buildable.builder.ITextureAtlasBuilder.TextureAtlasBuilderException;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.opengl.util.GLState;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.util.color.Color;
import org.andengine.util.debug.Debug;
import com.example.phonicsapp.HandWriting.Animation.AnimationDrawTutorial;
import com.example.phonicsapp.HandWriting.Objects.createObjects;
import com.example.phonicsapp.HandWriting.ScreenShoot.BitmapTextureAtlasSource;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.Display;

public class GameActivity extends BaseGameActivity implements IOnSceneTouchListener 
	{

	public static int CAMERA_WIDTH, CAMERA_HEIGHT;
	public static int BackgroundWidth, BackgroundHeight;
	public static Camera mCamera;
	public static Scene mScene;
	public static Scene menuScene;
	public static VertexBufferObjectManager vertexBufferObjectManager;
	public static GameActivity MainActivityInstace;

	
	public static ITextureRegion mMoFilledTextureRegion, mAaFilledTextureRegion,
								mEFilledTextureRegion, mHoFilledTextureRegion,
								mRawFilledTextureRegion, mKoFilledTextureRegion,
								mBoFilledTextureRegion, mTalibashaFilledTextureRegion,
								mLoFilledTextureRegion, mPoFilledTextureRegion,
								mGoFilledTextureRegion, mKhoFilledTextureRegion,
								mChoFilledTextureRegion, mNoFilledTextureRegion,
								mAFilledTextureRegion, mDoFilledTextureRegion,
								mUFilledTextureRegion, mToFilledTextureRegion,
								mTohFilledTextureRegion, mDohFilledTextureRegion,
								mUkarFilledTextureRegion, mEkarFilledTextureRegion,
								mAkarFilledTextureRegion, mAakarFilledTextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasMoFilled, mBitmapTextureAtlasAaFilled,
									mBitmapTextureAtlasEFilled, mBitmapTextureAtlasHoFilled,
									mBitmapTextureAtlasRawFilled, mBitmapTextureAtlasKoFilled,
									mBitmapTextureAtlasBoFilled, mBitmapTextureAtlasTalibashaFilled,
									mBitmapTextureAtlasLoFilled, mBitmapTextureAtlasPoFilled,
									mBitmapTextureAtlasGoFilled, mBitmapTextureAtlasKhoFilled,
									mBitmapTextureAtlasChoFilled, mBitmapTextureAtlasNoFilled,
									mBitmapTextureAtlasAFilled, mBitmapTextureAtlasDoFilled,
									mBitmapTextureAtlasUFilled, mBitmapTextureAtlasToFilled,
									mBitmapTextureAtlasTohFilled, mBitmapTextureAtlasDohFilled,
									mBitmapTextureAtlasUkarFilled, mBitmapTextureAtlasEkarFilled,
									mBitmapTextureAtlasAkarFilled, mBitmapTextureAtlasAakarFilled;
	
	
	
	public static BitmapTextureAtlas 
	 mBitmapTextureAtlasAaOutLine, mBitmapTextureAtlasEOutLine,
	 mBitmapTextureAtlasRawOutLine, mBitmapTextureAtlasKoOutLine,
	 mBitmapTextureAtlasBoOutLine, mBitmapTextureAtlasTalibaShaOutLine,
	 mBitmapTextureAtlasLoOutLine, mBitmapTextureAtlasPoOutLine,
	 mBitmapTextureAtlasGoOutLine, mBitmapTextureAtlasHoOutLine,
	 mBitmapTextureAtlasKhoOutLine, mBitmapTextureAtlasChoOutLine,
	 mBitmapTextureAtlasNoOutLine, mBitmapTextureAtlasAOutLine,
	 mBitmapTextureAtlasDoOutLine, mBitmapTextureAtlasUOutLine,
	 mBitmapTextureAtlasToOutLine, mBitmapTextureAtlasTohOutLine,
	 mBitmapTextureAtlasDohOutLine, mBitmapTextureAtlasUkarOutLine,
	 mBitmapTextureAtlasEkarOutLine, mBitmapTextureAtlasAkarOutLine,
	 mBitmapTextureAtlasAakarOutLine;
	 
	public static ITextureRegion mAaOutLineTextureRegion, 
	mEOutLineTextureRegion, mRawOutLineTextureRegion,
	mKoOutLineTextureRegion, mBoOutLineTextureRegion,
	mTalibaShaOutLineTextureRegion, mLoOutLineTextureRegion,
	mPoOutLineTextureRegion, mGoOutLineTextureRegion,
	mHoOutLineTextureRegion, mMoOutLineTextureRegion,
	mKhoOutLineTextureRegion, mChoOutLineTextureRegion,
	mNoOutLineTextureRegion, mAOutLineTextureRegion,
	mDoOutLineTextureRegion, mUOutLineTextureRegion,
	mToOutLineTextureRegion, mTohOutLineTextureRegion,
	mDohOutLineTextureRegion, mUkarOutLineTextureRegion,
	mEkarOutLineTextureRegion, mAkarOutLineTextureRegion,
	mAakarOutLineTextureRegion;
	
	//Menu Items
	public static BitmapTextureAtlas[][] mBitmapTextureAtlasMenuLetters = new BitmapTextureAtlas[50][50];
	public static ITextureRegion[][] mMenuTextureRegionMenuLetters =  new ITextureRegion[50][50];
	
	public static ITextureRegion mbackGroundTextureRegion,
			mBlackBoardTextureRegion, mSlidingScreenTextureRegion,
			mWhiteChalkTextureRegion, mCursorTextureRegion,
			mPopUpBlackBoardTextureRegion, mBookIconRegion,
			mCreatePopUpRegion, mCorrectLetterRegion, 
			mHandTutorialTextureRegion,	mCrossRegion,
			mDusterTextureRegion, mHomeButtoTextureRegion; 
	

	public static BuildableBitmapTextureAtlas mAnimatedBitmapTextureAtlas,
							mAnimatedMonkeyBitmapTextureAtlas;
	public static TiledTextureRegion mFishTextureRegion,
							mMonkeyTextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasBlackBoard,
	mBitmapTextureAtlasMoOutLine, mBitmapTextureAtlasBackGround,
	mBitmapTextureAtlasWhiteChalk, mBitmapTextureAtlasCursor,
	mBitmapTextureAtlasHomeButton;
	
	
	public static BitmapTextureAtlas mBitmapTextureAtlasPieceChalk,
	 mBitmapTextureAtlasBookIcon, mBitmapTextureAtlasHandWirtingBook,
	 mBitmapTextureAtlasBoard, mBitmapTextureAtlasHandCross, 
	 mBitmapTextureAtlasDuster, mBitmapTextureAtlasMonkeyBrush,
	 mBitmapTextureAtlasHandTutorial;

	//Menu Items
	public static BitmapTextureAtlas mBitmapTextureAtlasMenuBackground;
	public static ITextureRegion mMenuBackGroundTextureRegion;
	
	
	public static BitmapTextureAtlas[] mBitmapTextureAtlasNumber = new BitmapTextureAtlas[25];
	public static ITextureRegion[] mTextureRegionNumber = new ITextureRegion[25];
	public static Sprite[] numberSprites = new Sprite[25];
	public static Sprite[] whiteChalk = new Sprite[5000];
	public static Sprite[] tutorialWhiteChalk = new Sprite[5000];
	
	public static Sprite backGround, blackBoard, OutLine, homeButton;
	public static Sprite bookIcon, handTutorial, duster, slidingScreen;
	public static Sprite createPopUp, correctLetter, drawnPicture, cross, board;
	public static AnimatedSprite cursor;
	public static AnimatedSprite monkeyTutorial;
	public static Rectangle rectangle;
	public static float moOutLineX, moOutLineY;

	public static String DEBUG_TAG = GameActivity.class.getSimpleName();
	
	public static int iCounter, screenShotCounter, shakeCounter = 0, sCounter, wCounter;
	public static int aCounter = 0, bCounter, serialCounter = 1, totalLoadNumberPic = 20;
	public static int monkeyTutorialStart;
	public static int spriteCounter, dusterCounter, dusterFinishCounter ;
	public static boolean isHomeButtonCreated;
	public static int spriteCounterLimit;
	public static int  state = 0;
	public static Rectangle rect;
	public static float posX;
	public static float posY;
	public static boolean isShaking, isPopupActive,
						  isHandTutorialActive, isActionMoving;
	public static int touch, popUpValue, tutorialCounter;
	public static int soundCounter;
	public static Boolean audioPlay = false;
	static MediaPlayer mediaPlayer = new MediaPlayer();
	public static TimerHandler timer1;
	
	//Screen Shot texture
	public static ScreenCapture screenCapture;
	public static TextureRegion textureRegion;
	public static BitmapTextureAtlas texture;
	public static BitmapTextureAtlasSource source;
	public static int changeTexture = 0;
	public static boolean screenShot = false;
	public static int viewWidth, viewHeight;
	
	public static int letter;
	
	//Splash Screen 
	BitmapTextureAtlas splashTextureAtlas;
	TextureRegion splashTextureRegion;
	public Sprite splash;
	public Scene splashScene;
	
	private BuildableBitmapTextureAtlas mAnimatedSplashBitmapTextureAtlas;
	public static TiledTextureRegion mAnimatedSplashTextureRegion;
	public AnimatedSprite animatedSplash;

	@Override
	public EngineOptions onCreateEngineOptions()
	{
		// TODO Auto-generated method stub
		MainActivityInstace = this;
		Display display = getWindowManager().getDefaultDisplay();
		
		BackgroundWidth = display.getWidth();
		BackgroundHeight = display.getHeight();
		
		Debug.d(""+BackgroundWidth);
		Debug.d(""+BackgroundHeight);
		CAMERA_HEIGHT = 454;
		CAMERA_WIDTH = 800;

		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);

		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,
				new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
	}

	@Override
	public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback)
			throws Exception
	{
		// TODO Auto-generated method stub
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/");
		
		mAnimatedSplashBitmapTextureAtlas = new BuildableBitmapTextureAtlas(this.getTextureManager(), 2000, 267, TextureOptions.NEAREST);
		mAnimatedSplashTextureRegion = BitmapTextureAtlasTextureRegionFactory.
				createTiledFromAsset(this.mAnimatedSplashBitmapTextureAtlas, this, "monkeyTutorial.png", 10, 1); 
		
		try 
		{
			this.mAnimatedSplashBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			this.mAnimatedSplashBitmapTextureAtlas.load();
		}
		catch (TextureAtlasBuilderException e) 
		{
			Debug.e(e);
		}
		
        splashTextureAtlas = new BitmapTextureAtlas(this.getTextureManager(), 643, 906, TextureOptions.DEFAULT);
        splashTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(splashTextureAtlas,
        		this, "juggleMonkey3.png", 0, 0);
        splashTextureAtlas.load();
		
        pOnCreateResourcesCallback.onCreateResourcesFinished();
		
	}

	@Override
	public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback)
			throws Exception 
	{
		// TODO Auto-generated method stub
		initSplashScene();
        pOnCreateSceneCallback.onCreateSceneFinished(this.splashScene);
	}
	
	@Override
	public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback)
			throws Exception
	{
		// TODO Auto-generated method stub
		
		
		mEngine.registerUpdateHandler(new TimerHandler(1f, new ITimerCallback() 
		{
            public void onTimePassed(final TimerHandler pTimerHandler) 
            {
                mEngine.unregisterUpdateHandler(pTimerHandler);
               
                loadResources();
                loadScenes();
                splash.detachSelf();
                mEngine.setScene(mScene);
            }

		}));
		
		pOnPopulateSceneCallback.onPopulateSceneFinished();

	}
	
	public void initSplashScene() 
	{
		// TODO Auto-generated method stub
		splashScene = new Scene();
		splash = new Sprite(0, 0, splashTextureRegion, vertexBufferObjectManager)
		{
    		@Override
            protected void preDraw(GLState pGLState, Camera pCamera) 
    		{
                super.preDraw(pGLState, pCamera);
                pGLState.enableDither();
            }
    	};
    	splash.setScale((float) 0.4);
    	splash.setPosition((CAMERA_WIDTH - splash.getWidth()) * 0.5f, (CAMERA_HEIGHT - splash.getHeight()) * 0.5f);
    	splashScene.attachChild(splash);
		
	}
	
	public void loadResources() 
	{
		// TODO Auto-generated method stub
		LoadResources.loadAllResource();
	}
	
	public void loadScenes() 
	{
		// TODO Auto-generated method stub
		mScene = new Scene();
		mScene.setOnSceneTouchListener(this);
		
//		mScene.setBackground(new Background(Color.BLACK));
//		mScene.setBackgroundEnabled(true);
		
		//Initializing all the variables
		vertexBufferObjectManager = getVertexBufferObjectManager();
		
		serialCounter = 1;
		sCounter = 0;
		wCounter = 0;
		monkeyTutorialStart = 0;
		state = 0;
		spriteCounter = 1;
		spriteCounterLimit = 0;
		posX = 0;
		posY = 0;
		isShaking = false;
		isPopupActive  = false;
		isHandTutorialActive = false;
		isActionMoving = true;
		touch = 0;
		soundCounter=0;
		bCounter = 0;
		changeTexture = 0;
		screenShotCounter = 0;
		tutorialCounter = 0;
		dusterCounter = 0;
		dusterFinishCounter = 0;
		letter = 0;
		isHomeButtonCreated = false;

		StatusBarController.StatusBar.hideStatusBar();
		//getting the renderView width and height for taking the screen shot
//		viewWidth = GameActivity.MainActivityInstace.mRenderSurfaceView.getWidth() - 470;
//		viewHeight = GameActivity.MainActivityInstace.mRenderSurfaceView.getHeight() - 90;
		//320
		
//		double h = (CAMERA_WIDTH/1.7);
//		double h1= BackgroundHeight-h;
		
		
		viewWidth =  (int) (GameActivity.BackgroundWidth*0.45);
		viewHeight = (int) ((GameActivity.BackgroundWidth/1.7)*0.75);
		
		moOutLineX = CAMERA_WIDTH / 2 - 130;
		moOutLineY = CAMERA_HEIGHT / 2 - 130;
		
		//Timer for drawing during monkey Tutorial
		AnimationDrawTutorial.animationDrawTimer();
		mScene.registerUpdateHandler(timer1);
				
		//1.Mo 2.Aa 3.e 4.Raw 5.Ko 6.Bo 7.TalibaSha 8.Lo 9.Po 10.Go 11.Ho
		//12.Kho 13.Cho 14.No 15.A 16.Do 17.U 18.To 19.Toh 20.Doh 21.Ukar
		//22.Ekar 23.Akar 24.Aakar
		 
//		//choose the letter with number
		GameActivity.letter = HandWritingMenu.letterNumber; 
//		//create objects
		createObjects.createObject();
		
//		//create book icon
////		PopUp.createBookIcon();
////		HandTutorial.handTutorialCreate();
//
//		//create number with cursor
//		//AnimationDrawTutorial.createNumberSpriteAndCursor(2);
	}

	// to change the current main scene
	public static void setCurrentScene(Scene scene) 
	{
	    mScene = scene;
	    GameActivity.MainActivityInstace.getEngine().setScene(mScene);
	}
	
	@Override
	public boolean onSceneTouchEvent(Scene pScene, TouchEvent pSceneTouchEvent) 
	{
		// TODO Auto-generated method stub
		return Touch.touchEvent(pSceneTouchEvent);
	}

}
