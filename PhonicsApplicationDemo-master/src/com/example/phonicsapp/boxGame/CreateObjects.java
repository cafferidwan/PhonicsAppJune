package com.example.phonicsapp.boxGame;

import org.andengine.entity.Entity;
import org.andengine.entity.sprite.Sprite;
import org.andengine.util.debug.Debug;

import android.view.Menu;

public class CreateObjects 
{

	public static void create(int boxGameMenuLetter)
	{
		Debug.d("BoxMenuLEtter:"+boxGameMenuLetter);
		
		if(boxGameMenuLetter==1||boxGameMenuLetter==2||boxGameMenuLetter==5||boxGameMenuLetter==8||
				boxGameMenuLetter==18)
		{
			BoxGameActivity.backGround = new Sprite(0, 0, BoxGameActivity.mJungleBackGroundTextureRegion,
					BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.openedBox = new Sprite(BoxGameActivity.CAMERA_WIDTH/2-100, BoxGameActivity.CAMERA_HEIGHT/2, 
					BoxGameActivity.mJungleBoxOpenTextureRegion,  BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.closedBox = new Sprite(BoxGameActivity.CAMERA_WIDTH/2-100, BoxGameActivity.CAMERA_HEIGHT/2, 
					BoxGameActivity.mJungleBoxCloseTextureRegion,  BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
		}
		else if(boxGameMenuLetter==6||boxGameMenuLetter==14||boxGameMenuLetter==13||boxGameMenuLetter==3||
				boxGameMenuLetter==9)
		{
			BoxGameActivity.backGround = new Sprite(0, 0, BoxGameActivity.mBeachBackGroundTextureRegion,
					BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.openedBox = new Sprite(BoxGameActivity.CAMERA_WIDTH/2-100, BoxGameActivity.CAMERA_HEIGHT/2, 
					BoxGameActivity.mBeachBoxOpenTextureRegion,  BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.closedBox = new Sprite(BoxGameActivity.CAMERA_WIDTH/2-100, BoxGameActivity.CAMERA_HEIGHT/2, 
					BoxGameActivity.mBeachBoxCloseTextureRegion,  BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
		}
		else if(boxGameMenuLetter==4||boxGameMenuLetter==7||boxGameMenuLetter==16||boxGameMenuLetter==15||
				boxGameMenuLetter==20)
		{
			BoxGameActivity.backGround = new Sprite(0, 0, BoxGameActivity.mUnderWaterBackGroundTextureRegion,
					BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.openedBox = new Sprite(BoxGameActivity.CAMERA_WIDTH/2-100, BoxGameActivity.CAMERA_HEIGHT/2, 
					BoxGameActivity.mUnderWaterBoxTextureOpenRegion,  BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.closedBox = new Sprite(BoxGameActivity.CAMERA_WIDTH/2-100, BoxGameActivity.CAMERA_HEIGHT/2, 
					BoxGameActivity.mUnderWaterBoxCloseTextureRegion,  BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			
		}
		else if(boxGameMenuLetter==19||boxGameMenuLetter==12||boxGameMenuLetter==17||boxGameMenuLetter==10||
				boxGameMenuLetter==11)
		{
			BoxGameActivity.backGround = new Sprite(0, 0, BoxGameActivity.mPlanetBackGroundTextureRegion,
					BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.openedBox = new Sprite(BoxGameActivity.CAMERA_WIDTH/2-100, BoxGameActivity.CAMERA_HEIGHT/2, 
					BoxGameActivity.mPlanetBoxOpenTextureRegion,  BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.closedBox = new Sprite(BoxGameActivity.CAMERA_WIDTH/2-100, BoxGameActivity.CAMERA_HEIGHT/2, 
					BoxGameActivity.mPlanetBoxCloseTextureRegion,  BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
		}
			BoxGameActivity.backGround.setHeight(BoxGameActivity.CAMERA_HEIGHT);
			BoxGameActivity.backGround.setWidth(BoxGameActivity.CAMERA_WIDTH);
			BoxGameActivity.mScene.attachChild(BoxGameActivity.backGround);
		
		
		//Opened box
		BoxGameActivity.mScene.attachChild(BoxGameActivity.openedBox);
		BoxGameActivity.openedBox.setVisible(false);
		//closed box
		BoxGameActivity.mScene.attachChild(BoxGameActivity.closedBox);
		BoxGameActivity.closedBox.setVisible(true);
		
		BoxGameActivity.mScene.registerTouchArea(BoxGameActivity.obj1);
		BoxGameActivity.mScene.attachChild(BoxGameActivity.obj1);
		BoxGameActivity.obj1.setScale((float) BoxGameActivity.objectScale);
		
		
		BoxGameActivity.mScene.registerTouchArea(BoxGameActivity.obj2);
		BoxGameActivity.mScene.attachChild(BoxGameActivity.obj2);
		BoxGameActivity.obj2.setScale((float) BoxGameActivity.objectScale);
		
		BoxGameActivity.mScene.registerTouchArea(BoxGameActivity.obj3);
		BoxGameActivity.mScene.attachChild(BoxGameActivity.obj3);
		BoxGameActivity.obj3.setScale((float) BoxGameActivity.objectScale);
		
		BoxGameActivity.mScene.registerTouchArea(BoxGameActivity.obj4);
		BoxGameActivity.mScene.attachChild(BoxGameActivity.obj4);
		BoxGameActivity.obj4.setScale((float) BoxGameActivity.objectScale);
		
		BoxGameActivity.mScene.registerTouchArea(BoxGameActivity.obj5);
		BoxGameActivity.mScene.attachChild(BoxGameActivity.obj5);
		BoxGameActivity.obj5.setScale((float) BoxGameActivity.objectScale);
		
		BoxGameActivity.mScene.registerTouchArea(BoxGameActivity.obj6);
		BoxGameActivity.mScene.attachChild(BoxGameActivity.obj6);
		BoxGameActivity.obj6.setScale((float) BoxGameActivity.objectScale);
	
		BoxGameActivity.mScene.registerTouchArea(BoxGameActivity.wrongObj1);
		BoxGameActivity.mScene.attachChild(BoxGameActivity.wrongObj1);
		BoxGameActivity.wrongObj1.setScale((float) BoxGameActivity.objectScale);
		
		BoxGameActivity.mScene.registerTouchArea(BoxGameActivity.wrongObj2);
		BoxGameActivity.mScene.attachChild(BoxGameActivity.wrongObj2);
		BoxGameActivity.wrongObj2.setScale((float) BoxGameActivity.objectScale);
		
		
		//parrot-letter
		BoxGameActivity.parrotLetter =  new Entity(850,20);
		BoxGameActivity.mScene.attachChild(BoxGameActivity.parrotLetter);
		
		BoxGameActivity.mScene.registerTouchArea(BoxGameActivity.letter);
		BoxGameActivity.parrotLetter.attachChild(BoxGameActivity.letter);
		
		if(boxGameMenuLetter==1||boxGameMenuLetter==2||boxGameMenuLetter==5||boxGameMenuLetter==8||
				boxGameMenuLetter==18)
		{
		
			BoxGameActivity.parrot = new Parrot(0,0, 
					BoxGameActivity.mJungleParrotTextureRegion, BoxGameActivity.boxGameActivityInstance.
					getVertexBufferObjectManager());
		}
		else if(boxGameMenuLetter==6||boxGameMenuLetter==14||boxGameMenuLetter==13||boxGameMenuLetter==3||
				boxGameMenuLetter==9)
		{
			BoxGameActivity.parrot = new Parrot(0,0, 
					BoxGameActivity.mBeachParrotTextureRegion, BoxGameActivity.boxGameActivityInstance.
					getVertexBufferObjectManager());
		}
		else if(boxGameMenuLetter==4||boxGameMenuLetter==7||boxGameMenuLetter==16||boxGameMenuLetter==15||
				boxGameMenuLetter==20)
		{
			BoxGameActivity.parrot = new Parrot(0,0, 
					BoxGameActivity.mUnderWaterParrotTextureRegion, BoxGameActivity.boxGameActivityInstance.
					getVertexBufferObjectManager());
		}
		else if(boxGameMenuLetter==19||boxGameMenuLetter==12||boxGameMenuLetter==17||boxGameMenuLetter==10||
				boxGameMenuLetter==11)
		{
			BoxGameActivity.parrot = new Parrot(0,0, 
					BoxGameActivity.mPlanetParrotTextureRegion, BoxGameActivity.boxGameActivityInstance.
					getVertexBufferObjectManager());
		}
		//BoxGameActivity.parrot.animate(new long[]{0, 0, 150, 150}, 0, 3, true);
		BoxGameActivity.parrot.setScale((float) 0.4);
		BoxGameActivity.mScene.registerTouchArea(BoxGameActivity.parrot);
		BoxGameActivity.parrotLetter.attachChild(BoxGameActivity.parrot);
		
				
		Parrot.parrotPath();
	}
}
