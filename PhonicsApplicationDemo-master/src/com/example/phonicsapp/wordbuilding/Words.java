package com.example.phonicsapp.wordbuilding;

import java.util.ArrayList;
import java.util.Map;

import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;

import com.example.phonicsapp.R;

import android.util.Log;

public class Words {
	
	static ArrayList<String> secquence1;
	static ArrayList<Marker> secquence_ku;
	static ArrayList<Integer>soundArray;
	
	public static ArrayList<WordSecuenceSound> wsContainer;
	public static ArrayList<WordSecuenceSound> iwsContainer;
	
	public static Map<String, ArrayList<Marker>>  secquences;
	public static ArrayList< Mouled> secquenceMouled;
	public static Mouled alivetMouled;
	public static int currentStage=0, wrongWordCounter;
	public static ArrayList< ArrayList<String>> secquenceContainer;
	static ArrayList< ArrayList<Marker>> secquenceContainerTemp = new ArrayList<ArrayList<Marker>>() ;
	public static boolean touched,tt;
	//static MediaPlayer mediaPlayer1 = new MediaPlayer();
	private static String TAG = "WORDS";
	
	public Words(){
		
	}
	public static void  createScequences(){
		currentStage = 0;
		wrongWordCounter = 0;
		secquenceContainer = new ArrayList<ArrayList<String>>();
		
		alivetMouled = BaseActivity.mouled1;
		
		wsContainer = new ArrayList<WordSecuenceSound>();
		iwsContainer = new ArrayList<WordSecuenceSound>();
		
		//মা : 
		secquence1 = new ArrayList<String>();
		secquence1.add("m"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ma,"ma",BaseActivity.mouled.get(0)));


		//আম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("Aa"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.am,"am",BaseActivity.mouled.get(1)));


		//লাল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.lal,"lal",BaseActivity.mouled.get(2)));


		//মালা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.mala,"mala",BaseActivity.mouled.get(3)));


		//মলম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("l"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.molom,"molom",BaseActivity.mouled.get(4)));


		//কলম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("l"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kolom,"kolom",BaseActivity.mouled.get(6)));


		//কাক : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("akar"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kak,"kak",BaseActivity.mouled.get(5)));


		//কাল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ma,"kal"));


		//কলা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kola,"kola",BaseActivity.mouled.get(7)));


		//কল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kol,"kol"));


		//তাল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.tal,"tal"));


		//তালা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ma,"kal"));


		//তামা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquence1.add("m"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.tama,"tama"));


		//তাক : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.tak,"tak"));


		//লতা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("l"); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.lota,"lota"));


		//আটা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("Aa"); 
		secquence1.add("T"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.atta,"atta"));


		//বক : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.bok,"bok"));


		//বল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ball,"ball"));


		//বাবা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("akar"); 
		secquence1.add("b"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.baba,"baba"));


		//তবলা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("t"); 
		secquence1.add("b"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.tobla,"tobla"));


		//বাম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("akar"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.bam,"bam"));


		//বালক : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.balok,"balok"));


		//বন : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.bon,"bon"));


		//নখ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("n"); 
		secquence1.add("kh"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.nokh,"nokh"));


		//নাম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("n"); 
		secquence1.add("akar"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.nam,"nam"));


		//নলক : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("n"); 
		secquence1.add("l"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.nolok,"nolok"));


		//নানা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("n"); 
		secquence1.add("akar"); 
		secquence1.add("n"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.nana,"nana"));


		//চক : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chok,"chok"));


		//চাকা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("akar"); 
		secquence1.add("k"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chaka,"chaka"));


		//নাচ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("n"); 
		secquence1.add("akar"); 
		secquence1.add("ch"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.nach,"nach"));


		//চাল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chal,"chal"));


		//চালা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chala,"chala"));


		//চানা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("akar"); 
		secquence1.add("n"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chana,"chana"));


		//চালাক : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chalak,"chalak"));


		//চামচ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("akar"); 
		secquence1.add("m"); 
		secquence1.add("ch"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chamoch,"chamoch"));


		//মই : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("I"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.moi,"moi"));


		//বই : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("I"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.boi,"boi"));


		//কই : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("I"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.koi,"koi"));


		//চাবি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("b"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chabi,"chabi"));


		//বাতি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("t"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.bati,"bati"));


		//কবিতা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("i"); 
		secquence1.add("b"); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kobita,"kobita"));


		//বালতি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquence1.add("i"); 
		secquence1.add("t"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.balti,"balti"));


		//ইলিশ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("I"); 
		secquence1.add("i"); 
		secquence1.add("l"); 
		secquence1.add("sh"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.elish,"elish"));


		//পানি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("p"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.pani,"pani"));


		//পালক : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("p"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.palok,"palok"));


		//পাতিল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("p"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("t"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.patil,"patil"));


		//নাপিত : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("n"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("p"); 
		secquence1.add("t"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.napit,"napit"));


		//পাতা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("p"); 
		secquence1.add("akar"); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.pata,"pata"));


		//পতাকা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("p"); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquence1.add("k"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.potaka,"potaka"));


		//বর : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ma,"kal"));


		//পরি : 
		secquence1 = new ArrayList<String>();
		secquence1.add("p"); 
		secquence1.add("i"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.pori,"pori"));


		//চরকা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("r"); 
		secquence1.add("k"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chorka,"chorka"));


		//তরি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("t"); 
		secquence1.add("i"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.tori,"tori"));


		//বানর : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("akar"); 
		secquence1.add("n"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.banor,"banor"));


		//বিরানি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("b"); 
		secquence1.add("r"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.biryani,"biryani"));


		//কামার : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("akar"); 
		secquence1.add("m"); 
		secquence1.add("akar"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kamar,"kamar"));


		//আনার : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("Aa"); 
		secquence1.add("n"); 
		secquence1.add("akar"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.anar,"anar"));


		//শালিক : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("sh"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("l"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.shalik,"shalik"));


		//শাল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("sh"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.shal,"shal"));


		//শাপলা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("sh"); 
		secquence1.add("akar"); 
		secquence1.add("p"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.shapla,"shapla"));


		//মশা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("sh"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.mosha,"mosha"));


		//মশারি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("sh"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.moshari,"moshari"));


		//চশমা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("sh"); 
		secquence1.add("m"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.choshma,"choshma"));


		//বিষ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("b"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.bish,"bish"));


		//বালিশ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("l"); 
		secquence1.add("sh"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.balish,"balish"));


		//ডিম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("D"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.dim,"dim"));


		//ডাল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("D"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.dal,"dal"));


		//ডালিম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("D"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("l"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.dalim,"dalim"));


		//ডাব : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("D"); 
		secquence1.add("akar"); 
		secquence1.add("b"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.dab,"dab"));


		//ডান : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("D"); 
		secquence1.add("akar"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.dan,"dan"));


		//ডালা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("D"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.dal,"dal"));


		//রেল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("r"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.rel,"rel"));


		//বেল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("b"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.bell,"bell"));


		//�?ক : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("a"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ek,"ek"));


		//�?কতারা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("a"); 
		secquence1.add("k"); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquence1.add("r"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ektara,"ektara"));


		//মারবেল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("akar"); 
		secquence1.add("r"); 
		secquence1.add("ekar"); 
		secquence1.add("b"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.marble,"marbel"));


		//মেলা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("m"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.mela,"mela"));


		//মেষ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.mesh,"mesh"));


		//�?লাচ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("a"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquence1.add("ch"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.elach,"elach"));


		//আপেল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("Aa"); 
		secquence1.add("ekar"); 
		secquence1.add("p"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.apple,"apple"));


		//দেশ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("d"); 
		secquence1.add("sh"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.desh,"desh"));


		//দাদা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("d"); 
		secquence1.add("akar"); 
		secquence1.add("d"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.dada,"dada"));


		//দল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("d"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.dol,"dol"));


		//দশ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("d"); 
		secquence1.add("sh"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.dosh,"dosh"));


		//দই : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("d"); 
		secquence1.add("I"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.doi,"doi"));


		//কদম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("d"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kodom,"kodom"));


		//দালান : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("d"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.dalan,"dalan"));


		//মাদল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("akar"); 
		secquence1.add("d"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.madol,"madol"));


		//আদা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("Aa"); 
		secquence1.add("d"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ada,"ada"));


		//টেবিল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("T"); 
		secquence1.add("i"); 
		secquence1.add("b"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.table,"table"));


		//টিন : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("T"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.tin,"tin"));


		//তাকা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquence1.add("k"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.tak,"tak"));


		//টব : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("T"); 
		secquence1.add("b"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.tob,"tob"));


		//টমটম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("T"); 
		secquence1.add("m"); 
		secquence1.add("T"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.tomtom,"tomtom"));


		//চট : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("T"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chot,"cot"));


		//মাটি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("T"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.mati,"mati"));


		//লাতিম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("t"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.latim,"latim"));


		//খবর : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("kh"); 
		secquence1.add("b"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.khobor,"khobor"));


		//আখ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("Aa"); 
		secquence1.add("kh"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.akh,"akh"));


		//নখ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("n"); 
		secquence1.add("kh"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.nokh,"nokh"));


		//খাট : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("kh"); 
		secquence1.add("akar"); 
		secquence1.add("T"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.khat,"khat"));


		//খাম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("kh"); 
		secquence1.add("akar"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kham,"kham"));


		//খেলা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("kh"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.khela,"khela"));


		//র�?ই : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("r"); 
		secquence1.add("u"); 
		secquence1.add("I"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.rui,"rui"));


		//র�?টি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("r"); 
		secquence1.add("u"); 
		secquence1.add("i"); 
		secquence1.add("T"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ruti,"ruti"));


		//চ�?ল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("u"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.chul,"chul"));


		//ক�?ক�?র : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("u"); 
		secquence1.add("k"); 
		secquence1.add("u"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kukur,"kukur"));


		//প�?ক�?র : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("p"); 
		secquence1.add("u"); 
		secquence1.add("k"); 
		secquence1.add("u"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ma,"kal"));


		//ক�?মির : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("u"); 
		secquence1.add("i"); 
		secquence1.add("m"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kumir,"kumir"));


		//উট : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("U"); 
		secquence1.add("T"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.ut,"ut"));


		//ক�?লা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("u"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kula,"kula"));


		//উপর : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("U"); 
		secquence1.add("p"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.upor,"upor"));


		//বেল�?ন : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("b"); 
		secquence1.add("l"); 
		secquence1.add("u"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.belun,"belun"));


		//ক�?মার : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("u"); 
		secquence1.add("m"); 
		secquence1.add("akar"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.kumar,"kumar"));


		//বেগ�?ন : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("b"); 
		secquence1.add("g"); 
		secquence1.add("u"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.begun,"begun"));


		//গর�? : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("g"); 
		secquence1.add("r"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.goru,"goru"));


		//গান : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("g"); 
		secquence1.add("akar"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.gan,"gan"));


		//মগ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("g"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.mug,"mug"));


		//ম�?রগি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("u"); 
		secquence1.add("r"); 
		secquence1.add("i"); 
		secquence1.add("g"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.murgi,"murgi"));


		//বাগান : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("akar"); 
		secquence1.add("g"); 
		secquence1.add("akar"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.bagan,"bagan"));


		//গলা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("g"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.gola,"gola"));


		//গরম : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("g"); 
		secquence1.add("r"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.gorom,"gorom"));


		//হাট : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ho"); 
		secquence1.add("akar"); 
		secquence1.add("T"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.hat,"hat"));


		//হাতি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ho"); 
		secquence1.add("akar"); 
		secquence1.add("i"); 
		secquence1.add("t"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.hati,"hati"));


		//মহিশ : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("i"); 
		secquence1.add("ho"); 
		secquence1.add("sh"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.mohish,"mohish"));


		//মহিলা : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("i"); 
		secquence1.add("ho"); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.mohila,"mohila"));


		//হার : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ho"); 
		secquence1.add("akar"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.har,"har"));


		//হাল : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ho"); 
		secquence1.add("akar"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.hal,"hal"));


		//হরিতকি : 
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ho"); 
		secquence1.add("i"); 
		secquence1.add("r"); 
		secquence1.add("t"); 
		secquence1.add("i"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		wsContainer.add(new WordSecuenceSound(secquence1, R.raw.hortoki,"hortoki"));


		//============================================================================================================

		//কা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_04,"ka"));


		//কি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_94,"ki"));


		//কে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("k"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_154,"ke"));


		//ক�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("k"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_204,"ku"));


		//মা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.ma,"kal"));


		//মি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_90,"mi"));


		//ম�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("m"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_200,"mu"));


		//মে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("m"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_150,"me"));


		//লা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("l"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_03,"ka"));


		//লি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_93,"li"));


		//ল�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("l"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_203,"lu"));


		//লে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("l"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_153,"le"));


		//তা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("t"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_05,"ta"));


		//তি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("t"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_95,"ti"));


		//তে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("t"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_155,"te"));


		//ত�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("t"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_205,"tu"));


		//বা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_06,"ba"));


		//বি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("b"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_96,"bi"));


		//বে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("b"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_156,"be"));


		//ব�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("b"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_206,"bu"));


		//না :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("n"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_07,"na"));


		//নি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_97,"ni"));


		//নে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("n"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_157,"ne"));


		//ন�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("n"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_207,"nu"));


		//চা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_08,"ca"));


		//চি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("ch"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_98,"ci"));


		//চে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("ch"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_158,"ce"));


		//চ�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ch"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_208,"cu"));


		//পা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("p"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_011,"pa"));


		//পি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("p"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_911,"pi"));


		//পে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("p"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_1511,"pe"));


		//প�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("p"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_2011,"pu"));


		//রা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("r"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.ma,"ra"));


		//রি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_912,"ri"));


		//র�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("r"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_2012,"ru"));


		//রে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_1512,"re"));


		//শা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("sh"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_013,"sha"));


		//শি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("sh"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_913,"shi"));


		//শ�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("sh"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_2013,"shu"));


		//শে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("sh"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_1513,"she"));


		//ডা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("D"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_014,"Da"));


		//ডি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("D"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_914,"Di"));


		//ড�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("D"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_2014,"Du"));


		//ডে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("D"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_1514,"De"));


		//দা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("d"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_017,"da"));


		//দি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("d"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_917,"di"));


		//দ�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("d"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_2017,"du"));


		//দে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("d"); 
		secquenceContainer.add(secquence1); 
		//iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_1517,"de"));


		//টা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("T"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_018,"Ta"));


		//টি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("T"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_918,"Ti"));


		//ট�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("T"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_2018,"Tu"));


		//টে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("T"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_1518,"Te"));


		//খা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("kh"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_019,"kha"));


		//খি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("kh"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_919,"khi"));


		//খ�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("kh"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_2019,"khu"));


		//খে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("kh"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_1519,"khe"));


		//গা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("g"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_022,"ga"));


		//গি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("g"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_922,"gi"));


		//গ�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("g"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_2022,"gu"));


		//গে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("g"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_1522,"ge"));


		//হা :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ho"); 
		secquence1.add("akar"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_023,"ha"));


		//হি :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("i"); 
		secquence1.add("ho"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_923,"hi"));


		//হ�? :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ho"); 
		secquence1.add("u"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_2023,"hu"));

		//m :
				secquence1 = new ArrayList<String>(); 
				secquence1.add("m"); 
				secquenceContainer.add(secquence1); 
				iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.sl_0,"m"));

		//হে :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("ekar"); 
		secquence1.add("ho"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.bs_1523,"he"));
		
		
		//T :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("T"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.sl_18,"T"));
		
		//r :
		secquence1 = new ArrayList<String>(); 
		secquence1.add("r"); 
		secquenceContainer.add(secquence1); 
		iwsContainer.add(new WordSecuenceSound(secquence1, R.raw.sl_12,"r"));
		
		
		
		
//=================================================================================================
		sortASC();
		// sequential moulde obj container
		secquenceMouled = new ArrayList<Mouled>();
		secquenceMouled.add(BaseActivity.mouled1);
		secquenceMouled.add(BaseActivity.mouled2);
		//secquenceMouled.add(BaseActivity.mouled3);
		//secquenceMouled.add(BaseActivity.mouled1);	
		
	}
	public static void chk_sequence(Marker marker){
		soundArray = new ArrayList<Integer>();
		int counter = 1;
		Marker mm = marker;
		Marker tempMarker = marker;
		tt = false; 
		int blockSize = Scheming2.getBlockSize(marker);
		
		for(int i=0; i< wsContainer.size(); i++){
			//Log.d("Word", "Sequence Size-> " + wsContainer.get(i).secquence.size() + "Block Size-> " + blockSize + "Sequence First Matched-> "+wsContainer.get(i).secquence.get(0).equals(marker));
			if(wsContainer.get(i).secquence.size() == blockSize && wsContainer.get(i).secquence.get(0).equals(marker.letter.getUserData()) /*&& !Sound.mediaPlayer.isPlaying()*/){
				tempMarker = marker;
				for(int j = 1;j < blockSize;j++){
					if(tempMarker.right != null){
						if( wsContainer.get(i).secquence.get(j).equals(tempMarker.right.letter.getUserData())){
							counter ++;
							tempMarker = tempMarker.right;
							continue;
						}
					}
					if(tempMarker.bottom != null){
						if( wsContainer.get(i).secquence.get(j).equals(tempMarker.bottom.letter.getUserData())){
							counter ++;
							continue; 
						}
					}
				}
				if(blockSize == counter){
					//if(Words.touched){ 
						Log.d(TAG , "Block word: " + wsContainer.get(i).word);
						Sound.playSingleSound(wsContainer.get(i).voice); 
						if(wsContainer.get(i).module != null){ 
							BaseActivity.rightFlipImage.popUpFlipBook(wsContainer.get(i).module);
							if(!wsContainer.get(i).module.isRecognized){
								BaseActivity.rb.mouldAddingAnimationToBook(wsContainer.get(i).module);
								wsContainer.get(i).module.isRecognized = true;
							}
						}
						else{
							BaseActivity.rightFlipImage.popDownFlipBook();
						}
						counter = 1;
						tt = true;						
				}
				else{
					counter = 1;
					
				}
			}
		}
		if(!tt){
			BaseActivity.rightFlipImage.popDownFlipBook();
			chk_indivizual2(mm);
			
		}
}
	
	static void wrongCombination(){
		wrongWordCounter++; 
	}
	
	static void goToNextMould(final Mouled currentMouled){
		BaseActivity.mCurrentScene.registerUpdateHandler(new TimerHandler(3.0f, new ITimerCallback() {
					
					@Override
					public void onTimePassed(TimerHandler arg0) {
						// TODO Auto-generated method stub
						int index = secquenceMouled.indexOf(currentMouled);
						int size = secquenceMouled.size();
						if(index < size-1 && index == secquenceMouled.indexOf(alivetMouled)) {
							secquenceMouled.get(index).disAppaire();
							
							secquenceMouled.get(index+1).appaire();
							BaseActivity.mCurrentScene.sortChildren();
							alivetMouled = secquenceMouled.get(index+1);
							BaseActivity.resetPosition();
							//HelpMode.startHelpMode();
							currentStage++;
							wrongWordCounter = 0;
						}
					}
				}));
		
	}
	
	/*static boolean wrongCombinationDetections(ArrayList<Marker> arr , Marker firstLetterOfBlock){
		for(int i=0; i<arr.size();i++){
			if(arr.get(i).equals(firstLetterOfBlock)){
				while(firstLetterOfBlock != null && i<arr.size()){
					 
					if(!arr.get(i).equals(firstLetterOfBlock)){
						return false;
					}
					firstLetterOfBlock = firstLetterOfBlock.right;
					i++;
				}
				if(i == arr.size() && firstLetterOfBlock != null){
					return false;
				}
				return true;
			}
		}
		return false;
	}*/
	static void sortASC(){
		ArrayList<WordSecuenceSound> temp_wsContainer = new ArrayList<WordSecuenceSound>();
		ArrayList<WordSecuenceSound> temp_iwsContainer = new ArrayList<WordSecuenceSound>();
		//ArrayList< ArrayList<String>> secquenceContainerTemp = new ArrayList<ArrayList<String>>() ;
		for(int i = 0; i < wsContainer.size(); i++){
			for(int j=0; j<wsContainer.size()-1; j++){
				if(wsContainer.get(j).secquence.size() < wsContainer.get(j+1).secquence.size()){
					temp_wsContainer.add(0,wsContainer.get(j));
					wsContainer.set(j, wsContainer.get(j+1));
					wsContainer.set(j+1, temp_wsContainer.get(0)); 
					temp_wsContainer.clear();
				}
			}
		}
		for(int i = 0; i < iwsContainer.size(); i++){
			for(int j=0; j<iwsContainer.size()-1; j++){
				if(iwsContainer.get(j).secquence.size() < iwsContainer.get(j+1).secquence.size()){
					temp_iwsContainer.add(0,iwsContainer.get(j));
					iwsContainer.set(j, iwsContainer.get(j+1));
					iwsContainer.set(j+1, temp_iwsContainer.get(0)); 
					temp_iwsContainer.clear();
				}
			}
		}
	}
	/*static void chk_indivizual(Marker marker){ 
		Marker m = marker;
		Marker tm = null;
		int counter = 0,i=0;
		int blockSize = Scheming2.getBlockSize(m);
		blockSize =blockSize*blockSize;
		while(m!= null ){
		//for(int i=0; i< iwsContainer.size(); i++){
			if(iwsContainer.get(i).secquence.get(0).equals(m.letter.getUserData())){
				counter++;
				if(i==63){
					int a = 0;
					int t=a;
				}
				m = m.right;
				tm = m;
				for (int j = 1; j < iwsContainer.get(i).secquence.size(); j++) {
					if (m != null) {
						if (iwsContainer.get(i).secquence.get(j).equals(m.letter.getUserData())) {
							counter++;
							m = m.right;
							continue;
						}

						if (m.bottom != null) {
							if (iwsContainer.get(i).secquence.get(j).equals(m.bottom.letter.getUserData())) {
								counter++;
								m = m.right;
								continue;
							}
						}
					}
				}		
			}
			
			if(iwsContainer.get(i).secquence.size() == counter){
				soundArray.add(iwsContainer.get(i).voice);
				counter = 0;
				if(m != null){
				//m = m.right;
				}
			}
			else{
			//	m = tm;
			}
			counter = 0;
			if(i>=iwsContainer.size()-1){
				i=0;
				if( m != null){
					m=m.right;
				}				
			}
			else{
				i++;
			}
			}
		//}
		if(soundArray.size()>=0){
			//BaseActivity.playSequenceSoundFlag = 1;
			Sound.sound1 = new ArrayList<Integer>(soundArray);
			Sound.playSequenceSound(0);
			soundArray.clear();
		}
	}
	/*void chkScequence(Marker m , ArrayList<WordSecuenceSound> ws){
		int blockSize = Scheming2.getBlockSize(m);
		while (blockSize-- >=0) {
			
		}
		
	}*/
	
	static int chk_indivizual2(Marker marker){ 
		Marker m = marker;
		Marker tm = null;
		int counter = 0,i=0,c=0;
		while(m!= null ){ 
		//for(int i=0; i< iwsContainer.size(); i++){
			if(iwsContainer.get(i).secquence.get(0).equals(m.letter.getUserData())){
				counter++;
				tm = m;
				if(m.bottom != null){
					m = m.bottom;
				}
				else{
					m = m.right;
				}
				
				for (int j = 1; j < iwsContainer.get(i).secquence.size(); j++) {
					if (m != null) {
						if (iwsContainer.get(i).secquence.get(j).equals(m.letter.getUserData())) {
							counter++;
							if(m.up != null){
								m = m.up.right;
							}
							else{
								m = m.right;
							}
							continue;
						}
						/*else if (m.bottom != null) {
							if (iwsContainer.get(i).secquence.get(j).equals(m.bottom.letter.getUserData())) {
								counter++;
								m = m.right;
								continue;
							}
						}*/
						else{
							break;
						}
					}
				}
				if(iwsContainer.get(i).secquence.size() == counter){
					soundArray.add(iwsContainer.get(i).voice);
					tm = m;
					i=0;
					c++;
				}
				else{
					m = tm;
				}
			}
			
			counter = 0;
				if(i>=iwsContainer.size()-1){
					i=0;
					c++;
					if(c==5){
						return 1;
					}		
				}
				else{
					i++;
					
				}
			}
		//}
		if(soundArray.size()>=0){
			//BaseActivity.playSequenceSoundFlag = 1;
			Sound.sound1 = new ArrayList<Integer>(soundArray);
			Sound.playSequenceSound(0);
			soundArray.clear();
		}
		return 1;
	}
	
	
}
