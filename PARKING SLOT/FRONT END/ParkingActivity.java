package com.prop.parking;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ParkingActivity extends Activity {

	Button adminbtn1, btn1,btn2,btn3,btn4,btn5,btn6;
	String s1, s2, s3, s4, s5, s6,city;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn1=(Button)findViewById(R.id.Button2);
		btn2=(Button)findViewById(R.id.Button3);
		btn3=(Button)findViewById(R.id.Button4);
		btn4=(Button)findViewById(R.id.Button6);
		btn5=(Button)findViewById(R.id.Button5);
		btn6=(Button)findViewById(R.id.Button1);
		

		Intent intent=getIntent();
		s1=intent.getStringExtra("s1");
		
		s2=intent.getStringExtra("s2");
		
		s3=intent.getStringExtra("s3");

		s4=intent.getStringExtra("s4");

		s5=intent.getStringExtra("s5");

		s6=intent.getStringExtra("s6");
		

		if(s1.equals("#FF0000"))
		{
		btn1.setBackgroundColor(Color.RED); 
		}
		
		else if(s1.equals("#3DDC84"))
		{
		btn1.setBackgroundColor(Color.GREEN); 
		}
		
		
		if(s2.equals("#FF0000"))
		{
		btn2.setBackgroundColor(Color.RED); 
		}
		
		else if(s2.equals("#3DDC84"))
		{
		btn2.setBackgroundColor(Color.GREEN); 
		}
		
		
		if(s3.equals("#FF0000"))
		{
		btn3.setBackgroundColor(Color.RED); 
		}
		
		else if(s3.equals("#3DDC84"))
		{
		btn3.setBackgroundColor(Color.GREEN); 
		}
		
		
		if(s4.equals("#FF0000"))
		{
		btn4.setBackgroundColor(Color.RED); 
		}
		
		else if(s4.equals("#3DDC84"))
		{
		btn4.setBackgroundColor(Color.GREEN); 
		}
		
		
		if(s5.equals("#FF0000"))
		{
		btn5.setBackgroundColor(Color.RED); 
		}
		
		else if(s5.equals("#3DDC84"))
		{
		btn5.setBackgroundColor(Color.GREEN); 
		}
		
		
		if(s6.equals("#FF0000"))
		{
		btn6.setBackgroundColor(Color.RED); 
		}
		
		else if(s6.equals("#3DDC84"))
		{
		btn6.setBackgroundColor(Color.GREEN); 
		}
		
		
		
		btn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(s1.equals("#FF0000"))
				{
					Toast.makeText(getBaseContext(),"This Parking Not Available" ,Toast.LENGTH_LONG).show();
				}
				
				else if(s1.equals("#3DDC84"))
				{
					Toast.makeText(getBaseContext(),"Parking Booked Success" ,Toast.LENGTH_LONG).show();
					
				btn1.setBackgroundColor(Color.RED); 
				
				Intent intent = new Intent(
						ParkingActivity.this,
						ParkingSlotActivity.class);
				intent.putExtra("slot", "C2");		
				
				startActivity(intent);		
				
				}
				
			
			}
			
		});
		
		btn2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(s2.equals("#FF0000"))
				{
					Toast.makeText(getBaseContext(),"This Parking Not Available" ,Toast.LENGTH_LONG).show();
				}
				
				else if(s2.equals("#3DDC84"))
				{
					Toast.makeText(getBaseContext(),"Parking Booked Success" ,Toast.LENGTH_LONG).show();
										
				btn2.setBackgroundColor(Color.RED); 
				
				Intent intent = new Intent(
						ParkingActivity.this,
						ParkingSlotActivity.class);
				intent.putExtra("slot", "A1");		
				
				startActivity(intent);	
				
				}
									
			
			}
			
		});
		
		btn3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(s3.equals("#FF0000"))
				{
					Toast.makeText(getBaseContext(),"This Parking Not Available" ,Toast.LENGTH_LONG).show();
				}
				
				else if(s3.equals("#3DDC84"))
				{
					Toast.makeText(getBaseContext(),"Parking Booked Success" ,Toast.LENGTH_LONG).show();
					
				btn3.setBackgroundColor(Color.RED); 
				
				Intent intent = new Intent(
						ParkingActivity.this,
						ParkingSlotActivity.class);
				intent.putExtra("slot", "A2");		
				
				startActivity(intent);	
				
				
				}
										
			
			}
			
		});
		
		btn4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(s4.equals("#FF0000"))
				{
					Toast.makeText(getBaseContext(),"This Parking Not Available" ,Toast.LENGTH_LONG).show();
				}
				
				else if(s4.equals("#3DDC84"))
				{
					Toast.makeText(getBaseContext(),"Parking Booked Success" ,Toast.LENGTH_LONG).show();
					
				btn4.setBackgroundColor(Color.RED); 
				
				Intent intent = new Intent(
						ParkingActivity.this,
						ParkingSlotActivity.class);
				intent.putExtra("slot", "B1");		
				
				startActivity(intent);	
				
				}
										
			
			}
			
		});
		
		btn5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(s5.equals("#FF0000"))
				{
					Toast.makeText(getBaseContext(),"This Parking Not Available" ,Toast.LENGTH_LONG).show();
				}
				
				else if(s5.equals("#3DDC84"))
				{
					Toast.makeText(getBaseContext(),"Parking Booked Success" ,Toast.LENGTH_LONG).show();
					
				btn5.setBackgroundColor(Color.RED); 
				
				Intent intent = new Intent(
						ParkingActivity.this,
						ParkingSlotActivity.class);
				intent.putExtra("slot", "C1");		
				
				startActivity(intent);	
				}
										
			
			}
			
		});
		
		btn6.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(s6.equals("#FF0000"))
				{
					Toast.makeText(getBaseContext(),"This Parking Not Available" ,Toast.LENGTH_LONG).show();
				}
				
				else if(s6.equals("#3DDC84"))
				{
					Toast.makeText(getBaseContext(),"Parking Booked Success" ,Toast.LENGTH_LONG).show();
					
				btn6.setBackgroundColor(Color.RED); 
				
				Intent intent = new Intent(
						ParkingActivity.this,
						ParkingSlotActivity.class);
				intent.putExtra("slot", "B2");		
				
				startActivity(intent);	
				}
										
			
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
