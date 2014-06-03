package com.example.phonicsapp.wordbuilding;

import java.util.ArrayList;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.MoveXModifier;
import org.andengine.entity.modifier.MoveYModifier;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import android.content.Context;
import android.util.Log;

public class Seizure{

	protected static final String TAG = "Seizure";
	public static boolean cuttingOn = true;

	Sprite seizure;
	Timersz timer;
	float timerInterval = 100000;
	
	float px=5000,py=5000, initialX ,initialY ;
	
	public Seizure(float pX, float pY, float pWidth, float pHeight,ITextureRegion pTextureRegion,
			VertexBufferObjectManager pSpriteVertexBufferObject, Context cont, int seizureSound) {
		initialX = pX;
		initialY = pY;
		seizure = new Sprite(pX, pY, pTextureRegion, pSpriteVertexBufferObject){
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,	final float pTouchAreaLocalX, final float pTouchAreaLocalY) {
				
				switch (pSceneTouchEvent.getAction()) {
					case TouchEvent.ACTION_DOWN: {
						px= pSceneTouchEvent.getX();
						py = pSceneTouchEvent.getY();
												
						//play audio
						Log.d(TAG, " Touched down " + seizure.getUserData());
						//BaseActivity.rightFlipImage.popUpFlipBook();
						break;
					}
					case TouchEvent.ACTION_MOVE: {
						if(px ==5000 && py == 5000 ){
							px= pSceneTouchEvent.getX();
							py = pSceneTouchEvent.getY();
						} 
						seizure.setPosition((this.getX()+(pSceneTouchEvent.getX()-px)),(this.getY() + (pSceneTouchEvent.getY()-py)));
						
						if(Seizure.cuttingOn == true){
						CollutionDetection();
						}
					
						
						px= pSceneTouchEvent.getX();
						py = pSceneTouchEvent.getY();						
						break;
					}
					case TouchEvent.ACTION_UP: {
						px = 5000;
						py = 5000;
						//Log.d(TAG, " Touched Up " + seizure.getUserData());
						//Log.d(TAG, " ");
						MoveModifier mf = new MoveModifier(0.5f, seizure.getX(),initialX, seizure.getY(), initialY);
						seizure.registerEntityModifier(mf);
						BaseActivity.rightFlipImage.popDownFlipBook();
						break;
					}
				}
				return true;
			}
		};
		BaseActivity.mCurrentScene.registerTouchArea(seizure);
		BaseActivity.mCurrentScene.attachChild(seizure);
		//seizure.setPosition(initialX, initialY);
		seizure.setZIndex(100);
		float w = (seizure.getWidth()/seizure.getHeight())*pHeight;
		//seizure.setHeight(pHeight);
		//seizure.setWidth(w);
		
		BaseActivity.mCurrentScene.sortChildren();
		//startSzTimer();	
	}
	
	ArrayList<Marker> CollutionDetection() {
		ArrayList<Marker> markersTemp = new ArrayList<Marker>();
		for (int i = 0; i < BaseActivity.markers.size(); i++) {
			if (seizure.collidesWith(BaseActivity.markers.get(i).letter)) {
				if (markersTemp.size() == 0) {
					markersTemp.add(BaseActivity.markers.get(i));
				}
				if (markersTemp.get(0).left != null) {
					if (markersTemp.get(0).left.equals(BaseActivity.markers.get(i))) {
						markersTemp.add(BaseActivity.markers.get(i));
					}
				}
				if (markersTemp.get(0).right != null) {
					if (markersTemp.get(0).right.equals(BaseActivity.markers.get(i))) {
						markersTemp.add(BaseActivity.markers.get(i));
					} 
				}
				if (markersTemp.get(0).bottom != null) {
					if (markersTemp.get(0).bottom.equals(BaseActivity.markers.get(i))){
						markersTemp.add(BaseActivity.markers.get(i));
					}
				}
				if (markersTemp.get(0).up != null) {
					if (markersTemp.get(0).up.equals(BaseActivity.markers.get(i))) {
						markersTemp.add(BaseActivity.markers.get(i));
					}
				}
			}
			
			if (markersTemp.size() == 2) {
				// if(markers.get(0).right.equals(markers.get(1).left) ||
				// markers.get(0).left.equals(markers.get(1).right)){
				smoothSplit(markersTemp.get(0), markersTemp.get(1));
				Scheming2.magnaticJoinRight(markersTemp.get(0));
				Scheming2.magnaticJoinRight(markersTemp.get(1));
				markersTemp.clear();
				return markersTemp;
				// }
			}
		}
		return null;
	}
	boolean smoothSplit(Marker m1, Marker m2){
		Marker t1 = null, t2 = null ,t3 = null, t4 = null;
		boolean b = true;
		if(m1.letter.getX() < m2.letter.getX() && m1.right != null){
			/*if(!m1.right.equals(m2)) {
				return false;
			}*/
			Scheming2.updateLeftRightMarker(m1.right);
			m1.right = null; 
			m2.left = null; 
			m1.rightValue = 1;
			m2.leftValue = -1;
			
			t1=m1;
			t2=m2;
		}
		else if (m1.letter.getX() > m2.letter.getX() && m1.left != null){
			/*if(!m1.left.equals(m2)) {
				return false;
			}*/
			m1.left = null;
			Scheming2.updateLeftRightMarker(m1);
			m2.right = null; 
			m1.leftValue = -1;
			m2. rightValue= 1;
			
			t1 = m2;
			t2 = m1;
		}		
		else if(m1.letter.getY() < m2.letter.getY() && m1.bottom != null){
			m1.bottom = null;
			m2.up = null;
			Scheming2.updateLeftRightMarker(m2);
			m1.bottomtValue = -1;
			m2.upValue = 1;
			
			t3 = m1;
			t4 = m2;
		}
		//Scheming2.updateLeftRightMarker(m1);
		Scheming2.updateLeftRightMarker(m2);
		
		while(t1 != null){
			MoveXModifier mMfs1 = new MoveXModifier(.5f, t1.letter.getX(),t1.letter.getX() - 20);
			t1.letter.registerEntityModifier(mMfs1);
			if(t1.bottom != null){
				MoveXModifier mMfs2 = new MoveXModifier(.5f, t1.bottom.letter.getX(),t1.bottom.letter.getX() - 20);
				t1.bottom.letter.registerEntityModifier(mMfs2);
			}
			t1= t1.left;
		}
		while(t2 != null){
			MoveXModifier mMfs2 = new MoveXModifier(.5f, t2.letter.getX(),t2.letter.getX() + 20);
			t2.letter.registerEntityModifier(mMfs2);
			if(t2.bottom != null){
				MoveXModifier mMfs3 = new MoveXModifier(.5f, t2.bottom.letter.getX(),t2.bottom.letter.getX() + 20);
				t2.bottom.letter.registerEntityModifier(mMfs3);
			}
			t2= t2.right;
		}
		
		while(t3 != null){
			if(b){
				t3 = t3.mostLeft;
				b = false;
			}
			MoveYModifier mMfs1 = new MoveYModifier(.5f, t3.letter.getY(),t3.letter.getY() - 20);
			t3.letter.registerEntityModifier(mMfs1);
			/*if(t3.bottom != null){
				MoveYModifier mMfs2 = new MoveYModifier(.5f, t3.bottom.letter.getY(),t3.bottom.letter.getY() - 20);
				t3.bottom.letter.registerEntityModifier(mMfs2);
			}*/
			t3= t3.right;
		}
		while(t4 != null){
			MoveYModifier mMfs2 = new MoveYModifier(.5f, t4.letter.getY(),t4.letter.getY() + 20);
			t4.letter.registerEntityModifier(mMfs2);
			/*if(t4.bottom != null){
				MoveYModifier mMfs3 = new MoveYModifier(.5f, t4.bottom.letter.getY(),t4.bottom.letter.getY() + 20);
				t4.bottom.letter.registerEntityModifier(mMfs3);
			}*/
			t4= t4.bottom;
		}
		//Scheming2.updateLeftRightMarker(mostLeftMarker);
		return false;
		
		//MainActivity.SpriteContainer.get(i).sprite1.registerEntityModifier(mMfs1);
	}
	public void startSzTimer(){
		BaseActivity.mCurrentScene.registerUpdateHandler(new TimerHandler(0.02f, true, new ITimerCallback() {
			
			@Override
			public void onTimePassed(TimerHandler arg0) {
				// TODO Auto-generated method stub
				if(true){
					MoveModifier mf = new MoveModifier(0.5f, seizure.getX(),initialX, seizure.getY(), initialY);
					seizure.registerEntityModifier(mf);
				}
				
			}
		}));
	}
}
