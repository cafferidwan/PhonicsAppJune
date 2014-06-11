package com.example.accountSystem;

import java.io.File;
import java.util.ArrayList;

import com.example.phonicsapp.GameMainPage;
import com.example.phonicsapp.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class AccountDisplayPage extends Activity 
{
	
	public static String TAG = AccountDisplayPage.class.getSimpleName();

	public GridView gridView;
	public ArrayList<Item> gridArray = new ArrayList<Item>();
	public CustomGridViewAdapter customGridAdapter;
	
	public static int accountNumber;
	public Bitmap[] accountPic = new Bitmap[10];
	
	public AccountDisplayPage instance;
	public File[] imgFile= new File[10];
	public static int counter;
	
	Button adminButton;
	
	public static String student1, student2, student3, student4, student5, student6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.account_page);
		
		adminButton = (Button) findViewById(R.id.adminPress);
		adminButton.setOnLongClickListener(new View.OnLongClickListener()
		{
			@Override
			public boolean onLongClick(View v)
			{
				// TODO Auto-generated method stub
				
				Toast.makeText(getBaseContext(), "Hello", Toast.LENGTH_LONG).show();
				startActivity(new Intent(getBaseContext(), AdminPanel.class));
  
				return true;
			}
		});

		instance=this;
		counter=0;
		
		//loading account images
		loadingAccountImage();
	
		
		//loading text view labels 
		loadTextView();
		
		gridView = (GridView) findViewById(R.id.gridview);
		gridView.setOnItemClickListener(new OnItemClickListener() 
		{
	          public void onItemClick(AdapterView<?> parent, View v, int position, long id) 
	          {
	        	  //if the image file does not exists, then take a snap shot
	        	  onClickSnapShotCheck(position);
	          }
	      });
		customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid,
				gridArray);
		gridView.setAdapter(customGridAdapter);
		
	}
	
	public void loadTextView()
	{
		student1 = getDeviceIMEI()+"a";
		student2 = getDeviceIMEI()+"b";
		student3 = getDeviceIMEI()+"c";
		student4 = getDeviceIMEI()+"d";
		student5 = getDeviceIMEI()+"e";
		student6 = getDeviceIMEI()+"f";
		
		//adding textview icons
		gridArray.add(new Item(accountPic[0], student1));
		gridArray.add(new Item(accountPic[1], student2));
		gridArray.add(new Item(accountPic[2], student3));
		gridArray.add(new Item(accountPic[3], student4));
		gridArray.add(new Item(accountPic[4], student5));
		gridArray.add(new Item(accountPic[5], student6));
	} 
	
	public void loadingAccountImage()
	{
		for(int i=0;i<6;i++)
		{
			imgFile[i] = new  File("/sdcard/PhonicsApp/AccountPic/"+i+".jpg");
			//if the camera snap shot image file exists, then load the snap shot
			if(imgFile[i].exists())
			{
				
				Bitmap scaled = BitmapFactory.decodeFile(imgFile[i].getAbsolutePath());
				accountPic[i] =  Bitmap.createScaledBitmap(scaled, 226,
						223, false);
			}
			//else load the default image   
			else
			{
				Bitmap b=BitmapFactory.decodeResource(instance.getResources(),
						R.drawable.images);
				accountPic[i] = Bitmap.createScaledBitmap(b, 226,
						223, false);
			}  
		}
	}
	
	public void onClickSnapShotCheck(int position)
	{
		 File imgFile = new  File("/sdcard/PhonicsApp/AccountPic/"+position+".jpg");
		 accountNumber = position;
		 
		//if account picture is not taken, then take picture
 		 if(!imgFile.exists())
 		 {
 			 counter++;
 			 if(counter==1)
 			 {
 				 instance.finish();
 				 instance.startActivity(new Intent(instance.getBaseContext(), CameraPicture.class));
 			 } 
 	     }
 		 //if account picture is taken, then go to GameMainPage
 		 else
 		 {
 			 instance.finish();
 			 instance.startActivity(new Intent(instance.getBaseContext(), GameMainPage.class));
 		 }
 		 
 		 
	}
	
	public String getDeviceIMEI() 
	{
		TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		String device_id = tm.getDeviceId();

		return device_id;
	}
}