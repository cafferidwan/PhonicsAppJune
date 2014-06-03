package com.example.phonicsapp.HandWriting.banglaletterwriting;

import org.andengine.input.touch.TouchEvent;
import org.andengine.util.debug.Debug;

import com.example.phonicsapp.R;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureA;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureAa;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureAakar;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureAkar;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureBo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureCho;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureDo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureDoh;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureE;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureEkar;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureGo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureHo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureKho;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureKo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureLo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureMo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureNo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructurePo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureRaw;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureTalibaSha;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureTo;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureToh;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureU;
import com.example.phonicsapp.HandWriting.Letters.LetterStructureUkar;
import com.example.phonicsapp.HandWriting.ScreenShoot.ScreenShot;

public class Touch
{

	public static boolean touchEvent(TouchEvent pSceneTouchEvent)
	{
		if (pSceneTouchEvent.isActionDown()) 
		{
			GameActivity.touch = 1;
//			Debug.d("Touch.x:"+(pSceneTouchEvent.getX()-50));
//			Debug.d("Touch.y:"+(pSceneTouchEvent.getY()-50));
			
		
			return true;
		}
		else if (pSceneTouchEvent.isActionMove() && GameActivity.isPopupActive == false
				&& GameActivity.isHandTutorialActive == false && GameActivity.isActionMoving == true)
		{
			GameActivity.touch++;
			
			Debug.d("Touch.x:"+((pSceneTouchEvent.getX()-50)-GameActivity.moOutLineX));
			Debug.d("Touch.y:"+((pSceneTouchEvent.getY()-50)-GameActivity.moOutLineY));
			
			//sorting the scene child
			GameActivity.mScene.sortChildren();
			
			//enabling only by moving, disabling the tap
			if (GameActivity.touch>2)
			{
				//positioning the invisible rectangle according to the touch point 
				GameActivity.rect.setPosition(pSceneTouchEvent.getX() - GameActivity.rect.getWidth() / 2,
						pSceneTouchEvent.getY() - GameActivity.rect.getHeight() / 2);
				
				
//				Debug.d("spriteCounter:" + MainActivity.spriteCounter); 
				Debug.d("State:" + GameActivity.state);

				//enabling drawing from the first number sprite
				if (GameActivity.rect.collidesWith(GameActivity.numberSprites[1])) 
				{
					GameActivity.soundCounter++;
					if(GameActivity.soundCounter==1)
					{
						//play sound
						GameActivity.audioPlay = true;
						NumberSprites.playAudio(R.raw.star);
					}
					GameActivity.state = 1;
				}
				
				//For letter Mo
				if(GameActivity.letter == 1)
				{
					//building the structure for the letter with number sprite
					LetterStructureMo.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Aa
				else if(GameActivity.letter == 2)
				{
					//building the structure for the letter with number sprite
					LetterStructureAa.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter E
				else if(GameActivity.letter == 3)
				{
					//building the structure for the letter with number sprite
					LetterStructureE.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Raw
				else if(GameActivity.letter == 4)
				{
					//building the structure for the letter with number sprite
					LetterStructureRaw.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Ko
				else if(GameActivity.letter == 5)
				{
					//building the structure for the letter with number sprite
					LetterStructureKo.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Bo
				else if(GameActivity.letter == 6)
				{
					//building the structure for the letter with number sprite
					LetterStructureBo.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter TalibaSha
				else if(GameActivity.letter == 7)
				{
					//building the structure for the letter with number sprite
					LetterStructureTalibaSha.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Lo
				else if(GameActivity.letter == 8)
				{
					//building the structure for the letter with number sprite
					LetterStructureLo.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Po
				else if(GameActivity.letter == 9)
				{
					//building the structure for the letter with number sprite
					LetterStructurePo.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Go
				else if(GameActivity.letter == 10)
				{
					//building the structure for the letter with number sprite
					LetterStructureGo.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Ho
				else if(GameActivity.letter == 11)
				{
					//building the structure for the letter with number sprite
					LetterStructureHo.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Kho
				else if(GameActivity.letter == 12)
				{
					//building the structure for the letter with number sprite
					LetterStructureKho.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Cho
				else if(GameActivity.letter == 13)
				{
					//building the structure for the letter with number sprite
					LetterStructureCho.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter No
				else if(GameActivity.letter == 14)
				{
					//building the structure for the letter with number sprite
					LetterStructureNo.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter No
				else if(GameActivity.letter == 15)
				{
					//building the structure for the letter with number sprite
					LetterStructureA.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Do
				else if(GameActivity.letter == 16)
				{
					//building the structure for the letter with number sprite
					LetterStructureDo.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter U
				else if(GameActivity.letter == 17)
				{
					//building the structure for the letter with number sprite
					LetterStructureU.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter To
				else if(GameActivity.letter == 18)
				{
					//building the structure for the letter with number sprite
					LetterStructureTo.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Toh
				else if(GameActivity.letter == 19)
				{
					//building the structure for the letter with number sprite
					LetterStructureToh.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Doh
				else if(GameActivity.letter == 20)
				{
					//building the structure for the letter with number sprite
					LetterStructureDoh.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Ukar
				else if(GameActivity.letter == 21)
				{
					//building the structure for the letter with number sprite
					LetterStructureUkar.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Ekar
				else if(GameActivity.letter == 22)
				{
					//building the structure for the letter with number sprite
					LetterStructureEkar.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Akar
				else if(GameActivity.letter == 23)
				{
					//building the structure for the letter with number sprite
					LetterStructureAkar.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				//For letter Aakar
				else if(GameActivity.letter == 24)
				{
					//building the structure for the letter with number sprite
					LetterStructureAakar.getStructure(pSceneTouchEvent.getX(),
							pSceneTouchEvent.getY());
				}
				
				
				//take the screenShoot when triggered
				if(GameActivity.screenShotCounter == 1)
				{
					ScreenShot.takeScreenShot();
				}
			}
			
			return true;
		}

		else if (pSceneTouchEvent.isActionUp()) 
		{
			GameActivity.touch = 0;
			return true;
		}
		return true;
	}
}
