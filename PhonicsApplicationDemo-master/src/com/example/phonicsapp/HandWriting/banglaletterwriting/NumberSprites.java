package com.example.phonicsapp.HandWriting.banglaletterwriting;

import org.andengine.entity.sprite.Sprite;
import android.media.MediaPlayer;
 
public class NumberSprites 
{
	
	//set cursor/fish position
	public static void setCursorPosition(Sprite x)
	{
		GameActivity.cursor.setPosition(x.getX()+10, x.getY()+10);
		GameActivity.mScene.sortChildren();
	}
	
	//set cursor/fish rotation
	public static void setCursorRotation(float x, float y)
	{
		
		GameActivity.cursor.setPosition(x - GameActivity.cursor.getWidth()/2,
				y-GameActivity.cursor.getHeight()/2);
		
		 float directionX = x;
         float directionY = y;

         float rotationAngle = (float) Math.atan2(directionY, directionX);
         GameActivity.cursor.setRotationCenter(GameActivity.cursor.getWidth()/2, GameActivity.cursor.getHeight() / 2);
         GameActivity.cursor.setRotation(org.andengine.util.math.MathUtils
                    .radToDeg(rotationAngle));
	}
	
	//Audio play Function
	public static void playAudio(int val)
	{
		if(GameActivity.audioPlay)
		{
			GameActivity.mediaPlayer = MediaPlayer.create(GameActivity.MainActivityInstace.getBaseContext(), val);
			try 
			{
				GameActivity.mediaPlayer.start();
				GameActivity.mediaPlayer.setLooping(false);
			} 
			catch (IllegalStateException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			GameActivity.audioPlay = true;
		}
	}
}
