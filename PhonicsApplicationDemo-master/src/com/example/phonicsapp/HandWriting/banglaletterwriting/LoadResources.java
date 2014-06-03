package com.example.phonicsapp.HandWriting.banglaletterwriting;

import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.andengine.opengl.texture.atlas.buildable.builder.BlackPawnTextureAtlasBuilder;
import org.andengine.opengl.texture.atlas.buildable.builder.ITextureAtlasBuilder.TextureAtlasBuilderException;
import org.andengine.util.debug.Debug;

public class LoadResources 
{

	public static void loadAllResource()
	{
	
	//Mo
	if(HandWritingMenu.letterNumber == 1)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasMoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mMoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasMoFilled, GameActivity.MainActivityInstace,
				"moFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasMoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasMoOutLine = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mMoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(GameActivity.mBitmapTextureAtlasMoOutLine, GameActivity.MainActivityInstace,
						"moExample.png", 0, 0, 1, 1);
		GameActivity.mBitmapTextureAtlasMoOutLine.load();
	}
	//Aa
	else if(HandWritingMenu.letterNumber == 2)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasAaFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mAaFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasAaFilled, GameActivity.MainActivityInstace,
				"aaFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasAaFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasAaOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mAaOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasAaOutLine, GameActivity.MainActivityInstace,
				"aaExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasAaOutLine.load();
		
		//HandWritingMenu.letterNumber = 21;
	}
	//e
	else if(HandWritingMenu.letterNumber == 3)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasEFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mEFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasEFilled, GameActivity.MainActivityInstace,
				"eFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasEFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasEOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mEOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasEOutLine, GameActivity.MainActivityInstace,
				"eExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasEOutLine.load();
	}
	//Raw
	else if(HandWritingMenu.letterNumber == 4)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasRawFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mRawFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasRawFilled, GameActivity.MainActivityInstace,
				"rawFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasRawFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasRawOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mRawOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasRawOutLine, GameActivity.MainActivityInstace,
				"rawExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasRawOutLine.load();
	}
	//Ko
	else if(HandWritingMenu.letterNumber == 5)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasKoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mKoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasKoFilled, GameActivity.MainActivityInstace,
				"koFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasKoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasKoOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mKoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasKoOutLine, GameActivity.MainActivityInstace,
				"koExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasKoOutLine.load();
	}
	//Bo
	else if(HandWritingMenu.letterNumber == 6)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasBoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mBoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasBoFilled, GameActivity.MainActivityInstace,
				"boFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasBoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasBoOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mBoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasBoOutLine, GameActivity.MainActivityInstace,
				"boExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasBoOutLine.load();
	}
	//TalibaSha
	else if(HandWritingMenu.letterNumber == 7)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasTalibashaFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mTalibashaFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasTalibashaFilled, GameActivity.MainActivityInstace,
				"talibashaFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasTalibashaFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasTalibaShaOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mTalibaShaOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasTalibaShaOutLine, GameActivity.MainActivityInstace,
				"talibaShaExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasTalibaShaOutLine.load();
	}
	//Lo
	else if(HandWritingMenu.letterNumber == 8)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasLoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mLoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasLoFilled, GameActivity.MainActivityInstace,
				"loFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasLoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasLoOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mLoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasLoOutLine, GameActivity.MainActivityInstace,
				"loExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasLoOutLine.load();
	}
	//Po
	else if(HandWritingMenu.letterNumber == 9)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasPoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mPoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasPoFilled, GameActivity.MainActivityInstace,
				"poFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasPoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasPoOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mPoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasPoOutLine, GameActivity.MainActivityInstace,
				"poExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasPoOutLine.load();
	}
	//Go
	else if(HandWritingMenu.letterNumber == 10)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasGoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mGoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasGoFilled, GameActivity.MainActivityInstace,
				"goFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasGoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasGoOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mGoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasGoOutLine, GameActivity.MainActivityInstace,
				"goExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasGoOutLine.load();
	}
	//Ho
	else if(HandWritingMenu.letterNumber == 11)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasHoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mHoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasHoFilled, GameActivity.MainActivityInstace,
				"hoFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasHoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasHoOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mHoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasHoOutLine, GameActivity.MainActivityInstace,
				"hoExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasHoOutLine.load();
	}
	//Kho
	else if(HandWritingMenu.letterNumber == 12)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasKhoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mKhoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasKhoFilled, GameActivity.MainActivityInstace,
				"khoFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasKhoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasKhoOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mKhoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasKhoOutLine, GameActivity.MainActivityInstace,
				"khoExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasKhoOutLine.load();
	}
	//Cho
	else if(HandWritingMenu.letterNumber == 13)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasChoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mChoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasChoFilled, GameActivity.MainActivityInstace,
				"choFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasChoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasChoOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mChoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasChoOutLine, GameActivity.MainActivityInstace,
				"choExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasChoOutLine.load();
	}
	//No
	else if(HandWritingMenu.letterNumber == 14)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasNoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mNoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasNoFilled, GameActivity.MainActivityInstace,
				"noFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasNoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasNoOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mNoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasNoOutLine, GameActivity.MainActivityInstace,
				"noExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasNoOutLine.load();
	}
	//A
	else if(HandWritingMenu.letterNumber == 15)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasAFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mAFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasAFilled, GameActivity.MainActivityInstace,
				"aFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasAFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasAOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mAOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasAOutLine, GameActivity.MainActivityInstace,
				"aExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasAOutLine.load();
	}
	//Do
	else if(HandWritingMenu.letterNumber == 16)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasDoFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mDoFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasDoFilled, GameActivity.MainActivityInstace,
				"doFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasDoFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasDoOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mDoOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasDoOutLine, GameActivity.MainActivityInstace,
				"doExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasDoOutLine.load();
	}
	//U
	else if(HandWritingMenu.letterNumber == 17)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasUFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mUFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasUFilled, GameActivity.MainActivityInstace,
				"uFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasUFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasUOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mUOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasUOutLine, GameActivity.MainActivityInstace,
				"uExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasUOutLine.load();
	}
	//To
	else if(HandWritingMenu.letterNumber == 18)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasToFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mToFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasToFilled, GameActivity.MainActivityInstace,
				"toFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasToFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasToOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mToOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasToOutLine, GameActivity.MainActivityInstace,
				"toExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasToOutLine.load();
	}
	//Toh
	else if(HandWritingMenu.letterNumber == 19)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasTohFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mTohFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasTohFilled, GameActivity.MainActivityInstace,
				"tohFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasTohFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasTohOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mTohOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasTohOutLine, GameActivity.MainActivityInstace,
				"tohExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasTohOutLine.load();
	}
	//Doh
	else if(HandWritingMenu.letterNumber == 20)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasDohFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mDohFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasDohFilled, GameActivity.MainActivityInstace,
				"dohFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasDohFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasDohOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mDohOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasDohOutLine, GameActivity.MainActivityInstace,
				"dohExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasDohOutLine.load();
	}
	//Ukar
	else if(HandWritingMenu.letterNumber == 21)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasUkarFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mUkarFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasUkarFilled, GameActivity.MainActivityInstace,
				"ukarFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasUkarFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasUkarOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mUkarOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasUkarOutLine, GameActivity.MainActivityInstace,
				"ukarExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasUkarOutLine.load();
	}
	//Ekar
	else if(HandWritingMenu.letterNumber == 22)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasEkarFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mEkarFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasEkarFilled, GameActivity.MainActivityInstace,
				"ekarFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasEkarFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasEkarOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mEkarOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasEkarOutLine, GameActivity.MainActivityInstace,
				"ekarExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasEkarOutLine.load();
	}
	//Akar
	else if(HandWritingMenu.letterNumber == 23)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasAkarFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mAkarFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasAkarFilled, GameActivity.MainActivityInstace,
				"aakarFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasAkarFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasAkarOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mAkarOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasAkarOutLine, GameActivity.MainActivityInstace,
				"aakarExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasAkarOutLine.load();
	}
	//Aakar
	else if(HandWritingMenu.letterNumber == 24)
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/FilledLetters/");
		GameActivity.mBitmapTextureAtlasAakarFilled = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
		GameActivity.mAakarFilledTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasAakarFilled, GameActivity.MainActivityInstace,
				"aakarFilled.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasAakarFilled.load();
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/LetterOutLine/");
		GameActivity.mBitmapTextureAtlasAakarOutLine= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 700, 600, TextureOptions.BILINEAR);
		GameActivity.mAakarOutLineTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasAakarOutLine, GameActivity.MainActivityInstace,
				"aakarExample.png", 0, 0,  1, 1);
		GameActivity.mBitmapTextureAtlasAakarOutLine.load();
	}
	
		//Menu images
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/");
		GameActivity.mBitmapTextureAtlasMenuBackground= new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
		GameActivity.mMenuBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(
				GameActivity.mBitmapTextureAtlasMenuBackground, GameActivity.MainActivityInstace, "JungleBG.png", 0, 0, 1, 1);
		
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/MenuLetters/");
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=4; j++)
			{
				GameActivity.mBitmapTextureAtlasMenuLetters[i][j] = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);
				GameActivity.mMenuTextureRegionMenuLetters[i][j] = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasMenuLetters[i][j], GameActivity.MainActivityInstace,
					i+""+j+".png", 0, 0,  1, 1);
			}
		}
		
		
		//Background images
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("iWriteGFX/");

		GameActivity.mBitmapTextureAtlasBackGround = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);

		GameActivity.mBitmapTextureAtlasBlackBoard = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 400, 400, TextureOptions.BILINEAR);

		GameActivity.mBitmapTextureAtlasWhiteChalk = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 50, 50, TextureOptions.BILINEAR);

		GameActivity.mBitmapTextureAtlasHomeButton = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 150, 150, TextureOptions.BILINEAR);

		
		//popup
		GameActivity.mBitmapTextureAtlasBookIcon = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		 
		GameActivity.mBitmapTextureAtlasHandWirtingBook = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 1600, 800, TextureOptions.BILINEAR);
		 
		GameActivity.mBitmapTextureAtlasBoard = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 600, 800, TextureOptions.BILINEAR);
		 
		GameActivity.mBitmapTextureAtlasHandCross = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		
		GameActivity.mBitmapTextureAtlasDuster = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		
		GameActivity.mBitmapTextureAtlasMonkeyBrush = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 1300, 600, TextureOptions.BILINEAR);

		GameActivity.mBitmapTextureAtlasHandTutorial = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 100, 100, TextureOptions.BILINEAR);
		
		GameActivity.mBitmapTextureAtlasDuster = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
		
		GameActivity.mBitmapTextureAtlasMonkeyBrush = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 1300, 600, TextureOptions.BILINEAR);

		//popup
		GameActivity.mBookIconRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasBookIcon, GameActivity.MainActivityInstace,
				"bookIcon.png", 0, 0,  1, 1);
				
		GameActivity.mCreatePopUpRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasHandWirtingBook, GameActivity.MainActivityInstace,
				"handwritingbook.png", 0, 0,  1, 1);
				
		GameActivity.mCrossRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasHandCross, GameActivity.MainActivityInstace,
				"cross.png", 0, 0,  1, 1);
		
		GameActivity.mDusterTextureRegion =  BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasDuster, GameActivity.MainActivityInstace,
				"duster.png", 0, 0,  1, 1);
				
		GameActivity.mHandTutorialTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasHandTutorial, GameActivity.MainActivityInstace,
				"hand.png", 0, 0,  1, 1);
		
		GameActivity.mPopUpBlackBoardTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasBoard, GameActivity.MainActivityInstace,
				"board3.png", 0, 0,  1, 1); 
		
		GameActivity.mDusterTextureRegion =  BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasDuster, GameActivity.MainActivityInstace,
				"duster.png", 0, 0,  1, 1);
		
		GameActivity.mSlidingScreenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(GameActivity.mBitmapTextureAtlasMonkeyBrush, GameActivity.MainActivityInstace,
				"monkeyBrush3.png", 0, 0,  1, 1);

		
		
		// All the numbers
		for (int i = 1; i <= GameActivity.totalLoadNumberPic; i++) 
		{
			GameActivity.mBitmapTextureAtlasNumber[i] = new BitmapTextureAtlas(
					GameActivity.MainActivityInstace.getTextureManager(), 150, 150, TextureOptions.BILINEAR);
		}

		GameActivity.mbackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(GameActivity.mBitmapTextureAtlasBackGround, GameActivity.MainActivityInstace,
						"JungleBG.png", 0, 0, 1, 1);

		GameActivity.mBlackBoardTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(GameActivity.mBitmapTextureAtlasBlackBoard, GameActivity.MainActivityInstace,
						"board2.png", 0, 0, 1, 1);


		GameActivity.mWhiteChalkTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(GameActivity.mBitmapTextureAtlasWhiteChalk, GameActivity.MainActivityInstace,
						"chalk2.png", 0, 0, 1, 1);
		
		GameActivity.mHomeButtoTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(GameActivity.mBitmapTextureAtlasHomeButton, GameActivity.MainActivityInstace,
						"homeButton.png", 0, 0, 1, 1);

		// All the numbers
		for (int i = 1; i <= 4; i++) 
		{
			GameActivity.mTextureRegionNumber[i] = BitmapTextureAtlasTextureRegionFactory
					.createTiledFromAsset(GameActivity.mBitmapTextureAtlasNumber[i], GameActivity.MainActivityInstace,
							"Number" + i + ".png", 0, 0, 1, 1);
		}
		
		for (int i = 5; i <= 7; i++) 
		{
			GameActivity.mTextureRegionNumber[i] = BitmapTextureAtlasTextureRegionFactory
					.createTiledFromAsset(GameActivity.mBitmapTextureAtlasNumber[i], GameActivity.MainActivityInstace,
							"Number" + (i-4) + ".png", 0, 0, 1, 1);
		}
		
		for (int i = 8; i <= 9; i++) 
		{
			GameActivity.mTextureRegionNumber[i] = BitmapTextureAtlasTextureRegionFactory
					.createTiledFromAsset(GameActivity.mBitmapTextureAtlasNumber[i], GameActivity.MainActivityInstace,
							"Number" + (i-7) + ".png", 0, 0, 1, 1);
		}
		
		for (int i = 10; i <= 13; i++) 
		{
			GameActivity.mTextureRegionNumber[i] = BitmapTextureAtlasTextureRegionFactory
					.createTiledFromAsset(GameActivity.mBitmapTextureAtlasNumber[i], GameActivity.MainActivityInstace,
							"Number" + (i-9) + ".png", 0, 0, 1, 1);
		}
		
		for (int i = 14; i <= 17; i++) 
		{
			GameActivity.mTextureRegionNumber[i] = BitmapTextureAtlasTextureRegionFactory
					.createTiledFromAsset(GameActivity.mBitmapTextureAtlasNumber[i], GameActivity.MainActivityInstace,
							"Number" + (i-13) + ".png", 0, 0, 1, 1);
		}
		
		for (int i = 18; i <= 20; i++) 
		{
			GameActivity.mTextureRegionNumber[i] = BitmapTextureAtlasTextureRegionFactory
					.createTiledFromAsset(GameActivity.mBitmapTextureAtlasNumber[i], GameActivity.MainActivityInstace,
							"Number" + (i-17) + ".png", 0, 0, 1, 1);
		} 
		
		GameActivity.mBitmapTextureAtlasBackGround.load();
		GameActivity.mBitmapTextureAtlasBlackBoard.load();
		GameActivity.mBitmapTextureAtlasWhiteChalk.load();
		GameActivity.mBitmapTextureAtlasHomeButton.load();
		
		GameActivity.mBitmapTextureAtlasBookIcon.load();
		GameActivity.mBitmapTextureAtlasHandWirtingBook.load();
		GameActivity.mBitmapTextureAtlasBoard.load();
		GameActivity.mBitmapTextureAtlasHandCross.load();
		GameActivity.mBitmapTextureAtlasDuster.load();
		GameActivity.mBitmapTextureAtlasMonkeyBrush.load();
		GameActivity.mBitmapTextureAtlasHandTutorial.load();
		
		
		//Menu
		GameActivity.mBitmapTextureAtlasMenuBackground.load();
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=4; j++)
			{
				GameActivity.mBitmapTextureAtlasMenuLetters[i][j].load();
			}
		}
		
		// All the numbers
		for (int i = 1; i <= GameActivity.totalLoadNumberPic; i++) 
		{
			GameActivity.mBitmapTextureAtlasNumber[i].load();
		}

		GameActivity.mAnimatedBitmapTextureAtlas = new BuildableBitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 614, 104, TextureOptions.NEAREST);
		GameActivity.mFishTextureRegion = BitmapTextureAtlasTextureRegionFactory.
				createTiledFromAsset(GameActivity.mAnimatedBitmapTextureAtlas, GameActivity.MainActivityInstace, "fish.png", 6, 1);
		
		try 
		{
			GameActivity.mAnimatedBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			GameActivity.mAnimatedBitmapTextureAtlas.load();
		} 
		catch (TextureAtlasBuilderException e) 
		{
			Debug.e(e);
		}
		
		GameActivity.mAnimatedMonkeyBitmapTextureAtlas = new BuildableBitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(), 2080, 682, TextureOptions.NEAREST);
		GameActivity.mMonkeyTextureRegion = BitmapTextureAtlasTextureRegionFactory.
				createTiledFromAsset(GameActivity.mAnimatedMonkeyBitmapTextureAtlas, GameActivity.MainActivityInstace, "monkeyTutorial1.png", 10, 1);
		
		try 
		{
			GameActivity.mAnimatedMonkeyBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
			GameActivity.mAnimatedMonkeyBitmapTextureAtlas.load();
		} 
		catch (TextureAtlasBuilderException e) 
		{
			Debug.e(e);
		}
	}
}
