package com.example.phonicsapp.wordbuilding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.R.integer;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class Sound {
	
	static int currentPosition;
	static MediaPlayer mediaPlayer = new MediaPlayer();
	static MediaPlayer mediaPlayer2 = new MediaPlayer();
	public static Map<String, Integer> singleSound = new HashMap<String,Integer>();
	static ArrayList<Integer> sound1 = new ArrayList<Integer>();
	
	public Sound(){
	}
	
	public static Integer getSingleSound(String key) {
		return singleSound.get(key);
	}

	public static void setSingleSound(String letterName, Integer value) {
		/*Sound.singleSound = singleSound;*/
		singleSound.put(letterName, value);
	}
	
	public static void playSingleSound(int sound) {
		mediaPlayer.reset();
		mediaPlayer = MediaPlayer.create(BaseActivity.context, sound);
		try {
			mediaPlayer.start();
			mediaPlayer.setLooping(false);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void playSingleSound2(int sound) {
		mediaPlayer2.reset();
		mediaPlayer2 = MediaPlayer.create(BaseActivity.context, sound);
		try {
			mediaPlayer2.start();
			mediaPlayer2.setLooping(false);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int  playSequenceSound(int index) {
		currentPosition = index;
		if(currentPosition >= sound1.size()){
		//	BaseActivity.playSequenceSoundFlag = 0;
			return 0;
		}
		mediaPlayer.reset();
		mediaPlayer = MediaPlayer.create(BaseActivity.context, sound1.get(currentPosition));
		try {
			
			mediaPlayer.start();
			mediaPlayer.setLooping(false);
			mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
				
				@Override
				public void onCompletion(MediaPlayer mp) {
					 if (currentPosition >= sound1.size()) {
			                // Last song, just reset currentPosition
			                currentPosition = 0;
			                //mediaPlayer.reset();
			                
			        } else {
			                // Play next song
			        	currentPosition++;
			        	playSequenceSound (currentPosition);
			        }
					
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public static void playSingleSound3(int sound, boolean f) {
		if(f){
			if(!mediaPlayer.isPlaying()){
				mediaPlayer.reset();
				mediaPlayer = MediaPlayer.create(BaseActivity.context, sound);
				try {
					mediaPlayer.start();
					mediaPlayer.setLooping(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		else{
		mediaPlayer.reset();
		mediaPlayer = MediaPlayer.create(BaseActivity.context, sound);
		try {
			mediaPlayer.start();
			mediaPlayer.setLooping(false);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
}
