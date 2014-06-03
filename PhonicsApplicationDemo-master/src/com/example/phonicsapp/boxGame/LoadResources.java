package com.example.phonicsapp.boxGame;

import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.andengine.opengl.texture.atlas.buildable.builder.BlackPawnTextureAtlasBuilder;
import org.andengine.opengl.texture.atlas.buildable.builder.ITextureAtlasBuilder.TextureAtlasBuilderException;
import org.andengine.util.debug.Debug;

import com.example.phonicsapp.MenuPage;

public class LoadResources 
{

	public static void loadAllObjects()
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("Assets/");
		
		//if letter are mo, aa, lo, ko, to
		if(MenuPage.letterNumber==1||MenuPage.letterNumber==2||MenuPage.letterNumber==8||
				MenuPage.letterNumber==5||MenuPage.letterNumber==18)
		{
			BoxGameActivity.mBitmapTextureAtlasJungleBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mJungleBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasJungleBackGround, BoxGameActivity.boxGameActivityInstance,
					"JungleBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasJungleBackGround.load();
			
			BoxGameActivity.mJungleBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mJungleBoxOpenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mJungleBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"JungleBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mJungleBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mJungleBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mJungleBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"JungleBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mJungleBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mJungleBitmapTextureAtlasBoxClose.load();
			
			
			BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mJungleParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "JungleParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		//if letter are bo, no, cho, e, po
		else if(MenuPage.letterNumber==6||MenuPage.letterNumber==14||MenuPage.letterNumber==13||
				MenuPage.letterNumber==3||MenuPage.letterNumber==9)
		{
			BoxGameActivity.mBitmapTextureAtlasBeachBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mBeachBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBeachBackGround, BoxGameActivity.boxGameActivityInstance,
					"BeachBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasBeachBackGround.load();
			
			
			BoxGameActivity.mBeachBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mBeachBoxOpenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBeachBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"BeachBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mBeachBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mBeachBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBeachBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"BeachBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mBeachBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mBeachBitmapTextureAtlasBoxClose.load();
			
			
			BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mBeachParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "BeachParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		//if letter are raw, talibasha, do, a, doh
		else if(MenuPage.letterNumber==4||MenuPage.letterNumber==7||MenuPage.letterNumber==16||
				MenuPage.letterNumber==15||MenuPage.letterNumber==20)
		{
			BoxGameActivity.mBitmapTextureAtlasUnderWaterBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mUnderWaterBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasUnderWaterBackGround, BoxGameActivity.boxGameActivityInstance,
					"UnderWaterBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasUnderWaterBackGround.load();
			
			
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mUnderWaterBoxTextureOpenRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"UnderWaterBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mUnderWaterBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"UnderWaterBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxClose.load();
			
			
			BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mUnderWaterParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "UnderWaterParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		//if letter are toh, kho, u, go, ho
		else if(MenuPage.letterNumber==19||MenuPage.letterNumber==12||MenuPage.letterNumber==17||
				MenuPage.letterNumber==10||MenuPage.letterNumber==11)
		{
			BoxGameActivity.mBitmapTextureAtlasPlanetBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPlanetBackGround, BoxGameActivity.boxGameActivityInstance,
					"PlanetBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasPlanetBackGround.load();
			
			
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBoxOpenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"PlanetBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"PlanetBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose.load();
			
			
			BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mPlanetParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "PlanetParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		
		//Mo
		if( MenuPage.letterNumber == 1)
		{
			//Letter-Mo
			BoxGameActivity.mBitmapTextureAtlasMo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo1, BoxGameActivity.boxGameActivityInstance,
					"ma.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo2, BoxGameActivity.boxGameActivityInstance,
					"megh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo3, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasMo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo4, BoxGameActivity.boxGameActivityInstance,
					"moi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo5, BoxGameActivity.boxGameActivityInstance,
					"mula.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo6, BoxGameActivity.boxGameActivityInstance,
					"mama.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasMo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo, BoxGameActivity.boxGameActivityInstance,
					"Letters/mo.png", 0, 0,  1, 1);
			 
			BoxGameActivity.mBitmapTextureAtlasWMo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWMo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWMo1, BoxGameActivity.boxGameActivityInstance,
					"tomtom.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWMo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWMo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWMo2, BoxGameActivity.boxGameActivityInstance,
					"bol.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo1.load();
			BoxGameActivity.mBitmapTextureAtlasMo2.load();
			BoxGameActivity.mBitmapTextureAtlasMo3.load();
			BoxGameActivity.mBitmapTextureAtlasMo4.load();
			BoxGameActivity.mBitmapTextureAtlasMo5.load();
			BoxGameActivity.mBitmapTextureAtlasMo6.load();
			BoxGameActivity.mBitmapTextureAtlasMo.load();
			BoxGameActivity.mBitmapTextureAtlasWMo1.load();
			BoxGameActivity.mBitmapTextureAtlasWMo2.load();
		}
		//Aa
		else if( MenuPage.letterNumber == 2)
		{
			//Letter-Aa
			BoxGameActivity.mBitmapTextureAtlasAa1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa1, BoxGameActivity.boxGameActivityInstance,
					"ada.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasAa2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa2, BoxGameActivity.boxGameActivityInstance,
					"alu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasAa3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa3, BoxGameActivity.boxGameActivityInstance,
					"am.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasAa4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa4, BoxGameActivity.boxGameActivityInstance,
					"anarosh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasAa5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa5, BoxGameActivity.boxGameActivityInstance,
					"angur.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasAa6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa6, BoxGameActivity.boxGameActivityInstance,
					"apple.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasAa = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAaTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa, BoxGameActivity.boxGameActivityInstance,
					"Letters/aa.png", 0, 0,  1, 1);
			 
			BoxGameActivity.mBitmapTextureAtlasWAa1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWAa1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWAa1, BoxGameActivity.boxGameActivityInstance,
					"moi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWAa2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWAa2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWAa2, BoxGameActivity.boxGameActivityInstance,
					"bol.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasAa1.load();
			BoxGameActivity.mBitmapTextureAtlasAa2.load();
			BoxGameActivity.mBitmapTextureAtlasAa3.load();
			BoxGameActivity.mBitmapTextureAtlasAa4.load();
			BoxGameActivity.mBitmapTextureAtlasAa5.load();
			BoxGameActivity.mBitmapTextureAtlasAa6.load();
			BoxGameActivity.mBitmapTextureAtlasAa.load();
			BoxGameActivity.mBitmapTextureAtlasWAa1.load();
			BoxGameActivity.mBitmapTextureAtlasWAa2.load();
		}
		//E
		else if( MenuPage.letterNumber == 3)
		{
			//Letter-E
			BoxGameActivity.mBitmapTextureAtlasE1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE1, BoxGameActivity.boxGameActivityInstance,
					"idur.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasE2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE2, BoxGameActivity.boxGameActivityInstance,
					"iftar.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasE3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE3, BoxGameActivity.boxGameActivityInstance,
					"ilish.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasE4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE4, BoxGameActivity.boxGameActivityInstance,
					"imam.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasE5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE5, BoxGameActivity.boxGameActivityInstance,
					"it.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasE6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE6, BoxGameActivity.boxGameActivityInstance,
					"imarot.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasE = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mETextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE, BoxGameActivity.boxGameActivityInstance,
					"Letters/e.png", 0, 0,  1, 1);
			 
			BoxGameActivity.mBitmapTextureAtlasWE1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWE1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWE1, BoxGameActivity.boxGameActivityInstance,
					"am.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWE2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWE2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWE2, BoxGameActivity.boxGameActivityInstance,
					"tomato.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasE1.load();
			BoxGameActivity.mBitmapTextureAtlasE2.load();
			BoxGameActivity.mBitmapTextureAtlasE3.load();
			BoxGameActivity.mBitmapTextureAtlasE4.load();
			BoxGameActivity.mBitmapTextureAtlasE5.load();
			BoxGameActivity.mBitmapTextureAtlasE6.load();
			BoxGameActivity.mBitmapTextureAtlasE.load();
			BoxGameActivity.mBitmapTextureAtlasWE1.load();
			BoxGameActivity.mBitmapTextureAtlasWE2.load();
		}
		//Raw
		else if( MenuPage.letterNumber == 4)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//Ko
		else if( MenuPage.letterNumber == 5)
		{
			//Letter-Ko
			BoxGameActivity.mBitmapTextureAtlasKo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo1, BoxGameActivity.boxGameActivityInstance,
					"kak.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo2, BoxGameActivity.boxGameActivityInstance,
					"karam.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo3, BoxGameActivity.boxGameActivityInstance,
					"kol.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo4, BoxGameActivity.boxGameActivityInstance,
					"kola.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo5, BoxGameActivity.boxGameActivityInstance,
					"kolom.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo6, BoxGameActivity.boxGameActivityInstance,
					"komola.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo, BoxGameActivity.boxGameActivityInstance,
					"Letters/ko.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWKo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWKo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWKo1, BoxGameActivity.boxGameActivityInstance,
					"anarosh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWKo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWKo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWKo2, BoxGameActivity.boxGameActivityInstance,
					"ilish.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasKo1.load();
			BoxGameActivity.mBitmapTextureAtlasKo2.load();
			BoxGameActivity.mBitmapTextureAtlasKo3.load();
			BoxGameActivity.mBitmapTextureAtlasKo4.load();
			BoxGameActivity.mBitmapTextureAtlasKo5.load();
			BoxGameActivity.mBitmapTextureAtlasKo6.load();
			BoxGameActivity.mBitmapTextureAtlasKo.load();
			BoxGameActivity.mBitmapTextureAtlasWKo1.load();
			BoxGameActivity.mBitmapTextureAtlasWKo2.load();
		}
		//Bo
		else if( MenuPage.letterNumber == 6)
		{
			//Letter-Bo
			BoxGameActivity.mBitmapTextureAtlasBo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo1, BoxGameActivity.boxGameActivityInstance,
					"balish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo2, BoxGameActivity.boxGameActivityInstance,
					"belun.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo3, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo4, BoxGameActivity.boxGameActivityInstance,
					"bok.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo5, BoxGameActivity.boxGameActivityInstance,
					"begun.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo6, BoxGameActivity.boxGameActivityInstance,
					"bol.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasBo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo, BoxGameActivity.boxGameActivityInstance,
					"Letters/bo.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWBo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWBo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWBo1, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			 
			BoxGameActivity.mBitmapTextureAtlasWBo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWBo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWBo2, BoxGameActivity.boxGameActivityInstance,
					"moi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo1.load();
			BoxGameActivity.mBitmapTextureAtlasBo2.load();
			BoxGameActivity.mBitmapTextureAtlasBo3.load();
			BoxGameActivity.mBitmapTextureAtlasBo4.load();
			BoxGameActivity.mBitmapTextureAtlasBo5.load();
			BoxGameActivity.mBitmapTextureAtlasBo6.load();
			BoxGameActivity.mBitmapTextureAtlasBo.load();
			BoxGameActivity.mBitmapTextureAtlasWBo1.load();
			BoxGameActivity.mBitmapTextureAtlasWBo2.load();
		}
		//Talibasha
		else if( MenuPage.letterNumber == 7)
		{
			BoxGameActivity.mBitmapTextureAtlasTalibasha1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTalibasha1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTalibasha1, BoxGameActivity.boxGameActivityInstance,
					"shapla.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTalibasha2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTalibasha2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTalibasha2, BoxGameActivity.boxGameActivityInstance,
					"shari.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTalibasha3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTalibasha3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTalibasha3, BoxGameActivity.boxGameActivityInstance,
					"shishi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTalibasha4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTalibasha4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTalibasha4, BoxGameActivity.boxGameActivityInstance,
					"shishu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTalibasha5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTalibasha5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTalibasha5, BoxGameActivity.boxGameActivityInstance,
					"shiyal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTalibasha6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTalibasha6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTalibasha6, BoxGameActivity.boxGameActivityInstance,
					"shosha.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTalibasha = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTalibashaTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTalibasha, BoxGameActivity.boxGameActivityInstance,
					"Letters/talibasha.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWTalibasha1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWTalibasha1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWTalibasha1, BoxGameActivity.boxGameActivityInstance,
					"ek.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWTalibasha2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWTalibasha2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWTalibasha2, BoxGameActivity.boxGameActivityInstance,
					"tob.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasTalibasha1.load();
			BoxGameActivity.mBitmapTextureAtlasTalibasha2.load();
			BoxGameActivity.mBitmapTextureAtlasTalibasha3.load();
			BoxGameActivity.mBitmapTextureAtlasTalibasha4.load();
			BoxGameActivity.mBitmapTextureAtlasTalibasha5.load();
			BoxGameActivity.mBitmapTextureAtlasTalibasha6.load();
			BoxGameActivity.mBitmapTextureAtlasTalibasha.load();
			BoxGameActivity.mBitmapTextureAtlasWTalibasha1.load();
			BoxGameActivity.mBitmapTextureAtlasWTalibasha2.load();
		}
		//Lo
		else if( MenuPage.letterNumber == 8)
		{
			BoxGameActivity.mBitmapTextureAtlasLo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mLo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasLo1, BoxGameActivity.boxGameActivityInstance,
					"lal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasLo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mLo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasLo2, BoxGameActivity.boxGameActivityInstance,
					"langol.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasLo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mLo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasLo3, BoxGameActivity.boxGameActivityInstance,
					"lau.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasLo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mLo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasLo4, BoxGameActivity.boxGameActivityInstance,
					"lebu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasLo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mLo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasLo5, BoxGameActivity.boxGameActivityInstance,
					"lichu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasLo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mLo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasLo6, BoxGameActivity.boxGameActivityInstance,
					"lota.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasLo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mLoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasLo, BoxGameActivity.boxGameActivityInstance,
					"Letters/lo.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWLo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWLo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWLo1, BoxGameActivity.boxGameActivityInstance,
					"shapla.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWLo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWLo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWLo2, BoxGameActivity.boxGameActivityInstance,
					"alu.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasLo1.load();
			BoxGameActivity.mBitmapTextureAtlasLo2.load();
			BoxGameActivity.mBitmapTextureAtlasLo3.load();
			BoxGameActivity.mBitmapTextureAtlasLo4.load();
			BoxGameActivity.mBitmapTextureAtlasLo5.load();
			BoxGameActivity.mBitmapTextureAtlasLo6.load();
			BoxGameActivity.mBitmapTextureAtlasLo.load();
			BoxGameActivity.mBitmapTextureAtlasWLo1.load();
			BoxGameActivity.mBitmapTextureAtlasWLo2.load();
		}
		//Po
		else if( MenuPage.letterNumber == 9)
		{
			BoxGameActivity.mBitmapTextureAtlasPo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mPo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPo1, BoxGameActivity.boxGameActivityInstance,
					"pa.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasPo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mPo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPo2, BoxGameActivity.boxGameActivityInstance,
					"pani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasPo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mPo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPo3, BoxGameActivity.boxGameActivityInstance,
					"pata.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasPo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mPo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPo4, BoxGameActivity.boxGameActivityInstance,
					"patil.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasPo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mPo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPo5, BoxGameActivity.boxGameActivityInstance,
					"pori.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasPo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mPo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPo6, BoxGameActivity.boxGameActivityInstance,
					"potaka.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasPo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mPoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPo, BoxGameActivity.boxGameActivityInstance,
					"Letters/po.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWPo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWPo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWPo1, BoxGameActivity.boxGameActivityInstance,
					"lichu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWPo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWPo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWPo2, BoxGameActivity.boxGameActivityInstance,
					"shiyal.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasPo1.load();
			BoxGameActivity.mBitmapTextureAtlasPo2.load();
			BoxGameActivity.mBitmapTextureAtlasPo3.load();
			BoxGameActivity.mBitmapTextureAtlasPo4.load();
			BoxGameActivity.mBitmapTextureAtlasPo5.load();
			BoxGameActivity.mBitmapTextureAtlasPo6.load();
			BoxGameActivity.mBitmapTextureAtlasPo.load();
			BoxGameActivity.mBitmapTextureAtlasWPo1.load();
			BoxGameActivity.mBitmapTextureAtlasWPo2.load();
		}
		//Go
		else if( MenuPage.letterNumber == 10)
		{
			BoxGameActivity.mBitmapTextureAtlasGo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mGo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasGo1, BoxGameActivity.boxGameActivityInstance,
					"gada.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasGo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mGo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasGo2, BoxGameActivity.boxGameActivityInstance,
					"gan.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasGo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mGo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasGo3, BoxGameActivity.boxGameActivityInstance,
					"gari.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasGo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mGo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasGo4, BoxGameActivity.boxGameActivityInstance,
					"gorom.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasGo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mGo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasGo5, BoxGameActivity.boxGameActivityInstance,
					"goru.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasGo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mGo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasGo6, BoxGameActivity.boxGameActivityInstance,
					"gulap.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasGo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mGoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasGo, BoxGameActivity.boxGameActivityInstance,
					"Letters/go.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWGo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWGo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWGo1, BoxGameActivity.boxGameActivityInstance,
					"pata.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWGo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWGo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWGo2, BoxGameActivity.boxGameActivityInstance,
					"lebu.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasGo1.load();
			BoxGameActivity.mBitmapTextureAtlasGo2.load();
			BoxGameActivity.mBitmapTextureAtlasGo3.load();
			BoxGameActivity.mBitmapTextureAtlasGo4.load();
			BoxGameActivity.mBitmapTextureAtlasGo5.load();
			BoxGameActivity.mBitmapTextureAtlasGo6.load();
			BoxGameActivity.mBitmapTextureAtlasGo.load();
			BoxGameActivity.mBitmapTextureAtlasWGo1.load();
			BoxGameActivity.mBitmapTextureAtlasWGo2.load();
		}
		//Ho
		else if( MenuPage.letterNumber == 11)
		{
			BoxGameActivity.mBitmapTextureAtlasHo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mHo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasHo1, BoxGameActivity.boxGameActivityInstance,
					"har.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasHo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mHo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasHo2, BoxGameActivity.boxGameActivityInstance,
					"hash.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasHo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mHo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasHo3, BoxGameActivity.boxGameActivityInstance,
					"hath.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasHo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mHo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasHo4, BoxGameActivity.boxGameActivityInstance,
					"hathi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasHo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mHo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasHo5, BoxGameActivity.boxGameActivityInstance,
					"hira.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasHo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mHo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasHo6, BoxGameActivity.boxGameActivityInstance,
					"horin.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasHo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mHoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasHo, BoxGameActivity.boxGameActivityInstance,
					"Letters/ho.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWHo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWHo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWHo1, BoxGameActivity.boxGameActivityInstance,
					"goru.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWHo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWHo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWHo2, BoxGameActivity.boxGameActivityInstance,
					"ektara.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasHo1.load();
			BoxGameActivity.mBitmapTextureAtlasHo2.load();
			BoxGameActivity.mBitmapTextureAtlasHo3.load();
			BoxGameActivity.mBitmapTextureAtlasHo4.load();
			BoxGameActivity.mBitmapTextureAtlasHo5.load();
			BoxGameActivity.mBitmapTextureAtlasHo6.load();
			BoxGameActivity.mBitmapTextureAtlasHo.load();
			BoxGameActivity.mBitmapTextureAtlasWHo1.load();
			BoxGameActivity.mBitmapTextureAtlasWHo2.load();
		}
		//Kho
		else if( MenuPage.letterNumber == 12)
		{
			BoxGameActivity.mBitmapTextureAtlasKho1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKho1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKho1, BoxGameActivity.boxGameActivityInstance,
					"khabar.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKho2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKho2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKho2, BoxGameActivity.boxGameActivityInstance,
					"kham.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKho3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKho3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKho3, BoxGameActivity.boxGameActivityInstance,
					"khat.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKho4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKho4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKho4, BoxGameActivity.boxGameActivityInstance,
					"khata.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKho5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKho5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKho5, BoxGameActivity.boxGameActivityInstance,
					"khela.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKho6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKho6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKho6, BoxGameActivity.boxGameActivityInstance,
					"khobor.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKho = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKhoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKho, BoxGameActivity.boxGameActivityInstance,
					"Letters/kho.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWKho1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWKho1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWKho1, BoxGameActivity.boxGameActivityInstance,
					"pa.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWKho2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWKho2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWKho2, BoxGameActivity.boxGameActivityInstance,
					"lal.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasKho1.load();
			BoxGameActivity.mBitmapTextureAtlasKho2.load();
			BoxGameActivity.mBitmapTextureAtlasKho3.load();
			BoxGameActivity.mBitmapTextureAtlasKho4.load();
			BoxGameActivity.mBitmapTextureAtlasKho5.load();
			BoxGameActivity.mBitmapTextureAtlasKho6.load();
			BoxGameActivity.mBitmapTextureAtlasKho.load();
			BoxGameActivity.mBitmapTextureAtlasWKho1.load();
			BoxGameActivity.mBitmapTextureAtlasWKho2.load();
		}
		//Cho
		else if( MenuPage.letterNumber == 13)
		{
			BoxGameActivity.mBitmapTextureAtlasCho1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mCho1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasCho1, BoxGameActivity.boxGameActivityInstance,
					"chabi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasCho2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mCho2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasCho2, BoxGameActivity.boxGameActivityInstance,
					"chacha.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasCho3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mCho3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasCho3, BoxGameActivity.boxGameActivityInstance,
					"chaka.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasCho4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mCho4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasCho4, BoxGameActivity.boxGameActivityInstance,
					"chala.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasCho5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mCho5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasCho5, BoxGameActivity.boxGameActivityInstance,
					"chamoch.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasCho6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mCho6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasCho6, BoxGameActivity.boxGameActivityInstance,
					"chok.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasCho = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mChoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasCho, BoxGameActivity.boxGameActivityInstance,
					"Letters/cho.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWCho1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWCho1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWCho1, BoxGameActivity.boxGameActivityInstance,
					"hira.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWCho2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWCho2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWCho2, BoxGameActivity.boxGameActivityInstance,
					"pori.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasCho1.load();
			BoxGameActivity.mBitmapTextureAtlasCho2.load();
			BoxGameActivity.mBitmapTextureAtlasCho3.load();
			BoxGameActivity.mBitmapTextureAtlasCho4.load();
			BoxGameActivity.mBitmapTextureAtlasCho5.load();
			BoxGameActivity.mBitmapTextureAtlasCho6.load();
			BoxGameActivity.mBitmapTextureAtlasCho.load();
			BoxGameActivity.mBitmapTextureAtlasWCho1.load();
			BoxGameActivity.mBitmapTextureAtlasWCho2.load();
		}
		//No
		else if( MenuPage.letterNumber == 14)
		{
			BoxGameActivity.mBitmapTextureAtlasNo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mNo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasNo1, BoxGameActivity.boxGameActivityInstance,
					"nach.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasNo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mNo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasNo2, BoxGameActivity.boxGameActivityInstance,
					"nak.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasNo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mNo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasNo3, BoxGameActivity.boxGameActivityInstance,
					"nam.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasNo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mNo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasNo4, BoxGameActivity.boxGameActivityInstance,
					"nana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasNo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mNo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasNo5, BoxGameActivity.boxGameActivityInstance,
					"narikel.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasNo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mNo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasNo6, BoxGameActivity.boxGameActivityInstance,
					"nil.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasNo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mNoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasNo, BoxGameActivity.boxGameActivityInstance,
					"Letters/no.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWNo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWNo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWNo1, BoxGameActivity.boxGameActivityInstance,
					"chabi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWNo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWNo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWNo2, BoxGameActivity.boxGameActivityInstance,
					"hathi.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasNo1.load();
			BoxGameActivity.mBitmapTextureAtlasNo2.load();
			BoxGameActivity.mBitmapTextureAtlasNo3.load();
			BoxGameActivity.mBitmapTextureAtlasNo4.load();
			BoxGameActivity.mBitmapTextureAtlasNo5.load();
			BoxGameActivity.mBitmapTextureAtlasNo6.load();
			BoxGameActivity.mBitmapTextureAtlasNo.load();
			BoxGameActivity.mBitmapTextureAtlasWNo1.load();
			BoxGameActivity.mBitmapTextureAtlasWNo2.load();
		}
		//A
		else if( MenuPage.letterNumber == 15)
		{
			//Letter-A
			BoxGameActivity.mBitmapTextureAtlasA1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA1, BoxGameActivity.boxGameActivityInstance,
					"ek.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA2, BoxGameActivity.boxGameActivityInstance,
					"ekar.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA3, BoxGameActivity.boxGameActivityInstance,
					"ekhat.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA4, BoxGameActivity.boxGameActivityInstance,
					"ekmuto.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA5, BoxGameActivity.boxGameActivityInstance,
					"ektara.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA6, BoxGameActivity.boxGameActivityInstance,
					"elach.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mATextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA, BoxGameActivity.boxGameActivityInstance,
					"Letters/a.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWA1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWA1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWA1, BoxGameActivity.boxGameActivityInstance,
					"ada.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWA2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWA2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWA2, BoxGameActivity.boxGameActivityInstance,
					"idur.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasA1.load();
			BoxGameActivity.mBitmapTextureAtlasA2.load();
			BoxGameActivity.mBitmapTextureAtlasA3.load();
			BoxGameActivity.mBitmapTextureAtlasA4.load();
			BoxGameActivity.mBitmapTextureAtlasA5.load();
			BoxGameActivity.mBitmapTextureAtlasA6.load();
			BoxGameActivity.mBitmapTextureAtlasA.load();
			BoxGameActivity.mBitmapTextureAtlasWA1.load();
			BoxGameActivity.mBitmapTextureAtlasWA2.load();
		}
		//Do
		else if( MenuPage.letterNumber == 16)
		{
			BoxGameActivity.mBitmapTextureAtlasDo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDo1, BoxGameActivity.boxGameActivityInstance,
					"dab.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDo2, BoxGameActivity.boxGameActivityInstance,
					"dal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDo3, BoxGameActivity.boxGameActivityInstance,
					"dala.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDo4, BoxGameActivity.boxGameActivityInstance,
					"dalim.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDo5, BoxGameActivity.boxGameActivityInstance,
					"dan.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDo6, BoxGameActivity.boxGameActivityInstance,
					"dim.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDo, BoxGameActivity.boxGameActivityInstance,
					"Letters/do.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWDo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWDo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWDo1, BoxGameActivity.boxGameActivityInstance,
					"nach.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWDo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWDo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWDo2, BoxGameActivity.boxGameActivityInstance,
					"tala.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasDo1.load();
			BoxGameActivity.mBitmapTextureAtlasDo2.load();
			BoxGameActivity.mBitmapTextureAtlasDo3.load();
			BoxGameActivity.mBitmapTextureAtlasDo4.load();
			BoxGameActivity.mBitmapTextureAtlasDo5.load();
			BoxGameActivity.mBitmapTextureAtlasDo6.load();
			BoxGameActivity.mBitmapTextureAtlasDo.load();
			BoxGameActivity.mBitmapTextureAtlasWDo1.load();
			BoxGameActivity.mBitmapTextureAtlasWDo2.load();
		}
		//U
		else if( MenuPage.letterNumber == 17)
		{
			BoxGameActivity.mBitmapTextureAtlasU1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mU1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasU1, BoxGameActivity.boxGameActivityInstance,
					"ulta.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasU2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mU2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasU2, BoxGameActivity.boxGameActivityInstance,
					"ura.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasU3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mU3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasU3, BoxGameActivity.boxGameActivityInstance,
					"urojahaj.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasU4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mU4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasU4, BoxGameActivity.boxGameActivityInstance,
					"usha.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasU5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mU5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasU5, BoxGameActivity.boxGameActivityInstance,
					"ut.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasU6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mU6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasU6, BoxGameActivity.boxGameActivityInstance,
					"utpkhi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasU = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mUTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasU, BoxGameActivity.boxGameActivityInstance,
					"Letters/u.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWU1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWU1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWU1, BoxGameActivity.boxGameActivityInstance,
					"kak.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWU2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWU2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWU2, BoxGameActivity.boxGameActivityInstance,
					"lebu.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasU1.load();
			BoxGameActivity.mBitmapTextureAtlasU2.load();
			BoxGameActivity.mBitmapTextureAtlasU3.load();
			BoxGameActivity.mBitmapTextureAtlasU4.load();
			BoxGameActivity.mBitmapTextureAtlasU5.load();
			BoxGameActivity.mBitmapTextureAtlasU6.load();
			BoxGameActivity.mBitmapTextureAtlasU.load();
			BoxGameActivity.mBitmapTextureAtlasWU1.load();
			BoxGameActivity.mBitmapTextureAtlasWU2.load();
		}
		//To
		else if( MenuPage.letterNumber == 18)
		{
			BoxGameActivity.mBitmapTextureAtlasTo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo1, BoxGameActivity.boxGameActivityInstance,
					"tak.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo2, BoxGameActivity.boxGameActivityInstance,
					"tal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo3, BoxGameActivity.boxGameActivityInstance,
					"tala.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo4, BoxGameActivity.boxGameActivityInstance,
					"tobola.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo5, BoxGameActivity.boxGameActivityInstance,
					"tormuj.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo6, BoxGameActivity.boxGameActivityInstance,
					"tuli.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo, BoxGameActivity.boxGameActivityInstance,
					"Letters/to.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWTo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWTo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWTo1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWTo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWTo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWTo2, BoxGameActivity.boxGameActivityInstance,
					"ek.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasTo1.load();
			BoxGameActivity.mBitmapTextureAtlasTo2.load();
			BoxGameActivity.mBitmapTextureAtlasTo3.load();
			BoxGameActivity.mBitmapTextureAtlasTo4.load();
			BoxGameActivity.mBitmapTextureAtlasTo5.load();
			BoxGameActivity.mBitmapTextureAtlasTo6.load();
			BoxGameActivity.mBitmapTextureAtlasTo.load();
			BoxGameActivity.mBitmapTextureAtlasWTo1.load();
			BoxGameActivity.mBitmapTextureAtlasWTo2.load();
			
		}
		//Toh
		else if( MenuPage.letterNumber == 19)
		{
			BoxGameActivity.mBitmapTextureAtlasToh1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh1, BoxGameActivity.boxGameActivityInstance,
					"table.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh2, BoxGameActivity.boxGameActivityInstance,
					"taka.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh3, BoxGameActivity.boxGameActivityInstance,
					"tin.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh4, BoxGameActivity.boxGameActivityInstance,
					"tob.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh5, BoxGameActivity.boxGameActivityInstance,
					"tomato.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh6, BoxGameActivity.boxGameActivityInstance,
					"tomtom.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTohTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh, BoxGameActivity.boxGameActivityInstance,
					"Letters/toh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWToh1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWToh1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWToh1, BoxGameActivity.boxGameActivityInstance,
					"begun.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWToh2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWToh2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWToh2, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh1.load();
			BoxGameActivity.mBitmapTextureAtlasToh2.load();
			BoxGameActivity.mBitmapTextureAtlasToh3.load();
			BoxGameActivity.mBitmapTextureAtlasToh4.load();
			BoxGameActivity.mBitmapTextureAtlasToh5.load();
			BoxGameActivity.mBitmapTextureAtlasToh6.load();
			BoxGameActivity.mBitmapTextureAtlasToh.load();
			BoxGameActivity.mBitmapTextureAtlasWToh1.load();
			BoxGameActivity.mBitmapTextureAtlasWToh2.load();
		}
		//Doh
		else if( MenuPage.letterNumber == 20)
		{
			BoxGameActivity.mBitmapTextureAtlasDoh1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDoh1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDoh1, BoxGameActivity.boxGameActivityInstance,
					"dada.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDoh2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDoh2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDoh2, BoxGameActivity.boxGameActivityInstance,
					"dalan.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDoh3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDoh3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDoh3, BoxGameActivity.boxGameActivityInstance,
					"desh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDoh4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDoh4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDoh4, BoxGameActivity.boxGameActivityInstance,
					"doi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDoh5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDoh5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDoh5, BoxGameActivity.boxGameActivityInstance,
					"dol.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDoh6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDoh6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDoh6, BoxGameActivity.boxGameActivityInstance,
					"dosh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDoh = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mDohTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasDoh, BoxGameActivity.boxGameActivityInstance,
					"Letters/doh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWDoh1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWDoh1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWDoh1, BoxGameActivity.boxGameActivityInstance,
					"chaka.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWDoh2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWDoh2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWDoh2, BoxGameActivity.boxGameActivityInstance,
					"lau.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasDoh1.load();
			BoxGameActivity.mBitmapTextureAtlasDoh2.load();
			BoxGameActivity.mBitmapTextureAtlasDoh3.load();
			BoxGameActivity.mBitmapTextureAtlasDoh4.load();
			BoxGameActivity.mBitmapTextureAtlasDoh5.load();
			BoxGameActivity.mBitmapTextureAtlasDoh6.load();
			BoxGameActivity.mBitmapTextureAtlasDoh.load();
			BoxGameActivity.mBitmapTextureAtlasWDoh1.load();
			BoxGameActivity.mBitmapTextureAtlasWDoh2.load();
		}

	}
}
