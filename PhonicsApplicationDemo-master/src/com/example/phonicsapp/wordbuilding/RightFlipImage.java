package com.example.phonicsapp.wordbuilding;

import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.region.ITextureRegion;

public class RightFlipImage {
	Sprite flipBook;
	
	public RightFlipImage(){
		
	}
	
	public void createFlipBook(ITextureRegion pTextureRegion){
		flipBook = new Sprite(BaseActivity.CAMERA_WIDTH + 230, BaseActivity.CAMERA_HEIGHT/2 - 120, pTextureRegion, BaseActivity.vobm);
		flipBook.setHeight(200f);
		flipBook.setWidth(200f);
		BaseActivity.mCurrentScene.attachChild(flipBook);
	}
	public void popUpFlipBook(Mouled mouled){		
		if(!mouled.mouled.hasParent()){
			BaseActivity.rightFlipImage.flipBook.detachChildren();
			BaseActivity.rightFlipImage.flipBook.attachChild(mouled.mouled);
			mouled.mouled.setPosition(20, 20);
			mouled.mouled.setHeight(140);
			mouled.mouled.setWidth(140);
			MoveModifier mf = new MoveModifier(0.1f, BaseActivity.CAMERA_WIDTH + 200, BaseActivity.CAMERA_WIDTH -180, flipBook.getY(), flipBook.getY());
			flipBook.registerEntityModifier(mf);
		}
	}
	public void popDownFlipBook(){
		MoveModifier mf = new MoveModifier(0.1f, flipBook.getX(), BaseActivity.CAMERA_WIDTH +200, flipBook.getY(), flipBook.getY());
		flipBook.registerEntityModifier(mf);
		flipBook.detachChildren();
	}
}
