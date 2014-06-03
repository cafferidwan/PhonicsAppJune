package com.example.phonicsapp.boxGame;

import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.AlphaModifier;
import org.andengine.entity.modifier.MoveXModifier;
import org.andengine.entity.modifier.MoveYModifier;
import org.andengine.entity.modifier.PathModifier;
import org.andengine.entity.modifier.SequenceEntityModifier;
import org.andengine.entity.modifier.PathModifier.IPathModifierListener;
import org.andengine.entity.modifier.PathModifier.Path;
import org.andengine.entity.sprite.Sprite;
import org.andengine.util.modifier.ease.EaseBounceOut;
import org.andengine.util.modifier.ease.EaseCircularInOut;
import org.andengine.util.modifier.ease.EaseQuadOut;

import com.example.phonicsapp.R;

import android.content.Context;
import android.media.MediaPlayer;

public class Functions 
{
	
	static Boolean audioPlay = false;
	static MediaPlayer mediaPlayer = new MediaPlayer();
	public static SequenceEntityModifier jumpModifier, jumpModifier1;
	
//	static BoxGameActivity boxGameActivityInstance;
	
	//a is the Box and b is the other Object
	public static int collisoinCheck(Sprite a, Sprite b)
	{
		if(a.getX()-b.getX()>-30 && a.getX()-b.getX()<90 && a.getY()-b.getY()<50 && a.getY()-b.getY()>-135)
		{
			BoxGameActivity.val = 1;
			//Debug.d("Close1");
			return BoxGameActivity.val;
		}
		else if(b.getX()-a.getX()>20 && b.getX()-a.getX()<140 && a.getY()-b.getY()<50 && a.getY()-b.getY()>-135)
		{
			BoxGameActivity.val = 2;
			//Debug.d("Close2");
			return BoxGameActivity.val;
		}
		else
		{
			//Debug.d("Not Close");
			return 0;
		}
	}
	
	//jump functions
	public static void jump(Sprite a, int k)
	{
		 
        float jumpDuration = (float) 0.7;
        float startX = 0;
        float startY = 0;
        
        float endX = 0;
        float endY = 0;
        
        float midPointX = 0 ;
        float midPointY = 0 ;
        
        
        if(k == 0)
        {
        	startX = a.getX();
        	startY = a.getY();
        	
        	midPointX = 120;
        	midPointY = 50;
        	
        	endX = BoxGameActivity.wrongObj1X;
        	endY = BoxGameActivity.wrongObj1Y;
        	
        	Functions.audioPlay = true;
			Functions.playAudio(R.raw.parrot_correct);
        	
        	jumpModifier = new SequenceEntityModifier(
                    new MoveYModifier(jumpDuration, startY, midPointY,EaseQuadOut.getInstance()),
                    new MoveYModifier(jumpDuration, midPointY, endY, EaseBounceOut.getInstance()));
            a.registerEntityModifier(jumpModifier);
            
            jumpModifier1 = new SequenceEntityModifier(
                    new MoveXModifier(jumpDuration, startX, midPointX,EaseQuadOut.getInstance()),
                    new MoveXModifier(jumpDuration, midPointX, endX, EaseBounceOut.getInstance()));
            a.registerEntityModifier(jumpModifier1);
        }
        else if(k == 1)
        {
        	startX = a.getX();
        	startY = a.getY();
        	
        	midPointX = BoxGameActivity.CAMERA_WIDTH/2+100;
        	midPointY = 50;
        	
        	endX = BoxGameActivity.wrongObj2X;
        	endY = BoxGameActivity.wrongObj2Y;
        	
        	Functions.audioPlay = true;
			Functions.playAudio(R.raw.parrot_correct);
			
        	jumpModifier = new SequenceEntityModifier(
                    new MoveYModifier(jumpDuration, startY, midPointY, EaseCircularInOut.getInstance()),
                    new MoveYModifier(jumpDuration, midPointY, endY, EaseBounceOut.getInstance()));
            a.registerEntityModifier(jumpModifier);
            
            jumpModifier1 = new SequenceEntityModifier(
                    new MoveXModifier(jumpDuration, startX, midPointX, EaseCircularInOut.getInstance()),
                    new MoveXModifier(jumpDuration, midPointX, endX, EaseBounceOut.getInstance()));
            a.registerEntityModifier(jumpModifier1);
            
        }
        
	}
	
	//FadeOut Function
	public static void fadeOut(final Sprite sprite)
	{
		BoxGameActivity.bCounter++;
		if(BoxGameActivity.bCounter==1)
		{
			BoxGameActivity.aCounter++;
		}
		final Path boxPath = new Path(2).to(sprite.getX(), sprite.getY()).
				to(BoxGameActivity.closedBox.getX(), BoxGameActivity.closedBox.getY()+30);
		
		sprite.registerEntityModifier(new PathModifier((float)0.1, boxPath,  new IPathModifierListener() 
		{
			@Override
			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
			{
				//Debug.d("onPathStarted");
			}

			@Override
			public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			{
				//Debug.d("onPathWaypointStarted:  " + pWaypointIndex);
			}

			@Override
			public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) 
			{
				//Debug.d("onPathWaypointFinished: " + pWaypointIndex);
				
			}

			@Override
			public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
			{
			
			}
		}));
		
		AlphaModifier yourModifier = new AlphaModifier(1f, 0.5f, 0f)
		{
		        @Override
		        protected void onModifierStarted(IEntity pItem)
		        {
		                super.onModifierStarted(pItem);
		                // Your action after starting modifier
		                //BoxGameActivity.counter();
		                BoxGameActivity.mScene.unregisterTouchArea(sprite);
		        }
		       
		        @Override
		        protected void onModifierFinished(IEntity pItem)
		        {
		                super.onModifierFinished(pItem);
		                // Your action after finishing modifier
		                sprite.setY(BoxGameActivity.CAMERA_HEIGHT - BoxGameActivity.CAMERA_HEIGHT/4);
		        }
		};
		 
		sprite.registerEntityModifier(yourModifier);
	}
	
	//Exchange Position Function
	public static void ExchangePosition(final Sprite a, final Sprite b)
	{
		final Path boxPath ;
		
		boxPath = new Path(2).to(a.getX(), a.getY()).
				to(b.getX(), b.getY());
		AlphaModifier yourModifier = new AlphaModifier(1f, 0.5f, 0f)
		{
		        @Override
		        protected void onModifierStarted(IEntity pItem)
		        {
		                super.onModifierStarted(pItem);
		                BoxGameActivity.disableCol = 1;
		                // Your action after starting modifier
		        }
			       
		        @Override
		        protected void onModifierFinished(IEntity pItem)
		        {
		                super.onModifierFinished(pItem);
		                // Your action after finishing modifier
		                
		            	a.registerEntityModifier(new PathModifier((float)0.01, boxPath,  new IPathModifierListener() 
		        		{
		        			@Override
		        			public void onPathStarted(final PathModifier pPathModifier, final IEntity pEntity) 
		        			{
		        				//Debug.d("onPathStarted");
		        			}

			        		@Override
			        		public void onPathWaypointStarted(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex)
			        		{
			        			//Debug.d("onPathWaypointStarted:  " + pWaypointIndex);
			        		
			        		}

			        		@Override
			        		public void onPathWaypointFinished(final PathModifier pPathModifier, final IEntity pEntity, final int pWaypointIndex) 
			        		{
			        			//Debug.d("onPathWaypointFinished: " + pWaypointIndex);
			        				
			        		}

			        		@Override
			        		public void onPathFinished(final PathModifier pPathModifier, final IEntity pEntity) 
			        		{
			        			a.setAlpha(1);
			        			BoxGameActivity.disableCol = 0;
			        		}
		        	}));
		       }
		};
			 
		a.registerEntityModifier(yourModifier);
//		}

	}
	//Audio play Function
	public static void playAudio(int value)
	{
		if(audioPlay)
		{
			if(!mediaPlayer.isPlaying())
			{
				mediaPlayer.reset();
				mediaPlayer = MediaPlayer.create(getAppContext(), value);
				
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

	//getting the MainActivity context
	private static Context getAppContext() 
	{
		// TODO Auto-generated method stub
		return BoxGameActivity.context;
	}
}
