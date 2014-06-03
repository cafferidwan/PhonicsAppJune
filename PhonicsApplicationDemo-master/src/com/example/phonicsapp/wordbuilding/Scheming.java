package com.example.phonicsapp.wordbuilding;

import javax.microedition.khronos.opengles.GL10;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.modifier.AlphaModifier;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.ScaleModifier;
import org.andengine.entity.sprite.Sprite;

import android.util.Log;

public class Scheming {

	public static Marker leftMarker, rightMarker,boundaryMarker;
	public static String TAG = "Scheming class";
	
	public static Sprite spr1 = new Sprite(0, 0,BaseActivity.textureReason.get(0), BaseActivity.vobm);
	public static Sprite spr2 = new Sprite(0, 0,BaseActivity.textureReason.get(0), BaseActivity.vobm);

	public static void collutionDetection(Marker marker) {
		Marker m;
		if (marker.left == null && marker.right == null && marker.bottom == null) {
			//Log.d(TAG, "if Left and Right both are null ");
			m = getColliedObject(marker);
			if (m != null) {
				//Log.d(TAG, "If collied object is null "); 
				int lr = getLeftRight(marker, m);
				//Log.d(TAG, "Get left or right: " + lr);
				if (lr == 1) {
					m.isSingle = false;
					marker.isSingle = false;
					marker.left = m;
					m.right = marker;
				} else if (lr == 2) {
					m.isSingle = false;
					marker.isSingle = false;
					marker.right = m;
					m.left = marker;
				}
				else if (lr == 3) {
					m.isSingle = false;
					marker.isSingle = false;
					marker.bottom = m;
					m.up = marker;
				}
				else if (lr == 4) {
					m.isSingle = false;
					marker.isSingle = false;
					marker.up = m;
					m.bottom = marker;
				}
				joinFinished(marker);
			}
		} else {
			//Log.d(TAG, "if Left and Right both are not null ");
			if (marker.right == null) {
				//Log.d(TAG, "if Right is empty ");
				// leftMarker = getLeftLastObject(marker);
				m = getColliedObject(marker);
				if (m != null) {
					m.isSingle = false;
					m.left = marker;
					marker.right = m;
					joinFinished(marker);
				}
				leftMarker = marker.mostLeft;
				m = getColliedObject(leftMarker);
				if (m != null) {
					m.isSingle = false;
					m.right = leftMarker;
					leftMarker.left = m;
					joinFinished(marker);
				}
				
			}
			if (marker.left == null) {
				//Log.d(TAG, "if Left is empty ");
				// rightMarker = getRightLastObject(marker);
				m = getColliedObject(marker);
				if (m != null) {
					m.isSingle = false;
					m.right = marker;
					marker.left = m;
					joinFinished(marker);
				}

				rightMarker = marker.mostRight;
				m = getColliedObject(rightMarker);
				if (m != null) {
					m.isSingle = false;
					m.left = rightMarker;
					rightMarker.right = m;
					joinFinished(marker);
				}
				
			}
			if (marker.left != null && marker.right != null) {
				Log.d(TAG, "if Left Right is not empty ");
				leftMarker = marker.mostLeft;
				m = getColliedObject(leftMarker);
				if (m != null) {
					m.isSingle = false;
					m.right = leftMarker;
					leftMarker.left = m;
					joinFinished(marker);
				}

				rightMarker = marker.mostRight; 
				m = getColliedObject(rightMarker);
				if (m != null) {
					m.isSingle = false;
					m.left = rightMarker;
					rightMarker.right = m;
					joinFinished(marker);
				}				
			}
		}

	}

	public static Marker getColliedObject(Marker marker) {
		
		if(marker == null) return null;

		/*Sprite spr1 = new Sprite(marker.letter.getX(), marker.letter.getY(),BaseActivity.textureReason.get(0), BaseActivity.vobm);
		Sprite spr2 = new Sprite(marker.letter.getX(), marker.letter.getY(),BaseActivity.textureReason.get(0), BaseActivity.vobm);*/

		Log.d(TAG, " Marker name: " + marker.letter.getUserData() );
		spr1.setPosition(marker.letter.getX(), marker.letter.getY());
		spr1.setVisible(false);
		spr1.setHeight(marker.letter.getHeight() + 10);
		spr1.setWidth(marker.letter.getWidth() + 10);

		spr2.setVisible(false);
		spr2.setHeight(marker.letter.getHeight() + 10);
		spr2.setWidth(marker.letter.getWidth() + 10);

		magnaticJoin(marker);

		for (int i = 0; i < BaseActivity.markers.size(); i++) {
			if(!BaseActivity.markers.get(i).equals(marker)){
				if (true /*BaseActivity.markers.get(i).isSingle*/) {
	
					spr2.setPosition(BaseActivity.markers.get(i).letter.getX(),	BaseActivity.markers.get(i).letter.getY());
	
					 
					if(allowJoin(spr1,spr2)){
						if (spr2.collidesWith(spr1)) {
							if(isAllowedToCollied(marker, BaseActivity.markers.get(i))){
								return BaseActivity.markers.get(i);
							} 
						}
					}	
				}
			}
				
		}
		return null; 
	}
	
	public static boolean isAllowedToCollied(Marker marker, Marker m2){
		// if collied on left 
		if( m2.letter.getX() < marker.letter.getX()){
			if(m2.rightValue != 0 && marker.leftValue !=0 && m2.rightValue + marker.leftValue == 0){
				m2.rightValue =0;
				marker.leftValue=0;
				return true;
			}
		}
		//if collied on right 
		else if( m2.letter.getX() > marker.letter.getX()){
			if(m2.leftValue != 0 && marker.rightValue != 0 && m2.leftValue+ marker.rightValue == 0){
				m2.leftValue = 0;
				marker.rightValue = 0; 
				return true;
			}
		}
		return false;
	}
	public static void moveBlock(float px, float py, float ax, float ay, Marker marker) {
		Marker leftLast = marker.mostLeft;

		while (leftLast != null) {
			if (!leftLast.equals(marker)) {
				float nx = leftLast.letter.getX() + (ax - px);
				float ny = leftLast.letter.getY() + (ay - py);
				leftLast.letter.setPosition(nx, ny);
				if(leftLast.bottom !=null){
					//leftLast.bottom.letter.setPosition(leftLast.bottom.letter.getX() +(ax-px),leftLast.bottom.letter.getY()+(ay-py));
				}
			}
			leftLast = leftLast.right;
		}

	}

	public static Marker getLeftLastObject(Marker marker) {
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

	static int getLeftRight(Marker thisMarker, Marker colliedMarker) {

		//Left
		if (thisMarker.letter.getX() > colliedMarker.letter.getX() && (thisMarker.letter.getY()>colliedMarker.letter.getY() && thisMarker.letter.getY() + thisMarker.letter.getHeight()<colliedMarker.letter.getY() + colliedMarker.letter.getHeight())) {
			return 1;
		}
		//Right
		else if(thisMarker.letter.getX() < colliedMarker.letter.getX() && (thisMarker.letter.getY()>colliedMarker.letter.getY() && thisMarker.letter.getY() + thisMarker.letter.getHeight()<colliedMarker.letter.getY() + colliedMarker.letter.getHeight())){
			return 2;
		}
		//UP
		else if(thisMarker.letter.getY() < colliedMarker.letter.getY()){
			return 3;
		}
		//Down
		else if(thisMarker.letter.getY() > colliedMarker.letter.getY()) {
			return 4;
		}
		return 0;
	}

	public static boolean allowJoin(Sprite sp1, Sprite sp2) {
		/*if (sp1.getX() - sp2.getX() > 105 && sp1.getX() - sp2.getX() < 205 && sp1.getY() - sp2.getY() < 40 && sp1.getY() - sp2.getY() > - 40) {
			return true;
		} else if (sp2.getX() - sp1.getX() > 105 && sp2.getX() - sp1.getX() < 205 && sp2.getY() - sp1.getY() < 40 && sp2.getY() - sp1.getY() > - 40) {
			return true;
		}*/
		return true;

	}

	public static void magnaticJoin(Marker marker) {
		//marker = getLeftLastObject(marker);
		while (marker != null) {
			if (marker.left != null) {
				if(marker.joinLeft || marker.joinRight){
					marker.letter.setPosition(marker.left.letter.getX() + marker.left.letter.getWidth(),marker.left.letter.getY());
				}
				else if(marker.joinBottom){
					marker.letter.setPosition(marker.left.letter.getX() ,marker.left.letter.getY()+marker.left.letter.getHeight());
				}
				
			}
			marker = marker.right;
		}
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
	public static void joinFinished(Marker marker){
		marker.mostLeft = getLeftLastObject(marker);
		marker.mostRight = getRightLastObject(marker);
		magnaticJoin(marker.mostLeft);
		setZindexForBlock(marker.mostLeft,100);
		Log.d("Join sound ", "Not play" );
		if(!BaseActivity.chk){
			BaseActivity.chk = true;
		}
		Words.chk_sequence(marker.mostLeft);
		/*if(!Words.wrongCombinationDetections(Words.secquenceContainer.get(HelpMode.level), marker.mostLeft)){
			Words.wrongWordCounter++;
		}*/
		
	}
	
	public static void setZindexForBlock(Marker marker, int indx) {
		while (marker != null) {
			marker.letter.setZIndex(indx);
			marker = marker.right;
		}
		BaseActivity.mCurrentScene.sortChildren();
	}
	public static int getBlockSize(Marker marker){
	
		int counter1 = 0;
		while(marker != null){
			counter1 ++;
			marker = marker.right;
		}
		return counter1;
	}
	public static void removeMarkar(Marker marker){
		final Marker mark = marker;
		marker.letter.registerEntityModifier(new MoveModifier(0.5f,marker.letter.getX(),-200, marker.letter.getY(), marker.letter.getY()));
		marker.letter.registerEntityModifier(new AlphaModifier(0.35f, 1, 0));
		marker.letter.registerEntityModifier(new ScaleModifier(0.35f, 1, 0));
		
		BaseActivity.mCurrentScene.registerUpdateHandler(new TimerHandler(0.5f, new ITimerCallback() {
			
			@Override
			public void onTimePassed(TimerHandler arg0) {
				mark.letter.setBlendFunction(GL10.GL_SRC_ALPHA, GL10.GL_ONE_MINUS_SRC_ALPHA);
				BaseActivity.mCurrentScene.unregisterTouchArea(mark.letter);
				BaseActivity.mCurrentScene.detachChild(mark.letter);
				BaseActivity.markers.remove(mark);
			}
		}));		
		
	}
	boolean joinEdgeChk(Marker m1, Marker m2){
		int a = getLeftRight(m1,m2);
		if(a==1 || a==2){
			return true;
		}		
		else if(a==3 || a==4){
			return true;
		}
		return false;
	}
	
/*public static void delayBounderyChk (){
		
		DelayModifier dm2 = new DelayModifier(4,new IEntityModifierListener() {
			
			@Override
			public void onModifierStarted(IModifier<IEntity> arg0,
					IEntity arg1) {
				
			}

			@Override
			public void onModifierFinished(IModifier<IEntity> arg0,
						IEntity arg1) {
				
				}
		});		
	}*/
}
