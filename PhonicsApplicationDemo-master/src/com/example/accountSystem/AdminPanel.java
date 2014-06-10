package com.example.accountSystem;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import android.content.Intent;

import com.example.phonicsapp.MenuPage;
import com.example.phonicsapp.HandWriting.banglaletterwriting.HandWritingMenu;

public class AdminPanel extends SimpleBaseGameActivity
{

	public static int CAMERA_WIDTH, CAMERA_HEIGHT;
	public Camera mCamera;
	public static Scene adminPanelScene;
	public static VertexBufferObjectManager vertexBufferObjectManager;
	public static AdminPanel AdminPanelInstance;

	// Admin Items
	public static BitmapTextureAtlas mBitmapTextureAtlasAdminPanelBackground;
	public static ITextureRegion mAdminPanelBackGroundTextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasAdminPanelShowHandWriting ;
	public static ITextureRegion  mAdminPanelTextureRegionAdminPanelShowHandWriting ;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasAdminPanelShowGames ;
	public static ITextureRegion  mAdminPanelTextureRegionAdminPanelShowGames ;
	
	public static Sprite adminPanelBackground, adminShowGames, adminShowHandwriting;
	
	public static boolean adminEnable = false;
	
	@Override
	public void onBackPressed()
	{
		finish();
		//startActivity(new Intent(getBaseContext(), GameMainPage.class));
	}
	
	@Override
	public EngineOptions onCreateEngineOptions() 
	{
		// TODO Auto-generated method stub
		AdminPanelInstance = this;
		CAMERA_HEIGHT = 454;
		CAMERA_WIDTH = 800;

		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);

		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,
				new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
	}

	@Override
	protected void onCreateResources() 
	{
		// TODO Auto-generated method stub

		// AdminPanel images
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("Assets/");
		mBitmapTextureAtlasAdminPanelBackground = new BitmapTextureAtlas(
				this.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
		mAdminPanelBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(mBitmapTextureAtlasAdminPanelBackground, this,
				"JungleBG.png", 0, 0, 1, 1);

		mBitmapTextureAtlasAdminPanelShowHandWriting = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200,
				TextureOptions.BILINEAR);
		mAdminPanelTextureRegionAdminPanelShowHandWriting= BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
				mBitmapTextureAtlasAdminPanelShowHandWriting, this, "lock.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasAdminPanelShowGames = new BitmapTextureAtlas(
				this.getTextureManager(), 200, 200,
				TextureOptions.BILINEAR);
		mAdminPanelTextureRegionAdminPanelShowGames= BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
				mBitmapTextureAtlasAdminPanelShowGames, this, "lock.png", 0, 0, 1, 1);
		
		mBitmapTextureAtlasAdminPanelBackground.load();
		mBitmapTextureAtlasAdminPanelShowGames.load();
		mBitmapTextureAtlasAdminPanelShowHandWriting.load();
		
	}

	@Override
	protected Scene onCreateScene()
	{
		// TODO Auto-generated method stub

		adminPanelScene = new Scene();
		
		adminPanelBackground = new Sprite(0, 0, mAdminPanelBackGroundTextureRegion, vertexBufferObjectManager);
		adminPanelBackground.setHeight(CAMERA_HEIGHT);
		adminPanelBackground.setWidth(CAMERA_WIDTH);
		adminPanelScene.attachChild(adminPanelBackground);
		
		adminShowGames = new Sprite(100, 100, mAdminPanelTextureRegionAdminPanelShowGames, vertexBufferObjectManager)
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
			{
				switch (pSceneTouchEvent.getAction()) 
				{
				case TouchEvent.ACTION_DOWN:
					
					adminEnable = true;
					finish();
					startActivity(new Intent(getBaseContext(), HandWritingMenu.class));
					
				break;
				case TouchEvent.ACTION_UP:
					

				break;
				case TouchEvent.ACTION_MOVE:
//					this.setPosition(pSceneTouchEvent.getX() - this.getWidth() / 2, 
//					pSceneTouchEvent.getY() - this.getHeight() / 2);

				break;
				}
				return true;
			}
		};
		adminShowGames.setScale((float) 0.5);
		adminPanelScene.registerTouchArea(adminShowGames);
		adminPanelScene.attachChild(adminShowGames);
		
		
		adminShowHandwriting = new Sprite(400, 100, mAdminPanelTextureRegionAdminPanelShowHandWriting, vertexBufferObjectManager)
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
			{
				switch (pSceneTouchEvent.getAction()) 
				{
				case TouchEvent.ACTION_DOWN:
						
					adminEnable = true;
					finish();
					startActivity(new Intent(getBaseContext(), MenuPage.class));
					
				break;
				case TouchEvent.ACTION_UP:
					

				break;
				case TouchEvent.ACTION_MOVE:
//					this.setPosition(pSceneTouchEvent.getX() - this.getWidth() / 2, 
//					pSceneTouchEvent.getY() - this.getHeight() / 2);

				break;
				}
				return true;
			}
		};
		adminShowHandwriting.setScale((float) 0.4);
		adminPanelScene.registerTouchArea(adminShowHandwriting);
		adminPanelScene.attachChild(adminShowHandwriting);

		return adminPanelScene;
	}
}
