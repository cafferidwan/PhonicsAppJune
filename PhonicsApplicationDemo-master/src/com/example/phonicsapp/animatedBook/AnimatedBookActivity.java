package com.example.phonicsapp.animatedBook;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.entity.util.FPSLogger;
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
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import com.example.phonicsapp.R;
import com.example.phonicsapp.boxGame.BoxGameActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;

public class AnimatedBookActivity extends SimpleBaseGameActivity 
{
	public static int CAMERA_HEIGHT;
	public static int CAMERA_WIDTH;
	public static Context context;
	public static Camera mCamera;
	static float ImageWidth;
	static float ImageHeight;
	int val;
	
	static int NextCount=1;
	static boolean ArrowTouchEnable = false;
	
	static float ImagePosX;
	static float ImagePosY;
	
	//Background 
	public static BuildableBitmapTextureAtlas BgBuildableBitmapTextureAtlas;
	public static ITextureRegion BgTextureRegion,BgTextureRegion2,BgTextureRegion3,BgTextureRegion4;
	public static ITextureRegion SpriteBgTextureRegion;
	public static Scene mMainScene;
	public static Sprite BgSprite;
	public static Sprite NextSprite;
	public static Sprite SpriteBg;
	
	//Letters 
	public static BuildableBitmapTextureAtlas LetterBuildableBitmapTextureAtlas;
	
	//Letter images 1 Aaa
	public static ITextureRegion MangoTextureRegion;
	public static ITextureRegion AppleTextureRegion;
	public static ITextureRegion GingerTextureRegion;
	public static ITextureRegion PineappleTextureRegion;
	public static ITextureRegion PotatoTextureRegion;
	public static ITextureRegion SkyTextureRegion;
	
	//Letter images 2 Moo
	public static BuildableBitmapTextureAtlas Letter2BuildableBitmapTextureAtlas;
	public static ITextureRegion MaTextureRegion;
	public static ITextureRegion MamaTextureRegion;
	public static ITextureRegion MoiTextureRegion;
	public static ITextureRegion MeghTextureRegion;
	public static ITextureRegion MulaTextureRegion;
	public static ITextureRegion MohisTextureRegion;
	
	//Letter images 3 Rao
	public static BuildableBitmapTextureAtlas Letter3BuildableBitmapTextureAtlas;
	public static ITextureRegion RainTextureRegion;
	public static ITextureRegion RannaTextureRegion;
	public static ITextureRegion RobiTextureRegion;
	public static ITextureRegion RocketTextureRegion;
	public static ITextureRegion RongdonuTextureRegion;
	public static ITextureRegion RuiTextureRegion;
	
	//Letter images 4 Bo
	public static BuildableBitmapTextureAtlas Letter4BuildableBitmapTextureAtlas;
	public static ITextureRegion BalishTextureRegion;
	public static ITextureRegion BallTextureRegion;
	public static ITextureRegion BallonTextureRegion;
	public static ITextureRegion BoiTextureRegion;
	public static ITextureRegion BokTextureRegion;
	public static ITextureRegion BrinjalTextureRegion;
	
	//Letter images 5 To
	public static BuildableBitmapTextureAtlas Letter5BuildableBitmapTextureAtlas;
	public static ITextureRegion TableTextureRegion;
	public static ITextureRegion TakaTextureRegion;
	public static ITextureRegion TinTextureRegion;
	public static ITextureRegion TobTextureRegion;
	public static ITextureRegion TomatoTextureRegion;
	public static ITextureRegion TomtomTextureRegion;
	
	//Next Arrow
	public static ITextureRegion NextTextureRegion;
	
	//Parrot image Flying
	public BitmapTextureAtlas ParrotBitmapTextureAtlus,ParrotBitmapTextureAtlus2,ParrotBitmapTextureAtlus3,ParrotBitmapTextureAtlus4;
	public static TiledTextureRegion ParrotTextureRegion,ParrotTextureRegion2,ParrotTextureRegion3,ParrotTextureRegion4;

	//Letter 
	public static BuildableBitmapTextureAtlas LetterAllBuildableBitmapTextureAtlas;
	public static ITextureRegion LetterMoTextureRegion;
	public static ITextureRegion LetterToTextureRegion;
	public static ITextureRegion LetterRawTextureRegion;
	public static ITextureRegion LetterBoTextureRegion;
	
	public static VertexBufferObjectManager vertexBufferObjectManager;
	
	@Override
	public EngineOptions onCreateEngineOptions() 
	{
		// TODO Auto-generated method stub
		Display display = getWindowManager().getDefaultDisplay();
		CAMERA_HEIGHT = display.getHeight();
		CAMERA_WIDTH = display.getWidth();
		
		ImageHeight = CAMERA_HEIGHT/2.5f;
		ImageWidth = CAMERA_WIDTH/4.5f;
		
		ImagePosX = CAMERA_WIDTH/100;
		ImagePosY = CAMERA_HEIGHT/20;
		
		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);		
		
		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED, new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
	}
	@Override
	protected void onCreateResources() 
	{
		// TODO Auto-generated method stub
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("AnimatedBookGfx/");
		BgBuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(getTextureManager(), 3800,3000,TextureOptions.DEFAULT);
		BgTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(BgBuildableBitmapTextureAtlas, this, "jungle16.png");
		BgTextureRegion2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(BgBuildableBitmapTextureAtlas, this, "underWaterBackground.png");
		BgTextureRegion3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(BgBuildableBitmapTextureAtlas, this, "BeachBG.png");
		BgTextureRegion4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(BgBuildableBitmapTextureAtlas, this, "planetBackground.png");
		
		//Letter Image
		LetterBuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(getTextureManager(), 1400, 900,TextureOptions.DEFAULT);
		
		SpriteBgTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterBuildableBitmapTextureAtlas, this, "spritebg.png");
		
		MangoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterBuildableBitmapTextureAtlas, this, "grp1/mango2.png");
		AppleTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterBuildableBitmapTextureAtlas, this, "grp1/apple.png");
		GingerTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterBuildableBitmapTextureAtlas, this, "grp1/ginger.png");
		PineappleTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterBuildableBitmapTextureAtlas, this, "grp1/pineapple.png");
		PotatoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterBuildableBitmapTextureAtlas, this, "grp1/potato.png");
		SkyTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterBuildableBitmapTextureAtlas, this, "grp1/sky.png");
		NextTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterBuildableBitmapTextureAtlas, this, "a.png");
		
		//Letter Group 2 Moo
		Letter2BuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(getTextureManager(), 1200, 800,TextureOptions.DEFAULT);
		MaTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter2BuildableBitmapTextureAtlas, this, "grp2/ma.png");
		MamaTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter2BuildableBitmapTextureAtlas, this, "grp2/mama.png");
		MulaTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter2BuildableBitmapTextureAtlas, this, "grp2/mula.png");
		MeghTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter2BuildableBitmapTextureAtlas, this, "grp2/megh.png");
		MoiTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter2BuildableBitmapTextureAtlas, this, "grp2/moi.png");
		MohisTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter2BuildableBitmapTextureAtlas, this, "grp2/mohish.png");
		
		//Letter Group 3 Rao 
		Letter3BuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(getTextureManager(), 1300, 800,TextureOptions.DEFAULT);
		RainTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter3BuildableBitmapTextureAtlas, this, "LetterRaw/rani.png");
		RannaTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter3BuildableBitmapTextureAtlas, this, "LetterRaw/ranna.png");
		RobiTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter3BuildableBitmapTextureAtlas, this, "LetterRaw/robi.png");
		RocketTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter3BuildableBitmapTextureAtlas, this, "LetterRaw/rocket.png");
		RongdonuTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter3BuildableBitmapTextureAtlas, this, "LetterRaw/rongdhonu.png");
		RuiTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter3BuildableBitmapTextureAtlas, this, "LetterRaw/rui.png");
				
		//Letter Group 4 Bo
		Letter4BuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(getTextureManager(), 1200, 800,TextureOptions.DEFAULT);
		BalishTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter4BuildableBitmapTextureAtlas, this, "LetterBo/balish.png");
		BallTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter4BuildableBitmapTextureAtlas, this, "LetterBo/ball.png");
		BallonTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter4BuildableBitmapTextureAtlas, this, "LetterBo/ballon.png");
		BoiTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter4BuildableBitmapTextureAtlas, this, "LetterBo/boi.png");
		BokTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter4BuildableBitmapTextureAtlas, this, "LetterBo/bok.png");
		BrinjalTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter4BuildableBitmapTextureAtlas, this, "LetterBo/brinjal.png");
								
		//Letter Group 5 To
		Letter5BuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(getTextureManager(), 1200, 800,TextureOptions.DEFAULT);
		TableTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter5BuildableBitmapTextureAtlas, this, "LetterTo/table.png");
		TakaTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter5BuildableBitmapTextureAtlas, this, "LetterTo/taka.png");
		TinTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter5BuildableBitmapTextureAtlas, this, "LetterTo/tin.png");
		TobTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter5BuildableBitmapTextureAtlas, this, "LetterTo/tob.png");
		TomatoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter5BuildableBitmapTextureAtlas, this, "LetterTo/tomato.png");
		TomtomTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(Letter5BuildableBitmapTextureAtlas, this, "LetterTo/tomtom.png");
					
		// Letter All 
		LetterAllBuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(getTextureManager(), 1200, 1200,TextureOptions.DEFAULT);
		LetterMoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterAllBuildableBitmapTextureAtlas, this, "grp2/letter_mo.png");
		LetterRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterAllBuildableBitmapTextureAtlas, this, "LetterRaw/raw.png");
		LetterBoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterAllBuildableBitmapTextureAtlas, this, "LetterBo/bo.png");
		LetterToTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LetterAllBuildableBitmapTextureAtlas, this, "LetterTo/to.png");
		
		ParrotBitmapTextureAtlus = new BitmapTextureAtlas(getTextureManager(), 820, 820,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		ParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(ParrotBitmapTextureAtlus, this, "animatedParrot.png",0,0,2,2);
		ParrotBitmapTextureAtlus2 = new BitmapTextureAtlas(getTextureManager(), 820, 820,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		ParrotTextureRegion2 = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(ParrotBitmapTextureAtlus2, this, "beachParrot.png",0,0,2,2);//uw
		ParrotBitmapTextureAtlus3 = new BitmapTextureAtlas(getTextureManager(), 820, 820,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		ParrotTextureRegion3 = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(ParrotBitmapTextureAtlus3, this, "underWaterParrot.png",0,0,2,2);//b
		ParrotBitmapTextureAtlus4 = new BitmapTextureAtlas(getTextureManager(), 820, 820,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		ParrotTextureRegion4 = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(ParrotBitmapTextureAtlus4, this, "planetParrot.png",0,0,2,2);//p
		
		
		try
		{
			BgBuildableBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			BgBuildableBitmapTextureAtlas.load();
			
			LetterBuildableBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			LetterBuildableBitmapTextureAtlas.load();
			Letter2BuildableBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			Letter2BuildableBitmapTextureAtlas.load();
			Letter3BuildableBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			Letter3BuildableBitmapTextureAtlas.load();
			Letter4BuildableBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			Letter4BuildableBitmapTextureAtlas.load();
			Letter5BuildableBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			Letter5BuildableBitmapTextureAtlas.load();
			LetterAllBuildableBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			LetterAllBuildableBitmapTextureAtlas.load();
			
			ParrotBitmapTextureAtlus.load();
			ParrotBitmapTextureAtlus2.load();
			ParrotBitmapTextureAtlus3.load();
			ParrotBitmapTextureAtlus4.load(); 
			
		} 
		catch (TextureAtlasBuilderException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected Scene onCreateScene() 
	{
		
		mEngine.registerUpdateHandler(new FPSLogger());
		mMainScene = new Scene();
		Bundle extras = getIntent().getExtras();
		val = extras.getInt("val");
		vertexBufferObjectManager = getVertexBufferObjectManager();
		AnimatedBookActivity.context = getApplicationContext();
		mMainScene.setTouchAreaBindingOnActionMoveEnabled(true);

		if(val == 1){		
			BgSprite = new Sprite(0, 0, BgTextureRegion,vertexBufferObjectManager);
		}
		else if(val == 4){
			BgSprite = new Sprite(0, 0, BgTextureRegion2,vertexBufferObjectManager);
			ParrotTextureRegion = ParrotTextureRegion3;
		}
		else if(val == 6){
			BgSprite = new Sprite(0, 0, BgTextureRegion3,vertexBufferObjectManager);
			ParrotTextureRegion = ParrotTextureRegion2.deepCopy();
		}
		else if(val == 19){
			BgSprite = new Sprite(0, 0, BgTextureRegion4,vertexBufferObjectManager);
			ParrotTextureRegion = ParrotTextureRegion4.deepCopy();
		}
		BgSprite.setHeight(CAMERA_HEIGHT);
		BgSprite.setWidth(CAMERA_WIDTH);
		mMainScene.attachChild(BgSprite);

		nextStage(val);
		return mMainScene;
	}
	  public  void nextStage(int stage)
	  {
		  TiledImage.ObjNo = 1;
		if(stage == 0)
		{
			//ahoro 
			loadImage1(MangoTextureRegion,R.raw.mama);
			loadImage2(AppleTextureRegion,R.raw.mama);
			loadImage3(GingerTextureRegion,R.raw.mama);
			loadImage4(PineappleTextureRegion,R.raw.mama);
			loadImage5(PotatoTextureRegion,R.raw.mama);
			loadImage6(SkyTextureRegion,R.raw.mama);
			loadParrotAndNext(ParrotTextureRegion,NextTextureRegion,LetterMoTextureRegion,R.raw.parrot_introducing_mo);
		}
		//'mo' letter
		else if(stage == 1)
		{
			loadImage1(MamaTextureRegion,R.raw.mama);
			loadImage2(MaTextureRegion,R.raw.ma);
			loadImage3(MohisTextureRegion,R.raw.mohis);
			loadImage4(MulaTextureRegion,R.raw.mula);
			loadImage5(MoiTextureRegion,R.raw.moi);
			loadImage6(MeghTextureRegion,R.raw.megh);
			loadParrotAndNext(ParrotTextureRegion,NextTextureRegion,LetterMoTextureRegion,R.raw.parrot_introducing_mo);
		}
		//Ro 
		else if(stage == 4)
		{
			Letter2BuildableBitmapTextureAtlas.clearTextureAtlasSources();
			loadImage1(RainTextureRegion,R.raw.rani);
			loadImage2(RannaTextureRegion,R.raw.rana);
			loadImage3(RobiTextureRegion,R.raw.robi);
			loadImage4(RocketTextureRegion,R.raw.rocket);
			loadImage5(RongdonuTextureRegion,R.raw.rongdhonu);
			loadImage6(RuiTextureRegion,R.raw.ruimach);
			loadParrotAndNext(ParrotTextureRegion,NextTextureRegion,LetterRawTextureRegion,R.raw.ab_intro_ro);
		}
		//Bo
		else if(stage == 6)
		{
			Letter3BuildableBitmapTextureAtlas.clearTextureAtlasSources();
			Log.d("TitledImage", " In 4 ");
			loadImage1(BalishTextureRegion,R.raw.balish);
			loadImage2(BallTextureRegion,R.raw.boll);
			loadImage3(BallonTextureRegion,R.raw.belun);
			loadImage4(BoiTextureRegion,R.raw.boi);
			loadImage5(BokTextureRegion,R.raw.bok);
			loadImage6(BrinjalTextureRegion,R.raw.begun);
			loadParrotAndNext(ParrotTextureRegion,NextTextureRegion,LetterBoTextureRegion,R.raw.ab_intro_bo);
		}
		else if(stage == 19)
		{
			Letter3BuildableBitmapTextureAtlas.clearTextureAtlasSources();
			loadImage1(TableTextureRegion,R.raw.tebil);
			loadImage2(TakaTextureRegion,R.raw.taka);
			loadImage3(TinTextureRegion,R.raw.tin);
			loadImage4(TobTextureRegion,R.raw.tob);
			loadImage5(TomatoTextureRegion,R.raw.tomato);
			loadImage6(TomtomTextureRegion,R.raw.tomtom);
			loadParrotAndNext(ParrotTextureRegion,NextTextureRegion,LetterToTextureRegion,R.raw.ab_intro_to);
		}
	}
	
	static void loadImage1(ITextureRegion r1, int voice)
	{
		TiledImage t1 = new TiledImage(ImagePosX, ImagePosY, ImageWidth , ImageHeight, r1, vertexBufferObjectManager,voice,AnimatedBookActivity.context);
		mMainScene.registerTouchArea(t1.Letter);
		mMainScene.attachChild(t1.Letter);
	}
	
	static void loadImage2(ITextureRegion r1, int voice)
	{
		TiledImage t2 = new TiledImage(ImagePosX +(CAMERA_WIDTH*0.22f), ImagePosY, ImageWidth , ImageHeight, r1, vertexBufferObjectManager,voice,AnimatedBookActivity.context);
		mMainScene.registerTouchArea(t2.Letter);
		mMainScene.attachChild(t2.Letter);
	}
	
	static void loadImage3(ITextureRegion r1,int voice)
	{
		TiledImage t3 = new TiledImage(ImagePosX +(CAMERA_WIDTH*0.44f), ImagePosY, ImageWidth , ImageHeight, r1, vertexBufferObjectManager,voice,AnimatedBookActivity.context);
		mMainScene.registerTouchArea(t3.Letter);
		mMainScene.attachChild(t3.Letter);
		
	}
	
	static void loadImage4(ITextureRegion r1,int voice)
	{
		TiledImage t4 = new TiledImage(ImagePosX, ImagePosY+(CAMERA_HEIGHT*0.44f), ImageWidth , ImageHeight,r1 , vertexBufferObjectManager,voice,AnimatedBookActivity.context);
		mMainScene.registerTouchArea(t4.Letter);
		mMainScene.attachChild(t4.Letter);
		
	}
	
	static void loadImage5(ITextureRegion r1, int voice)
	{
		TiledImage t5 = new TiledImage(ImagePosX+(CAMERA_WIDTH*0.22f), ImagePosY+(CAMERA_HEIGHT*0.44f), ImageWidth , ImageHeight, r1, vertexBufferObjectManager,voice,AnimatedBookActivity.context);
		mMainScene.registerTouchArea(t5.Letter);
		mMainScene.attachChild(t5.Letter);
		
	}
	
	static void loadImage6(ITextureRegion r1 , int voice)
	{
		TiledImage t6 = new TiledImage(ImagePosX+(CAMERA_WIDTH*0.44f), ImagePosY+(CAMERA_HEIGHT*0.44f), ImageWidth , ImageHeight, r1, vertexBufferObjectManager,voice,AnimatedBookActivity.context);
		mMainScene.registerTouchArea(t6.Letter);
		mMainScene.attachChild(t6.Letter);
		
	}
	
	 void loadParrotAndNext(TiledTextureRegion p , ITextureRegion n,ITextureRegion l, int parrot_sound)
	{
		Parrot p1 = new Parrot(CAMERA_WIDTH + 200,CAMERA_WIDTH - 250, CAMERA_HEIGHT / 2-20 ,CAMERA_HEIGHT / 2-50, p, vertexBufferObjectManager,parrot_sound, R.raw.mama, AnimatedBookActivity.context,l);
		mMainScene.registerTouchArea(p1.parrotFlying);
		mMainScene.attachChild(p1.parrotFlying);
		createNextArrow(CAMERA_WIDTH-100f, CAMERA_HEIGHT-100f, 200f, 200f, n, 1);
		mMainScene.registerTouchArea(NextSprite);
		mMainScene.attachChild(NextSprite);
		mMainScene.attachChild(p1.mLetter);
		mMainScene.sortChildren();
	}
	void createNextArrow(float pX, float pY, float pWidth, float pHeight,ITextureRegion pTextureRegion, int voice)
	{
		NextSprite = new Sprite(pX, pY, pTextureRegion, vertexBufferObjectManager)
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
			{
				switch (pSceneTouchEvent.getAction()) 
				{
					case TouchEvent.ACTION_DOWN:
					{
						break;
					}
					case TouchEvent.ACTION_MOVE: 
					{
						break;
					}
					case TouchEvent.ACTION_UP: 
					{
						if(ArrowTouchEnable)
						{
							ArrowTouchEnable = false;
							startActivity();
							/*
							AnimatedBookActivity.mMainScene.detachChildren();
							mMainScene.attachChild(BgSprite);
							TiledImage.ObjNo = 0;
							NextCount++;
							nextStage(NextCount);
							*/
						}
						break;
					}
					default:
					{
	
					}
				}
				return false;
			}
		};
	}
	
	void startActivity()
	{
		finish();
		startActivity(new Intent(this, BoxGameActivity.class));
	}
}
