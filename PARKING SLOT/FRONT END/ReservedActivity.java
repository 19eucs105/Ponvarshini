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

public class ReservedActivity extends Activity {

	Button homebtn1,backbtn1,loginbtn1;
	static final String ACTION_SCAN = "com.google.zxing.client.android.SCAN";
	String contents="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reserved);
		
		
		
		homebtn1=(Button)findViewById(R.id.home_btn);
		
		
		
		
		homebtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(ReservedActivity.this,MainActivity.class));		
				
			}
			
		});
		
		
		
	}

}
