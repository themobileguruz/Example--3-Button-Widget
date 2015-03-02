package com.themobileguruz.mg_3_buttonaction;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity 
{

	Button btnClick;
	
	OnClickListener clicklistener;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnClick = (Button) findViewById(R.id.buttonClcik);
		
		btnClick.setOnClickListener(clicklistener);
		
		clicklistener=new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Button is Clicked", Toast.LENGTH_SHORT).show();
			}
		};
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
