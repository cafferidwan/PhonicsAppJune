package com.example.phonicsapp;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;

import com.example.phonicsapp.HandWriting.banglaletterwriting.HandWritingMenu;

public class SetMenuLetters
{
	
	public static void setAllMenuLetters()
	{
		for(int l=1; l<=4; l++)
		{
			MenuPage.menuLetters[6][l] = new Sprite(630, l*100-120, MenuPage.mTextureRegionAssessmentLetters,
					MenuPage.vertexBufferObjectManager)
			{
				@Override
				public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
				{
					switch (pSceneTouchEvent.getAction()) 
					{
					case TouchEvent.ACTION_DOWN:
					
						if(MenuPage.setMenuLetter(pSceneTouchEvent, 6,1)== true)
						{
							MenuPage.setStartActivity(31,6,1);
						}
						else if(MenuPage.setMenuLetter(pSceneTouchEvent, 6,2)== true)
						{
							MenuPage.setStartActivity(32,6,2);
						}
						else if(MenuPage.setMenuLetter(pSceneTouchEvent, 6,3)== true)
						{
							MenuPage.setStartActivity(33,6,3);
						}
						else if(MenuPage.setMenuLetter(pSceneTouchEvent, 6,4)== true)
						{
							MenuPage.setStartActivity(34,6,4);
						}
						
						break;
					}
					return true;
				}
			};
			
			MenuPage.menuScene.attachChild(MenuPage.menuLetters[6][l]);
			MenuPage.menuLetters[6][l].setScale((float) 0.4);
		}
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=4; j++) 
			{
				MenuPage.menuLetters[i][j] = new Sprite(i*130-150, j*100-120, MenuPage.mMenuTextureRegionMenuLetters[i][j],
						MenuPage.vertexBufferObjectManager)
				{
					@Override
					public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
					{
						switch (pSceneTouchEvent.getAction()) 
						{
						case TouchEvent.ACTION_DOWN:
							
							//1.Mo 2.Aa 3.e 4.Raw 5.Ko 6.Bo 7.TalibaSha 8.Lo 9.Po 10.Go 11.Ho
							//12.Kho 13.Cho 14.No 15.A 16.Do 17.U 18.To 19.Toh 20.Doh 21.Ukar
							//22.Ekar 23.Akar 24.Aakar
						
							//Mo
							if(MenuPage.setMenuLetter(pSceneTouchEvent, 1,1)== true)
							{
								MenuPage.setStartActivity(1,1,1);
							}
							//Aa
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 2,1)== true)
							{
								MenuPage.setStartActivity(2,2,1); 
							}
							//Lo
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 3,1)== true)
							{
								MenuPage.setStartActivity(8,3,1); 
							} 
							//Ko
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 4,1)== true)
							{
								MenuPage.setStartActivity(5,4,1); 
							}
							//To
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 5,1)== true)
							{
								MenuPage.setStartActivity(18,5,1); 
							}
							
							////////////////////
							//Bo
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 1,2)== true)
							{
								MenuPage.setStartActivity(6,1,2); 
							}
							//No
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 2,2)== true)
							{
								MenuPage.setStartActivity(14,2,2); 
							}
							//Cho
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 3,2)== true)
							{
								MenuPage.setStartActivity(13,3,2); 
							}
							//E
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 4,2)== true)
							{
								MenuPage.setStartActivity(3,4,2); 
							}
							//Po
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 5,2)== true)
							{
								MenuPage.setStartActivity(9,5,2); 
							}
							
							
							///////////////////////////
							//Ro
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 1,3)== true)
							{
								MenuPage.setStartActivity(4,1,3); 
							}
							//TalibaSha
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 2,3)== true)
							{
								MenuPage.setStartActivity(7,2,3); 
							}
							//Do
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 3,3)== true)
							{
								MenuPage.setStartActivity(16,3,3); 
							}
							//A
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 4,3)== true)
							{
								MenuPage.setStartActivity(15,4,3); 
							}
							//Doh
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 5,3)== true)
							{
								MenuPage.setStartActivity(20,5,3); 
							}
							
							///////////////////////////
							//Toh
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 1,4)== true)
							{
								MenuPage.setStartActivity(19,1,4); 
							}
							//Kho
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 2,4)== true)
							{
								MenuPage.setStartActivity(12,2,4); 
							}
							//U
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 3,4)== true)
							{
								MenuPage.setStartActivity(17,3,4); 
							}
							//Go
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 4,4)== true)
							{
								MenuPage.setStartActivity(10,4,4); 
							}
							//Ho
							else if(MenuPage.setMenuLetter(pSceneTouchEvent, 5,4)== true)
							{
								MenuPage.setStartActivity(11,5,4); 
//								MenuPage.setStartActivity(24,5,4); 
							}
							
							
						break;
						case TouchEvent.ACTION_UP:
		
						break;
						}
						return true;
					}
			
				};
				MenuPage.menuLetters[i][j].setScale((float) 0.4);
				//menuScene.registerTouchArea(MenuPage.menuLetters[i][j]);
				MenuPage.menuScene.attachChild(MenuPage.menuLetters[i][j]);
				
				MenuPage.letter[0] =  MenuPage.menuLetters[1][1];
				MenuPage.letter[1] =  MenuPage.menuLetters[2][1];
				MenuPage.letter[2] =  MenuPage.menuLetters[3][1];
				MenuPage.letter[3] =  MenuPage.menuLetters[4][1];
				MenuPage.letter[4] =  MenuPage.menuLetters[5][1];
				MenuPage.letter[5] =  MenuPage.menuLetters[6][1];
				
				MenuPage.letter[6] =  MenuPage.menuLetters[1][2];
				MenuPage.letter[7] =  MenuPage.menuLetters[2][2];
				MenuPage.letter[8] =  MenuPage.menuLetters[3][2];
				MenuPage.letter[9] =  MenuPage.menuLetters[4][2];
				MenuPage.letter[10] =  MenuPage.menuLetters[5][2];
				MenuPage.letter[11] =  MenuPage.menuLetters[6][2];
				
				MenuPage.letter[12] =  MenuPage.menuLetters[1][3];
				MenuPage.letter[13] =  MenuPage.menuLetters[2][3];
				MenuPage.letter[14] =  MenuPage.menuLetters[3][3];
				MenuPage.letter[15] =  MenuPage.menuLetters[4][3];
				MenuPage.letter[16] =  MenuPage.menuLetters[5][3];
				MenuPage.letter[17] =  MenuPage.menuLetters[6][3];
				
				MenuPage.letter[18] =  MenuPage.menuLetters[1][4];
				MenuPage.letter[19] =  MenuPage.menuLetters[2][4];
				MenuPage.letter[20] =  MenuPage.menuLetters[3][4];
				MenuPage.letter[21] =  MenuPage.menuLetters[4][4];
				MenuPage.letter[22] =  MenuPage.menuLetters[5][4];
				MenuPage.letter[23] =  MenuPage.menuLetters[6][4];
				
			}
			
		}
		
	}
	
	
	
	//set handwriting menu letters
	public static void setHandWritingMenuLetterIcon()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=4; j++) 
			{
				HandWritingMenu.menuLetters[i][j] = new Sprite(i*130-120, j*100-120, HandWritingMenu.mMenuTextureRegionMenuLetters[i][j],
						HandWritingMenu.vertexBufferObjectManager)
				{
					@Override
					public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
					{
						switch (pSceneTouchEvent.getAction()) 
						{
						case TouchEvent.ACTION_DOWN:
							
//							Debug.d("Touch:"+(pSceneTouchEvent.getX()- this.getWidth()/2));
//							Debug.d("Letter2.x:"+menuLetters[2][2].getX());
//							Debug.d("Letter2.y:"+menuLetters[2][2].getY());
							
							//1.Mo 2.Aa 3.e 4.Raw 5.Ko 6.Bo 7.TalibaSha 8.Lo 9.Po 10.Go 11.Ho
							//12.Kho 13.Cho 14.No 15.A 16.Do 17.U 18.To 19.Toh 20.Doh 21.Ukar
							//22.Ekar 23.Akar 24.Aakar
						
							//Mo
							if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 1,1)== true)
							{
								HandWritingMenu.setStartActivity(1,1,1);
							}
							//Aa
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 2,1)== true)
							{
								HandWritingMenu.setStartActivity(2,2,1); 
							}
							//Lo
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 3,1)== true)
							{
								HandWritingMenu.setStartActivity(8,3,1); 
							} 
							//Ko
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 4,1)== true)
							{
								HandWritingMenu.setStartActivity(5,4,1); 
							}
							//To
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 5,1)== true)
							{
								HandWritingMenu.setStartActivity(18,5,1); 
							}
							
							////////////////////
							//Bo
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 1,2)== true)
							{
								HandWritingMenu.setStartActivity(6,1,2); 
							}
							//No
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 2,2)== true)
							{
								HandWritingMenu.setStartActivity(14,2,2); 
							}
							//Cho
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 3,2)== true)
							{
								HandWritingMenu.setStartActivity(13,3,2); 
							}
							//E
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 4,2)== true)
							{
								HandWritingMenu.setStartActivity(3,4,2); 
							}
							//Po
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 5,2)== true)
							{
								HandWritingMenu.setStartActivity(9,5,2); 
							}
							
							
							///////////////////////////
							//Ro
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 1,3)== true)
							{
								HandWritingMenu.setStartActivity(4,1,3); 
							}
							//TalibaSha
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 2,3)== true)
							{
								HandWritingMenu.setStartActivity(7,2,3); 
							}
							//Do
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 3,3)== true)
							{
								HandWritingMenu.setStartActivity(16,3,3); 
							}
							//A
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 4,3)== true)
							{
								HandWritingMenu.setStartActivity(15,4,3); 
							}
							//Doh
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 5,3)== true)
							{
								HandWritingMenu.setStartActivity(20,5,3); 
							}
							
							///////////////////////////
							//Toh
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 1,4)== true)
							{
								HandWritingMenu.setStartActivity(19,1,4); 
							}
							//Kho
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 2,4)== true)
							{
								HandWritingMenu.setStartActivity(12,2,4); 
							}
							//U
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 3,4)== true)
							{
								HandWritingMenu.setStartActivity(17,3,4); 
							}
							//Go
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 4,4)== true)
							{
								HandWritingMenu.setStartActivity(10,4,4); 
							}
							//Ho
							else if(HandWritingMenu.setMenuLetter(pSceneTouchEvent, 5,4)== true)
							{
								HandWritingMenu.setStartActivity(11,5,4); 
//								setStartActivity(24,5,4); 
							}
							
							
						break;
						case TouchEvent.ACTION_UP:
		
						break;
						}
						return true;
					}
			
				};
				HandWritingMenu.menuLetters[i][j].setScale((float) 0.4);
				//menuScene.registerTouchArea(menuLetters[i][j]);
				HandWritingMenu.menuScene.attachChild(HandWritingMenu.menuLetters[i][j]);
			}
		}
		
		HandWritingMenu.handWritingLetter[0] =  HandWritingMenu.menuLetters[1][1];
		HandWritingMenu.handWritingLetter[1] =  HandWritingMenu.menuLetters[2][1];
		HandWritingMenu.handWritingLetter[2] =  HandWritingMenu.menuLetters[3][1];
		HandWritingMenu.handWritingLetter[3] =  HandWritingMenu.menuLetters[4][1];
		HandWritingMenu.handWritingLetter[4] =  HandWritingMenu.menuLetters[5][1];
		
		HandWritingMenu.handWritingLetter[5] =  HandWritingMenu.menuLetters[1][2];
		HandWritingMenu.handWritingLetter[6] =  HandWritingMenu.menuLetters[2][2];
		HandWritingMenu.handWritingLetter[7] =  HandWritingMenu.menuLetters[3][2];
		HandWritingMenu.handWritingLetter[8] =  HandWritingMenu.menuLetters[4][2];
		HandWritingMenu.handWritingLetter[9] =  HandWritingMenu.menuLetters[5][2];
		
		HandWritingMenu.handWritingLetter[10] =  HandWritingMenu.menuLetters[1][3];
		HandWritingMenu.handWritingLetter[11] =  HandWritingMenu.menuLetters[2][3];
		HandWritingMenu.handWritingLetter[12] =  HandWritingMenu.menuLetters[3][3];
		HandWritingMenu.handWritingLetter[13] =  HandWritingMenu.menuLetters[4][3];
		HandWritingMenu.handWritingLetter[14] =  HandWritingMenu.menuLetters[5][3];
		
		HandWritingMenu.handWritingLetter[15] =  HandWritingMenu.menuLetters[1][4];
		HandWritingMenu.handWritingLetter[16] =  HandWritingMenu.menuLetters[2][4];
		HandWritingMenu.handWritingLetter[17] =  HandWritingMenu.menuLetters[3][4];
		HandWritingMenu.handWritingLetter[18] =  HandWritingMenu.menuLetters[4][4];
		HandWritingMenu.handWritingLetter[19] =  HandWritingMenu.menuLetters[5][4];
	}
	
	
	
}
