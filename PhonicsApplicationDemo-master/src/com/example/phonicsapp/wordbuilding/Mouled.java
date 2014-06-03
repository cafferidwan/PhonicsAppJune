package com.example.phonicsapp.wordbuilding;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import android.content.Context;
import android.util.Log;

public class Mouled {

	Sprite mouled; 
	Sprite mouledBW; 
	int sound;
	boolean isRecognized;
	
	public Mouled(Mouled m){
		mouled = m.mouled;
		mouledBW = m.mouledBW;
	}
	
	public Mouled(float pX, float pY, float pWidth, float pHeight,ITextureRegion pTextureRegion,ITextureRegion pTextureRegion2,
			VertexBufferObjectManager pSpriteVertexBufferObject, Context cont, int mouledeSound) {
		sound = mouledeSound;
		
		mouled = new Sprite(pX, pY, pTextureRegion, pSpriteVertexBufferObject){
			private String TAG = "Module";

			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,	final float pTouchAreaLocalX, final float pTouchAreaLocalY) {
				
				switch (pSceneTouchEvent.getAction()) {
					case TouchEvent.ACTION_DOWN: {
						// play audio
						Sound.playSingleSound3(sound,true);
						for(int i=0; i<BaseActivity.allMarkers.size();i++){
							Log.d(TAG , Integer.toString(i)+" : "+ BaseActivity.allMarkers.get(i).letter.getUserData());
						}
						break;
					}
					case TouchEvent.ACTION_MOVE: {
						break;
					}
					case TouchEvent.ACTION_UP: {
						break;
					}
				}
				return false;
			}
		};
		mouledBW = new Sprite(pX, pY, pTextureRegion2, pSpriteVertexBufferObject);
		mouled.setPosition(pX, pY);
		mouled.setZIndex(0);
		mouled.setHeight(pHeight);
		mouled.setWidth(pWidth);
		mouledBW.setZIndex(1);
		mouledBW.setHeight(pHeight);
		mouledBW.setWidth(pWidth);
		BaseActivity.mCurrentScene.sortChildren(); 
	}
	public void appaire(){
		BaseActivity.mCurrentScene.registerTouchArea(mouled);
		BaseActivity.mCurrentScene.attachChild(mouled);
	}
	public void disAppaire(){
		BaseActivity.mCurrentScene.unregisterTouchArea(mouled);
		BaseActivity.mCurrentScene.detachChild(mouled);
	}
	
}
