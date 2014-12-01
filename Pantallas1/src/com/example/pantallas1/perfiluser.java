package com.example.pantallas1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class perfiluser extends Activity {
	
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.profileview);

	   final Button boton1 = (Button) findViewById (R.id.button1);
	   
	   boton1.setOnClickListener(new OnClickListener() {
		   
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			   Intent intent = new Intent(perfiluser.this, sendchirp.class );
			   startActivityForResult (intent,0);		
		}	   
	   });
	   
	        
	    }

	}

