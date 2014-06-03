package com.example.phonicsapp.wordbuilding;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.modifier.FadeOutModifier;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.color.Color;

import android.content.Context;
import android.util.Log;

public class Marker {

	Sprite letter;
	Marker left, right,bottom,up, markerSelf, mostLeft, mostRight;
	int sound, leftValue, rightValue, bottomtValue, upValue,count;
	boolean isSingle = true, mostLeftRight, isMooving,joinLeft,joinTop,joinRight,joinBottom;
	public static String TAG = "Marker ";

	float px = 5000, py = 5000;

	public Marker(float pX, float pY, float pWidth, float pHeight,ITextureRegion pTextureRegion,VertexBufferObjectManager pSpriteVertexBufferObject, Context cont,int letterSound,boolean jl, boolean jt,boolean jr,boolean jb) {

		sound = letterSound;
		left = markerSelf;
		right = null;
		bottom = null;
		up = null;
		leftValue = -1;
		rightValue = 1;
		bottomtValue = -1;
		upValue = 1;
		
		joinLeft = jl;
		joinTop = jt;
		joinRight = jr;
		joinBottom = jb;
		

		letter = new Sprite(pX, pY, pTextureRegion, pSpriteVertexBufferObject) {
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) {

				switch (pSceneTouchEvent.getAction()) {
				case TouchEvent.ACTION_DOWN: {
					if(!BaseActivity.bookAlive){
					Words.touched = true;
					Seizure.cuttingOn = false;
					px = pSceneTouchEvent.getX();
					py = pSceneTouchEvent.getY();

					mostLeft = Scheming2.getLeftLastObject(markerSelf);
					mostRight = Scheming2.getRightLastObject(markerSelf);
					if(markerSelf.up !=null){
						markerSelf.up.mostLeft = Scheming2.getLeftLastObject(markerSelf.up.markerSelf);
						markerSelf.up.mostRight = Scheming2.getRightLastObject(markerSelf.up.markerSelf);
					}
					Marker temp = markerSelf.mostLeft;
					while(temp != null){
						Log.d(TAG ,"index: " + BaseActivity.allMarkers.indexOf(temp) +" "+  temp.letter.getUserData() + ",# ");
						temp = temp.right;
					}
					// play audio
					Sound.playSingleSound(sound);
					if(Words.touched && Scheming2.getBlockSize(mostLeft)>1){
						Words.chk_sequence(mostLeft);
						Words.touched = false;
					}
					Scheming2.manageZindez(true, mostLeft);
					if (markerSelf.isSingle){
						BaseActivity.rightFlipImage.popDownFlipBook();
					}
					}
					break;
				}
				case TouchEvent.ACTION_MOVE: {
					if(!BaseActivity.bookAlive){
					if (px == 5000 && py == 5000) {
						px = 0;// pSceneTouchEvent.getX();
						py = 0;// pSceneTouchEvent.getY();
					}
					BaseActivity.FinishMethodCallFlag ++;
					if(BaseActivity.FinishMethodCallFlag == 10){
						BaseActivity.FinishMethodCallFlag = 0;
						Scheming2.chk(markerSelf.mostLeft);
						//Scheming2.magnaticJoin(markerSelf);
						//Scheming2.timer1();
						BaseActivity.trashCan.openTrashCan(markerSelf);
						
					}
					
					//Scheming2.checkBoundary(markerSelf.mostLeft);
					if (markerSelf.isSingle) { 	
						if(letter.getY() + 5 <= -5 ){
							letter.setPosition(letter.getX(), letter.getY()+ 1);
						}
						else{
							letter.setPosition(pSceneTouchEvent.getX() - letter.getWidth() / 2,pSceneTouchEvent.getY() - letter.getHeight()	/ 2);
						}						
						
					} else {
						if(pSceneTouchEvent.getX()+(Scheming2.getRightLastObject(markerSelf).letter.getX()-letter.getX()) + Scheming2.getRightLastObject(markerSelf).letter.getWidth() < BaseActivity.CAMERA_WIDTH-95
								){
						float previousX = letter.getX(); 
						float previousY = letter.getY();

						letter.setPosition(pSceneTouchEvent.getX() - letter.getWidth() / 2,pSceneTouchEvent.getY() - letter.getHeight()/ 2);
						float afterX = letter.getX();
						float afterY = letter.getY();
						
						Scheming2.moveBlock(previousX, previousY, afterX, afterY, markerSelf);
						}
					}

					/*
					 * px = pSceneTouchEvent.getX();
					 * py = pSceneTouchEvent.getY();
					 */
					// }
					}
					break;
				}
				case TouchEvent.ACTION_UP: {
					if(!BaseActivity.bookAlive){
						BaseActivity.chk = false;
						Seizure.cuttingOn = true;
						Words.touched = false;
						//Scheming.setZindexForBlock(mostLeft, 1);
						Log.d(TAG, " Touched Up " + letter.getUserData());
						Log.d(TAG, " "); 
						Scheming2.manageZindez(false, mostLeft);
						BaseActivity.trashCan.removeToTrash(markerSelf);
						//BaseActivity.rightFlipImage.popDownFlipBook();
						BaseActivity.trashCan.openTrashCan(markerSelf);
					}
					break;
				}
				}
				return true;
			}
		};
		//BaseActivity.mCurrentScene.registerTouchArea(letter);
		//BaseActivity.mCurrentScene.attachChild(letter);
		float w = (letter.getWidth()/letter.getHeight())*pHeight;
		letter.setHeight(pHeight);
		letter.setWidth(w);
		letter.setZIndex(3);
	}
	public void disAppaire(){
		FadeOutModifier fOutM = new FadeOutModifier(2.5f);
		letter.registerEntityModifier(fOutM);
		markerSelf.left = null;
		markerSelf.right = null;
				
		BaseActivity.mCurrentScene.registerUpdateHandler(new TimerHandler(3.0f, new ITimerCallback() {
			
			@Override
			public void onTimePassed(TimerHandler arg0) {
				BaseActivity.mCurrentScene.unregisterTouchArea(letter);
				BaseActivity.mCurrentScene.detachChild(letter);
			}
		}));
	}
	


}
