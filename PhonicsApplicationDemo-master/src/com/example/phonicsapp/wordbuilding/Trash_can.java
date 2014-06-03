package com.example.phonicsapp.wordbuilding;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.ScaleModifier;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.region.ITextureRegion;

import android.util.Log;

public class Trash_can {

	private static final String TAG = "Trash Can";
	Sprite trashCanOpen,trashCanClose;
	Marker marker;
	public Trash_can(){
		
	}
	public void createTrashCan(ITextureRegion pTextureRegion, ITextureRegion pTextureRegion2){
		trashCanOpen = new Sprite(BaseActivity.CAMERA_WIDTH - 230, BaseActivity.CAMERA_HEIGHT - 150, pTextureRegion, BaseActivity.vobm);
		BaseActivity.mCurrentScene.attachChild(trashCanOpen);
		trashCanClose = new Sprite(BaseActivity.CAMERA_WIDTH - 230, BaseActivity.CAMERA_HEIGHT - 150, pTextureRegion2, BaseActivity.vobm);
		BaseActivity.mCurrentScene.attachChild(trashCanClose);
		trashCanOpen.setVisible(false);
	}
	
	public void removeToTrash(Marker m){
		Marker mm = m.mostRight;
		if(mm != null){
			if(isColliedWithTrash(mm)){
				
				while(mm != null){
				removeOneToTrash(mm);
				if(mm.bottom != null){
					removeOneToTrash(mm.bottom); 
				}
				
				mm = mm.left;
				}
				Sound.mediaPlayer.reset();
			}
		}
		
	}
	public void removeOneToTrash(Marker m){
		if(true){ 
			marker = m;
			BaseActivity.markers.remove(m);
			ScaleModifier sm = new ScaleModifier(0.3f , 1, 0);
			MoveModifier mf = new MoveModifier(0.1f, marker.letter.getX(), trashCanOpen.getX(), marker.letter.getY(), trashCanOpen.getY());
			m.letter.registerEntityModifier(mf);
			m.letter.registerEntityModifier(sm);
			//ParallelModifier<> pm = new ParallelModifier<>();
			
			BaseActivity.mCurrentScene.registerUpdateHandler(new TimerHandler(0.5f, new ITimerCallback() {
				
				@Override
				public void onTimePassed(TimerHandler arg0) { 
					BaseActivity.mCurrentScene.detachChild(marker.letter);
					trashCanOpen.setVisible(false);
					trashCanClose.setVisible(true);
					BaseActivity.rightFlipImage.popDownFlipBook();
				}
			}));	
		}
	}
	
	boolean isColliedWithTrash(Marker m){
		
		//while(m!=null){
			if(m.letter.collidesWith(trashCanOpen)){ 
				return true;
			}
			//m = m.left;
		//}
		return false;
	}
	void openTrashCan(Marker m){
		if(m.mostRight != null){
			m = m.mostRight;
			//Log.d(TAG , "MostRight "+ m.letter.getUserData());
		}
		if(isColliedWithTrash(m)){
			trashCanOpen.setVisible(true);
			trashCanClose.setVisible(false);
		}
		/*else if(m.mostRight!= null){
			if(isColliedWithTrash(m.mostRight)){
				trashCanOpen.setVisible(true);
				trashCanClose.setVisible(false);
			}
		}*/
		else{
			trashCanOpen.setVisible(false);
			trashCanClose.setVisible(true);
		}
	}
	
}
