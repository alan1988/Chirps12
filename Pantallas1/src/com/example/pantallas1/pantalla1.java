package com.example.pantallas1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
 
import com.example.pantallas1.R;


public class pantalla1 extends Activity {

	ImageView imagenSeleccionada;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_1);
        
        final Integer[] imagenes = { R.drawable.ic_launcher,};
             
        GridView gridView = (GridView) findViewById(R.id.gridView);
        
        gridView.setAdapter(new thumbmaker (this, imagenes));
        
        gridView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
     		    Intent intent2 = new Intent(pantalla1.this, perfiluser.class );
    		    startActivityForResult (intent2,0);	
            }
        });
         
    
    
    }
    
    

}
 