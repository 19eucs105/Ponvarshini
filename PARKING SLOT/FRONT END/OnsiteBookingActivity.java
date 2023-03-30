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

public class OnsiteBookingActivity extends Activity {

	Button qrbtn1,cambtn1,backbtn1;
	static final String ACTION_SCAN = "com.google.zxing.client.android.SCAN";
	String contents="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.onsite_booking);
		
		qrbtn1=(Button)findViewById(R.id.qr_btn);
		cambtn1=(Button)findViewById(R.id.cam_btn);
		backbtn1=(Button)findViewById(R.id.back_btn);
		
		
		qrbtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(OnsiteBookingActivity.this,OnsiteBookingActivity.class));		
				
			}
			
		});
		cambtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(OnsiteBookingActivity.this,OnsiteBookingActivity.class));		
				
			}
			
		});
		
		backbtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(OnsiteBookingActivity.this,MainActivity.class));		
				
			}
			
		});
	}

}
