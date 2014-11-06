package com.example.reproductor;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class video2 extends Activity {
	
	
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	        setContentView(R.layout.videowc);
	        
	        //reproducir video
	        VideoView videoView = (VideoView)findViewById(R.id.videoView1);
	        
	        Uri path = Uri.parse("android.resource://com.example.reproductor/" + R.raw.videowc);
	        videoView.setVideoURI(path);
	        videoView.start();
	        
	        MediaController mc = new MediaController(this);
	        mc.setMediaPlayer(videoView);
	        videoView.setMediaController(mc);
	        
	        
	        }
	
	 
	 public void cerrar(View view) {           
	     finish();
	    }
	 
	
}
