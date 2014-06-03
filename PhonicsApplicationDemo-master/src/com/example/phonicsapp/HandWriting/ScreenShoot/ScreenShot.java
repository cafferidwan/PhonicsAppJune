package com.example.phonicsapp.HandWriting.ScreenShoot;

import java.io.File;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.util.ScreenCapture;
import org.andengine.entity.util.ScreenCapture.IScreenCaptureCallback;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.texture.region.TextureRegionFactory;
import org.andengine.util.FileUtils;

import com.example.accountSystem.AccountDisplayPage;
import com.example.phonicsapp.HandWriting.banglaletterwriting.GameActivity;

import android.graphics.BitmapFactory;
import android.os.Environment;


public class ScreenShot 
{
	
	public static int screenAccountNumber;
	
	public ScreenShot()
	{
//		GameActivity.screenCapture.capture((int) (GameActivity.BackgroundWidth*0.3), (int)((GameActivity.BackgroundWidth/1.7)*1/7), 
//				GameActivity.viewWidth, GameActivity.viewHeight,FileUtils.getAbsolutePathOnExternalStorage("/screen"+".jpg")
//		 , new IScreenCaptureCallback() 
		
//		GameActivity.screenCapture.capture((int) (GameActivity.BackgroundWidth*0.3), (int)((GameActivity.BackgroundWidth/1.7)*1/7), GameActivity.viewWidth, GameActivity.viewHeight,FileUtils.getAbsolutePathOnInternalStorage
//				(GameActivity.MainActivityInstace.getApplicationContext(), "/screen"+".jpg") , new IScreenCaptureCallback() 
		
		File file = new File(Environment.getExternalStorageDirectory(), "/PhonicsApp/HandWritingLetters");
		if (!file.exists())  
		{
		    file.mkdirs();
		}
		screenAccountNumber = AccountDisplayPage.accountNumber;
		
		//capture the screen shot and save it to external storage
		GameActivity.cursor.setVisible(false);
		//final float time = System.currentTimeMillis();
		GameActivity.screenCapture.capture((int) (GameActivity.BackgroundWidth*0.3), (int)((GameActivity.BackgroundWidth/1.7)*1/7), 
		GameActivity.viewWidth, GameActivity.viewHeight,FileUtils.getAbsolutePathOnExternalStorage( "/PhonicsApp/HandWritingLetters/account no"+" "+screenAccountNumber+".jpg")
		, new IScreenCaptureCallback() 
		{ 
			@Override
			public void onScreenCaptured(final String pFilePath) 
			{
				GameActivity.MainActivityInstace.runOnUiThread(new Runnable()
				{ 
					@Override
					public void run() 
					{ 
						//Debug.d("Screenshot: " + pFilePath + " taken!");
//						GameActivity.changeTexture = 1;
						new setTexture(FileUtils.getAbsolutePathOnExternalStorage("/PhonicsApp/HandWritingLetters/account no"+" "+screenAccountNumber+".jpg"));
						
//						new setTexture(FileUtils.getAbsolutePathOnInternalStorage
//								(GameActivity.MainActivityInstace.getApplicationContext(), "/screen"+".jpg"));
					} 
				});
			}

			@Override
			public void onScreenCaptureFailed(final String pFilePath, final Exception pException)
			{
				GameActivity.MainActivityInstace.runOnUiThread(new Runnable()
				{
					@Override
					public void run() 
					{
						GameActivity.changeTexture = 0;
					}
				});
			}
		});

	}
	
	public static class setTexture
	{
		public setTexture(String address)
		{ 
			//this.mDrawnPictureRegion = textureRegion;
			GameActivity.source = new BitmapTextureAtlasSource(BitmapFactory.decodeFile(address));
			GameActivity.texture = new BitmapTextureAtlas(GameActivity.MainActivityInstace.getTextureManager(),
					GameActivity.viewWidth, GameActivity.viewHeight);
			GameActivity.texture.addTextureAtlasSource(GameActivity.source, 0, 0);
			GameActivity.texture.load();
			GameActivity.textureRegion = (TextureRegion) TextureRegionFactory.createFromSource(
					GameActivity.texture, GameActivity.source, 0, 0);
		}
		
	}
	
	//calling for screen shot
	public static void takeScreenShot()
		{
		GameActivity.screenCapture = new ScreenCapture();
			GameActivity.mScene.attachChild(GameActivity.screenCapture);
			
			GameActivity.mScene.registerUpdateHandler(new TimerHandler((float)0.1, new ITimerCallback() 
			{
				@Override
				public void onTimePassed(TimerHandler pTimerHandler)
				{
					// TODO Auto-generated method stub
					
					//trigger the screen shot
					new ScreenShot();
					GameActivity.changeTexture = 1;
				} 
			}));
		}
}
