package com.prop.parking;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AdminActivity extends Activity {

	Button addbtn1,viewbtn1;
	Button adminbtn1,userbtn1,userbtn;
	String username;
	Connection conn;
	 String Content1,Content2,Content3,Content4,Content5;
	 String regno, s1, s2, s3, s4, s5, s6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);
		
		
		adminbtn1=(Button)findViewById(R.id.btn);
		
		
		adminbtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				//startActivity(new Intent(AdminActivity.this,AdminLoginActivity.class));
				String serverURL = "https://blynk.cloud/external/api/get?token=K0C-6weIAeM0RJV5WorbEMMKtkRtugRb&v0"; 
				
		        // Create Object and call AsyncTask execute Method
				new LongOperation().execute(serverURL);
				
				
				
			}
			
		});
		
	}

	// Class with extends AsyncTask class
    private class LongOperation  extends AsyncTask<String, Void, Void> {
    	
        private final HttpClient Client = new DefaultHttpClient();
       
        private String Error = null;
        private ProgressDialog Dialog = new ProgressDialog(AdminActivity.this);
       // TextView uiUpdate = (TextView) findViewById(R.id.output);
        
        ProgressDialog pDialog ;
		//Exception error;
		ResultSet rs;
        
        protected void onPreExecute() {
        	// NOTE: You can call UI Element here.
        	
        	//UI Element
        	//uiUpdate.setText("Output : ");
           // Dialog.setMessage("Retrieving data..");
           // Dialog.show();
        	super.onPreExecute();
	        
	        pDialog = new ProgressDialog(AdminActivity.this);
	        pDialog.setTitle("Data Retreiving");
	        pDialog.setMessage("View values...");
	        pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
	        pDialog.setIndeterminate(false);
	        pDialog.setCancelable(false);
	        pDialog.show();
        	
        }

        // Call after onPreExecute method
        protected Void doInBackground(String... urls) {
            try {
            	
            	// Call long running operations here (perform background computation)
            	// NOTE: Don't call UI Element here.
            	
            	// Server url call by GET method
                HttpGet httpget = new HttpGet(urls[0]);
                ResponseHandler<String> responseHandler = new BasicResponseHandler();
                Content1 = Client.execute(httpget, responseHandler);
                
               
              
                
                
            } catch (ClientProtocolException e) {
                Error = e.getMessage();
                cancel(true);
            } catch (IOException e) {
                Error = e.getMessage();
                cancel(true);
            }
            
            String Content=Content1;
            
            String attend = "";
            
            if(Content.contains("1"))
            {
            	s1 = "#FF0000";
            	s2 = "#3DDC84";
            	s3 = "#3DDC84";
            	s4 = "#3DDC84";
            	s5 = "#3DDC84";
            	s6 = "#3DDC84";
            }
            if(Content.contains("2"))
            {
            	s1 = "#FF0000";
            	s2 = "#FF0000";
            	s3 = "#3DDC84";
            	s4 = "#3DDC84";
            	s5 = "#3DDC84";
            	s6 = "#3DDC84";
            }
            if(Content.contains("3"))
            {
            	s1 = "#FF0000";
            	s2 = "#FF0000";
            	s3 = "#FF0000";
            	s4 = "#3DDC84";
            	s5 = "#3DDC84";
            	s6 = "#3DDC84";
            }
            if(Content.contains("4"))
            {
            	s1 = "#FF0000";
            	s2 = "#FF0000";
            	s3 = "#FF0000";
            	s4 = "#FF0000";
            	s5 = "#3DDC84";
            	s6 = "#3DDC84";
            }
            if(Content.contains("5"))
            {
            	s1 = "#FF0000";
            	s2 = "#FF0000";
            	s3 = "#FF0000";
            	s4 = "#FF0000";
            	s5 = "#FF0000";
            	s6 = "#3DDC84";
            }
            if(Content.contains("6"))
            {
            	s1 = "#FF0000";
            	s2 = "#FF0000";
            	s3 = "#FF0000";
            	s4 = "#FF0000";
            	s5 = "#FF0000";
            	s6 = "#FF0000";
            }

			try {
				
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
				
				

			} catch (Exception e) {
				//error = e;
				//return false;
//				Toast.makeText(getBaseContext(),"Successfully Registered...", Toast.LENGTH_LONG).show();
			}
            return null;
        }
        
        protected void onPostExecute(Void unused) {
        	// NOTE: You can call UI Element here.
        	
        	pDialog.dismiss ( ) ;
        	Intent intent=new Intent(AdminActivity.this,ParkingActivity.class);
			intent.putExtra("s1", s1);
			intent.putExtra("s2", s2);
			intent.putExtra("s3", s3);
			intent.putExtra("s4", s4);
			intent.putExtra("s5", s5);
			intent.putExtra("s6", s6);
			
			startActivity(intent);	
			
        	
        }
        
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
