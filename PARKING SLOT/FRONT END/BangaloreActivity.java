package com.prop.parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
    
public class BangaloreActivity extends Activity {
    /** Called when the activity is first created. */
	Connection conn;
	String r1,r2,r3,r4,a1,a2,a3,a4;
	EditText edt1;
	Button b1,b2,b3,b4;
	String regno, s1, s2, s3, s4, s5, s6;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bangalore);
        
        b1=(Button)findViewById(R.id.mall1_btn);
        b2=(Button)findViewById(R.id.mall2_btn);
        b3=(Button)findViewById(R.id.mall3_btn);
        b4=(Button)findViewById(R.id.back_btn);
		
        b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				try {


					String serverURL = "https://blynk.cloud/external/api/get?token=K0C-6weIAeM0RJV5WorbEMMKtkRtugRb&v0"; 
					
			        // Create Object and call AsyncTask execute Method
					new LongOperation().execute(serverURL);

				}
				catch(Exception e){
				//	Toast.makeText(applicationContext.getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
				}
			}
		});
		
		
        b2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				try {


					String serverURL = "https://blynk.cloud/external/api/get?token=K0C-6weIAeM0RJV5WorbEMMKtkRtugRb&v0"; 
					
			        // Create Object and call AsyncTask execute Method
					new LongOperation().execute(serverURL);

				}
				catch(Exception e){
				//	Toast.makeText(applicationContext.getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
				}
			}
		});
		
        b3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				try {


					String serverURL = "https://blynk.cloud/external/api/get?token=K0C-6weIAeM0RJV5WorbEMMKtkRtugRb&v0"; 
					
			        // Create Object and call AsyncTask execute Method
					new LongOperation().execute(serverURL);

				}
				catch(Exception e){
				//	Toast.makeText(applicationContext.getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
				}
			}
		});
		
        b4.setOnClickListener(new View.OnClickListener() {
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(BangaloreActivity.this,OnlineBookingActivity.class));		
				
			}
			
		});
		
        
        
    }
    
    
      
    // Class with extends AsyncTask class
    private class LongOperation  extends AsyncTask<String, Void, Boolean> {
    	
        private final HttpClient Client = new DefaultHttpClient();
        private String Content;
        Exception error;
        private String Error = null;
        ProgressDialog Dialog ;
        
        protected void onPreExecute() {
        	// NOTE: You can call UI Element here.
        	
        	//UI Element
        	Dialog = new ProgressDialog(BangaloreActivity.this);
			Dialog.setTitle("Status Update");
            Dialog.setMessage("Downloading source..");
            Dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
	        Dialog.setIndeterminate(false);
	        Dialog.setCancelable(false);
            Dialog.show();
        }

        // Call after onPreExecute method
        protected Boolean doInBackground(String... urls) {
            try {
            	
            	// Call long running operations here (perform background computation)
            	// NOTE: Don't call UI Element here.
            	
            	// Server url call by GET method
            	
            	URL url = new URL(urls[0]); // creating a url object  
                URLConnection urlConnection = url.openConnection(); // creating a urlconnection object  
            
                // wrapping the urlconnection in a bufferedreader  
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));  
                String line=bufferedReader.readLine();  
                
               // HttpGet httpget = new HttpGet(urls[0]);
               // ResponseHandler<String> responseHandler = new BasicResponseHandler();
                //Content = Client.execute(httpget, responseHandler);
                
                Content=line;
                
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
    			
                
                
                
            } catch (ClientProtocolException e) {
                Error = e.getMessage();
                cancel(true);
            } catch (IOException e) {
                Error = e.getMessage();
                cancel(true);
            }
            
            return true;
        }
        
        protected void onPostExecute(Boolean result1) {
	    	Dialog.dismiss ( ) ;
	    	if(result1)
	    	{
                
			
					
//					System.out.println("ELSE(JSON) LOOP EXE");
					try {// try3 open
						
						Intent intent=new Intent(BangaloreActivity.this,ParkingActivity.class);
						intent.putExtra("s1", s1);
						intent.putExtra("s2", s2);
						intent.putExtra("s3", s3);
						intent.putExtra("s4", s4);
						intent.putExtra("s5", s5);
						intent.putExtra("s6", s6);
						
						startActivity(intent);			
						
					} catch (Exception e1) {
						Toast.makeText(getBaseContext(), e1.toString(),
								Toast.LENGTH_LONG).show();

					}					
				
            
	    	}else
	    	{
	    		if(error!=null)
	    		{
	    			Toast.makeText(getBaseContext(),error.getMessage().toString() ,Toast.LENGTH_LONG).show();
	    		}
	    		else
	    		{
	    			Toast.makeText(getBaseContext(),"Check your credentials!!!" ,Toast.LENGTH_LONG).show();
	    		}
	    	}
	    	super.onPostExecute(result1);
	    }
	}
	
	
        
    }
