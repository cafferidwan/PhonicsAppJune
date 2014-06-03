package com.example.phonicsapp.wordbuilding;

import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import android.util.Log;

public class Parrot {
	protected static final String TAG = "Parrpt";
	AnimatedSprite parrot;
	
	public Parrot(int pX, int pY, int pWidth, int pHeight,TiledTextureRegion pTiledTextureRegion,VertexBufferObjectManager vertexBufferObjectManager) {
		// TODO Auto-generated constructor stub
		parrot = new AnimatedSprite(pX, pY, pTiledTextureRegion, vertexBufferObjectManager){
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) {
				// Log.d("TitledImage", "Before ");
				switch (pSceneTouchEvent.getAction()) {
				case TouchEvent.ACTION_DOWN: {

					Log.d(TAG, "Parrpt " + parrot.getZIndex());
					break;
					}
					case TouchEvent.ACTION_MOVE: {
						
						break;
					}
					case TouchEvent.ACTION_UP: {
						
						break;
					}
					default: {
		
					}
				}
				return false;
			}
		};
		//BaseActivity.mCurrentScene.registerTouchArea(parrot);
		//BaseActivity.mCurrentScene.attachChild(parrot);
		parrot.setZIndex(0);
		parrot.setWidth(pWidth);
		parrot.setHeight(pHeight);
		parrot.setFlippedHorizontal(true);
		parrot.animate(new long[]{300,300,0,0}, 0, 3, true);
		
	}

}
