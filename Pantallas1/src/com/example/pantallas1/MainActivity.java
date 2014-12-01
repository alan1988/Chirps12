package com.example.pantallas1;


import android.app.Activity;
import android.os.Bundle;

import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   final Button boton1 = (Button) findViewById (R.id.button1);
   final Button boton2 = (Button) findViewById (R.id.button2);
   final Button boton3 = (Button) findViewById (R.id.button3);
   
   boton1.setOnClickListener(new OnClickListener() {
	   
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		   Intent intent1 = new Intent(MainActivity.this, pantalla1.class );
		   startActivity (intent1);		
	}	   
   });
   
      boton2.setOnClickListener(new OnClickListener() {
	   
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		   Intent intent2 = new Intent(MainActivity.this, Pantalla2.class );
		   startActivityForResult (intent2,0);		
	}	   
   });
      
      boton3.setOnClickListener(new OnClickListener() {
   	   
    @Override
    public void onClick(View v) {
    	// TODO Auto-generated method stub
    	   Intent intent3 = new Intent(MainActivity.this, Pantalla3.class );
    	   startActivityForResult (intent3,0);		
    		}	   
    	   });
    
    
    }

}
