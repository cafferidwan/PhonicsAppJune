package com.example.phonicsapp.wordbuilding;

import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

import android.content.Context;

public class VouleMarker extends Marker {

	public VouleMarker(float pX, float pY, float pWidth, float pHeight,ITextureRegion pTextureRegion,
			VertexBufferObjectManager pSpriteVertexBufferObject, Context cont,
			int letterSound, boolean jl, boolean jt, boolean jr, boolean jb) {
		super(pX, pY, pWidth, pHeight, pTextureRegion, pSpriteVertexBufferObject, cont,
				letterSound, jl, jt, jr, jb);
		// TODO Auto-generated constructor stub
	}

}

