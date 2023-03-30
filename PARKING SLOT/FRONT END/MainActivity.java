package com.prop.parking;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button onlinebtn1,onsitebtn1,loginbtn1;
	static final String ACTION_SCAN = "com.google.zxing.client.android.SCAN";
	String contents="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.booking_type);
		
		onlinebtn1=(Button)findViewById(R.id.online_btn);
		onsitebtn1=(Button)findViewById(R.id.onsite_btn);
		loginbtn1=(Button)findViewById(R.id.login_btn);
		
		
		onlinebtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(MainActivity.this,OnlineBookingActivity.class));		
				
			}
			
		});
		onsitebtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(MainActivity.this,OnsiteBookingActivity.class));		
				
			}
			
		});
		
		loginbtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(MainActivity.this,LoginActivity.class));		
				
			}
			
		});
	}

}
