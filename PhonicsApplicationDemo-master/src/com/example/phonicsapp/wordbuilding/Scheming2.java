package com.example.phonicsapp.wordbuilding;

import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.sprite.Sprite;

import android.os.Handler;
import android.util.Log;

public class Scheming2 {
	static boolean flag;
	static Marker boundaryMarker;
	
	Handler handler;
	
	static int addjestedY = 20;
	public static Sprite spr1 = new Sprite(0, 0,BaseActivity.textureReason.get(0), BaseActivity.vobm);
	public static Sprite spr2 = new Sprite(0, 0,BaseActivity.textureReason.get(0), BaseActivity.vobm);
	private static String TAG = "Scheming2";
	
	public static void chk(Marker ThisObj){
		try{
		flag = true;
		while(ThisObj != null){
			if(flag){		
				ThisObj = ThisObj.mostLeft;
				flag = false;
			}
			Marker m = getColliedObj(ThisObj);
			if(m != null){
				if(checkJoinPermisson(ThisObj,m)){
					int colliedSide = getColliedSide(ThisObj, m);
					join(ThisObj, colliedSide, m);
				}
			}
			if(ThisObj != null){
				ThisObj = ThisObj.right;
			}
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static Marker getColliedObj(Marker ThisMarker){ 
		if(ThisMarker == null){
			return null;
		}
		spr1.setPosition(ThisMarker.letter.getX(), ThisMarker.letter.getY());
		spr1.setVisible(false);
		spr1.setHeight(ThisMarker.letter.getHeight() + 15);
		spr1.setWidth(ThisMarker.letter.getWidth() + 20);

		//spr2.setVisible(false);
		
		for(int i=0;i<BaseActivity.allMarkers.size();i++){
			spr2.setPosition(BaseActivity.allMarkers.get(i).letter.getX(),	BaseActivity.allMarkers.get(i).letter.getY());
			spr2.setHeight(BaseActivity.allMarkers.get(i).letter.getHeight() + 15);
			spr2.setWidth(BaseActivity.allMarkers.get(i).letter.getWidth() + 20);
			if(!ThisMarker.equals(BaseActivity.allMarkers.get(i))){
				if(chkJoinConditions(ThisMarker,BaseActivity.allMarkers.get(i))){
					if(spr2.collidesWith(spr1)){
						return BaseActivity.allMarkers.get(i);
					}
				}
			}
		}		
		return null;		
	}
	
	public static int getColliedSide(Marker ThisObj, Marker ColliedObj){
		// Return collied side of this obj 
		double thisX = ThisObj.letter.getX();
		double thisY = ThisObj.letter.getY();
		double ColliedX = ColliedObj.letter.getX();
		double ColliedY = ColliedObj.letter.getY();
		
		float thisWidth = ThisObj.letter.getWidth();
		float thisHeight = ThisObj.letter.getHeight();
		float ColliedWidth = ColliedObj.letter.getWidth(); 
		float ColliedHeight = ColliedObj.letter.getHeight();
		
		int var = 10;
		
		
		//if left collied
		if(ColliedX  < thisX  && (ColliedY > thisY -var && ColliedY < thisY + var ) && ThisObj.joinLeft && ColliedObj.joinRight) {
			return 1; 
		}
		//If Top Collied
		else if(thisY  > ColliedY + ColliedHeight -20 && (thisX-var <ColliedX && thisX+ var > ColliedX) && ThisObj.joinTop && ColliedObj.joinBottom) {
			return 2; 
		}
		//If Right Collied
		else if( ColliedX >= thisX-20 + thisWidth &&  (ColliedY - var < thisY && ColliedY + var > thisY) && ThisObj.joinRight && ColliedObj.joinLeft) {
		//else if(ColliedObj.letter.getX() >= ThisObj.letter.getX()  && ThisObj.joinRight && ColliedObj.joinLeft) {
			return 3; 
		}
		//If Bottom Collied
		else if(ColliedY  > thisY + thisWidth && (ColliedX > thisX -var && ColliedX < thisX + var ) && ThisObj.joinBottom && ColliedObj.joinTop) {
			return 4; 
		}
		return 0;		
	}
	
	public static boolean checkJoinPermisson(Marker ThisObj, Marker ColliedObj){
		int colliedSide = getColliedSide(ThisObj, ColliedObj);
		
		if(colliedSide == 1){
			if(ColliedObj.joinRight && ThisObj.joinLeft){
				return true;
			}
		}
		else if(colliedSide == 2){
			if(ColliedObj.joinBottom && ThisObj.joinTop){
				return true;
			}
		}
		else if(colliedSide == 3){
			if(ColliedObj.joinLeft && ThisObj.joinRight){
				return true;
			}
		}
		else if(colliedSide == 4){
			if(ColliedObj.joinTop && ThisObj.joinBottom){
				return true;
			}
		}
		return false;
		
	}
	public static void join(Marker ThisObj , int side, Marker colliedObj){
		if(side == 1){
			ThisObj.isSingle = false;
			colliedObj.isSingle = false;
			 
			ThisObj.left = colliedObj;
			colliedObj.right = ThisObj;
			ThisObj.mostLeft = colliedObj.mostLeft;
			
			ThisObj.leftValue = 0;
			colliedObj.rightValue = 0;
			magnaticJoin2(ThisObj);
			//joinFinished(ThisObj);
		}
		else if(side == 2){
			ThisObj.isSingle = false;
			colliedObj.isSingle = false;
			
			ThisObj.up = colliedObj;
			colliedObj.bottom = ThisObj;
			ThisObj.upValue = 0;
			colliedObj.bottomtValue = 0;
			magnaticJoinRight(ThisObj);
			//joinFinished(ThisObj);
			
		}
		else if(side == 3){
			ThisObj.isSingle = false;
			colliedObj.isSingle = false;
			
			ThisObj.right = colliedObj;
			colliedObj.left = ThisObj;
			ThisObj.rightValue = 0; 
			colliedObj.leftValue = 0;
			ThisObj.mostRight = colliedObj.mostRight;
			magnaticJoinRight(ThisObj);
			//joinFinished(ThisObj);
			
		}
		else if(side == 4){
			ThisObj.isSingle = false;
			colliedObj.isSingle = false;
			
			ThisObj.bottom = colliedObj;
			colliedObj.up = ThisObj;
			ThisObj.bottomtValue = 0;
			colliedObj.upValue = 0;
			magnaticJoinRight(ThisObj);
			//joinFinished(ThisObj);			
		}
		joinFinished(ThisObj);
		//moveBlock(ThisObj.letter.getX(), ThisObj.letter.getY(), ThisObj.letter.getX(), ThisObj.letter.getY(), ThisObj);
		
	}
	public static void moveBlock(float px, float py, float ax, float ay, Marker marker) {
		Marker leftLast = getLeftLastObject(marker) ;
		
		if(marker.bottom == null || marker.up == null ){
			leftLast = marker.mostLeft;
		}
		if (marker.up != null){
			leftLast = marker.up.mostLeft;
		}
//Log.d(TAG, "Moving In Marker MostLeft: " + marker.mostLeft.letter.getUserData());
		while (leftLast != null ) {
 			if (!leftLast.equals(marker)) {
				float nx = leftLast.letter.getX() + (ax - px);
				float ny = leftLast.letter.getY() + (ay - py);
				leftLast.letter.setPosition(nx, ny);
				}
 			if(leftLast.bottom !=null && !leftLast.bottom.equals(marker)){
				leftLast.bottom.letter.setPosition(leftLast.bottom.letter.getX() +(ax-px),leftLast.bottom.letter.getY()+(ay-py));
			}
			
			leftLast = leftLast.right;
		}

	}
	
	public static Marker getLeftLastObject(Marker marker) {
		if(marker == null){
			return null;
		}
		Marker tempMarker = marker;
		if(marker.up != null){
			tempMarker = marker.up;
		}
		if (tempMarker.left == null) {
			return tempMarker;
		}
		while (tempMarker != null) {
			marker = tempMarker;
			tempMarker = marker.left;
		}
		return marker;
	}

	public static Marker getRightLastObject(Marker marker) {
		if(marker == null){
			return null;
		}
		Marker tempMarker = marker;
		if(marker.up != null){
			tempMarker = marker.up;
		}
		if (tempMarker.right == null) {
			return tempMarker;
		}
		while (tempMarker != null) {
			marker = tempMarker;
			tempMarker = marker.right;
		}
		return marker;
	}	
	
	public static void joinFinished(Marker marker){
		
			marker.mostLeft = getLeftLastObject(marker);
			marker.mostRight = getRightLastObject(marker); 
			//Log.d(TAG , "MostLeft "+ marker.mostLeft.letter.getUserData());
			//Log.d(TAG , "MostRight "+ marker.mostRight.letter.getUserData());
			if(marker.up !=null){
				marker.up.mostLeft = marker.mostLeft;
				marker.up.mostRight = marker.mostRight;
			}
			
			updateLeftRightMarker(marker.mostLeft);
			//magnaticJoin(marker.mostLeft);
			//setZindexForBlock(marker.mostLeft,100);
			Log.d("Join sound ", "Not play" );
			if(!BaseActivity.chk){
				BaseActivity.chk = true;
			}
			Words.chk_sequence(marker.mostLeft);
			manageZindez(true,marker.mostLeft);
			//marker.letter.
			/*Words.chk_sequence(marker.mostLeft);
			if(!Words.wrongCombinationDetections(Words.secquenceContainer.get(HelpMode.level), marker.mostLeft)){
				Words.wrongWordCounter++;
			}*/
	}
	
	public static void magnaticJoinRight(Marker marker) {
		marker = getLeftLastObject(marker);
		//Marker mr = null, ml = marker;
		while (marker != null) {
			if (marker.left != null || marker.bottom != null) {
				if((marker.left != null || marker.right != null)){
					if(marker.left != null){
						marker.letter.setPosition(marker.left.letter.getX() + marker.left.letter.getWidth(),marker.left.letter.getY());
						Log.d("Marker Position ",marker.letter.getUserData() + " x: " + Float.toString(marker.letter.getX()));
					}
					else{
					//	marker.letter.setPosition(marker.right.letter.getX() - marker.letter.getWidth(),marker.right.letter.getY());
					}
				}
				if(marker.joinBottom && marker.bottom != null){
					marker.bottom.letter.setPosition(marker.letter.getX() ,marker.letter.getY() + marker.letter.getHeight());
				}
				
			}
			//marker.mostLeft = ml;
			marker = marker.right;
		}
	}
	
	public static void magnaticJoin2(Marker marker) {
		marker = getLeftLastObject(marker);
		
		if(marker != null){
			marker = getRightLastObject(marker);
		}
		while (marker != null) {
			if (marker.right != null) {
				if((marker.left != null || marker.right != null)){
					if(marker.right != null){
						marker.letter.setPosition(marker.right.letter.getX() - marker.letter.getWidth(),marker.right.letter.getY());
					}
				}
				if(marker.joinBottom && marker.bottom != null){
					marker.bottom.letter.setPosition(marker.letter.getX() ,marker.letter.getY() + marker.letter.getHeight()); 
				}
				
			}
			//marker.mostRight = mr;
			marker = marker.left;		
		}
		
	}

	static boolean chkJoinConditions(Marker ThisObj, Marker colliedObj){
		int side = getColliedSide(ThisObj, colliedObj); 
		if(side == 1){
			if(ThisObj.leftValue + colliedObj.rightValue == 0 && ThisObj.leftValue != 0 &&  colliedObj.rightValue != 0){
				return true;
			}
		}
		else if(side == 2){
			if(ThisObj.upValue + colliedObj.bottomtValue == 0 && ThisObj.upValue != 0 &&  colliedObj.bottomtValue != 0){
				return true;
			}			
		}
		else if(side == 3){
			if(ThisObj.rightValue + colliedObj.leftValue == 0 && ThisObj.rightValue != 0 &&  colliedObj.leftValue != 0){
				return true;
			}			
		}
		else if(side == 4){
			if(ThisObj.bottomtValue + colliedObj.upValue == 0 && ThisObj.bottomtValue != 0 &&  colliedObj.upValue != 0){
				return true;
			}	
		}
		return false;
		
	}
	public static int checkBoundary(Marker marker) {
		Marker leftMarker1 = marker.mostLeft;
		Marker rightMarker1 = marker.mostRight;
		
		boundaryMarker = marker;

		if (leftMarker1 == null) {
			leftMarker1 = marker;
		}
		if (rightMarker1 == null) {
			rightMarker1 = marker;
		}

		//Left 
		if (leftMarker1.letter.getX() < -30) {
			while (leftMarker1 != null) {
				MoveModifier mf = new MoveModifier(0.4f,leftMarker1.letter.getX(),leftMarker1.letter.getX() + 50,leftMarker1.letter.getY(), leftMarker1.letter.getY());
				leftMarker1.letter.registerEntityModifier(mf);
				leftMarker1 = leftMarker1.right;
			}
			return 1;
		}
		//Top
		else if (leftMarker1.letter.getY() < -20) {
			while (leftMarker1 != null) {
				MoveModifier mf = new MoveModifier(0.4f,leftMarker1.letter.getX(), leftMarker1.letter.getX(),leftMarker1.letter.getY(),leftMarker1.letter.getY() + 50);
				leftMarker1.letter.registerEntityModifier(mf);
				leftMarker1 = leftMarker1.right;
			}
			return 2;
		}
		//Right
		else if (rightMarker1.letter.getX() + 100 > BaseActivity.CAMERA_WIDTH + 30) {
			while (rightMarker1 != null) {
				MoveModifier mf = new MoveModifier(0.4f,rightMarker1.letter.getX(),rightMarker1.letter.getX() - 50,rightMarker1.letter.getY(), rightMarker1.letter.getY());
				rightMarker1.letter.registerEntityModifier(mf);
				rightMarker1 = rightMarker1.left;
			}
			return 3;
		}
		//Bottom 
		else if (leftMarker1.letter.getY() + 100 > BaseActivity.CAMERA_HEIGHT + 20) {
			while (leftMarker1 != null) {
				MoveModifier mf = new MoveModifier(0.4f,
						leftMarker1.letter.getX(), leftMarker1.letter.getX(),leftMarker1.letter.getY(),leftMarker1.letter.getY() - 50);
				leftMarker1.letter.registerEntityModifier(mf);
				leftMarker1 = leftMarker1.right;
			}
			return 4;
		}
		
		return 0;
	}
	public static int getBlockSize(Marker marker){
		
		int counter1 = 0;
		while(marker != null){
			counter1 ++;
			if(marker.bottom != null){
				counter1 ++;
			}
			marker = marker.right;
		}
		return counter1;
	}
	/*public static void timer1(){
		BaseActivity.mCurrentScene.registerUpdateHandler(new TimerHandler(0.5f, new ITimerCallback() {
			
			@Override
			public void onTimePassed(TimerHandler arg0) {
				BaseActivity.FinishMethodCallFlag = 0;
			}
		}));
	}*/
	public static void manageZindez(Boolean status, Marker mostLeft){
		if(!status){
			while (mostLeft != null) {
				mostLeft.letter.setZIndex(30);//(mostLeft.letter.getZIndex() - 1);
				if(mostLeft.bottom != null){
					mostLeft.bottom.letter.setZIndex(30);
				}
				mostLeft = mostLeft.right;
			}
		} 
		else if(status){
			while (mostLeft != null) {
				if(mostLeft.letter.getUserData().equals(Letters.lettersNameContainer.indexOf("i"))){
					mostLeft.letter.setZIndex(150);
				}
				else{
					mostLeft.letter.setZIndex(100);//(mostLeft.letter.getZIndex() + 1);
				}
				if(mostLeft.bottom != null){
					mostLeft.bottom.letter.setZIndex(100);//(mostLeft.bottom.letter.getZIndex() + 1);
				}
				mostLeft = mostLeft.right;
			}
		}
		BaseActivity.mCurrentScene.sortChildren();
	}
	
	public static void updateLeftRightMarker(Marker mostLeftMarker){
		Marker tempMarker = mostLeftMarker;
		while(tempMarker != null){
			tempMarker.mostLeft = mostLeftMarker;
			tempMarker.mostRight = mostLeftMarker.mostRight;
			if(tempMarker.bottom != null){
				tempMarker.bottom.mostLeft = mostLeftMarker;
				tempMarker.bottom.mostRight = mostLeftMarker.mostRight;
			}
			tempMarker = tempMarker.right;
		}
	}
	
}
