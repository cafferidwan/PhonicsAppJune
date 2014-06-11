package com.example.accountSystem;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.phonicsapp.MenuPage;
import com.example.phonicsapp.R;
import com.example.phonicsapp.HandWriting.banglaletterwriting.HandWritingMenu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class AdminPanel extends Activity
{
	private ListView mainListView;
	private ArrayAdapter<String> listAdapter;
	public static boolean adminEnable = false;

    public Button buttonGame, buttonHandWriting;
    
    public static String currentAccount;
    
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student_view);
		
		mainListView = (ListView) findViewById( R.id.mainListView );  
		buttonGame = (Button) findViewById(R.id.btnGame);
		buttonHandWriting = (Button) findViewById(R.id.btnHandWriting);
		
	    ArrayList<String> studentList = new ArrayList<String>();  
	    studentList.add(AccountDisplayPage.student1);  
	    studentList.add(AccountDisplayPage.student2);
	    studentList.add(AccountDisplayPage.student3);
	    studentList.add(AccountDisplayPage.student4);
	    studentList.add(AccountDisplayPage.student5);
	    studentList.add(AccountDisplayPage.student6);
	    
	    
	    // Create ArrayAdapter using the planet list.  
	    listAdapter = new ArrayAdapter<String>(this, R.layout.student_row, studentList);  
	    // Set the ArrayAdapter as the ListView's adapter.  
	    mainListView.setAdapter( listAdapter ); 
	    
	    mainListView .setOnItemClickListener(new OnItemClickListener()
	    {
	       @Override
	       public void onItemClick(AdapterView<?> adapter, View v, int position,
	             long arg3) 
	       {
	             currentAccount = (String)adapter.getItemAtPosition(position); 
	             
	             Toast.makeText(getBaseContext(), currentAccount, Toast.LENGTH_SHORT).show();
	             startActivity(new Intent(getBaseContext(), IndividualAccountDescription.class));
	       }
	    });
	    
	   
	    //go to unlocked games menu
	    buttonGame.setOnClickListener(new View.OnClickListener()
	    {
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				adminEnable = true;
				finish();
				startActivity(new Intent(getBaseContext(), MenuPage.class));
			}
		});
	    
	    //go to handwriting unlocked menu
	    buttonHandWriting.setOnClickListener(new View.OnClickListener()
	    {
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				adminEnable = true;
				finish();
				startActivity(new Intent(getBaseContext(), HandWritingMenu.class));
			}
		});
	}
	
}