package com.example.phonicsapp.HandWriting.Letters;

import org.andengine.entity.sprite.AnimatedSprite;
import com.example.phonicsapp.R;
import com.example.phonicsapp.HandWriting.Duster.Duster;
import com.example.phonicsapp.HandWriting.Popup.PopUp;
import com.example.phonicsapp.HandWriting.banglaletterwriting.GameActivity;
import com.example.phonicsapp.HandWriting.banglaletterwriting.NumberSprites;
import com.example.phonicsapp.HandWriting.banglaletterwriting.StructureDrawAnimation;

public class LetterStructureUkar
{

	//create numberSprite and cursor
	public static void createNumberSpriteAndCursor()
	{
			 
		//creating the first line of numbers
		GameActivity.spriteCounterLimit = 3;
		StructureDrawAnimation.scale(GameActivity.moOutLineX + 70, GameActivity.moOutLineY - 50, 1);
					
		//creating the fish cursor
		GameActivity.cursor = new AnimatedSprite(GameActivity.moOutLineX, GameActivity.moOutLineY, 
				GameActivity.mFishTextureRegion, GameActivity.vertexBufferObjectManager);
		GameActivity.cursor.animate(new long[]{100, 100, 100, 100, 100, 100}, 0, 5, true);
		GameActivity.cursor.setZIndex(3);
		GameActivity.mScene.attachChild(GameActivity.cursor);
					
		//setting the cursor to top of first number sprite
		NumberSprites.setCursorPosition(GameActivity.numberSprites[1]);
					
	}
		
	//Creating the structure for the Letter by positioning co-ordinates and also drawing with chalk
	public static void getStructure(float x, float y)
	{
			
		if(GameActivity.state==1)
		{
			//Drawing the chalk
			StructureDrawAnimation.Draw(x, y); 
			
			//setting the position of posX, posY
			GameActivity.posX = GameActivity.numberSprites[1].getX()+GameActivity.numberSprites[1].getWidth()/2-20;
			GameActivity.posY = GameActivity.numberSprites[1].getY()+GameActivity.numberSprites[1].getHeight()/2-20;

			if( 
				   GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX< -70 
				||GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX>70 
				|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY>70 
				|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY<-70 
					)
			{ 
				//set the cursor to the last collided number sprite
				NumberSprites.setCursorPosition(GameActivity.numberSprites[1]);
					
				//if out of the area the remove white chalks
				for(int a=0; a<=GameActivity.aCounter; a++)
				{
					GameActivity.mScene.detachChild(GameActivity.whiteChalk[a]);
					//if wrong and not shaking the shake as wrong signal
					if(GameActivity.isShaking == false)
					{
						StructureDrawAnimation.shake(1, GameActivity.OutLine, 10);
					}
				}
				
			}
			//if in the area and collides the right number sprite then remove and pass to the next number sprite
			else 
			{
				NumberSprites.setCursorRotation(x, y);
					
				remove(2, 1,2);
			}
				
		}  
		else if(GameActivity.state==2)
		{
			//creating new line of numbers
			GameActivity.spriteCounterLimit=4;
			StructureDrawAnimation.scale(GameActivity.moOutLineX -60,
					GameActivity.moOutLineY+40, GameActivity.spriteCounter);
			GameActivity.state=3;
		}
		else if(GameActivity.state==3)
		{
			StructureDrawAnimation.Draw(x, y);
				
			GameActivity.posX = GameActivity.numberSprites[2].getX()+GameActivity.numberSprites[2].getWidth()/2-20;
			GameActivity.posY = GameActivity.numberSprites[2].getY()+GameActivity.numberSprites[2].getHeight()/2-20;

			if(
					 GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX< -70 
					 ||GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX>70 
				|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY>70 
				|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY<-70 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(GameActivity.numberSprites[2]);
					
					//if out of the area the remove white chalks
					for(int a=GameActivity.wCounter; a<=GameActivity.aCounter; a++)
					{
						GameActivity.mScene.detachChild(GameActivity.whiteChalk[a]);
						//if wrong and not shaking the shake as wrong signal
						if(GameActivity.isShaking == false)
						{
							StructureDrawAnimation.shake(1, GameActivity.OutLine, 10);
						}
					}
					
				} 
				else
				{
					//Move the cursor with touch
					NumberSprites.setCursorRotation(x, y);
					
					remove(3,2,4);
				}
			} 
			else if(GameActivity.state==4)
			{
				StructureDrawAnimation.Draw(x, y);
				
				GameActivity.posX = GameActivity.numberSprites[3].getX()+GameActivity.numberSprites[3].getWidth()/2-20;
				GameActivity.posY = GameActivity.numberSprites[3].getY()+GameActivity.numberSprites[3].getHeight()/2-20;
				
				if(
						 GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX< -80 
						 ||GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX>80 
					|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY>70 
					|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY<-70 
					)
				{
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(GameActivity.numberSprites[3]);
					
					//if out of the area the remove white chalks
					for(int a=GameActivity.wCounter; a<=GameActivity.aCounter; a++)
					{
						GameActivity.mScene.detachChild(GameActivity.whiteChalk[a]);
						//if wrong and not shaking the shake as wrong signal
						if(GameActivity.isShaking == false)
						{
							StructureDrawAnimation.shake(1, GameActivity.OutLine, 10);
							//if wrong and not shaking the shake as wrong signal
							if(GameActivity.isShaking == false)
							{
								StructureDrawAnimation.shake(1, GameActivity.OutLine, 10);

							}
						}
					}
					
				} 
				else
				{
					//Move the cursor with touch
					NumberSprites.setCursorRotation(x, y);
					
					remove(4,3,5);
				}
			}
			else if(GameActivity.state==5)
			{
				//creating new line of numbers
				GameActivity.spriteCounterLimit=7;
				StructureDrawAnimation.scale(GameActivity.moOutLineX+30 ,
						GameActivity.moOutLineY+10, GameActivity.spriteCounter); 
				
				GameActivity.state=6;
			}
			else if(GameActivity.state==6)
			{
				StructureDrawAnimation.Draw(x, y);
				
				GameActivity.posX = GameActivity.numberSprites[4].getX()+GameActivity.numberSprites[4].getWidth()/2-20; 
				GameActivity.posY = GameActivity.numberSprites[4].getY()+GameActivity.numberSprites[4].getHeight()/2-20;
				
				if(
						 GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX< -70 
						 	|| GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX>70 
							|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY>70 
							|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY<-70 
						)
				{
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(GameActivity.numberSprites[4]);
					
					//if out of the area the remove white chalks
					for(int a=GameActivity.wCounter; a<=GameActivity.aCounter; a++)
					{
						GameActivity.mScene.detachChild(GameActivity.whiteChalk[a]);
						//if wrong and not shaking the shake as wrong signal
						if(GameActivity.isShaking == false)
						{
							StructureDrawAnimation.shake(1, GameActivity.OutLine, 10);
						}
					}
					
				} 
				else
				{
					//Move the cursor with touch
					NumberSprites.setCursorRotation(x, y);
					
					remove(5,4,7);
				}
			}
			else if(GameActivity.state==7)
			{
				StructureDrawAnimation.Draw(x, y); 
				
				GameActivity.posX = GameActivity.numberSprites[5].getX()+GameActivity.numberSprites[5].getWidth()/2-20; 
				GameActivity.posY = GameActivity.numberSprites[5].getY()+GameActivity.numberSprites[5].getHeight()/2-20;
				
				if(
						 GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX< -70 
						 	|| GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX>80 
							|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY>80 
							|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY<-70 
						)
				{
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(GameActivity.numberSprites[5]);
					
					//if out of the area the remove white chalks
					for(int a=GameActivity.wCounter; a<=GameActivity.aCounter; a++)
					{
						GameActivity.mScene.detachChild(GameActivity.whiteChalk[a]);
						//if wrong and not shaking the shake as wrong signal
						if(GameActivity.isShaking == false)
						{
							StructureDrawAnimation.shake(1, GameActivity.OutLine, 10);
						}
					}
					
				} 
				else
				{
					//Move the cursor with touch
					NumberSprites.setCursorRotation(x, y);
					
					remove(6,5,8);
				}
			}
			else if(GameActivity.state==8)
			{
				StructureDrawAnimation.Draw(x, y);
				
				GameActivity.posX = GameActivity.numberSprites[6].getX()+GameActivity.numberSprites[6].getWidth()/2-20; 
				GameActivity.posY = GameActivity.numberSprites[6].getY()+GameActivity.numberSprites[6].getHeight()/2-20;
				
				if(
						 GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX< -70 
						 	|| GameActivity.whiteChalk[GameActivity.aCounter].getX() - GameActivity.posX>70 
							|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY>70 
							|| GameActivity.whiteChalk[GameActivity.aCounter].getY() - GameActivity.posY<-70 
						)
				{
					
					//set the cursor to the last collided number sprite
					NumberSprites.setCursorPosition(GameActivity.numberSprites[6]);
					
					//if out of the area the remove white chalks
					for(int a=GameActivity.wCounter; a<=GameActivity.aCounter; a++)
					{
						GameActivity.mScene.detachChild(GameActivity.whiteChalk[a]);
						//if wrong and not shaking the shake as wrong signal
						if(GameActivity.isShaking == false)
						{
							StructureDrawAnimation.shake(1, GameActivity.OutLine, 10);
						}
					}
					
				}
				else 
				{
					//Move the cursor with touch
					NumberSprites.setCursorRotation(x, y);
					
					remove(7,6,9);
				}
			}  
	}
		
		
	public static void Structure()
	{
		
		if(GameActivity.spriteCounterLimit == 3)
		{
			GameActivity.spriteCounter++;
			StructureDrawAnimation.scale(GameActivity.moOutLineX-50*GameActivity.spriteCounter + 160, 
					GameActivity.moOutLineY +50*GameActivity.spriteCounter-60, GameActivity.spriteCounter);
		}
		else if(GameActivity.spriteCounterLimit == 4)
		{
			GameActivity.spriteCounter++;
			StructureDrawAnimation.scale(GameActivity.moOutLineX+30*GameActivity.spriteCounter - 150 ,
					GameActivity.moOutLineY+60*GameActivity.spriteCounter - 350,
					GameActivity.spriteCounter);
		}
		else if(GameActivity.spriteCounterLimit == 7)
		{
			GameActivity.spriteCounter++;
			StructureDrawAnimation.scale(GameActivity.moOutLineX+80*GameActivity.spriteCounter - 360 ,
					GameActivity.moOutLineY+50*GameActivity.spriteCounter - 220,
					GameActivity.spriteCounter);
		}
	}
	
	//when a sprite collides a number sprite then it is called;
	//it removes the number sprite and enables the next state for drawing
	public static void remove(int collisionSprite, int removeSpriteNumber, int stateNumber)
	{
		
		if(GameActivity.whiteChalk[GameActivity.aCounter].collidesWith(GameActivity.numberSprites[collisionSprite]))
		{
			//removing when it is in the last state
			if(collisionSprite == 7)
			{ 
				GameActivity.mScene.detachChild(GameActivity.numberSprites[7]);
				
				//trigger for taking screen shot
				GameActivity.screenShotCounter = 1;
				//create book icon
				PopUp.createBookIcon();
				//start duster
				Duster.startDuster();
				
				GameActivity.isActionMoving = false;
				
				//start the hand tutorial 
//				MainActivity.tutorialCounter++;
//				if(MainActivity.tutorialCounter==1)
//				{
//					HandTutorial.handTutorialCreate();
//				}
			}
			GameActivity.mScene.detachChild(GameActivity.numberSprites[removeSpriteNumber]);
			GameActivity.numberSprites[removeSpriteNumber].setY(GameActivity.CAMERA_HEIGHT+500);
			GameActivity.wCounter =GameActivity. aCounter+2;
			GameActivity.state = stateNumber;
			
			//play sound
			GameActivity.audioPlay = true;
			NumberSprites.playAudio(R.raw.star);
			
		}
	}
	
}
