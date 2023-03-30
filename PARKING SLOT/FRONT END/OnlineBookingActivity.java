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
import android.widget.Spinner;
import android.widget.Toast;

public class OnlineBookingActivity extends Activity {

	Button addbtn1,cambtn1,backbtn1;
	static final String ACTION_SCAN = "com.google.zxing.client.android.SCAN";
	String contents="";
	Spinner spinner1;
	String city;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.online_booking);
		
		addbtn1=(Button)findViewById(R.id.add_btn);
		
		backbtn1=(Button)findViewById(R.id.back_btn);
		
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		
		addbtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				city = spinner1.getSelectedItem().toString();
				
				if(city.equals("Coimbatore"))
				
				{
					Intent intent = new Intent(
							OnlineBookingActivity.this,
							CoimbatoreActivity.class);
					intent.putExtra("city", city);		
					
					startActivity(intent);
					
				}
				
				if(city.equals("Chennai"))
					
				{
					Intent intent = new Intent(
							OnlineBookingActivity.this,
							ChennaiActivity.class);
					intent.putExtra("city", city);		
					
					startActivity(intent);
					
				}
				
				if(city.equals("Bangalore"))
					
				{
					Intent intent = new Intent(
							OnlineBookingActivity.this,
							BangaloreActivity.class);
					intent.putExtra("city", city);		
					
					startActivity(intent);
					
				}
				
				//startActivity(new Intent(OnlineBookingActivity.this,MainActivity.class));		
				
			}
			
		});
		backbtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(OnlineBookingActivity.this,MainActivity.class));		
				
			}
			
		});
		
		
	}

}
