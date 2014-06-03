package com.example.phonicsapp.animatedBook;

import java.util.Timer;
import java.util.TimerTask;

import org.andengine.entity.Entity;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.DelayModifier;
import org.andengine.entity.modifier.FadeInModifier;
import org.andengine.entity.modifier.SequenceEntityModifier;
import org.andengine.entity.modifier.IEntityModifier.IEntityModifierListener;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.modifier.IModifier;

import com.example.phonicsapp.R;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.Log;

public class TiledImage extends Sprite
{	
	Sprite Letter,s;
	IEntity en ;
	static boolean audioPlay= false;
	static int ObjNo=0, audioPlayCount=0,anotherCounter = 0;
	static float APPEARING_TIME=3f, anotherDelay;
	static MediaPlayer mediaPlayer;
	static Context con;
	int audio;
	
	public TiledImage(float pX, float pY, float pWidth, float pHeight,ITextureRegion pTextureRegion,VertexBufferObjectManager vertexBufferObjectManager, int voice, Context cont) 
	{
		super(pX, pY, pWidth, pHeight, pTextureRegion, vertexBufferObjectManager);
		con=cont;
		ObjNo++;
		audioPlayCount=0;
		audio = voice;
		audioPlay = false;
		mediaPlayer= new MediaPlayer();
		this.Letter = new Sprite(pX, pY, pTextureRegion, vertexBufferObjectManager) 
		{
			@Override
			public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
					final float pTouchAreaLocalX, final float pTouchAreaLocalY)
			{
				switch (pSceneTouchEvent.getAction()) 
				{
					case TouchEvent.ACTION_DOWN:
					{
						this.setScale(1.09f);	
						break;
					}
					case TouchEvent.ACTION_MOVE:
					{
						break;
					}
					case TouchEvent.ACTION_UP:
					{
						this.setScale(1.0f);	
						audioPlay = true;
						playAudio(audio);
						break;
					}
					default:
					{
	
					}
				}
				return false;
			}
		};
		en = new Entity(0,0);
		s = new Sprite(-20,-20, AnimatedBookActivity.SpriteBgTextureRegion, vertexBufferObjectManager);
		Letter.setWidth(pHeight-40);
		Letter.setHeight(pHeight-40);	
		//s.setPosition(pX - 30, pY - 30);
		s.setWidth(pHeight+10);
		s.setHeight(pHeight+10);
		s.setZIndex(-1);
		s.setAlpha(0.8f);
		
		Letter.attachChild(s); 
		
		s.setVisible(false);
		Letter.setVisible(false);	
		
		AnimateImage();
	}
	
	void AnimateImage() 
	{
		Log.d("TiledImage", "ObjNo: "+ObjNo);
		if(ObjNo == 2){
			anotherDelay = 10.0f;
			//anotherCounter=1; 
		}
		else if(ObjNo == 3){ 
			anotherDelay = 12.1f; 
			//anotherCounter=1; 
		}
		else if(ObjNo == 4){ 
			anotherDelay = 14.1f; 
			//anotherCounter=1; 
		}
		else if(ObjNo == 5){ 
			anotherDelay = 16.1f; 
			//anotherCounter=1; 
		}
		else if(ObjNo == 6){ 
			anotherDelay = 18.1f; 
			//anotherCounter=1; 
		}
		else if(ObjNo == 7){ 
			anotherDelay = 20.1f; 
			//anotherCounter=1; 
		}
		else{
			anotherDelay = 22.3f;
		}
		Log.d("TiledImage", "ObjNo: "+ObjNo + " anotherDelay: "+ anotherDelay +" total: "+ ObjNo*anotherDelay);
		
		DelayModifier dMod = new DelayModifier(anotherDelay,new IEntityModifierListener()
		{
					@Override
					public void onModifierStarted(IModifier<IEntity> arg0,
							IEntity arg1)
					{ 
						
					}

					@Override
					public void onModifierFinished(IModifier<IEntity> arg0, 
								IEntity arg1)
					{
						Letter.setVisible(true);
						s.setVisible(true);
						
						audioPlay = true;
						playAudio(audio);
						
						audioPlayCount++;
						if(audioPlayCount==6)
						{
							audioPlay = true;
							AnimatedBookActivity.ArrowTouchEnable = true;
							//ObjNo=0;
						}
					}
				});
		FadeInModifier macch_fim2 = new FadeInModifier(APPEARING_TIME);
		SequenceEntityModifier macch_sm = new SequenceEntityModifier(dMod,macch_fim2);
		
		Letter.registerEntityModifier(macch_sm);
		
		
	}
	//Audio play Function
	public static void playAudio(int val)
	{
		if(audioPlay)
		{
			if(!mediaPlayer.isPlaying())
			{
				mediaPlayer.reset();
				mediaPlayer = MediaPlayer.create(AnimatedBookActivity.context, val);
					
				try 
				{
					mediaPlayer.start();
					mediaPlayer.setLooping(false);
				} 
				catch (IllegalStateException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			audioPlay = true;
		}
	}
	
}
 