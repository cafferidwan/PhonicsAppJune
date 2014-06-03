package com.example.phonicsapp.wordbuilding;

import java.util.ArrayList;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.andengine.opengl.texture.atlas.buildable.builder.BlackPawnTextureAtlasBuilder;
import org.andengine.opengl.texture.atlas.buildable.builder.ITextureAtlasBuilder.TextureAtlasBuilderException;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import com.example.phonicsapp.R;

import android.content.Context;
import android.util.Log;
import android.view.Display;

public class BaseActivity extends SimpleBaseGameActivity {

	private static final String TAG = "BaseActivity";
	public static int CAMERA_WIDTH;
	public static int CAMERA_HEIGHT;
	public static int z_index, FinishMethodCallFlag;
	public static Scene mCurrentScene,mScene;
	public Camera mCamera;
	
	public static boolean chk = false,bookAlive; 
	
	public Sprite BgSprite,Branche,sp_ibh;
	public static Sprite sp_ith;
	public Seizure seizure;
	public Parrot parrot;
	public static Mouled mouled1,mouled2,mouled3;
	public static  ArrayList<Mouled> mouled;
	static Marker TempMarker;
	static Trash_can trashCan;
	static RightFlipImage rightFlipImage;
	static RightBar rb;
	
	
	public static VertexBufferObjectManager vobm;
	public static Context context;
	public static EngineOptions engOps;
	public static Engine eng;
	
	public static BuildableBitmapTextureAtlas BgBuildableBitmapTextureAtlas;
	public static BuildableBitmapTextureAtlas LettersBuildableBitmapTextureAtlas;
	public static BuildableBitmapTextureAtlas MouledBuildableBitmapTextureAtlas;
	public static BuildableBitmapTextureAtlas ScrollBuildableBitmapTextureAtlas;
	public BitmapTextureAtlas ParrotBitmapTextureAtlus;
	public static ITextureRegion BgTextureReason;
	public static ITextureRegion SeizureTextureReason;
	public static ITextureRegion BranchTextureReason;
	public static TiledTextureRegion ParrotTextureReason;
	
	public static ITextureRegion tr1,tr2;
	
	public static ITextureRegion Letter1TextureReason;
	public static ArrayList<ITextureRegion> textureReason;
	public static ArrayList<ITextureRegion> textureReasonTopJoin;
	public static ArrayList<ITextureRegion> MouledTextureReason;
	public static ArrayList<ITextureRegion> MouledTextureReasonBW;
	public static ArrayList<ITextureRegion> OthersTextureReason;
	
	public static ArrayList<Marker> markers;
	public static ArrayList<Marker> markersTopJoin;
	public static ArrayList<Marker> allMarkers;
	public static ArrayList<ScrollBar> Scrollmarkers;
	
	public static ArrayList<String> letterName;
	public static ArrayList<Boolean> bookPicAliveList;
	
	
	//public static boolean isSeizureTouchedup = false;
	
	@Override
	public EngineOptions onCreateEngineOptions() {
		// TODO Auto-generated method stub
		Display display = getWindowManager().getDefaultDisplay();
		CAMERA_HEIGHT = display.getHeight();
		CAMERA_WIDTH = display.getWidth();
		z_index = 0;
		context = getApplicationContext();
		//instance = this;
		
		textureReason = new ArrayList<ITextureRegion>();
		textureReasonTopJoin = new ArrayList<ITextureRegion>();
		MouledTextureReason = new ArrayList<ITextureRegion>();
		MouledTextureReasonBW = new ArrayList<ITextureRegion>();
		OthersTextureReason = new ArrayList<ITextureRegion>();
		markers = new ArrayList<Marker>();
		markersTopJoin = new ArrayList<Marker>();
		letterName = new ArrayList<String>();
		Scrollmarkers = new ArrayList<ScrollBar>();
		mouled = new ArrayList<Mouled>();
		bookPicAliveList = new ArrayList<Boolean>();
		Letters.allLettersName();
		initialCall();
		
		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
	    engOps = new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR, new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
		engOps.getTouchOptions().setNeedsMultiTouch(true);
		eng = new Engine(engOps);
	    return engOps; 
	}

	@Override
	protected void onCreateResources() {
		// TODO Auto-generated method stub
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("WordBuildingScroll/");
		BgBuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(this.getTextureManager(), 2900, 2532,TextureOptions.BILINEAR);
		LettersBuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(this.getTextureManager(), 1400, 1400,TextureOptions.BILINEAR);
		MouledBuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(this.getTextureManager(), 1400, 1400,TextureOptions.BILINEAR);
		ScrollBuildableBitmapTextureAtlas = new BuildableBitmapTextureAtlas(this.getTextureManager(), 600, 5400,TextureOptions.BILINEAR);
		
		BgTextureReason = BitmapTextureAtlasTextureRegionFactory.createFromAsset(BgBuildableBitmapTextureAtlas, this, "jungle16.png");
		BranchTextureReason = BitmapTextureAtlasTextureRegionFactory.createFromAsset(BgBuildableBitmapTextureAtlas, this, "branch1.png");
		SeizureTextureReason = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "kacchi.png");
		
		textureReason.add(Letters.lettersNameContainer.indexOf("m"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_1.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("akar"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_3.png"));
		textureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_2.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("Aa"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_2.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("l"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_4.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("k"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_5.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("t"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_6.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("b"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_7.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("n"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_8.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("ch"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_9.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("i"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/i_b.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("I"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_10.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("p"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_12.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("r"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_13.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("sh"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_14.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("D"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_15.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("ekar"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_17.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("a"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_16.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("d"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_18.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("T"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_19.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("kh"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_20.png"));
		
		textureReason.add(Letters.lettersNameContainer.indexOf("U"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_21.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("g"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_23.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("ho"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_24.png"));
		textureReason.add(Letters.lettersNameContainer.indexOf("u"),BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/bl_22.png"));
		
		tr1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/i_t.png");
		
		
		/*textureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/shoroa.png"));
		letterName.add("shoroa");*/
		//textureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(LettersBuildableBitmapTextureAtlas, this, "Letters/letter_mo.png"));
		
		MouledTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/ma_1.png"));
		MouledTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/am_1.png"));
		MouledTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/lal_1.png"));
		MouledTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/mala_1.png"));
		MouledTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/molom_1.png"));
		MouledTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/kak_1.png"));
		MouledTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/kolom_1.png"));
		MouledTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/kola_1.png"));
		MouledTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/komola_1.png"));
		
		MouledTextureReasonBW.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/ma_2.png"));
		MouledTextureReasonBW.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/am_2.png"));
		MouledTextureReasonBW.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/lal_2.png"));
		MouledTextureReasonBW.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/mala_2.png"));
		MouledTextureReasonBW.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/molom_2.png"));
		MouledTextureReasonBW.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/kak_2.png"));
		MouledTextureReasonBW.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/kolom_2.png"));
		MouledTextureReasonBW.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/kola_2.png"));
		MouledTextureReasonBW.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "MouledCharacter/komola_2.png"));
		
		OthersTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "others/book_3.png"));
		OthersTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "others/trash_1.png"));
		OthersTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "others/trash_2.png"));
		OthersTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "others/book_flip.png"));
		OthersTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "others/book_2.png"));
		OthersTextureReason.add(BitmapTextureAtlasTextureRegionFactory.createFromAsset(MouledBuildableBitmapTextureAtlas, this, "others/cross_icon.png"));
		
		ParrotBitmapTextureAtlus = new BitmapTextureAtlas(this.getTextureManager(),810, 810,TextureOptions.BILINEAR);
		ParrotTextureReason = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(ParrotBitmapTextureAtlus, this, "animatedParrot.png",0,0,2,2);
		
		try {
			BgBuildableBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			LettersBuildableBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			MouledBuildableBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			BgBuildableBitmapTextureAtlas.load();
			LettersBuildableBitmapTextureAtlas.load();
			MouledBuildableBitmapTextureAtlas.load();
			ParrotBitmapTextureAtlus.load();

		} catch (TextureAtlasBuilderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	protected void onDestroy()
	{
		super.onDestroy();
	        System.exit(0);	
	}

	@Override
	protected Scene onCreateScene() {
		// TODO Auto-generated method stub
		
		mCurrentScene = new Scene();
		mCurrentScene.setTouchAreaBindingOnActionMoveEnabled(true);
		//mScene = new Scene();
	    
		BgSprite = new Sprite(0, 0, BgTextureReason, getVertexBufferObjectManager());
				
	    BgSprite.setHeight(CAMERA_HEIGHT);
		BgSprite.setWidth(CAMERA_WIDTH);
		mCurrentScene.attachChild(BgSprite);
		mCurrentScene.setUserData("MainScene");
		
		setSingleSound(); 
		
		//markers.get(Letters.lettersNameContainer.indexOf("i")).joinBottom = false;
		sp_ith = new Sprite(40, -1, tr1, vobm);
		sp_ith.setZIndex(200);
		
		seizure = new Seizure(CAMERA_WIDTH- 200, 10,80,80, SeizureTextureReason,getVertexBufferObjectManager(),getApplicationContext(),0);
		
		mouled.add(new Mouled(10, 5, 150, 150, MouledTextureReason.get(0), MouledTextureReasonBW.get(0), getVertexBufferObjectManager(), getApplicationContext(),R.raw.ma));
		mouled.add(new Mouled(10, 5, 150, 150, MouledTextureReason.get(1), MouledTextureReasonBW.get(1), getVertexBufferObjectManager(), getApplicationContext(),R.raw.am));
		mouled.add(new Mouled(10, 5, 150, 150, MouledTextureReason.get(2), MouledTextureReasonBW.get(2), getVertexBufferObjectManager(), getApplicationContext(),R.raw.lal));
		mouled.add(new Mouled(10, 5, 150, 150, MouledTextureReason.get(3), MouledTextureReasonBW.get(3), getVertexBufferObjectManager(), getApplicationContext(),R.raw.mala));
		mouled.add(new Mouled(10, 5, 150, 150, MouledTextureReason.get(4), MouledTextureReasonBW.get(4), getVertexBufferObjectManager(), getApplicationContext(),R.raw.molom));
		mouled.add(new Mouled(10, 5, 150, 150, MouledTextureReason.get(5), MouledTextureReasonBW.get(5), getVertexBufferObjectManager(), getApplicationContext(),R.raw.kak));
		mouled.add(new Mouled(10, 5, 150, 150, MouledTextureReason.get(6), MouledTextureReasonBW.get(6), getVertexBufferObjectManager(), getApplicationContext(),R.raw.kolom));
		mouled.add(new Mouled(10, 5, 150, 150, MouledTextureReason.get(7), MouledTextureReasonBW.get(7), getVertexBufferObjectManager(), getApplicationContext(),R.raw.kola));
		
		/*mouled2 = new Mouled(CAMERA_WIDTH/2 - 150, CAMERA_HEIGHT/2 - 150, 150, 150, MouledTextureReason.get(1), getVertexBufferObjectManager(), getApplicationContext(),R.raw.ma);
		Branche = new Sprite(CAMERA_WIDTH -200, CAMERA_HEIGHT/4, 400, 80,BranchTextureReason,getVertexBufferObjectManager());
		Branche.setFlippedHorizontal(true);
		Branche.setZIndex(0);*/
		//mCurrentScene.attachChild(Branche); 
		//parrot = new Parrot(CAMERA_WIDTH -200, CAMERA_HEIGHT/4-120, 250, 200, ParrotTextureReason, this.getVertexBufferObjectManager());
		
		
		for(int i = 0; i< Letters.lettersNameContainer.size(); i++){
			Scrollmarkers.add(new ScrollBar(10,75*(i+1), 60f, 60f, textureReason.get(i), getVertexBufferObjectManager(),getApplicationContext(),Letters.lettersNameContainer.get(i).toString())); 
			Scrollmarkers.get(i).scrollLetter = Scrollmarkers.get(i).scrollLetter;
		}
		allMarkers();
		Words.createScequences();
		mCurrentScene.sortChildren();
		mCurrentScene.setTouchAreaBindingOnActionDownEnabled(true);  
		
		createLetter("m");
		createLetter("akar");
		createLetter("i");
		createLetter("r");
		createLetter("T");
		//createLetter("u");
		
		rb = new RightBar();
		rb.addRightBar();
		//rb.createTopImage(OthersTextureReason.get(0));
		rb.createLowerImage(OthersTextureReason.get(0));
		rb.createBook(OthersTextureReason.get(4),OthersTextureReason.get(5));
		rb.createParrot(ParrotTextureReason); 
		
		trashCan = new Trash_can();
		trashCan.createTrashCan(OthersTextureReason.get(1),OthersTextureReason.get(2));
		
		rightFlipImage = new RightFlipImage();
		rightFlipImage.createFlipBook(OthersTextureReason.get(3));
		//rightFlipImage.flipBook.attachChild(mouled.get(0).mouled);
		
		return mCurrentScene;
	}
	
	void setSingleSound(){
		Sound.setSingleSound(Letters.lettersNameContainer.get(0), R.raw.sl_0);
		Sound.setSingleSound(Letters.lettersNameContainer.get(1), R.raw.sl_1);
		Sound.setSingleSound(Letters.lettersNameContainer.get(2), R.raw.sl_2);
		Sound.setSingleSound(Letters.lettersNameContainer.get(3),R.raw.lo);
		Sound.setSingleSound(Letters.lettersNameContainer.get(4), R.raw.sl_4);
		Sound.setSingleSound(Letters.lettersNameContainer.get(5), R.raw.sl_5);
		Sound.setSingleSound(Letters.lettersNameContainer.get(6), R.raw.sl_6);
		Sound.setSingleSound(Letters.lettersNameContainer.get(7), R.raw.sl_7);
		Sound.setSingleSound(Letters.lettersNameContainer.get(8), R.raw.sl_8);
		Sound.setSingleSound(Letters.lettersNameContainer.get(9), R.raw.sl_9);
		Sound.setSingleSound(Letters.lettersNameContainer.get(10), R.raw.sl_10);
		Sound.setSingleSound(Letters.lettersNameContainer.get(11), R.raw.sl_11); 
		Sound.setSingleSound(Letters.lettersNameContainer.get(12), R.raw.sl_12);
		Sound.setSingleSound(Letters.lettersNameContainer.get(13), R.raw.sl_13);
		Sound.setSingleSound(Letters.lettersNameContainer.get(14), R.raw.sl_14);
		Sound.setSingleSound(Letters.lettersNameContainer.get(15), R.raw.sl_16);
		Sound.setSingleSound(Letters.lettersNameContainer.get(16), R.raw.sl_16);
		Sound.setSingleSound(Letters.lettersNameContainer.get(17), R.raw.sl_17);
		Sound.setSingleSound(Letters.lettersNameContainer.get(18), R.raw.sl_18);
		Sound.setSingleSound(Letters.lettersNameContainer.get(19), R.raw.kho);
		Sound.setSingleSound(Letters.lettersNameContainer.get(20), R.raw.sl_20);
		Sound.setSingleSound(Letters.lettersNameContainer.get(21), R.raw.sl_21);
		Sound.setSingleSound(Letters.lettersNameContainer.get(22), R.raw.sl_22);
		Sound.setSingleSound(Letters.lettersNameContainer.get(23), R.raw.sl_20);
		//Sound.setSingleSound(letterName.get(23), R.raw.shoroa);
		/**/
		
	}
	public static void resetPosition(){
		for(int i=0;i<markers.size();i++){
			markers.get(i).letter.setPosition(1+((121)*(i+1) ), CAMERA_HEIGHT - 120);
			markers.get(i).left=null;
			markers.get(i).right=null;
			markers.get(i).leftValue=-1;
			markers.get(i).rightValue=1;
		}
	}
	
	static float getX_PositionForInitialLetter(){
		float nextX=10;
		for(int i=0;i<markers.size();i++){
			if(nextX<markers.get(i).letter.getX()){
				nextX = markers.get(i).letter.getX() + markers.get(i).letter.getWidth() ;
			}
		}
		for(int i=0;i<markersTopJoin.size();i++){
			if(nextX<markersTopJoin.get(i).letter.getX()){
				nextX = markersTopJoin.get(i).letter.getX();
			}
		}
		return nextX;		
	}
	void allMarkers(){
		allMarkers = markers;
		for(int i=0;i<markersTopJoin.size();i++){
			allMarkers.add(markersTopJoin.get(i));
		}
	}
	
	public void deAttachToScene(Marker m){
		m.letter.setPosition(- 130, - 120);
		mCurrentScene.detachChild(m.letter);
		mCurrentScene.unregisterTouchArea(m.letter);
		markers.remove(m);
	}
	
	public static void createLetter(String name){
		if(Letters.lettersNameContainer.contains(name)){
			TempMarker = new Marker(getX_PositionForInitialLetter() + 50, CAMERA_HEIGHT - 120, 100f, 100f, textureReason.get(Letters.lettersNameContainer.indexOf(name)), vobm,context,Sound.getSingleSound(name),true,false,true,true);
			TempMarker.markerSelf = TempMarker;
			TempMarker.letter.setUserData(name);
			markers.add(TempMarker);
			markerJoinPermission(TempMarker);
			mCurrentScene.attachChild(TempMarker.letter);
			mCurrentScene.registerTouchArea(TempMarker.letter);
			mCurrentScene.sortChildren();
		}
		else{
			Log.d(TAG, name + " doesn't contain");
		}
	}
	public static void createLetterFromScroll(String name , float pX, float pY){
		if(Letters.lettersNameContainer.contains(name)){
			TempMarker = new Marker(pX+10, pY, 100f, 100f, textureReason.get(Letters.lettersNameContainer.indexOf(name)), vobm,context,Sound.getSingleSound(name),true,false,true,true);
			TempMarker.markerSelf = TempMarker;
			TempMarker.letter.setUserData(name);
			markers.add(TempMarker);
			markerJoinPermission(TempMarker);
			mCurrentScene.attachChild(TempMarker.letter);
			mCurrentScene.registerTouchArea(TempMarker.letter);
			mCurrentScene.sortChildren();
		}
		else{
			Log.d(TAG, name + " doesn't contain");
		}
	}
	public static void markerJoinPermission(Marker m){
		if(m.letter.getUserData().equals("i")){
			m.letter.attachChild(new Sprite(40, -1, tr1, vobm));
			m.letter.setZIndex(200);
			m.joinBottom = false;
		}
		if(m.letter.getUserData().equals("akar") || m.letter.getUserData().equals("ekar")){
			m.joinBottom = false;
		}
		if(m.letter.getUserData().equals("u")){
			m.joinBottom = false;
			m.joinLeft = false;
			m.joinRight = false;
			m.joinTop = true;
			m.letter.setHeight((float)(m.letter.getHeight()*0.4));
			m.letter.setWidth((float)(m.letter.getWidth()*0.4));
		}
	}
	void initialCall(){
		for(int i=0;i<Letters.lettersNameContainer.size();i++){
			textureReason.add(null);
		}
	}
	
	/*public static void scroll(){
		for(int i = 0; i< textureReason.size(); i++){
			//markers.add(new Marker(1+((121)*(i+1) ), CAMERA_HEIGHT - 120, 100f, 100f, textureReason.get(i), getVertexBufferObjectManager(),getApplicationContext(),Sound.getSingleSound(letterName.get(i))));
			//markers.get(i).markerSelf = markers.get(i);
		}
	}*/
		
}
