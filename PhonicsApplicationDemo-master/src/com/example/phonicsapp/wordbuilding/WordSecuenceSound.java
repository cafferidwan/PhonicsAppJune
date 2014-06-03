package com.example.phonicsapp.wordbuilding;

import java.util.ArrayList;

public class WordSecuenceSound {
	ArrayList<String> secquence;
	int voice;	
	String word;
	Mouled module;
	public WordSecuenceSound(ArrayList<String> secquence, int voice, String w) {
		super();
		this.secquence = secquence;
		this.voice = voice;
		this.word = w;
		this.module = null;
	}
	public WordSecuenceSound(ArrayList<String> secquence, int voice, String w,Mouled mo) {
		super();
		this.secquence = secquence;
		this.voice = voice;
		this.word = w;
		this.module = mo;
	}
	public WordSecuenceSound() {
		
	}
	
	 /*static void sortASC(){
		ArrayList< ArrayList<Marker>> secquenceContainerTemp = null ;
		for(int i = 0; i < secquenceContainer.size(); i++){
			for(int j=0; j<secquenceContainer.size()-1; j++){
				if(secquenceContainer.get(j).size() > secquenceContainer.get(j+1).size()){
					secquenceContainerTemp.add(secquenceContainer.get(j));
					secquenceContainer.add(j, secquenceContainer.get(j+1));
					secquenceContainer.add(j+1, secquenceContainerTemp.get(0));
					secquenceContainerTemp.clear();
				}
			}
		}
	}*/
}
