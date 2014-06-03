package com.example.phonicsapp.wordbuilding;

import java.util.ArrayList;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class SequenceSound {

	ArrayList<Integer> SoundArray;
	static MediaPlayer mediaPlayer;
	int currentIndex;
	public SequenceSound(ArrayList<Integer> sound) {
		SoundArray = new ArrayList<Integer>();
		SoundArray = sound;
		mediaPlayer = Sound.mediaPlayer;
		currentIndex = 0;
	}	
	
	public int  playSequenceSound(int index) {
		currentIndex = index;
		if(currentIndex >= SoundArray.size()){
			//BaseActivity.playSequenceSoundFlag = 0;
			return 0;
		}
		//sound1 = sound;
		mediaPlayer.reset();
		mediaPlayer = MediaPlayer.create(BaseActivity.context, SoundArray.get(currentIndex));
		try {
			mediaPlayer.start();
			mediaPlayer.setLooping(false);
			mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
				
				@Override
				public void onCompletion(MediaPlayer mp) {
					if (currentIndex < SoundArray.size()-1) {
						currentIndex++;
						mp = MediaPlayer.create(BaseActivity.context, SoundArray.get(currentIndex));
						mp.setOnCompletionListener(this);
						mp.start();
				      }
					/*currentIndex = currentIndex++;
			       	playSequenceSound (currentIndex);*/
			    }					
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}		
}
