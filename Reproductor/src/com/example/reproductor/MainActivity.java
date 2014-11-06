package com.example.reproductor;

import android.support.v7.app.ActionBarActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements OnClickListener{
	Button botonReproducir, botonParar, botonReproducir2, botonParar2;
	MediaPlayer mp, mp2;
	int bandera;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //buscar botones y definirlos
        botonReproducir = (Button)findViewById(R.id.btnreproducir);
        botonParar = (Button)findViewById(R.id.btparar);
        botonReproducir2 = (Button)findViewById(R.id.btnreproducir2);
        botonParar2 = (Button)findViewById(R.id.btnparar2);
        
        
        //listeners
        botonReproducir.setOnClickListener(this);
        botonParar.setOnClickListener(this);
        botonReproducir2.setOnClickListener(this);
        botonParar2.setOnClickListener(this);   
        
    }

    
    //metodo que abre la primer vetana
    public void video1 (View view){
    	Intent video1 = new Intent(this, video1.class );  
        startActivity(video1);
    }
    
    //segundo metodo
    public void video2 (View view){
    	Intent video2 = new Intent(this, video2.class );  
        startActivity(video2);
    }
    
    
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, JEAM 208782091 
    	// so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    
    

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
		
		   //el primer caso del switch (boton Reproducir)
		     case R.id.btnreproducir:
		         mp = MediaPlayer.create(this, R.raw.dontcry);
		         mp.start();
		         botonReproducir.setEnabled(false);
		         botonParar.setEnabled(true);
		         botonReproducir2.setEnabled(false);
		         botonParar2.setEnabled(false);
		         Toast.makeText(getApplicationContext(), "Reproduciendo:  Don't cry - Guns 'n Roses", Toast.LENGTH_SHORT).show();
		    	 break;
		     
		    	// opciones del boton parar (stop)
		     case R.id.btparar:
		         mp.stop();
		         botonReproducir.setEnabled(true);
		         botonParar.setEnabled(false);
		         botonReproducir2.setEnabled(true);
		         botonParar2.setEnabled(false);
		         Toast.makeText(getApplicationContext(), "Cancion detenida", Toast.LENGTH_SHORT).show();
		         break;
		    
		         
		    	 
		    	 //opciones de la segunda cancion 
		     case R.id.btnreproducir2:
		         mp2 = MediaPlayer.create(this, R.raw.windoc);
		         mp2.start();
		         botonReproducir.setEnabled(false);
		         botonParar.setEnabled(false);
		         botonReproducir2.setEnabled(false);
		         botonParar2.setEnabled(true);
		         Toast.makeText(getApplicationContext(), "Reproduciendo:  Wind of change - Scorpions", Toast.LENGTH_SHORT).show();
		    	 break;
		     
		    	// opciones del boton parar (stop)
		     case R.id.btnparar2:
		         mp2.stop();
		         botonReproducir.setEnabled(true);
		         botonParar.setEnabled(false);
		         botonReproducir2.setEnabled(true);
		         botonParar2.setEnabled(false);
		         Toast.makeText(getApplicationContext(), "Cancion detenida", Toast.LENGTH_SHORT).show();
		    	 break;
		    	 

		}
	}
	
}
