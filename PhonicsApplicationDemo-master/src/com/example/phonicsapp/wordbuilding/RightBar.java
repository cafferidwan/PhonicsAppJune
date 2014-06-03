package com.example.phonicsapp.wordbuilding;

import java.util.ArrayList;

import org.andengine.entity.modifier.FadeOutModifier;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.ParallelEntityModifier;
import org.andengine.entity.modifier.ScaleModifier;
import org.andengine.entity.primitive.Rectangle;
import org.andengine.entity.scene.ITouchArea.ITouchAreaMatcher;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.util.color.Color;

import com.example.phonicsapp.R;



public class RightBar {
	Sprite topPart,lowarPart,book ;
	Rectangle rectAngle;
	Parrot parrot;
	ITextureRegion pCrossButton;
	
	public RightBar (TextureRegion pTextureRegion){
		topPart = new Sprite(-333, -333, pTextureRegion, BaseActivity.vobm);
		lowarPart = new Sprite(-333, -333, pTextureRegion, BaseActivity.vobm);
	}
	public RightBar (){
		
	}
	public void addRightBar(){
		rectAngle = new Rectangle(BaseActivity.CAMERA_WIDTH-130,10, 130, BaseActivity.CAMERA_HEIGHT-20, BaseActivity.vobm);
		rectAngle.setAlpha(0.1f);
		rectAngle.setColor(0.0f,0.0f,0.0f);
		BaseActivity.mCurrentScene.attachChild(rectAngle);
	}
	public void createTopImage(ITextureRegion pTextureRegion){
		topPart = new Sprite(10, 10, pTextureRegion, BaseActivity.vobm);
		//topPart.setHeight(110f); 
		//topPart.setWidth(110f);
		rectAngle.attachChild(topPart);
	}
	public void createParrot(TiledTextureRegion pTextureRegion ){
		parrot = new Parrot(-15, 0, 150, 150, pTextureRegion,BaseActivity.vobm);
		rectAngle.attachChild(parrot.parrot);
		//rectAngle.attachChild(topPart);
	}

	public void createLowerImage(ITextureRegion pTextureRegion) {
		lowarPart = new Sprite(10, rectAngle.getHeight() - 120, pTextureRegion,	BaseActivity.vobm) {
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) {

				switch (pSceneTouchEvent.getAction()) {
				case TouchEvent.ACTION_DOWN: {
					popUpBook();
				}
				case TouchEvent.ACTION_MOVE: {

				}
				case TouchEvent.ACTION_UP: {
					
				//	popDownBook();
				}
				}

				return false;

			}
		};
		BaseActivity.mCurrentScene.registerTouchArea(lowarPart);
		lowarPart.setHeight(110f);
		lowarPart.setWidth(110f);
		rectAngle.attachChild(lowarPart);
		
		
	}
	public void createBook(ITextureRegion pTextureRegion, ITextureRegion pTextureRegion2){
		pCrossButton = pTextureRegion2;
		book = new Sprite(-110,120, pTextureRegion, BaseActivity.vobm);
		book.setHeight(BaseActivity.CAMERA_HEIGHT + 20);
		book.setWidth(BaseActivity.CAMERA_WIDTH +20);
		book.setZIndex(500);
		
		
		
		
	}
	void popUpBook(){
		BaseActivity.bookAlive = true;
		BaseActivity.rightFlipImage.flipBook.detachChildren();
		BaseActivity.rightFlipImage.popDownFlipBook();
		if(!book.hasParent()){
			BaseActivity.mCurrentScene.attachChild(book);
			book.setPosition(BaseActivity.CAMERA_WIDTH + 10 ,BaseActivity.CAMERA_HEIGHT +10);
			//book.registerEntityModifier(new ScaleModifier(0.4f, 0, 1));
			book.registerEntityModifier(new ParallelEntityModifier(new ScaleModifier(0.3f, 0, 1), new MoveModifier(0.3f, BaseActivity.CAMERA_WIDTH -80, -10, BaseActivity.CAMERA_HEIGHT-80, -10)));
			//book.setPosition(-10.0f, -10.0f);
			
			Sprite sp = new Sprite(book.getWidth()-70, 10, 15, 15, pCrossButton, BaseActivity.vobm){
				@Override
				public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
						final float pTouchAreaLocalX, final float pTouchAreaLocalY) {

					switch (pSceneTouchEvent.getAction()) {
						case TouchEvent.ACTION_DOWN: {
							popDownBook();
						}
						case TouchEvent.ACTION_MOVE: {
		
						}
						case TouchEvent.ACTION_UP: {
							
						//	popDownBook();
						}
					}
	 
					return false;

				}
			};
			BaseActivity.mCurrentScene.registerTouchArea(sp);
			book.attachChild(sp);
			sp.setWidth(60);
			sp.setHeight(60);
			
			addPicInBook();
		}
	}
	void popDownBook(){
		if(book.hasParent()){
			
			BaseActivity.bookAlive = false;
			//book.registerEntityModifier(new ParallelEntityModifier(new ScaleModifier(0.2f, 1, 0), new MoveModifier(0.2f, BaseActivity.CAMERA_WIDTH -80, -10, BaseActivity.CAMERA_HEIGHT-80, -10)));
			BaseActivity.mCurrentScene.detachChild(book);
			book.setPosition(-4220.0f, -4440.0f);
			
 			for(int i=0; i<BaseActivity.mouled.size();i++){
 				BaseActivity.mouled.get(i).mouled.setPosition(-1111, -1111);
 			}
			
			book.detachChildren();
		}
	}
	
	int addPicInBook(){
		int x=45,y=50,c = -1;			
		
		for(int i = 0; i<2; i++){
			//BaseActivity.mouled.get(6).isRecognized = false;
			for(int j = 0; j<4; j++){
				c++;
				if(c>= BaseActivity.mouled.size()){
					return 0;
				}
				book.attachChild(BaseActivity.mouled.get(c).mouled); 
				
				//BaseActivity.mCurrentScene.registerTouchArea(BaseActivity.mouled.get(c).mouled); 
				if(!BaseActivity.mouled.get(c).isRecognized){
					book.attachChild(BaseActivity.mouled.get(c).mouledBW);
					BaseActivity.mouled.get(c).mouledBW.setPosition(x,y);
					BaseActivity.mCurrentScene.registerTouchArea(BaseActivity.mouled.get(c).mouled);
				}				
				BaseActivity.mouled.get(c).mouled.setPosition(x,y);				
				x+=BaseActivity.mouled.get(c).mouled.getWidth()+ 40; 				
			}
			x = 45;
			y += y+=BaseActivity.mouled.get(i).mouled.getHeight();
		}
		return 1;
	}
	/*ArrayList<Integer> bookPicAliveList(){
		BaseActivity.bookPicAliveList.add(false);	
		
		return null;
		
	}*/
	void mouldAddingAnimationToBook(Mouled m){
		Mouled tempMpoldMouled = new Mouled(m.mouled.getX(),m.mouled.getY(),m.mouled.getWidth(),m.mouled.getHeight(),m.mouled.getTextureRegion(),m.mouled.getTextureRegion(),BaseActivity.vobm,BaseActivity.context,1);
		BaseActivity.rightFlipImage.flipBook.attachChild(tempMpoldMouled.mouled);
		tempMpoldMouled.mouled.setHeight(200);
		ScaleModifier sm = new ScaleModifier(0.5f , 1, 0.4f);
		MoveModifier mf = new MoveModifier(0.3f, tempMpoldMouled.mouled.getX(), tempMpoldMouled.mouled.getX() + 20, tempMpoldMouled.mouled.getY(), tempMpoldMouled.mouled.getY() + 150);
		FadeOutModifier fo = new FadeOutModifier(1.2f);
		tempMpoldMouled.mouled.registerEntityModifier(sm);
		tempMpoldMouled.mouled.registerEntityModifier(mf);
		tempMpoldMouled.mouled.registerEntityModifier(fo);
		Sound.playSingleSound2(R.raw.letter_complete_sound);
	}
}
