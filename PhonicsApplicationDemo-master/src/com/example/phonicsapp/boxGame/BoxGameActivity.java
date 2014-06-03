package com.example.phonicsapp.boxGame;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.Entity;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.debug.Debug;

import com.example.phonicsapp.MenuPage;
import com.example.phonicsapp.R;
import com.example.phonicsapp.monkeyGame.MonkeyGameActivity;
import StatusBarController.StatusBar;
import android.content.Context;
import android.content.Intent;

public class BoxGameActivity extends SimpleBaseGameActivity 
{

	static int CAMERA_WIDTH;
	static int CAMERA_HEIGHT;

	public Camera mCamera;
	public static Scene mScene;
	static Context context;
	
	public static ITextureRegion mJungleBackGroundTextureRegion, mBeachBackGroundTextureRegion,
								 mUnderWaterBackGroundTextureRegion, mPlanetBackGroundTextureRegion;
	public static BitmapTextureAtlas mBitmapTextureAtlasJungleBackGround, mBitmapTextureAtlasUnderWaterBackGround,
									 mBitmapTextureAtlasBeachBackGround, mBitmapTextureAtlasPlanetBackGround;
	
	
	//All the Boxes
	public static ITextureRegion mUnderWaterBoxCloseTextureRegion, mUnderWaterBoxTextureOpenRegion, mPlanetBoxCloseTextureRegion, mPlanetBoxOpenTextureRegion,
								 mBeachBoxCloseTextureRegion, mBeachBoxOpenTextureRegion, mJungleBoxCloseTextureRegion, mJungleBoxOpenTextureRegion;
	public static BitmapTextureAtlas mUnderWaterBitmapTextureAtlasBoxClose, mUnderWaterBitmapTextureAtlasBoxOpen, mPlanetBitmapTextureAtlasBoxClose,
								 mPlanetBitmapTextureAtlasBoxOpen, mBeachBitmapTextureAtlasBoxClose, mBeachBitmapTextureAtlasBoxOpen, mJungleBitmapTextureAtlasBoxClose,
								 mJungleBitmapTextureAtlasBoxOpen;
	
	
	public static BuildableBitmapTextureAtlas mAnimatedJungleParrotBitmapTextureAtlas, 
										mAnimatedUnderWaterParrotBitmapTextureAtlas,
										mAnimatedBeachParrotBitmapTextureAtlas,
										mAnimatedPlanetParrotBitmapTextureAtlas;
	public static TiledTextureRegion mJungleParrotTextureRegion, mUnderWaterParrotTextureRegion,
										mBeachParrotTextureRegion, mPlanetParrotTextureRegion;
	
	//Letter-Mo
	public static ITextureRegion mMo1TextureRegion;
	public static ITextureRegion mMo2TextureRegion;
	public static ITextureRegion mMo3TextureRegion;
	public static ITextureRegion mMo4TextureRegion;
	public static ITextureRegion mMo5TextureRegion;
	public static ITextureRegion mMo6TextureRegion;
	public static ITextureRegion mMoTextureRegion;
	public static ITextureRegion mWMo1TextureRegion;
	public static ITextureRegion mWMo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasMo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo2;
	
	//Letter-E
	public static ITextureRegion mE1TextureRegion;
	public static ITextureRegion mE2TextureRegion;
	public static ITextureRegion mE3TextureRegion;
	public static ITextureRegion mE4TextureRegion;
	public static ITextureRegion mE5TextureRegion;
	public static ITextureRegion mE6TextureRegion;
	public static ITextureRegion mETextureRegion;
	public static ITextureRegion mWE1TextureRegion;
	public static ITextureRegion mWE2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasE1;
	public static BitmapTextureAtlas mBitmapTextureAtlasE2;
	public static BitmapTextureAtlas mBitmapTextureAtlasE3;
	public static BitmapTextureAtlas mBitmapTextureAtlasE4;
	public static BitmapTextureAtlas mBitmapTextureAtlasE5;
	public static BitmapTextureAtlas mBitmapTextureAtlasE6;
	public static BitmapTextureAtlas mBitmapTextureAtlasE;
	public static BitmapTextureAtlas mBitmapTextureAtlasWE1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWE2;
	
	//Letter-Ko
	public static ITextureRegion mKo1TextureRegion;
	public static ITextureRegion mKo2TextureRegion;
	public static ITextureRegion mKo3TextureRegion;
	public static ITextureRegion mKo4TextureRegion;
	public static ITextureRegion mKo5TextureRegion;
	public static ITextureRegion mKo6TextureRegion;
	public static ITextureRegion mKoTextureRegion;
	public static ITextureRegion mWKo1TextureRegion;
	public static ITextureRegion mWKo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasKo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasKo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKo2;
	
	//Letter-TalibaSha
	public static ITextureRegion mTalibaSha1TextureRegion;
	public static ITextureRegion mTalibaSha2TextureRegion;
	public static ITextureRegion mTalibaSha3TextureRegion;
	public static ITextureRegion mTalibaSha4TextureRegion;
	public static ITextureRegion mTalibaSha5TextureRegion;
	public static ITextureRegion mTalibaSha6TextureRegion;
	public static ITextureRegion mTalibaShaTextureRegion;
	public static ITextureRegion mWTalibaSha1TextureRegion;
	public static ITextureRegion mWTalibaSha2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibaSha1;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibaSha2;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibaSha3;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibaSha4;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibaSha5;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibaSha6;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibaSha;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibaSha1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibaSha2;
	
	//Letter-Lo
	public static ITextureRegion mLo1TextureRegion;
	public static ITextureRegion mLo2TextureRegion;
	public static ITextureRegion mLo3TextureRegion;
	public static ITextureRegion mLo4TextureRegion;
	public static ITextureRegion mLo5TextureRegion;
	public static ITextureRegion mLo6TextureRegion;
	public static ITextureRegion mLoTextureRegion;
	public static ITextureRegion mWLo1TextureRegion;
	public static ITextureRegion mWLo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasLo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasLo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWLo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWLo2;
	
	//Letter-Po
	public static ITextureRegion mPo1TextureRegion;
	public static ITextureRegion mPo2TextureRegion;
	public static ITextureRegion mPo3TextureRegion;
	public static ITextureRegion mPo4TextureRegion;
	public static ITextureRegion mPo5TextureRegion;
	public static ITextureRegion mPo6TextureRegion;
	public static ITextureRegion mPoTextureRegion;
	public static ITextureRegion mWPo1TextureRegion;
	public static ITextureRegion mWPo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasPo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasPo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWPo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWPo2;
	
	//Letter-Go
	public static ITextureRegion mGo1TextureRegion;
	public static ITextureRegion mGo2TextureRegion;
	public static ITextureRegion mGo3TextureRegion;
	public static ITextureRegion mGo4TextureRegion;
	public static ITextureRegion mGo5TextureRegion;
	public static ITextureRegion mGo6TextureRegion;
	public static ITextureRegion mGoTextureRegion;
	public static ITextureRegion mWGo1TextureRegion;
	public static ITextureRegion mWGo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasGo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasGo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWGo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWGo2;
	
	//Ho
	public static ITextureRegion mHo1TextureRegion;
	public static ITextureRegion mHo2TextureRegion;
	public static ITextureRegion mHo3TextureRegion;
	public static ITextureRegion mHo4TextureRegion;
	public static ITextureRegion mHo5TextureRegion;
	public static ITextureRegion mHo6TextureRegion;
	public static ITextureRegion mHoTextureRegion;
	public static ITextureRegion mWHo1TextureRegion;
	public static ITextureRegion mWHo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasHo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasHo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWHo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWHo2;
	
	//Letter-Kho
	public static ITextureRegion mKho1TextureRegion;
	public static ITextureRegion mKho2TextureRegion;
	public static ITextureRegion mKho3TextureRegion;
	public static ITextureRegion mKho4TextureRegion;
	public static ITextureRegion mKho5TextureRegion;
	public static ITextureRegion mKho6TextureRegion;
	public static ITextureRegion mKhoTextureRegion;
	public static ITextureRegion mWKho1TextureRegion;
	public static ITextureRegion mWKho2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasKho1;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho2;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho3;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho4;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho5;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho6;
	public static BitmapTextureAtlas mBitmapTextureAtlasKho;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKho1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWKho2;
	
	//Letter-No
	public static ITextureRegion mNo1TextureRegion;
	public static ITextureRegion mNo2TextureRegion;
	public static ITextureRegion mNo3TextureRegion;
	public static ITextureRegion mNo4TextureRegion;
	public static ITextureRegion mNo5TextureRegion;
	public static ITextureRegion mNo6TextureRegion;
	public static ITextureRegion mNoTextureRegion;
	public static ITextureRegion mWNo1TextureRegion;
	public static ITextureRegion mWNo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasNo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasNo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWNo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWNo2;
	
	//Letter-Cho
	public static ITextureRegion mCho1TextureRegion;
	public static ITextureRegion mCho2TextureRegion;
	public static ITextureRegion mCho3TextureRegion;
	public static ITextureRegion mCho4TextureRegion;
	public static ITextureRegion mCho5TextureRegion;
	public static ITextureRegion mCho6TextureRegion;
	public static ITextureRegion mChoTextureRegion;
	public static ITextureRegion mWCho1TextureRegion;
	public static ITextureRegion mWCho2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasCho1;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho2;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho3;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho4;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho5;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho6;
	public static BitmapTextureAtlas mBitmapTextureAtlasCho;
	public static BitmapTextureAtlas mBitmapTextureAtlasWCho1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWCho2;
	
	//Letter-Do
	public static ITextureRegion mDo1TextureRegion;
	public static ITextureRegion mDo2TextureRegion;
	public static ITextureRegion mDo3TextureRegion;
	public static ITextureRegion mDo4TextureRegion;
	public static ITextureRegion mDo5TextureRegion;
	public static ITextureRegion mDo6TextureRegion;
	public static ITextureRegion mDoTextureRegion;
	public static ITextureRegion mWDo1TextureRegion;
	public static ITextureRegion mWDo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasDo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasDo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDo2;
	
	//Letter-U
	public static ITextureRegion mU1TextureRegion;
	public static ITextureRegion mU2TextureRegion;
	public static ITextureRegion mU3TextureRegion;
	public static ITextureRegion mU4TextureRegion;
	public static ITextureRegion mU5TextureRegion;
	public static ITextureRegion mU6TextureRegion;
	public static ITextureRegion mUTextureRegion;
	public static ITextureRegion mWU1TextureRegion;
	public static ITextureRegion mWU2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasU1;
	public static BitmapTextureAtlas mBitmapTextureAtlasU2;
	public static BitmapTextureAtlas mBitmapTextureAtlasU3;
	public static BitmapTextureAtlas mBitmapTextureAtlasU4;
	public static BitmapTextureAtlas mBitmapTextureAtlasU5;
	public static BitmapTextureAtlas mBitmapTextureAtlasU6;
	public static BitmapTextureAtlas mBitmapTextureAtlasU;
	public static BitmapTextureAtlas mBitmapTextureAtlasWU1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWU2;
	
	
	//Letter-Bo
	public static ITextureRegion mBo1TextureRegion;
	public static ITextureRegion mBo2TextureRegion;
	public static ITextureRegion mBo3TextureRegion;
	public static ITextureRegion mBo4TextureRegion;
	public static ITextureRegion mBo5TextureRegion;
	public static ITextureRegion mBo6TextureRegion;
	public static ITextureRegion mBoTextureRegion;
	public static ITextureRegion mWBo1TextureRegion;
	public static ITextureRegion mWBo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasBo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo2;
	
	
	//Letter-Raw
	public static ITextureRegion mRaw1TextureRegion;
	public static ITextureRegion mRaw2TextureRegion;
	public static ITextureRegion mRaw3TextureRegion;
	public static ITextureRegion mRaw4TextureRegion;
	public static ITextureRegion mRaw5TextureRegion;
	public static ITextureRegion mRaw6TextureRegion;
	public static ITextureRegion mRawTextureRegion;
	public static ITextureRegion mWRaw1TextureRegion;
	public static ITextureRegion mWRaw2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw1;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw2;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw3;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw4;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw5;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw6;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw2;
	
	//Letter-Toh
	public static ITextureRegion mToh1TextureRegion;
	public static ITextureRegion mToh2TextureRegion;
	public static ITextureRegion mToh3TextureRegion;
	public static ITextureRegion mToh4TextureRegion;
	public static ITextureRegion mToh5TextureRegion;
	public static ITextureRegion mToh6TextureRegion;
	public static ITextureRegion mTohTextureRegion;
	public static ITextureRegion mWToh1TextureRegion;
	public static ITextureRegion mWToh2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasToh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh2;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh3;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh4;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh5;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh6;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh2;

	//Letter-Aa
	public static ITextureRegion mAa1TextureRegion;
	public static ITextureRegion mAa2TextureRegion;
	public static ITextureRegion mAa3TextureRegion;
	public static ITextureRegion mAa4TextureRegion;
	public static ITextureRegion mAa5TextureRegion;
	public static ITextureRegion mAa6TextureRegion;
	public static ITextureRegion mAaTextureRegion;
	public static ITextureRegion mWAa1TextureRegion;
	public static ITextureRegion mWAa2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasAa1;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa2;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa3;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa4;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa5;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa6;
	public static BitmapTextureAtlas mBitmapTextureAtlasAa;
	public static BitmapTextureAtlas mBitmapTextureAtlasWAa1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWAa2;
	
	//Letter-Doh
	public static ITextureRegion mDoh1TextureRegion;
	public static ITextureRegion mDoh2TextureRegion;
	public static ITextureRegion mDoh3TextureRegion;
	public static ITextureRegion mDoh4TextureRegion;
	public static ITextureRegion mDoh5TextureRegion;
	public static ITextureRegion mDoh6TextureRegion;
	public static ITextureRegion mDohTextureRegion;
	public static ITextureRegion mWDoh1TextureRegion;
	public static ITextureRegion mWDoh2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh2;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh3;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh4;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh5;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh6;
	public static BitmapTextureAtlas mBitmapTextureAtlasDoh;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDoh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWDoh2;
	
	//Letter-To
	public static ITextureRegion mTo1TextureRegion;
	public static ITextureRegion mTo2TextureRegion;
	public static ITextureRegion mTo3TextureRegion;
	public static ITextureRegion mTo4TextureRegion;
	public static ITextureRegion mTo5TextureRegion;
	public static ITextureRegion mTo6TextureRegion;
	public static ITextureRegion mToTextureRegion;
	public static ITextureRegion mWTo1TextureRegion;
	public static ITextureRegion mWTo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasTo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo2;
	
	//Letter-A
	public static ITextureRegion mA1TextureRegion;
	public static ITextureRegion mA2TextureRegion;
	public static ITextureRegion mA3TextureRegion;
	public static ITextureRegion mA4TextureRegion;
	public static ITextureRegion mA5TextureRegion;
	public static ITextureRegion mA6TextureRegion;
	public static ITextureRegion mATextureRegion;
	public static ITextureRegion mWA1TextureRegion;
	public static ITextureRegion mWA2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasA1;
	public static BitmapTextureAtlas mBitmapTextureAtlasA2;
	public static BitmapTextureAtlas mBitmapTextureAtlasA3;
	public static BitmapTextureAtlas mBitmapTextureAtlasA4;
	public static BitmapTextureAtlas mBitmapTextureAtlasA5;
	public static BitmapTextureAtlas mBitmapTextureAtlasA6;
	public static BitmapTextureAtlas mBitmapTextureAtlasA;
	public static BitmapTextureAtlas mBitmapTextureAtlasWA1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWA2;
	
	//Letter-Talibasha
	public static ITextureRegion mTalibasha1TextureRegion;
	public static ITextureRegion mTalibasha2TextureRegion;
	public static ITextureRegion mTalibasha3TextureRegion;
	public static ITextureRegion mTalibasha4TextureRegion;
	public static ITextureRegion mTalibasha5TextureRegion;
	public static ITextureRegion mTalibasha6TextureRegion;
	public static ITextureRegion mTalibashaTextureRegion;
	public static ITextureRegion mWTalibasha1TextureRegion;
	public static ITextureRegion mWTalibasha2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha1;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha2;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha3;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha4;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha5;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha6;
	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibasha1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibasha2;
	
//	//Letter-Lo
//	public static ITextureRegion mTalibasha1TextureRegion;
//	public static ITextureRegion mTalibasha2TextureRegion;
//	public static ITextureRegion mTalibasha3TextureRegion;
//	public static ITextureRegion mTalibasha4TextureRegion;
//	public static ITextureRegion mTalibasha5TextureRegion;
//	public static ITextureRegion mTalibasha6TextureRegion;
//	public static ITextureRegion mTalibashaTextureRegion;
//	public static ITextureRegion mWTalibasha1TextureRegion;
//	public static ITextureRegion mWTalibasha2TextureRegion;
//	
//	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha1;
//	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha2;
//	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha3;
//	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha4;
//	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha5;
//	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha6;
//	public static BitmapTextureAtlas mBitmapTextureAtlasTalibasha;
//	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibasha1;
//	public static BitmapTextureAtlas mBitmapTextureAtlasWTalibasha2;
	
	
	public static Sprite backGround, openedBox, closedBox;
	static Sprite obj1, obj2, obj3, obj4, obj5, obj6,wrongObj1, wrongObj2;
	static int obj1Sound, obj2Sound, obj3Sound, obj4Sound, obj5Sound, obj6Sound, wrongObj1Sound, wrongObj2Sound, letterSound;
	
	static Letter letter ;
	//Obj1-mula, Obj2-ma, Obj3-mohis, Obj4-megh, Obj5-moi, Obj6-mama, wrongObj1-kola, wrongObj2-keramBoard;
	static AnimatedSprite  parrot;
	public static Entity parrotLetter;
	public static TimerHandler timer1, timer2, timer3;
	
	static float obj1X , obj1Y, obj2X, obj2Y, obj3X, obj3Y, obj4X, obj4Y, obj5X, obj5Y, 
				 obj6X, obj6Y, wrongObj1X, wrongObj1Y, wrongObj2X, wrongObj2Y,
				 letterX, letterY;
	
	static float ImageHight;
	static float ImageWidth;

	public static BoxGameActivity boxGameActivityInstance;
	public static int counter, bCounter, aCounter;
	public static String DEBUG_TAG = BoxGameActivity.class.getSimpleName();
	public static double objectScale;
	//variables for function files
	public static int val, count, disableCol ;
	
	//level selector of box game
	public static int boxGameMenuLetterSelector;
	public static int[] letterLevelSelector = new int[25];
	//public static int letterLevelSelector1, letterLevelSelector4, letterLevelSelector6, letterLevelSelector19;
	
	public static BoxGameActivity getSharedInstances()
	{
		return boxGameActivityInstance;
	}
	
	@Override
	public EngineOptions onCreateEngineOptions()
	{
		// TODO Auto-generated method stub
		boxGameActivityInstance = this;
		CAMERA_WIDTH = 800;
		CAMERA_HEIGHT = 454;
		
		ImageHight = 120;
		ImageWidth = 120;
		
		obj1X = CAMERA_WIDTH/2 - CAMERA_WIDTH/4;
		obj1Y =	CAMERA_HEIGHT/2 - CAMERA_HEIGHT/4;
		
		obj6X = CAMERA_WIDTH/2 - CAMERA_WIDTH/3;
		obj6Y =	CAMERA_HEIGHT-130;
		
		wrongObj1X = 35;
		wrongObj1Y = CAMERA_HEIGHT-130;
		
		obj2X = 50;
		obj2Y = CAMERA_HEIGHT/2 - CAMERA_HEIGHT/4;
		
		obj3X = CAMERA_WIDTH - 150;
		obj3Y = CAMERA_HEIGHT-130;
		
		wrongObj2X = CAMERA_WIDTH - CAMERA_WIDTH/4 -95;
		wrongObj2Y = CAMERA_HEIGHT-130;
		
		obj4X =  CAMERA_WIDTH/2 + 40;
		obj4Y = CAMERA_HEIGHT/4;
		
		obj5X = CAMERA_WIDTH/2-90;
		obj5Y = CAMERA_HEIGHT/2 - CAMERA_HEIGHT/4;
		
		letterX = 160;
		letterY = 250;
		
		//Box game every object scale
		objectScale = 0.7;
		
		BoxGameActivity.counter = 0;
		
		//setting the level to 0
		//boxGameLevel = 0;
		
		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		
		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
	}

	@Override
	protected void onCreateResources() 
	{
		// TODO Auto-generated method stub
		LoadResources.loadAllObjects();
	}

	@Override
	public void onBackPressed()
	{
	   
//	    BoxGameActivity.super.onBackPressed();
		finish();
		startActivity(new Intent(getBaseContext(), MenuPage.class));
	}
	
	@Override
	protected Scene onCreateScene()
	{
		// TODO Auto-generated method stub
		mScene = new Scene();
//		mScene.setBackground(new Background(Color.WHITE));
//		mScene.setTouchAreaBindingOnActionDownEnabled(true);
		
		counter = 0;
		bCounter = 0;
		aCounter = 0;
		val = 0; 
		count = 0 ;
		disableCol = 0;
		
//		StatusBar.hideStatusBar();
//		StatusBar.showStatusBar();
		
		//Getting the menu letter number
		boxGameMenuLetterSelector = MenuPage.letterNumber;
		 
		//Loading the objects according to letter
		LevelObject.loadObjects(boxGameMenuLetterSelector); 
		
		//check collisions
		TimerHandlers.checkObjectCollisions();
		
		//change wrong objects with right ones when it is second level
		
		
		if(boxGameMenuLetterSelector==1) 
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==2) 
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==3) 
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==4)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==5)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==6)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==7) 
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==8) 
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==9)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==10)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==11)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==12) 
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==13) 
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==14)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==15)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==16)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}	
		else if(boxGameMenuLetterSelector==17) 
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==18) 
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==19)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==20)
		{
			setTimerLevel(boxGameMenuLetterSelector);
		}

			
		CreateObjects.create(boxGameMenuLetterSelector);
		
		//getting the context
		BoxGameActivity.context = getApplicationContext();
		
		//playing the introduction sound of parrot
		mScene.registerUpdateHandler(new TimerHandler((float) 0.5,new ITimerCallback()
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler)
			{
				playIntroSound();
			}
		}));
		
		return mScene;
	}
	
	
	public static void setTimerLevel(int a)
	{
		if(letterLevelSelector[a] == 1)
		{
			TimerHandlers.ExchangeObjects();
		}
	}
	
	public void playIntroSound()
	{
		Functions.audioPlay = true;
		if(boxGameMenuLetterSelector==1)
		{
			Functions.playAudio(R.raw.intro_box_mo);
		}
		else if(boxGameMenuLetterSelector==2)
		{
			Functions.playAudio(R.raw.intro_box_aa);
		}
		else if(boxGameMenuLetterSelector==3)
		{
			Functions.playAudio(R.raw.intro_box_e);
		}
		else if(boxGameMenuLetterSelector==4)
		{
			Functions.playAudio(R.raw.intro_box_raw);
		}
		else if(boxGameMenuLetterSelector==5)
		{
			Functions.playAudio(R.raw.intro_box_ko);
		}
		else if(boxGameMenuLetterSelector==6)
		{
			Functions.playAudio(R.raw.intro_box_bo);
		}
		else if(boxGameMenuLetterSelector==7)
		{
			Functions.playAudio(R.raw.intro_box_talibasha);
		}
		else if(boxGameMenuLetterSelector==8)
		{
			Functions.playAudio(R.raw.intro_box_lo);
		}
		else if(boxGameMenuLetterSelector==9)
		{
			Functions.playAudio(R.raw.intro_box_po);
		}
		else if(boxGameMenuLetterSelector==10)
		{
			Functions.playAudio(R.raw.intro_box_go);
		}
		else if(boxGameMenuLetterSelector==11)
		{
			Functions.playAudio(R.raw.intro_box_ho);
		}
		else if(boxGameMenuLetterSelector==12)
		{
			Functions.playAudio(R.raw.intro_box_kho);
		}
		else if(boxGameMenuLetterSelector==13)
		{
			Functions.playAudio(R.raw.intro_box_cho);
		}
		else if(boxGameMenuLetterSelector==14)
		{
			Functions.playAudio(R.raw.intro_box_no);
		}
		else if(boxGameMenuLetterSelector==15)
		{
			Functions.playAudio(R.raw.intro_box_a);
		}
		else if(boxGameMenuLetterSelector==16)
		{
			Functions.playAudio(R.raw.intro_box_do);
		}
		else if(boxGameMenuLetterSelector==17)
		{
			Functions.playAudio(R.raw.intro_box_u);
		}
		else if(boxGameMenuLetterSelector==18)
		{
			Functions.playAudio(R.raw.intro_box_to);
		}
		else if(boxGameMenuLetterSelector==19)
		{
			Functions.playAudio(R.raw.intro_box_toh);
		}
		else if(boxGameMenuLetterSelector==20)
		{
			Functions.playAudio(R.raw.intro_box_doh);
		}
		
	}
	
	public static void startActivity()
	{
		//Debug.d("level:"+boxGameLevel);
	
		if(boxGameMenuLetterSelector==1)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==2)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==3)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==4)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==5)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==6)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==7)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==8)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==9)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==10)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==11)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==12)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==13)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==14)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==15)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==16)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==17)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==18)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==19)
		{
			levelControl(boxGameMenuLetterSelector);
		}
		else if(boxGameMenuLetterSelector==20)
		{
			levelControl(boxGameMenuLetterSelector); 
		}
		
	}
	
	public static void levelControl(int b)
	{
		if(letterLevelSelector[b] == 0)
		{
			letterLevelSelector[b] = 1;
			
			mScene.unregisterUpdateHandler(timer1);
			BoxGameActivity.boxGameActivityInstance.finish();
			BoxGameActivity.boxGameActivityInstance.startActivity(new Intent(boxGameActivityInstance, BoxGameActivity.class));
		}
		else if(letterLevelSelector[b] == 1)
		{
			mScene.unregisterUpdateHandler(timer1);
			BoxGameActivity.boxGameActivityInstance.finish();
			BoxGameActivity.boxGameActivityInstance.startActivity(new Intent(boxGameActivityInstance, MonkeyGameActivity.class));
	
			letterLevelSelector[b] = 0;
		}
	}
	
	public void setCurrentScene(Scene scene)
	{
		mScene = scene;
		getEngine().setScene(mScene);
	}
}
