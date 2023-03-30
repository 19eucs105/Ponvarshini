package com.prop.parking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.JSONException;




import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends MainActivity  {

	Connection conn;
	EditText username,password,hostIP;
	Button signin,signup,back,cancel;
	String user,pass,user1,pass1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		signin=(Button)findViewById(R.id.loginbtn);
		back=(Button)findViewById(R.id.backbtn);
		cancel=(Button)findViewById(R.id.cancelbtn);
		
		
				
//		conn=CONN();
		signin.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
								
				Toast.makeText(getBaseContext(),"Login Success" ,Toast.LENGTH_LONG).show();
				
				startActivity(new Intent(LoginActivity.this,MainActivity.class));
				
				
					
						}
			
		});
		back.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(LoginActivity.this,MainActivity.class));		
				
			}
			
		});
		
		cancel.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent(LoginActivity.this,MainActivity.class));		
				
			}
			
		});
	}

	
	
	
	}
	
	




