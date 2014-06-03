package com.example.phonicsapp.animatedBook;

import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.DelayModifier;
import org.andengine.entity.modifier.IEntityModifier.IEntityModifierListener;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.SequenceEntityModifier;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.ITiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.modifier.IModifier;

import com.example.phonicsapp.R;
import com.example.phonicsapp.R.raw;
import com.example.phonicsapp.boxGame.BoxGameActivity;

import android.content.Context;
import android.content.Intent;


public class Parrot extends AnimatedSprite 
{
	AnimatedSprite parrotFlying;
	Context cont;
	VertexBufferObjectManager vobm;
	Sprite Next, mLetter;
	ITextureRegion LetterTextureReason;
	int sound_parrot,sound_letter;

	public Parrot(float pX, float pY, float pWidth, float pHeight, ITiledTextureRegion pTiledTextureRegion,
			VertexBufferObjectManager pVertexBufferObject, int audio_parrot, int audio , Context con, ITextureRegion pTextureRegion)
	{
		super(pX, pY, pWidth, pHeight, pTiledTextureRegion, pVertexBufferObject);
		vobm = pVertexBufferObject;
		cont = con;
		LetterTextureReason = pTextureRegion;
		mLetter = new Sprite(pX, pY, pTextureRegion, pVertexBufferObject);

		this.parrotFlying = new AnimatedSprite(pX, pY, pWidth, pHeight,
				pTiledTextureRegion, vobm)
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
			{
				switch (pSceneTouchEvent.getAction()) 
				{
				case TouchEvent.ACTION_DOWN:
				{
					TiledImage.playAudio(sound_parrot);
					break;
				}
				case TouchEvent.ACTION_MOVE:
				{
					break;
				}
				case TouchEvent.ACTION_UP: 
				{
					TiledImage.audioPlay = true;
					if(AnimatedBookActivity.ArrowTouchEnable){
						//TiledImage.playAudio(audio);
					}
					
					break;
				}
				default:
				{

				}
				}
				return false;
			}
		};
		parrotFlying.animate(new long[] {300,300,0,0}, 0, 3, true);
		//parrotFlying.setFlippedHorizontal(true);
//		parrotFlying.setHeight(AnimatedBookActivity.CAMERA_HEIGHT / 2);
//		parrotFlying.setWidth(AnimatedBookActivity.CAMERA_WIDTH / 4);
		mLetter.setHeight(80);
		mLetter.setWidth(80);
		mLetter.setZIndex(3);
		parrotFlying.setZIndex(5);
		AnimatedBookActivity.mMainScene.sortChildren();
		
		sound_parrot = audio_parrot;
		sound_letter = audio;
		loadMparrot();

	}

	void loadMparrot()
	{
		
		MoveModifier mMod = new MoveModifier(4.0f,AnimatedBookActivity.CAMERA_WIDTH +20, AnimatedBookActivity.CAMERA_WIDTH - 250,
				AnimatedBookActivity.CAMERA_HEIGHT / 10.55f,
				AnimatedBookActivity.CAMERA_HEIGHT / 10.55f);
		
		MoveModifier mModLetter = new MoveModifier(4.0f,AnimatedBookActivity.CAMERA_WIDTH + 75,AnimatedBookActivity.CAMERA_WIDTH - 185,
				AnimatedBookActivity.CAMERA_HEIGHT / 2.4f,AnimatedBookActivity.CAMERA_HEIGHT / 2.4f);
		 
		DelayModifier dMod = new DelayModifier(2.51f,
				new IEntityModifierListener()
		{
					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,IEntity arg1)
					{
											
					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0,IEntity arg1) 
					{
						
					}
				});
		DelayModifier dMod1 = new DelayModifier(2.5f,
				new IEntityModifierListener()
		{

					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,IEntity arg1)
					{
								
					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0,IEntity arg1) 
					{
						TiledImage.audioPlay = true;
						TiledImage.playAudio(sound_parrot);
					}
				});
		SequenceEntityModifier macch_sm = new SequenceEntityModifier(dMod1,mMod);
		SequenceEntityModifier mLetter_sm = new SequenceEntityModifier(dMod,mModLetter);
		
		parrotFlying.registerEntityModifier(macch_sm);
		mLetter.registerEntityModifier(mLetter_sm);
			
	}

	void createNextArrow(float pX, float pY, float pWidth, float pHeight,
			ITextureRegion pTextureRegion, int voice) 
	{
		this.Next = new Sprite(pX, pY, pTextureRegion, this.vobm)
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
			{
				switch (pSceneTouchEvent.getAction())
				{
					case TouchEvent.ACTION_DOWN: 
					{
						break;
					}
					case TouchEvent.ACTION_MOVE: 
					{
						break;
					}
					case TouchEvent.ACTION_UP:
					{
						AnimatedBookActivity.mMainScene.detachChildren();
						
						break;
					}
					default: 
					
				}
				return false;
			}
		};
	}
	
}
