package com.example.phonicsapp.boxGame;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import com.example.phonicsapp.R;

public class Letter extends Sprite 
{

	public Letter(float pX, float pY, float pWidth, float pHeight,
			ITextureRegion pTextureRegion, VertexBufferObjectManager VertexBufferObject) 
	{
		super(pX, pY, pWidth, pHeight, pTextureRegion, VertexBufferObject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
			final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
	{
		switch (pSceneTouchEvent.getAction())  
		{
		case TouchEvent.ACTION_DOWN:

			Functions.audioPlay = true;
			Functions.playAudio(BoxGameActivity.letterSound);

			break;
		}

		return true;
	}
};
