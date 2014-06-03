package com.example.phonicsapp.boxGame;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class Objects extends Sprite
{

	public static boolean touchFlag, touchFlag1, touchFlag2, touchFlag3, touchFlag4;
	
	int i =0;
	
	public Objects(float pX, float pY, ITextureRegion pTextureRegion,
			VertexBufferObjectManager VertexBufferObject) 
	{
		super(pX, pY, pTextureRegion, VertexBufferObject);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public boolean onAreaTouched(final TouchEvent pSceneTouchEvent,
			final float pTouchAreaLocalX, final float pTouchAreaLocalY) 
	{
		switch (pSceneTouchEvent.getAction())
		{
			case TouchEvent.ACTION_DOWN:
			{ 
				touchFlag = true;  
				break;
			}
			case TouchEvent.ACTION_MOVE: 
			{
				if(pSceneTouchEvent.getX()<0)
				{
					this.setX(this.getX()); 
				}
				else if(pSceneTouchEvent.getY()<0)
				{
					this.setY(this.getY());
				}
				else if(pSceneTouchEvent.getX()>750)
				{
					this.setX(this.getX());
				}
				else if(pSceneTouchEvent.getY()>400)
				{
					this.setY(this.getY());
				}
				else
				{
				this.setPosition(pSceneTouchEvent.getX() - this.getWidth() / 2, 
						pSceneTouchEvent.getY() - this.getHeight() / 2);
				
				if(pSceneTouchEvent.getX()- this.getWidth()/2 == BoxGameActivity.obj1.getX() && 
						pSceneTouchEvent.getY()- this.getHeight()/2 == BoxGameActivity.obj1.getY())
				{
					
					i++;
					if(i==1)
					{
						touchFlag1 = true;
						Functions.audioPlay = true;
						Functions.playAudio(BoxGameActivity.obj1Sound);
						
					}
				}
				else if(pSceneTouchEvent.getX()- this.getWidth()/2 == BoxGameActivity.obj2.getX() && 
						pSceneTouchEvent.getY()- this.getHeight()/2 == BoxGameActivity.obj2.getY())
				{
					i++;
					if(i==1)
					{
						touchFlag2 = true;
						Functions.audioPlay = true;
						Functions.playAudio(BoxGameActivity.obj2Sound);
					}
				}
				else if(pSceneTouchEvent.getX()- this.getWidth()/2 == BoxGameActivity.obj3.getX() && 
						pSceneTouchEvent.getY()- this.getHeight()/2 == BoxGameActivity.obj3.getY())
				{
					i++;
					if(i==1)
					{
						Functions.audioPlay = true;
						Functions.playAudio(BoxGameActivity.obj3Sound);
					}
				}
				else if(pSceneTouchEvent.getX()- this.getWidth()/2 == BoxGameActivity.obj4.getX() && 
						pSceneTouchEvent.getY()- this.getHeight()/2 == BoxGameActivity.obj4.getY())
				{
					i++;
					if(i==1)
					{
						Functions.audioPlay = true;
						Functions.playAudio(BoxGameActivity.obj4Sound);
					}
				}
				else if(pSceneTouchEvent.getX()- this.getWidth()/2 == BoxGameActivity.obj5.getX() && 
						pSceneTouchEvent.getY()- this.getHeight()/2 == BoxGameActivity.obj5.getY())
				{
					i++;
					if(i==1)
					{
						Functions.audioPlay = true;
						Functions.playAudio(BoxGameActivity.obj5Sound);
					}
				}
				else if(pSceneTouchEvent.getX()- this.getWidth()/2 == BoxGameActivity.obj6.getX() && 
						pSceneTouchEvent.getY()- this.getHeight()/2 == BoxGameActivity.obj6.getY())
				{
					i++;
					if(i==1)
					{
						Functions.audioPlay = true;
						Functions.playAudio(BoxGameActivity.obj6Sound);
					}
				}
				else if(pSceneTouchEvent.getX()- this.getWidth()/2 == BoxGameActivity.wrongObj1.getX() && 
						pSceneTouchEvent.getY()- this.getHeight()/2 == BoxGameActivity.wrongObj1.getY())
				{
					i++;
					if(i==1)
					{
						touchFlag1 = true;
						Functions.audioPlay = true;
						Functions.playAudio(BoxGameActivity.wrongObj1Sound);
					}
				}
				else if(pSceneTouchEvent.getX()- this.getWidth()/2 == BoxGameActivity.wrongObj2.getX() && 
						pSceneTouchEvent.getY()- this.getHeight()/2 == BoxGameActivity.wrongObj2.getY())
				{
					i++;
					if(i==1)
					{
						touchFlag2 = true;
						Functions.audioPlay = true;
						Functions.playAudio(BoxGameActivity.wrongObj2Sound);
					}
				}
				}
				break;
			} 
			case TouchEvent.ACTION_UP:
			{
				i=0;
				touchFlag = false;
				touchFlag1 = false;
				touchFlag2 = false;
				BoxGameActivity.bCounter=0;
				
				break;
			}
		}
		return true;
	}
				
}
