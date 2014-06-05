package com.example.phonicsapp.monkeyGame;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.IOnAreaTouchListener;
import org.andengine.entity.scene.ITouchArea;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.color.Color;

import android.content.Intent;
import android.media.MediaPlayer;

import com.example.phonicsapp.GameMainPage;
import com.example.phonicsapp.MenuPage;
import com.example.phonicsapp.R;


public class MonkeyGameActivity  extends SimpleBaseGameActivity implements IOnAreaTouchListener
{
	// ===========================================================
	// Constants
	// ===========================================================
	static MonkeyGameActivity MonkeyGameActivityActivity;
	
	static int CAMERA_WIDTH;
	static int CAMERA_HEIGHT;
	static float distance;
	// ===========================================================
	// Fields
	// ===========================================================
	
	public static BitmapTextureAtlas mBitmapTextureAtlasBoxSide;
	public static TextureRegion mBoxSideTextureRegion;
	
	public static ITextureRegion mJungleBackGroundTextureRegion, mBeachBackGroundTextureRegion,
								 mUnderWaterBackGroundTextureRegion, mPlanetBackGroundTextureRegion;
	public static BitmapTextureAtlas mBitmapTextureAtlasJungleBackGround, mBitmapTextureAtlasUnderWaterBackGround,
									 mBitmapTextureAtlasBeachBackGround, mBitmapTextureAtlasPlanetBackGround;
	
	public static Sprite backGround, obj1, obj2, obj3, obj4, obj5, obj6, 
						 wrongObj1, wrongObj2, wrongObj3, wrongObj4, wrongObj5, wrongObj6,
						 banana, monkey1, monkey2;
	public static Sprite[] boxSide = new Sprite[7];
	
	public static Camera mCamera;
	public static Scene mScene;
	
	//Fixed Objects monkey1, monkey2, banana;
	public static BitmapTextureAtlas mBitmapTextureAtlasMonkeyWithoutBanana, mBitmapTextureAtlasMonkeyWithBanana,
									mBitmapTextureAtlasMonkeyWithFish, mBitmapTextureAtlasMonkeyWithAlien, 
									mBitmapTextureAtlasMonkeyWithCup, mBitmapTextureAtlasMonkeyWithoutCup,
									mBitmapTextureAtlasMonkeyWithoutAlien, mBitmapTextureAtlasMonkeyWithoutFish;
	public static ITextureRegion mFaceTextureRegionMonkeyWithoutBanana, mFaceTextureRegionMonkeyWithBanana, 
									mFaceTextureRegionMonkeyWithFish, mFaceTextureRegionMonkeyWithAlien,
									mFaceTextureRegionMonkeyWithCup, mFaceTextureRegionMonkeyWithoutCup,
									mFaceTextureRegionMonkeyWithoutAlien, mFaceTextureRegionMonkeyWithoutFish;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasBanana;
	public static ITextureRegion mFaceTextureRegionBanana;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasFish;
	public static ITextureRegion mFaceTextureRegionFish;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasCup;
	public static ITextureRegion mFaceTextureRegionCup;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasAlien;
	public static ITextureRegion mFaceTextureRegionAlien;
	
	//Letter-Mo
	public static BitmapTextureAtlas mBitmapTextureAtlasMo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo6;
	
	public static ITextureRegion mFaceTextureRegionMo1;
	public static ITextureRegion mFaceTextureRegionMo2;
	public static ITextureRegion mFaceTextureRegionMo3;
	public static ITextureRegion mFaceTextureRegionMo4;
	public static ITextureRegion mFaceTextureRegionMo5;
	public static ITextureRegion mFaceTextureRegionMo6;
	public static ITextureRegion mFaceTextureRegionWMo1;
	public static ITextureRegion mFaceTextureRegionWMo2;
	public static ITextureRegion mFaceTextureRegionWMo3;
	public static ITextureRegion mFaceTextureRegionWMo4;
	public static ITextureRegion mFaceTextureRegionWMo5;
	public static ITextureRegion mFaceTextureRegionWMo6;
	
	//Letter-Bo
	public static BitmapTextureAtlas mBitmapTextureAtlasBo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo6;
	
	public static ITextureRegion mFaceTextureRegionBo1;
	public static ITextureRegion mFaceTextureRegionBo2;
	public static ITextureRegion mFaceTextureRegionBo3;
	public static ITextureRegion mFaceTextureRegionBo4;
	public static ITextureRegion mFaceTextureRegionBo5;
	public static ITextureRegion mFaceTextureRegionBo6;
	public static ITextureRegion mFaceTextureRegionWBo1;
	public static ITextureRegion mFaceTextureRegionWBo2;
	public static ITextureRegion mFaceTextureRegionWBo3;
	public static ITextureRegion mFaceTextureRegionWBo4;
	public static ITextureRegion mFaceTextureRegionWBo5;
	public static ITextureRegion mFaceTextureRegionWBo6;
	
	//Letter-Ko
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw1;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw2;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw3;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw4;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw5;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw6;
		
	public static ITextureRegion mFaceTextureRegionRaw1;
	public static ITextureRegion mFaceTextureRegionRaw2;
	public static ITextureRegion mFaceTextureRegionRaw3;
	public static ITextureRegion mFaceTextureRegionRaw4;
	public static ITextureRegion mFaceTextureRegionRaw5;
	public static ITextureRegion mFaceTextureRegionRaw6;
	public static ITextureRegion mFaceTextureRegionWRaw1;
	public static ITextureRegion mFaceTextureRegionWRaw2;
	public static ITextureRegion mFaceTextureRegionWRaw3;
	public static ITextureRegion mFaceTextureRegionWRaw4;
	public static ITextureRegion mFaceTextureRegionWRaw5;
	public static ITextureRegion mFaceTextureRegionWRaw6;
	
	//Letter-Lo
	public static BitmapTextureAtlas mBitmapTextureAtlasToh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh2;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh3;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh4;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh5;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh6;
		
	public static ITextureRegion mFaceTextureRegionToh1;
	public static ITextureRegion mFaceTextureRegionToh2;
	public static ITextureRegion mFaceTextureRegionToh3;
	public static ITextureRegion mFaceTextureRegionToh4;
	public static ITextureRegion mFaceTextureRegionToh5;
	public static ITextureRegion mFaceTextureRegionToh6;
	public static ITextureRegion mFaceTextureRegionWToh1;
	public static ITextureRegion mFaceTextureRegionWToh2;
	public static ITextureRegion mFaceTextureRegionWToh3;
	public static ITextureRegion mFaceTextureRegionWToh4;
	public static ITextureRegion mFaceTextureRegionWToh5;
	public static ITextureRegion mFaceTextureRegionWToh6;
	
	//Letter-To
	public static BitmapTextureAtlas mBitmapTextureAtlasTo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo6;
		
	public static ITextureRegion mFaceTextureRegionTo1;
	public static ITextureRegion mFaceTextureRegionTo2;
	public static ITextureRegion mFaceTextureRegionTo3;
	public static ITextureRegion mFaceTextureRegionTo4;
	public static ITextureRegion mFaceTextureRegionTo5;
	public static ITextureRegion mFaceTextureRegionTo6;
	public static ITextureRegion mFaceTextureRegionWTo1;
	public static ITextureRegion mFaceTextureRegionWTo2;
	public static ITextureRegion mFaceTextureRegionWTo3;
	public static ITextureRegion mFaceTextureRegionWTo4;
	public static ITextureRegion mFaceTextureRegionWTo5;
	public static ITextureRegion mFaceTextureRegionWTo6;
	
	//Letter-Aa
	public static BitmapTextureAtlas mBitmapTextureAtlasAa1;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa2;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa3;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa4;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa5;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWAa1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWAa2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWAa3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWAa4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWAa5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWAa6;
		
	public static ITextureRegion mFaceTextureRegionAa1;
	public static ITextureRegion mFaceTextureRegionAa2;
	public static ITextureRegion mFaceTextureRegionAa3;
	public static ITextureRegion mFaceTextureRegionAa4;
	public static ITextureRegion mFaceTextureRegionAa5;
	public static ITextureRegion mFaceTextureRegionAa6;
	public static ITextureRegion mFaceTextureRegionWAa1;
	public static ITextureRegion mFaceTextureRegionWAa2;
	public static ITextureRegion mFaceTextureRegionWAa3;
	public static ITextureRegion mFaceTextureRegionWAa4;
	public static ITextureRegion mFaceTextureRegionWAa5;
	public static ITextureRegion mFaceTextureRegionWAa6;
	
	//Letter-Lo
	public static BitmapTextureAtlas mBitmapTextureAtlasLo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWLo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWLo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWLo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWLo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWLo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWLo6;
		
	public static ITextureRegion mFaceTextureRegionLo1;
	public static ITextureRegion mFaceTextureRegionLo2;
	public static ITextureRegion mFaceTextureRegionLo3;
	public static ITextureRegion mFaceTextureRegionLo4;
	public static ITextureRegion mFaceTextureRegionLo5;
	public static ITextureRegion mFaceTextureRegionLo6;
	public static ITextureRegion mFaceTextureRegionWLo1;
	public static ITextureRegion mFaceTextureRegionWLo2;
	public static ITextureRegion mFaceTextureRegionWLo3;
	public static ITextureRegion mFaceTextureRegionWLo4;
	public static ITextureRegion mFaceTextureRegionWLo5;
	public static ITextureRegion mFaceTextureRegionWLo6;
	
	//Letter-Ko
	public static BitmapTextureAtlas mBitmapTextureAtlasKo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKo6;
		
	public static ITextureRegion mFaceTextureRegionKo1;
	public static ITextureRegion mFaceTextureRegionKo2;
	public static ITextureRegion mFaceTextureRegionKo3;
	public static ITextureRegion mFaceTextureRegionKo4;
	public static ITextureRegion mFaceTextureRegionKo5;
	public static ITextureRegion mFaceTextureRegionKo6;
	public static ITextureRegion mFaceTextureRegionWKo1;
	public static ITextureRegion mFaceTextureRegionWKo2;
	public static ITextureRegion mFaceTextureRegionWKo3;
	public static ITextureRegion mFaceTextureRegionWKo4;
	public static ITextureRegion mFaceTextureRegionWKo5;
	public static ITextureRegion mFaceTextureRegionWKo6;
	
	//Letter-No
	public static BitmapTextureAtlas mBitmapTextureAtlasNo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWNo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWNo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWNo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWNo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWNo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWNo6;
		
	public static ITextureRegion mFaceTextureRegionNo1;
	public static ITextureRegion mFaceTextureRegionNo2;
	public static ITextureRegion mFaceTextureRegionNo3;
	public static ITextureRegion mFaceTextureRegionNo4;
	public static ITextureRegion mFaceTextureRegionNo5;
	public static ITextureRegion mFaceTextureRegionNo6;
	public static ITextureRegion mFaceTextureRegionWNo1;
	public static ITextureRegion mFaceTextureRegionWNo2;
	public static ITextureRegion mFaceTextureRegionWNo3;
	public static ITextureRegion mFaceTextureRegionWNo4;
	public static ITextureRegion mFaceTextureRegionWNo5;
	public static ITextureRegion mFaceTextureRegionWNo6;
	
	//Letter-Cho
	public static BitmapTextureAtlas mBitmapTextureAtlasCho1;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho2;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho3;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho4;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho5;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWCho1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWCho2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWCho3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWCho4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWCho5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWCho6;
		
	public static ITextureRegion mFaceTextureRegionCho1;
	public static ITextureRegion mFaceTextureRegionCho2;
	public static ITextureRegion mFaceTextureRegionCho3;
	public static ITextureRegion mFaceTextureRegionCho4;
	public static ITextureRegion mFaceTextureRegionCho5;
	public static ITextureRegion mFaceTextureRegionCho6;
	public static ITextureRegion mFaceTextureRegionWCho1;
	public static ITextureRegion mFaceTextureRegionWCho2;
	public static ITextureRegion mFaceTextureRegionWCho3;
	public static ITextureRegion mFaceTextureRegionWCho4;
	public static ITextureRegion mFaceTextureRegionWCho5;
	public static ITextureRegion mFaceTextureRegionWCho6;
	
	//Letter-E
	public static BitmapTextureAtlas mBitmapTextureAtlasE1;
	public static BitmapTextureAtlas mBitmapTextureAtlasE2;
	public static BitmapTextureAtlas mBitmapTextureAtlasE3;
	public static BitmapTextureAtlas mBitmapTextureAtlasE4;
	public static BitmapTextureAtlas mBitmapTextureAtlasE5;
	public static BitmapTextureAtlas mBitmapTextureAtlasE6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWE1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWE2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWE3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWE4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWE5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWE6;
		
	public static ITextureRegion mFaceTextureRegionE1;
	public static ITextureRegion mFaceTextureRegionE2;
	public static ITextureRegion mFaceTextureRegionE3;
	public static ITextureRegion mFaceTextureRegionE4;
	public static ITextureRegion mFaceTextureRegionE5;
	public static ITextureRegion mFaceTextureRegionE6;
	public static ITextureRegion mFaceTextureRegionWE1;
	public static ITextureRegion mFaceTextureRegionWE2;
	public static ITextureRegion mFaceTextureRegionWE3;
	public static ITextureRegion mFaceTextureRegionWE4;
	public static ITextureRegion mFaceTextureRegionWE5;
	public static ITextureRegion mFaceTextureRegionWE6;
	
	//Letter-Po
	public static BitmapTextureAtlas mBitmapTextureAtlasPo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWPo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWPo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWPo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWPo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWPo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWPo6;
		
	public static ITextureRegion mFaceTextureRegionPo1;
	public static ITextureRegion mFaceTextureRegionPo2;
	public static ITextureRegion mFaceTextureRegionPo3;
	public static ITextureRegion mFaceTextureRegionPo4;
	public static ITextureRegion mFaceTextureRegionPo5;
	public static ITextureRegion mFaceTextureRegionPo6;
	public static ITextureRegion mFaceTextureRegionWPo1;
	public static ITextureRegion mFaceTextureRegionWPo2;
	public static ITextureRegion mFaceTextureRegionWPo3;
	public static ITextureRegion mFaceTextureRegionWPo4;
	public static ITextureRegion mFaceTextureRegionWPo5;
	public static ITextureRegion mFaceTextureRegionWPo6;
	
	//Letter-Sho
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha1;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha2;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha3;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha4;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha5;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibasha1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibasha2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibasha3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibasha4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibasha5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibasha6;
		
	public static ITextureRegion mFaceTextureRegionTalibasha1;
	public static ITextureRegion mFaceTextureRegionTalibasha2;
	public static ITextureRegion mFaceTextureRegionTalibasha3;
	public static ITextureRegion mFaceTextureRegionTalibasha4;
	public static ITextureRegion mFaceTextureRegionTalibasha5;
	public static ITextureRegion mFaceTextureRegionTalibasha6;
	public static ITextureRegion mFaceTextureRegionWTalibasha1;
	public static ITextureRegion mFaceTextureRegionWTalibasha2;
	public static ITextureRegion mFaceTextureRegionWTalibasha3;
	public static ITextureRegion mFaceTextureRegionWTalibasha4;
	public static ITextureRegion mFaceTextureRegionWTalibasha5;
	public static ITextureRegion mFaceTextureRegionWTalibasha6;
	
	//Letter-Do
	public static BitmapTextureAtlas mBitmapTextureAtlasDo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDo6;
		
	public static ITextureRegion mFaceTextureRegionDo1;
	public static ITextureRegion mFaceTextureRegionDo2;
	public static ITextureRegion mFaceTextureRegionDo3;
	public static ITextureRegion mFaceTextureRegionDo4;
	public static ITextureRegion mFaceTextureRegionDo5;
	public static ITextureRegion mFaceTextureRegionDo6;
	public static ITextureRegion mFaceTextureRegionWDo1;
	public static ITextureRegion mFaceTextureRegionWDo2;
	public static ITextureRegion mFaceTextureRegionWDo3;
	public static ITextureRegion mFaceTextureRegionWDo4;
	public static ITextureRegion mFaceTextureRegionWDo5;
	public static ITextureRegion mFaceTextureRegionWDo6;
	
	//Letter-A
	public static BitmapTextureAtlas mBitmapTextureAtlasA1;
	public static BitmapTextureAtlas mBitmapTextureAtlasA2;
	public static BitmapTextureAtlas mBitmapTextureAtlasA3;
	public static BitmapTextureAtlas mBitmapTextureAtlasA4;
	public static BitmapTextureAtlas mBitmapTextureAtlasA5;
	public static BitmapTextureAtlas mBitmapTextureAtlasA6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWA1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWA2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWA3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWA4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWA5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWA6;
		
	public static ITextureRegion mFaceTextureRegionA1;
	public static ITextureRegion mFaceTextureRegionA2;
	public static ITextureRegion mFaceTextureRegionA3;
	public static ITextureRegion mFaceTextureRegionA4;
	public static ITextureRegion mFaceTextureRegionA5;
	public static ITextureRegion mFaceTextureRegionA6;
	public static ITextureRegion mFaceTextureRegionWA1;
	public static ITextureRegion mFaceTextureRegionWA2;
	public static ITextureRegion mFaceTextureRegionWA3;
	public static ITextureRegion mFaceTextureRegionWA4;
	public static ITextureRegion mFaceTextureRegionWA5;
	public static ITextureRegion mFaceTextureRegionWA6;
	
	//Letter-Doh
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh2;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh3;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh4;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh5;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDoh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDoh2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDoh3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDoh4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDoh5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDoh6;
		
	public static ITextureRegion mFaceTextureRegionDoh1;
	public static ITextureRegion mFaceTextureRegionDoh2;
	public static ITextureRegion mFaceTextureRegionDoh3;
	public static ITextureRegion mFaceTextureRegionDoh4;
	public static ITextureRegion mFaceTextureRegionDoh5;
	public static ITextureRegion mFaceTextureRegionDoh6;
	public static ITextureRegion mFaceTextureRegionWDoh1;
	public static ITextureRegion mFaceTextureRegionWDoh2;
	public static ITextureRegion mFaceTextureRegionWDoh3;
	public static ITextureRegion mFaceTextureRegionWDoh4;
	public static ITextureRegion mFaceTextureRegionWDoh5;
	public static ITextureRegion mFaceTextureRegionWDoh6;
	
	//Letter-Kho
	public static BitmapTextureAtlas mBitmapTextureAtlasKho1;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho2;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho3;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho4;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho5;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKho1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKho2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKho3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKho4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKho5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKho6;
		
	public static ITextureRegion mFaceTextureRegionKho1;
	public static ITextureRegion mFaceTextureRegionKho2;
	public static ITextureRegion mFaceTextureRegionKho3;
	public static ITextureRegion mFaceTextureRegionKho4;
	public static ITextureRegion mFaceTextureRegionKho5;
	public static ITextureRegion mFaceTextureRegionKho6;
	public static ITextureRegion mFaceTextureRegionWKho1;
	public static ITextureRegion mFaceTextureRegionWKho2;
	public static ITextureRegion mFaceTextureRegionWKho3;
	public static ITextureRegion mFaceTextureRegionWKho4;
	public static ITextureRegion mFaceTextureRegionWKho5;
	public static ITextureRegion mFaceTextureRegionWKho6;
	
	//Letter-U
	public static BitmapTextureAtlas mBitmapTextureAtlasU1;
	public static BitmapTextureAtlas mBitmapTextureAtlasU2;
	public static BitmapTextureAtlas mBitmapTextureAtlasU3;
	public static BitmapTextureAtlas mBitmapTextureAtlasU4;
	public static BitmapTextureAtlas mBitmapTextureAtlasU5;
	public static BitmapTextureAtlas mBitmapTextureAtlasU6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWU1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWU2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWU3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWU4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWU5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWU6;
		
	public static ITextureRegion mFaceTextureRegionU1;
	public static ITextureRegion mFaceTextureRegionU2;
	public static ITextureRegion mFaceTextureRegionU3;
	public static ITextureRegion mFaceTextureRegionU4;
	public static ITextureRegion mFaceTextureRegionU5;
	public static ITextureRegion mFaceTextureRegionU6;
	public static ITextureRegion mFaceTextureRegionWU1;
	public static ITextureRegion mFaceTextureRegionWU2;
	public static ITextureRegion mFaceTextureRegionWU3;
	public static ITextureRegion mFaceTextureRegionWU4;
	public static ITextureRegion mFaceTextureRegionWU5;
	public static ITextureRegion mFaceTextureRegionWU6;
	
	//Letter-Go
	public static BitmapTextureAtlas mBitmapTextureAtlasGo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWGo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWGo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWGo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWGo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWGo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWGo6;
		
	public static ITextureRegion mFaceTextureRegionGo1;
	public static ITextureRegion mFaceTextureRegionGo2;
	public static ITextureRegion mFaceTextureRegionGo3;
	public static ITextureRegion mFaceTextureRegionGo4;
	public static ITextureRegion mFaceTextureRegionGo5;
	public static ITextureRegion mFaceTextureRegionGo6;
	public static ITextureRegion mFaceTextureRegionWGo1;
	public static ITextureRegion mFaceTextureRegionWGo2;
	public static ITextureRegion mFaceTextureRegionWGo3;
	public static ITextureRegion mFaceTextureRegionWGo4;
	public static ITextureRegion mFaceTextureRegionWGo5;
	public static ITextureRegion mFaceTextureRegionWGo6;
	
	//Letter-Ho
	public static BitmapTextureAtlas mBitmapTextureAtlasHo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasWHo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWHo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWHo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWHo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWHo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasWHo6;
		
	public static ITextureRegion mFaceTextureRegionHo1;
	public static ITextureRegion mFaceTextureRegionHo2;
	public static ITextureRegion mFaceTextureRegionHo3;
	public static ITextureRegion mFaceTextureRegionHo4;
	public static ITextureRegion mFaceTextureRegionHo5;
	public static ITextureRegion mFaceTextureRegionHo6;
	public static ITextureRegion mFaceTextureRegionWHo1;
	public static ITextureRegion mFaceTextureRegionWHo2;
	public static ITextureRegion mFaceTextureRegionWHo3;
	public static ITextureRegion mFaceTextureRegionWHo4;
	public static ITextureRegion mFaceTextureRegionWHo5;
	public static ITextureRegion mFaceTextureRegionWHo6;
	
	static float mFaceCount = -100;

	public static int aCount = 0;
	public static int randomItem, randomItem1;
	
	//reward objects like banana, fish, cup, alien
	public static Sprite[] position = new Sprite[7];
	
	static float ImageHeight;
	static float ImageWidth;
	
	static float ImageHeightObjects;
	static float ImageWidthObjects;
	
	static int value = 0;
	static int bananaValue = 0;
	
	public static VertexBufferObjectManager vbo;
	static Boolean audioPlay = false;
	static MediaPlayer mediaPlayer = new MediaPlayer();
	static int obj1Sound, obj2Sound, obj3Sound, obj4Sound, obj5Sound, obj6Sound, 
			   wrongObj1Sound, wrongObj2Sound, wrongObj3Sound, wrongObj4Sound,
			   wrongObj5Sound, wrongObj6Sound;
	
	public static TimerHandler timer1, timer2;
	public static int monkeyGameLevelSelector;
	public static int monkeyGameMenuLetterSelector;
	public static double monkeyGameObjectScale;
	public static int[] monkeyGameLevelSelector1 = new int[25];
	
	
	@Override
	public EngineOptions onCreateEngineOptions() 
	{
		MonkeyGameActivityActivity = this;
		
		CAMERA_HEIGHT = 454;
		CAMERA_WIDTH = 800;
		
		ImageHeight = CAMERA_HEIGHT/1.1f;
		ImageWidth = CAMERA_WIDTH/6.0f;
		
		ImageHeightObjects = CAMERA_HEIGHT/5.0f;
		ImageWidthObjects = CAMERA_WIDTH/7.5f;
		
		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		
		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
	}

	@Override
	public void onCreateResources() 
	{
		LoadResources.loadAllObjects();
	}
	
	@Override
	public void onBackPressed()
	{
//	    new AlertDialog.Builder(this)
//	        .setTitle("Really Exit?")
//	        .setMessage("Are you sure you want to exit?")
//	        .setNegativeButton(android.R.string.no, null)
//	        .setPositiveButton(android.R.string.yes, new OnClickListener()
//	        {
//
//	            public void onClick(DialogInterface arg0, int arg1) 
//	            {
//	            	aCount = 0;
//					mFaceCount = -100; 
//	                MonkeyGameActivity.super.onBackPressed();
//	            }
//	        }).create().show();
		
		aCount = 0;
		mFaceCount = -100; 
		finish();
		startActivity(new Intent(getBaseContext(), MenuPage.class));
	}
	
	@Override
	public Scene onCreateScene() 
	{
		mScene = new Scene();
		mScene.setBackground(new Background(Color.WHITE));
		vbo = getVertexBufferObjectManager();

		//debug mode
		//RootTools.debugMode = true; 
//		StatusBar.hideStatusBar();
				
		monkeyGameObjectScale = 0.6;
		
//		MonkeyGameActivity.monkeyGameLevelSelector = 2;
		
		monkeyGameMenuLetterSelector = MenuPage.letterNumber;
		
		GameObjects.createObjects(monkeyGameMenuLetterSelector);
		
		
		mScene.registerUpdateHandler(new TimerHandler(1, true, new ITimerCallback()
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler) 
			{
				// TODO Auto-generated method stub
				
				if(value == 1)
				{
					MonkeyFunction.monkey1();
				}
			}
		}));
		 
		mScene.registerUpdateHandler(new TimerHandler(3, true, new ITimerCallback() 
		{
			
			@Override
			public void onTimePassed(TimerHandler pTimerHandler)
			{
				// TODO Auto-generated method stub
				//Adding Banana
				if(bananaValue == 1)
				{
					MonkeyFunction.addFace(CAMERA_WIDTH / 2, CAMERA_HEIGHT / 2);
				}
			}
		}));
		
		MonkeyGameTimerHandlers.selectRandromObjects();
		

		//playing the introduction sound of parrot
		mScene.registerUpdateHandler(new TimerHandler((float) 0.5,new ITimerCallback()
		{
				@Override
				public void onTimePassed(TimerHandler pTimerHandler)
				{
					playIntroSound();
				}
		}));
		
		mScene.setOnAreaTouchListener(this);
		return mScene;
	}

	
	@Override
	public boolean onAreaTouched(TouchEvent pSceneTouchEvent,ITouchArea pTouchArea, float pTouchAreaLocalX,float pTouchAreaLocalY) 
	{
		// TODO Auto-generated method stub
		
		if (pSceneTouchEvent.isActionDown()) 
		{
			ObjectRemoveFunctions.removeFace((Sprite) pTouchArea);
			return true;
		}
		return false;
	}

	public void playIntroSound()
	{
		MonkeyGameActivity.audioPlay = true;
		if(monkeyGameMenuLetterSelector==1)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_mo);
		}
		else if(monkeyGameMenuLetterSelector==2)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_aa);
		}
		else if(monkeyGameMenuLetterSelector==3)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_e);
		}
		else if(monkeyGameMenuLetterSelector==4)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_raw);
		}
		else if(monkeyGameMenuLetterSelector==5)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_ko);
		}
		else if(monkeyGameMenuLetterSelector==6)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_bo);
		}
		else if(monkeyGameMenuLetterSelector==7)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_talibasha);
		}
		else if(monkeyGameMenuLetterSelector==8)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_lo);
		}
		else if(monkeyGameMenuLetterSelector==9)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_po);
		}
		else if(monkeyGameMenuLetterSelector==10)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_go);
		}
		else if(monkeyGameMenuLetterSelector==11)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_ho);
		}
		else if(monkeyGameMenuLetterSelector==12)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_kho);
		}
		else if(monkeyGameMenuLetterSelector==13)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_cho);
		}
		else if(monkeyGameMenuLetterSelector==14)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_no);
		}
		else if(monkeyGameMenuLetterSelector==15)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_a);
		}
		else if(monkeyGameMenuLetterSelector==16)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_do);
		}
		else if(monkeyGameMenuLetterSelector==17)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_u);
		}
		else if(monkeyGameMenuLetterSelector==18)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_to);
		}
		else if(monkeyGameMenuLetterSelector==19)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_toh);
		}
		else if(monkeyGameMenuLetterSelector==20)
		{
			ObjectRemoveFunctions.playAudio(R.raw.intro_doh);
		}
		
	}

	public static void startActivity()
	{
		if(monkeyGameMenuLetterSelector==1)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==2)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==3)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==4)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==5)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==6)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==7)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==8)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==9)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==10)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==11)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==12)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==13)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==14)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==15)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==16)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==17)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==18)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==19)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		else if(monkeyGameMenuLetterSelector==20)
		{
			levelSelector(monkeyGameMenuLetterSelector);
		}
		
	}
	
	public static void levelSelector(int a)
	{
		if(monkeyGameLevelSelector1[a] == 0)
		{
			monkeyGameLevelSelector1[a] = 1;
			monkeyGameLevelSelector = 1;
			mScene.unregisterUpdateHandler(timer1);
			MonkeyGameActivityActivity.finish();
			MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, MonkeyGameActivity.class));
		}
		else if(monkeyGameLevelSelector1[a] == 1)
		{
			monkeyGameLevelSelector = 0;
			mScene.unregisterUpdateHandler(timer1);
			MonkeyGameActivityActivity.finish();
			//MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, GameMainPage.class));
			MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, MenuPage.class));
			//Unlock the letters
			MenuPage.count();
			monkeyGameLevelSelector1[a] = 0;
		}
	}
}