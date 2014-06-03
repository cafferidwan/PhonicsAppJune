package com.example.phonicsapp.wordbuilding;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import android.content.Context;

public class ScrollBar {

	protected static final String TAG = null;
	Sprite scrollLetter;
	Sprite temp;
	float px=5000,py=5000;
	float yy ;
	boolean isTouchDown;
	String name;
	public ScrollBar(float pX, float pY, float pWidth, float pHeight,ITextureRegion pTextureRegion,
			VertexBufferObjectManager pSpriteVertexBufferObject, Context cont, String n) {
		name = n;
		scrollLetter = new Sprite(pX, pY, pTextureRegion, pSpriteVertexBufferObject){ 
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,	final float pTouchAreaLocalX, final float pTouchAreaLocalY) {
				if(!BaseActivity.bookAlive){
				switch (pSceneTouchEvent.getAction()) {
				
					case TouchEvent.ACTION_DOWN: {
						if(px ==5000 && py == 5000 ){ 
							px= pSceneTouchEvent.getX();
							py = pSceneTouchEvent.getY();
						} 
						isTouchDown = true;
						//scrollLetter.setHeight(60+10);
						//scrollLetter.setWidth(60+10);
						scrollLetter.setZIndex(100);
						//scrollLetter.setScale(1.01f);
						
						BaseActivity.mCurrentScene.sortChildren();
												
						//Log.d(TAG, " Touched down " + scrollLetter.getUserData());
						break;
					}
					case TouchEvent.ACTION_MOVE: {
						if(px ==5000 && py == 5000 ){
							px= pSceneTouchEvent.getX();
							py = pSceneTouchEvent.getY();
						}
						yy = scrollLetter.getY();
						//scrollLetter.setPosition((scrollLetter.getX()+(pSceneTouchEvent.getX()-px)),(scrollLetter.getY() + (pSceneTouchEvent.getY()-py)));
						if(scrollLetter.getX()<90){
							//scrollLetter.setPosition(pSceneTouchEvent.getX()-scrollLetter.getX()/2,pSceneTouchEvent.getY() - scrollLetter.getHeight()/ 2);
							if(pSceneTouchEvent.getY() < BaseActivity.CAMERA_HEIGHT -50 && pSceneTouchEvent.getY() > 50){
								scrollLetter.setPosition((scrollLetter.getX()+(pSceneTouchEvent.getX()-px)),(scrollLetter.getY() + (pSceneTouchEvent.getY()-py)));
								moveScroll(scrollLetter,yy);
							}
						}
						else{
							//scrollLetter.setPosition(pSceneTouchEvent.getX()-scrollLetter.getX()/2,scrollLetter.getY());
							scrollLetter.setPosition((scrollLetter.getX()+(pSceneTouchEvent.getX()-px)),(scrollLetter.getY() + (pSceneTouchEvent.getY()-py))); 
							
						}
						
						if(scrollLetter.getX()>90){
							//BaseActivity.mCurrentScene.unregisterTouchArea(scrollLetter);
							longPress();

							scrollLetter.setPosition(10, scrollLetter.getY());
							isTouchDown = false;
							//BaseActivity.mCurrentScene.registerTouchArea(scrollLetter);
							//BaseActivity.mCurrentScene.registerTouchArea(scrollLetter);
							resetFaded(scrollLetter);
							px = 5000;
							py = 5000;
							return false;
						}						
						px= pSceneTouchEvent.getX();
						py = pSceneTouchEvent.getY();						
						break;
					}
					case TouchEvent.ACTION_UP: {
						px = 5000;
						py = 5000;
						isTouchDown = false;
						scrollLetter.setPosition(10, scrollLetter.getY());
						resetFaded(scrollLetter);
						
						break;
					}
				}
			}
				return true;
			}
		};
		BaseActivity.mCurrentScene.registerTouchArea(scrollLetter);
		BaseActivity.mCurrentScene.attachChild(scrollLetter);
		scrollLetter.setHeight(pHeight);
		scrollLetter.setWidth(pWidth);
		scrollLetter.setUserData(n);
	}
	
	void moveScroll(Sprite sp,float pY){
		float nY = sp.getY() - pY;
			for(int i=0;i<BaseActivity.Scrollmarkers.size();i++){
				if(!BaseActivity.Scrollmarkers.get(i).scrollLetter.equals(sp)){
					BaseActivity.Scrollmarkers.get(i).scrollLetter.setPosition(BaseActivity.Scrollmarkers.get(i).scrollLetter.getX(), BaseActivity.Scrollmarkers.get(i).scrollLetter.getY()+nY);
					BaseActivity.Scrollmarkers.get(i).scrollLetter.setAlpha(0.60f);
				}
			}
	}
	void resetFaded(Sprite sp){
		for(int i=0;i<BaseActivity.Scrollmarkers.size();i++){
			if(!BaseActivity.Scrollmarkers.get(i).scrollLetter.equals(sp)){
				BaseActivity.Scrollmarkers.get(i).scrollLetter.setAlpha(1.0f);
			}
		}
	}
	void longPress(){
		if(isTouchDown){
			//Marker mk = 
			//BaseActivity.NewMarker(BaseActivity.textureReason.get(1), scrollLetter.getX(), scrollLetter.getY());
			BaseActivity.createLetterFromScroll(scrollLetter.getUserData().toString(),scrollLetter.getX(),scrollLetter.getY());
			//BaseActivity.mCurrentScene.unregisterTouchArea(BaseActivity.markers.get(BaseActivity.markers.size()-1).letter);
			isTouchDown = false;
		}
		/*BaseActivity.mCurrentScene.registerUpdateHandler(new TimerHandler(0.05f, new ITimerCallback() {
			
			@Override
			public void onTimePassed(TimerHandler arg0) {
			
			}
		}));*/
	}
}
