package com.example.phonicsapp.monkeyGame;

import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;

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
			MonkeyGameActivity.mBitmapTextureAtlasJungleBackGround = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 1600, 868,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mJungleBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasJungleBackGround, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "MonkeyGame/jungleBackground.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasJungleBackGround.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutBanana = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithBanana = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutBanana = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutBanana, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/monkeyWithoutBanana.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithBanana = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithBanana, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/monkeyWithBanana.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutBanana.load();
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithBanana.load();
			
			
			MonkeyGameActivity.mBitmapTextureAtlasBanana = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mFaceTextureRegionBanana = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBanana, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/banana.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasBanana.load();
		}
		//if letter are bo, no, cho, e, po
		else if(MenuPage.letterNumber==6||MenuPage.letterNumber==14||MenuPage.letterNumber==13||
					MenuPage.letterNumber==3||MenuPage.letterNumber==9)
		{
			MonkeyGameActivity.mBitmapTextureAtlasBeachBackGround = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 1600, 868,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mBeachBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBeachBackGround, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "MonkeyGame/beachBackground.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasBeachBackGround.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithFish = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutFish = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithFish = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithFish, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/monkeyWithFish.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutFish = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutFish, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/monkeyWithoutFish.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithFish.load();
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutFish.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasFish = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mFaceTextureRegionFish = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasFish, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/fish.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasFish.load();
		}
		//if letter are raw, talibasha, do, a, doh
		else if(MenuPage.letterNumber==4||MenuPage.letterNumber==7||MenuPage.letterNumber==16||
					MenuPage.letterNumber==15||MenuPage.letterNumber==20)
		{
			MonkeyGameActivity.mBitmapTextureAtlasUnderWaterBackGround = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 1600, 868,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mUnderWaterBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasUnderWaterBackGround, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "MonkeyGame/underWaterBackground.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasUnderWaterBackGround.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasBoxSide = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 300, 300,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mBoxSideTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBoxSide, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "MonkeyGame/boxSide.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasBoxSide.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithCup = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutCup = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithCup = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithCup, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/monkeyWithCup.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutCup = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutCup, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/monkeyWithoutCup.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithCup.load();
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutCup.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasCup = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mFaceTextureRegionCup = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasCup, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/cup.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasCup.load();
		}
		//if letter are toh, kho, u, go, ho
		else if(MenuPage.letterNumber==19||MenuPage.letterNumber==12||MenuPage.letterNumber==17||
					MenuPage.letterNumber==10||MenuPage.letterNumber==11)
		{
			MonkeyGameActivity.mBitmapTextureAtlasPlanetBackGround = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 1600, 868,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mPlanetBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasPlanetBackGround, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "MonkeyGame/planetBackground.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasPlanetBackGround.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithAlien = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutAlien = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithAlien = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithAlien, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/monkeyWithAlien.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutAlien = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutAlien, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/monkeyWithoutAlien.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithAlien.load();
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutAlien.load();
			
			
			MonkeyGameActivity.mBitmapTextureAtlasAlien = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mFaceTextureRegionAlien = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasAlien, MonkeyGameActivity.MonkeyGameActivityActivity, "MonkeyGame/alien.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasAlien.load();
		}
		
		//Mo
		if(MenuPage.letterNumber == 1)
		{
			MonkeyGameActivity.mBitmapTextureAtlasMo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasMo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasMo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasMo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasMo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasMo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWMo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWMo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWMo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWMo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWMo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWMo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			MonkeyGameActivity.mFaceTextureRegionMo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMo1, MonkeyGameActivity.MonkeyGameActivityActivity, "ma.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionMo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMo2, MonkeyGameActivity.MonkeyGameActivityActivity, "mama.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMo3, MonkeyGameActivity.MonkeyGameActivityActivity, "megh.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMo4, MonkeyGameActivity.MonkeyGameActivityActivity, "mohish.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMo5, MonkeyGameActivity.MonkeyGameActivityActivity, "moi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMo6, MonkeyGameActivity.MonkeyGameActivityActivity, "mula.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWMo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWMo1, MonkeyGameActivity.MonkeyGameActivityActivity, "taka.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWMo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWMo2, MonkeyGameActivity.MonkeyGameActivityActivity, "robi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWMo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWMo3, MonkeyGameActivity.MonkeyGameActivityActivity, "nam.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWMo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWMo4, MonkeyGameActivity.MonkeyGameActivityActivity, "nana.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWMo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWMo5, MonkeyGameActivity.MonkeyGameActivityActivity, "patil.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWMo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWMo6, MonkeyGameActivity.MonkeyGameActivityActivity, "pori.png",0,0);
		
			MonkeyGameActivity.mBitmapTextureAtlasMo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasMo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasMo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasMo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasMo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasMo6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWMo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWMo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWMo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWMo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWMo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWMo6.load();
		}
		//Aa
		else if(MenuPage.letterNumber == 2)
		{
			MonkeyGameActivity.mBitmapTextureAtlasAa1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasAa2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasAa3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasAa4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasAa5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasAa6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWAa1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWAa2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWAa3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWAa4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWAa5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWAa6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
					
			MonkeyGameActivity.mFaceTextureRegionAa1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasAa1, MonkeyGameActivity.MonkeyGameActivityActivity, "ada.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionAa2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasAa2, MonkeyGameActivity.MonkeyGameActivityActivity, "alu.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionAa3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasAa3, MonkeyGameActivity.MonkeyGameActivityActivity, "am.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionAa4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasAa4, MonkeyGameActivity.MonkeyGameActivityActivity, "anarosh.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionAa5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasAa5, MonkeyGameActivity.MonkeyGameActivityActivity, "angur.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionAa6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasAa6, MonkeyGameActivity.MonkeyGameActivityActivity, "apple.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWAa1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWAa1, MonkeyGameActivity.MonkeyGameActivityActivity, "moi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWAa2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWAa2, MonkeyGameActivity.MonkeyGameActivityActivity, "mula.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWAa3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWAa3, MonkeyGameActivity.MonkeyGameActivityActivity, "rakhal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWAa4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWAa4, MonkeyGameActivity.MonkeyGameActivityActivity, "bok.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWAa5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWAa5, MonkeyGameActivity.MonkeyGameActivityActivity, "chaka.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWAa6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWAa6, MonkeyGameActivity.MonkeyGameActivityActivity, "rana.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasAa1.load();
			MonkeyGameActivity.mBitmapTextureAtlasAa2.load();
			MonkeyGameActivity.mBitmapTextureAtlasAa3.load();
			MonkeyGameActivity.mBitmapTextureAtlasAa4.load();
			MonkeyGameActivity.mBitmapTextureAtlasAa5.load();
			MonkeyGameActivity.mBitmapTextureAtlasAa6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWAa1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWAa2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWAa3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWAa4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWAa5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWAa6.load();
		}
		//E
		else if(MenuPage.letterNumber == 3)
		{
			MonkeyGameActivity.mBitmapTextureAtlasE1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasE2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasE3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasE4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasE5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasE6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWE1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWE2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWE3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWE4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWE5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWE6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			
			MonkeyGameActivity.mFaceTextureRegionE1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasE1, MonkeyGameActivity.MonkeyGameActivityActivity, "idur.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionE2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasE2, MonkeyGameActivity.MonkeyGameActivityActivity, "iftar.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionE3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasE3, MonkeyGameActivity.MonkeyGameActivityActivity, "ilish.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionE4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasE4, MonkeyGameActivity.MonkeyGameActivityActivity, "imam.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionE5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasE5, MonkeyGameActivity.MonkeyGameActivityActivity, "imarot.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionE6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasE6, MonkeyGameActivity.MonkeyGameActivityActivity, "it.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWE1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWE1, MonkeyGameActivity.MonkeyGameActivityActivity, "chabi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWE2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWE2, MonkeyGameActivity.MonkeyGameActivityActivity, "kak.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWE3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWE3, MonkeyGameActivity.MonkeyGameActivityActivity, "nach.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWE4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWE4, MonkeyGameActivity.MonkeyGameActivityActivity, "lal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWE5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWE5, MonkeyGameActivity.MonkeyGameActivityActivity, "am.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWE6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWE6, MonkeyGameActivity.MonkeyGameActivityActivity, "tal.png",0,0);
			
			
			MonkeyGameActivity.mBitmapTextureAtlasE1.load();
			MonkeyGameActivity.mBitmapTextureAtlasE2.load();
			MonkeyGameActivity.mBitmapTextureAtlasE3.load();
			MonkeyGameActivity.mBitmapTextureAtlasE4.load();
			MonkeyGameActivity.mBitmapTextureAtlasE5.load();
			MonkeyGameActivity.mBitmapTextureAtlasE6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWE1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWE2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWE3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWE4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWE5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWE6.load();
		}
		//Raw
		else if(MenuPage.letterNumber == 4)
		{
			MonkeyGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWRaw3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWRaw4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWRaw5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWRaw6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			MonkeyGameActivity.mFaceTextureRegionRaw1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasRaw1, MonkeyGameActivity.MonkeyGameActivityActivity, "robi.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionRaw2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasRaw2, MonkeyGameActivity.MonkeyGameActivityActivity, "roket.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionRaw3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasRaw3, MonkeyGameActivity.MonkeyGameActivityActivity, "rani.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionRaw4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasRaw4, MonkeyGameActivity.MonkeyGameActivityActivity, "rana.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionRaw5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasRaw5, MonkeyGameActivity.MonkeyGameActivityActivity, "rondhonu.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionRaw6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasRaw6, MonkeyGameActivity.MonkeyGameActivityActivity, "rakhal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWRaw1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWRaw1, MonkeyGameActivity.MonkeyGameActivityActivity, "pa.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWRaw2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWRaw2, MonkeyGameActivity.MonkeyGameActivityActivity, "pani.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWRaw3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWRaw3, MonkeyGameActivity.MonkeyGameActivityActivity, "it.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWRaw4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWRaw4, MonkeyGameActivity.MonkeyGameActivityActivity, "nak.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWRaw5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWRaw5, MonkeyGameActivity.MonkeyGameActivityActivity, "chamoch.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWRaw6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWRaw6, MonkeyGameActivity.MonkeyGameActivityActivity, "lebu.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasRaw1.load();
			MonkeyGameActivity.mBitmapTextureAtlasRaw2.load();
			MonkeyGameActivity.mBitmapTextureAtlasRaw3.load();
			MonkeyGameActivity.mBitmapTextureAtlasRaw4.load();
			MonkeyGameActivity.mBitmapTextureAtlasRaw5.load();
			MonkeyGameActivity.mBitmapTextureAtlasRaw6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWRaw1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWRaw2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWRaw3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWRaw4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWRaw5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWRaw6.load();
		}
		//Ko
		else if(MenuPage.letterNumber == 5)
		{
			MonkeyGameActivity.mBitmapTextureAtlasKo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasKo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasKo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasKo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasKo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasKo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
					
			MonkeyGameActivity.mFaceTextureRegionKo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKo1, MonkeyGameActivity.MonkeyGameActivityActivity, "kak.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionKo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKo2, MonkeyGameActivity.MonkeyGameActivityActivity, "karam.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionKo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKo3, MonkeyGameActivity.MonkeyGameActivityActivity, "kol.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionKo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKo4, MonkeyGameActivity.MonkeyGameActivityActivity, "kola.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionKo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKo5, MonkeyGameActivity.MonkeyGameActivityActivity, "kolom.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionKo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKo6, MonkeyGameActivity.MonkeyGameActivityActivity, "komola.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKo1, MonkeyGameActivity.MonkeyGameActivityActivity, "lau.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKo2, MonkeyGameActivity.MonkeyGameActivityActivity, "megh.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKo3, MonkeyGameActivity.MonkeyGameActivityActivity, "ada.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKo4, MonkeyGameActivity.MonkeyGameActivityActivity, "lichu.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKo5, MonkeyGameActivity.MonkeyGameActivityActivity, "mula.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKo6, MonkeyGameActivity.MonkeyGameActivityActivity, "angur.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasKo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasKo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasKo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasKo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasKo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasKo6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKo6.load();
		}
		//Bo
		else if(MenuPage.letterNumber == 6)
		{
			MonkeyGameActivity.mBitmapTextureAtlasBo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasBo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasBo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasBo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasBo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasBo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWBo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWBo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWBo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWBo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWBo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWBo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
							
			MonkeyGameActivity.mFaceTextureRegionBo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBo1, MonkeyGameActivity.MonkeyGameActivityActivity, "balish.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionBo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBo2, MonkeyGameActivity.MonkeyGameActivityActivity, "baba.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionBo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBo3, MonkeyGameActivity.MonkeyGameActivityActivity, "belun.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionBo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBo4, MonkeyGameActivity.MonkeyGameActivityActivity, "begun.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionBo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBo5, MonkeyGameActivity.MonkeyGameActivityActivity, "bok.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionBo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBo6, MonkeyGameActivity.MonkeyGameActivityActivity, "bol.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWBo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWBo1, MonkeyGameActivity.MonkeyGameActivityActivity, "tuli.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWBo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWBo2, MonkeyGameActivity.MonkeyGameActivityActivity, "anarosh.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWBo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWBo3, MonkeyGameActivity.MonkeyGameActivityActivity, "kola.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWBo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWBo4, MonkeyGameActivity.MonkeyGameActivityActivity, "tal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWBo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWBo5, MonkeyGameActivity.MonkeyGameActivityActivity, "kolom.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWBo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWBo6, MonkeyGameActivity.MonkeyGameActivityActivity, "tala.png",0,0);
		
			MonkeyGameActivity.mBitmapTextureAtlasBo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasBo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasBo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasBo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasBo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasBo6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWBo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWBo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWBo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWBo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWBo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWBo6.load();
		}
		//Talibasha
		else if(MenuPage.letterNumber == 7)
		{
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
					
			MonkeyGameActivity.mFaceTextureRegionTalibasha1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTalibasha1, MonkeyGameActivity.MonkeyGameActivityActivity, "shapla.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionTalibasha2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTalibasha2, MonkeyGameActivity.MonkeyGameActivityActivity, "shari.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionTalibasha3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTalibasha3, MonkeyGameActivity.MonkeyGameActivityActivity, "shishi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionTalibasha4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTalibasha4, MonkeyGameActivity.MonkeyGameActivityActivity, "shishu.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionTalibasha5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTalibasha5, MonkeyGameActivity.MonkeyGameActivityActivity, "shosha.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionTalibasha6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTalibasha6, MonkeyGameActivity.MonkeyGameActivityActivity, "shiyal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTalibasha1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTalibasha1, MonkeyGameActivity.MonkeyGameActivityActivity, "rakhal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTalibasha2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTalibasha2, MonkeyGameActivity.MonkeyGameActivityActivity, "pata.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTalibasha3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTalibasha3, MonkeyGameActivity.MonkeyGameActivityActivity, "idur.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTalibasha4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTalibasha4, MonkeyGameActivity.MonkeyGameActivityActivity, "rana.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTalibasha5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTalibasha5, MonkeyGameActivity.MonkeyGameActivityActivity, "bol.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTalibasha6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTalibasha6, MonkeyGameActivity.MonkeyGameActivityActivity, "roket.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha1.load();
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha2.load();
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha3.load();
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha4.load();
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha5.load();
			MonkeyGameActivity.mBitmapTextureAtlasTalibasha6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTalibasha6.load();
		}
		//Lo
		else if(MenuPage.letterNumber == 8)
		{
			MonkeyGameActivity.mBitmapTextureAtlasLo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasLo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasLo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasLo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasLo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasLo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWLo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWLo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWLo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWLo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWLo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWLo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			MonkeyGameActivity.mFaceTextureRegionLo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasLo1, MonkeyGameActivity.MonkeyGameActivityActivity, "lal.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionLo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasLo2, MonkeyGameActivity.MonkeyGameActivityActivity, "langol.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionLo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasLo3, MonkeyGameActivity.MonkeyGameActivityActivity, "lau.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionLo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasLo4, MonkeyGameActivity.MonkeyGameActivityActivity, "lebu.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionLo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasLo5, MonkeyGameActivity.MonkeyGameActivityActivity, "lichu.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionLo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasLo6, MonkeyGameActivity.MonkeyGameActivityActivity, "lota.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWLo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWLo1, MonkeyGameActivity.MonkeyGameActivityActivity, "apple.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWLo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWLo2, MonkeyGameActivity.MonkeyGameActivityActivity, "mohish.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWLo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWLo3, MonkeyGameActivity.MonkeyGameActivityActivity, "alu.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWLo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWLo4, MonkeyGameActivity.MonkeyGameActivityActivity, "ma.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWLo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWLo5, MonkeyGameActivity.MonkeyGameActivityActivity, "am.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWLo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWLo6, MonkeyGameActivity.MonkeyGameActivityActivity, "moi.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasLo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasLo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasLo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasLo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasLo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasLo6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWLo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWLo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWLo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWLo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWLo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWLo6.load();
		}
		//Po
		else if(MenuPage.letterNumber == 9)
		{
			MonkeyGameActivity.mBitmapTextureAtlasPo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasPo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasPo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasPo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasPo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasPo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWPo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWPo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWPo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWPo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWPo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWPo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			MonkeyGameActivity.mFaceTextureRegionPo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasPo1, MonkeyGameActivity.MonkeyGameActivityActivity, "pa.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionPo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasPo2, MonkeyGameActivity.MonkeyGameActivityActivity, "pani.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionPo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasPo3, MonkeyGameActivity.MonkeyGameActivityActivity, "pata.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionPo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasPo4, MonkeyGameActivity.MonkeyGameActivityActivity, "patil.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionPo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasPo5, MonkeyGameActivity.MonkeyGameActivityActivity, "pori.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionPo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasPo6, MonkeyGameActivity.MonkeyGameActivityActivity, "potaka.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWPo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWPo1, MonkeyGameActivity.MonkeyGameActivityActivity, "ilish.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWPo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWPo2, MonkeyGameActivity.MonkeyGameActivityActivity, "chok.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWPo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWPo3, MonkeyGameActivity.MonkeyGameActivityActivity, "bok.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWPo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWPo4, MonkeyGameActivity.MonkeyGameActivityActivity, "chaka.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWPo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWPo5, MonkeyGameActivity.MonkeyGameActivityActivity, "it.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWPo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWPo6, MonkeyGameActivity.MonkeyGameActivityActivity, "narikel.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasPo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasPo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasPo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasPo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasPo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasPo6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWPo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWPo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWPo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWPo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWPo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWPo6.load();
		}
		//Go
		else if(MenuPage.letterNumber == 10)
		{
			MonkeyGameActivity.mBitmapTextureAtlasGo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasGo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasGo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasGo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasGo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasGo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWGo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWGo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWGo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWGo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWGo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWGo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			
			MonkeyGameActivity.mFaceTextureRegionGo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasGo1, MonkeyGameActivity.MonkeyGameActivityActivity, "gada.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionGo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasGo2, MonkeyGameActivity.MonkeyGameActivityActivity, "gan.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionGo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasGo3, MonkeyGameActivity.MonkeyGameActivityActivity, "gari.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionGo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasGo4, MonkeyGameActivity.MonkeyGameActivityActivity, "gorom.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionGo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasGo5, MonkeyGameActivity.MonkeyGameActivityActivity, "goru.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionGo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasGo6, MonkeyGameActivity.MonkeyGameActivityActivity, "gulap.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWGo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWGo1, MonkeyGameActivity.MonkeyGameActivityActivity, "ut.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWGo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWGo2, MonkeyGameActivity.MonkeyGameActivityActivity, "khela.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWGo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWGo3, MonkeyGameActivity.MonkeyGameActivityActivity, "urojahaj.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWGo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWGo4, MonkeyGameActivity.MonkeyGameActivityActivity, "dim.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWGo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWGo5, MonkeyGameActivity.MonkeyGameActivityActivity, "tobola.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWGo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWGo6, MonkeyGameActivity.MonkeyGameActivityActivity, "ektara.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasGo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasGo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasGo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasGo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasGo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasGo6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWGo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWGo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWGo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWGo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWGo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWGo6.load();
		}
		//Ho
		else if(MenuPage.letterNumber == 11)
		{
			MonkeyGameActivity.mBitmapTextureAtlasHo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasHo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasHo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasHo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasHo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasHo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWHo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWHo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWHo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWHo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWHo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWHo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			MonkeyGameActivity.mFaceTextureRegionHo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasHo1, MonkeyGameActivity.MonkeyGameActivityActivity, "har.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionHo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasHo2, MonkeyGameActivity.MonkeyGameActivityActivity, "hash.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionHo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasHo3, MonkeyGameActivity.MonkeyGameActivityActivity, "hath.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionHo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasHo4, MonkeyGameActivity.MonkeyGameActivityActivity, "hathi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionHo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasHo5, MonkeyGameActivity.MonkeyGameActivityActivity, "hira.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionHo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasHo6, MonkeyGameActivity.MonkeyGameActivityActivity, "horin.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWHo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWHo1, MonkeyGameActivity.MonkeyGameActivityActivity, "gulap.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWHo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWHo2, MonkeyGameActivity.MonkeyGameActivityActivity, "utpkhi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWHo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWHo3, MonkeyGameActivity.MonkeyGameActivityActivity, "khabar.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWHo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWHo4, MonkeyGameActivity.MonkeyGameActivityActivity, "table.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWHo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWHo5, MonkeyGameActivity.MonkeyGameActivityActivity, "doi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWHo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWHo6, MonkeyGameActivity.MonkeyGameActivityActivity, "gari.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasHo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasHo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasHo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasHo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasHo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasHo6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWHo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWHo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWHo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWHo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWHo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWHo6.load();
		}
		//Kho
		else if(MenuPage.letterNumber == 12)
		{
			MonkeyGameActivity.mBitmapTextureAtlasKho1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasKho2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasKho3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasKho4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasKho5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasKho6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKho1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKho2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKho3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKho4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKho5= new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWKho6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			MonkeyGameActivity.mFaceTextureRegionKho1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKho1, MonkeyGameActivity.MonkeyGameActivityActivity, "khabar.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionKho2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKho2, MonkeyGameActivity.MonkeyGameActivityActivity, "kham.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionKho3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKho3, MonkeyGameActivity.MonkeyGameActivityActivity, "khat.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionKho4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKho4, MonkeyGameActivity.MonkeyGameActivityActivity, "khela.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionKho5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKho5, MonkeyGameActivity.MonkeyGameActivityActivity, "khata.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionKho6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasKho6, MonkeyGameActivity.MonkeyGameActivityActivity, "khobor.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKho1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKho1, MonkeyGameActivity.MonkeyGameActivityActivity, "tin.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKho2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKho2, MonkeyGameActivity.MonkeyGameActivityActivity, "dalim.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKho3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKho3, MonkeyGameActivity.MonkeyGameActivityActivity, "taka.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKho4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKho4, MonkeyGameActivity.MonkeyGameActivityActivity, "ek.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKho5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKho5, MonkeyGameActivity.MonkeyGameActivityActivity, "dol.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWKho6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWKho6, MonkeyGameActivity.MonkeyGameActivityActivity, "shapla.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasKho1.load();
			MonkeyGameActivity.mBitmapTextureAtlasKho2.load();
			MonkeyGameActivity.mBitmapTextureAtlasKho3.load();
			MonkeyGameActivity.mBitmapTextureAtlasKho4.load();
			MonkeyGameActivity.mBitmapTextureAtlasKho5.load();
			MonkeyGameActivity.mBitmapTextureAtlasKho6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKho1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKho2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKho3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKho4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKho5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWKho6.load();
		}
		//Cho
		else if(MenuPage.letterNumber == 13)
		{
			MonkeyGameActivity.mBitmapTextureAtlasCho1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasCho2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasCho3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasCho4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasCho5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasCho6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWCho1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWCho2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWCho3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWCho4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWCho5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWCho6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			MonkeyGameActivity.mFaceTextureRegionCho1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasCho1, MonkeyGameActivity.MonkeyGameActivityActivity, "chabi.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionCho2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasCho2, MonkeyGameActivity.MonkeyGameActivityActivity, "chacha.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionCho3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasCho3, MonkeyGameActivity.MonkeyGameActivityActivity, "chaka.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionCho4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasCho4, MonkeyGameActivity.MonkeyGameActivityActivity, "chala.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionCho5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasCho5, MonkeyGameActivity.MonkeyGameActivityActivity, "chamoch.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionCho6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasCho6, MonkeyGameActivity.MonkeyGameActivityActivity, "chok.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWCho1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWCho1, MonkeyGameActivity.MonkeyGameActivityActivity, "nil.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWCho2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWCho2, MonkeyGameActivity.MonkeyGameActivityActivity, "bol.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWCho3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWCho3, MonkeyGameActivity.MonkeyGameActivityActivity, "nak.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWCho4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWCho4, MonkeyGameActivity.MonkeyGameActivityActivity, "tormuj.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWCho5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWCho5, MonkeyGameActivity.MonkeyGameActivityActivity, "kola.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWCho6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWCho6, MonkeyGameActivity.MonkeyGameActivityActivity, "lau.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasCho1.load();
			MonkeyGameActivity.mBitmapTextureAtlasCho2.load();
			MonkeyGameActivity.mBitmapTextureAtlasCho3.load();
			MonkeyGameActivity.mBitmapTextureAtlasCho4.load();
			MonkeyGameActivity.mBitmapTextureAtlasCho5.load();
			MonkeyGameActivity.mBitmapTextureAtlasCho6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWCho1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWCho2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWCho3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWCho4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWCho5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWCho6.load();
		}
		//No
		else if(MenuPage.letterNumber == 14)
		{
			MonkeyGameActivity.mBitmapTextureAtlasNo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasNo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasNo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasNo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasNo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasNo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWNo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWNo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWNo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWNo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWNo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWNo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			
			MonkeyGameActivity.mFaceTextureRegionNo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasNo1, MonkeyGameActivity.MonkeyGameActivityActivity, "nach.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionNo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasNo2, MonkeyGameActivity.MonkeyGameActivityActivity, "nak.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionNo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasNo3, MonkeyGameActivity.MonkeyGameActivityActivity, "nam.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionNo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasNo4, MonkeyGameActivity.MonkeyGameActivityActivity, "nana.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionNo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasNo5, MonkeyGameActivity.MonkeyGameActivityActivity, "narikel.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionNo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasNo6, MonkeyGameActivity.MonkeyGameActivityActivity, "nil.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWNo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWNo1, MonkeyGameActivity.MonkeyGameActivityActivity, "balish.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWNo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWNo2, MonkeyGameActivity.MonkeyGameActivityActivity, "langol.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWNo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWNo3, MonkeyGameActivity.MonkeyGameActivityActivity, "tala.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWNo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWNo4, MonkeyGameActivity.MonkeyGameActivityActivity, "angur.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWNo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWNo5, MonkeyGameActivity.MonkeyGameActivityActivity, "belun.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWNo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWNo6, MonkeyGameActivity.MonkeyGameActivityActivity, "tal.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasNo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasNo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasNo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasNo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasNo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasNo6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWNo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWNo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWNo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWNo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWNo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWNo6.load();
		}
		//A
		else if(MenuPage.letterNumber == 15)
		{
			MonkeyGameActivity.mBitmapTextureAtlasA1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasA2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasA3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasA4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasA5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasA6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWA1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWA2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWA3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWA4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWA5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWA6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			MonkeyGameActivity.mFaceTextureRegionA1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasA1, MonkeyGameActivity.MonkeyGameActivityActivity, "ek.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionA2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasA2, MonkeyGameActivity.MonkeyGameActivityActivity, "ekar.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionA3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasA3, MonkeyGameActivity.MonkeyGameActivityActivity, "ekhat.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionA4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasA4, MonkeyGameActivity.MonkeyGameActivityActivity, "ekmuto.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionA5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasA5, MonkeyGameActivity.MonkeyGameActivityActivity, "ektara.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionA6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasA6, MonkeyGameActivity.MonkeyGameActivityActivity, "elach.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWA1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWA1, MonkeyGameActivity.MonkeyGameActivityActivity, "dab.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWA2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWA2, MonkeyGameActivity.MonkeyGameActivityActivity, "shiyal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWA3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWA3, MonkeyGameActivity.MonkeyGameActivityActivity, "dal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWA4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWA4, MonkeyGameActivity.MonkeyGameActivityActivity, "pa.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWA5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWA5, MonkeyGameActivity.MonkeyGameActivityActivity, "robi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWA6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWA6, MonkeyGameActivity.MonkeyGameActivityActivity, "nil.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasA1.load();
			MonkeyGameActivity.mBitmapTextureAtlasA2.load();
			MonkeyGameActivity.mBitmapTextureAtlasA3.load();
			MonkeyGameActivity.mBitmapTextureAtlasA4.load();
			MonkeyGameActivity.mBitmapTextureAtlasA5.load();
			MonkeyGameActivity.mBitmapTextureAtlasA6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWA1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWA2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWA3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWA4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWA5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWA6.load();
		}
		//Do
		else if(MenuPage.letterNumber == 16)
		{
			MonkeyGameActivity.mBitmapTextureAtlasDo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasDo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasDo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasDo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasDo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasDo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
					
			MonkeyGameActivity.mFaceTextureRegionDo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDo1, MonkeyGameActivity.MonkeyGameActivityActivity, "dab.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionDo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDo2, MonkeyGameActivity.MonkeyGameActivityActivity, "dal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionDo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDo3, MonkeyGameActivity.MonkeyGameActivityActivity, "dala.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionDo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDo4, MonkeyGameActivity.MonkeyGameActivityActivity, "dalim.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionDo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDo5, MonkeyGameActivity.MonkeyGameActivityActivity, "dan.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionDo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDo6, MonkeyGameActivity.MonkeyGameActivityActivity, "dim.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDo1, MonkeyGameActivity.MonkeyGameActivityActivity, "shishi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDo2, MonkeyGameActivity.MonkeyGameActivityActivity, "roket.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDo3, MonkeyGameActivity.MonkeyGameActivityActivity, "shosha.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDo4, MonkeyGameActivity.MonkeyGameActivityActivity, "pani.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDo5, MonkeyGameActivity.MonkeyGameActivityActivity, "imarot.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDo6, MonkeyGameActivity.MonkeyGameActivityActivity, "kak.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasDo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasDo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasDo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasDo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasDo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasDo6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDo6.load();
		}
		//U
		else if(MenuPage.letterNumber == 17)
		{
			MonkeyGameActivity.mBitmapTextureAtlasU1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasU2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasU3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasU4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasU5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasU6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWU1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWU2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWU3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWU4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWU5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWU6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			
			MonkeyGameActivity.mFaceTextureRegionU1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasU1, MonkeyGameActivity.MonkeyGameActivityActivity, "ulta.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionU2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasU2, MonkeyGameActivity.MonkeyGameActivityActivity, "ura.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionU3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasU3, MonkeyGameActivity.MonkeyGameActivityActivity, "urojahaj.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionU4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasU4, MonkeyGameActivity.MonkeyGameActivityActivity, "usha.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionU5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasU5, MonkeyGameActivity.MonkeyGameActivityActivity, "ut.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionU6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasU6, MonkeyGameActivity.MonkeyGameActivityActivity, "utpkhi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWU1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWU1, MonkeyGameActivity.MonkeyGameActivityActivity, "khobor.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWU2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWU2, MonkeyGameActivity.MonkeyGameActivityActivity, "dim.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWU3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWU3, MonkeyGameActivity.MonkeyGameActivityActivity, "khata.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWU4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWU4, MonkeyGameActivity.MonkeyGameActivityActivity, "ekar.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWU5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWU5, MonkeyGameActivity.MonkeyGameActivityActivity, "kham.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWU6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWU6, MonkeyGameActivity.MonkeyGameActivityActivity, "taka.png",0,0);
			
			
			MonkeyGameActivity.mBitmapTextureAtlasU1.load();
			MonkeyGameActivity.mBitmapTextureAtlasU2.load();
			MonkeyGameActivity.mBitmapTextureAtlasU3.load();
			MonkeyGameActivity.mBitmapTextureAtlasU4.load();
			MonkeyGameActivity.mBitmapTextureAtlasU5.load();
			MonkeyGameActivity.mBitmapTextureAtlasU6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWU1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWU2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWU3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWU4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWU5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWU6.load();
		}
		//To
		else if(MenuPage.letterNumber == 18)
		{
			MonkeyGameActivity.mBitmapTextureAtlasTo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTo5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTo6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		
			
			MonkeyGameActivity.mFaceTextureRegionTo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTo1, MonkeyGameActivity.MonkeyGameActivityActivity, "tormuj.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionTo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTo2, MonkeyGameActivity.MonkeyGameActivityActivity, "tal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionTo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTo3, MonkeyGameActivity.MonkeyGameActivityActivity, "tala.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionTo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTo4, MonkeyGameActivity.MonkeyGameActivityActivity, "tobola.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionTo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTo5, MonkeyGameActivity.MonkeyGameActivityActivity, "tuli.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionTo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTo6, MonkeyGameActivity.MonkeyGameActivityActivity, "tak.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTo1, MonkeyGameActivity.MonkeyGameActivityActivity, "kolom.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTo2, MonkeyGameActivity.MonkeyGameActivityActivity, "lau.png",0,0);			
			MonkeyGameActivity.mFaceTextureRegionWTo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTo3, MonkeyGameActivity.MonkeyGameActivityActivity, "am.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTo4, MonkeyGameActivity.MonkeyGameActivityActivity, "kola.png",0,0);			
			MonkeyGameActivity.mFaceTextureRegionWTo5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTo5, MonkeyGameActivity.MonkeyGameActivityActivity, "megh.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTo6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTo6, MonkeyGameActivity.MonkeyGameActivityActivity, "kol.png",0,0);			
		
			
			MonkeyGameActivity.mBitmapTextureAtlasTo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasTo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasTo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasTo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasTo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasTo6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTo5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTo6.load();
		}
		//Toh
		else if(MenuPage.letterNumber == 19)
		{
			MonkeyGameActivity.mBitmapTextureAtlasToh1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasToh2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasToh3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasToh4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasToh5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasToh6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWToh1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWToh2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWToh3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWToh4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWToh5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWToh6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
				
			MonkeyGameActivity.mFaceTextureRegionToh1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasToh1, MonkeyGameActivity.MonkeyGameActivityActivity, "tomtom.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionToh2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasToh2, MonkeyGameActivity.MonkeyGameActivityActivity, "tomato.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionToh3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasToh3, MonkeyGameActivity.MonkeyGameActivityActivity, "tin.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionToh4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasToh4, MonkeyGameActivity.MonkeyGameActivityActivity, "table.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionToh5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasToh5, MonkeyGameActivity.MonkeyGameActivityActivity, "tob.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionToh6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasToh6, MonkeyGameActivity.MonkeyGameActivityActivity, "taka.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWToh1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWToh1, MonkeyGameActivity.MonkeyGameActivityActivity, "dalim.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWToh2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWToh2, MonkeyGameActivity.MonkeyGameActivityActivity, "elach.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWToh3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWToh3, MonkeyGameActivity.MonkeyGameActivityActivity, "dal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWToh4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWToh4, MonkeyGameActivity.MonkeyGameActivityActivity, "dab.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWToh5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWToh5, MonkeyGameActivity.MonkeyGameActivityActivity, "shishi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWToh6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWToh6, MonkeyGameActivity.MonkeyGameActivityActivity, "potaka.png",0,0);
			
			
			MonkeyGameActivity.mBitmapTextureAtlasToh1.load();
			MonkeyGameActivity.mBitmapTextureAtlasToh2.load();
			MonkeyGameActivity.mBitmapTextureAtlasToh3.load();
			MonkeyGameActivity.mBitmapTextureAtlasToh4.load();
			MonkeyGameActivity.mBitmapTextureAtlasToh5.load();
			MonkeyGameActivity.mBitmapTextureAtlasToh6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWToh1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWToh2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWToh3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWToh4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWToh5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWToh6.load();
		}
		//Doh
		else if(MenuPage.letterNumber == 20)
		{
			MonkeyGameActivity.mBitmapTextureAtlasDoh1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasDoh2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasDoh3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasDoh4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasDoh5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasDoh6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDoh1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDoh2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDoh3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDoh4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDoh5 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWDoh6 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			MonkeyGameActivity.mFaceTextureRegionDoh1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDoh1, MonkeyGameActivity.MonkeyGameActivityActivity, "dada.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionDoh2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDoh2, MonkeyGameActivity.MonkeyGameActivityActivity, "dalan.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionDoh3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDoh3, MonkeyGameActivity.MonkeyGameActivityActivity, "desh.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionDoh4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDoh4, MonkeyGameActivity.MonkeyGameActivityActivity, "doi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionDoh5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDoh5, MonkeyGameActivity.MonkeyGameActivityActivity, "dol.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionDoh6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasDoh6, MonkeyGameActivity.MonkeyGameActivityActivity, "dosh.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDoh1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDoh1, MonkeyGameActivity.MonkeyGameActivityActivity, "ek.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDoh2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDoh2, MonkeyGameActivity.MonkeyGameActivityActivity, "dala.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDoh3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDoh3, MonkeyGameActivity.MonkeyGameActivityActivity, "ektara.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDoh4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDoh4, MonkeyGameActivity.MonkeyGameActivityActivity, "rana.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDoh5 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDoh5, MonkeyGameActivity.MonkeyGameActivityActivity, "elach.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWDoh6 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWDoh6, MonkeyGameActivity.MonkeyGameActivityActivity, "dab.png",0,0);
			
			MonkeyGameActivity.mBitmapTextureAtlasDoh1.load();
			MonkeyGameActivity.mBitmapTextureAtlasDoh2.load();
			MonkeyGameActivity.mBitmapTextureAtlasDoh3.load();
			MonkeyGameActivity.mBitmapTextureAtlasDoh4.load();
			MonkeyGameActivity.mBitmapTextureAtlasDoh5.load();
			MonkeyGameActivity.mBitmapTextureAtlasDoh6.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDoh1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDoh2.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDoh3.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDoh4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDoh5.load();
			MonkeyGameActivity.mBitmapTextureAtlasWDoh6.load();
		}
	}
}
