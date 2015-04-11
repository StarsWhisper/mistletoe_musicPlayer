package com.mistletoe.musicplayer.aboutMusic;


import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
	
	private TabHost mtabHost;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
        		WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.mytab);
  
        mtabHost=getTabHost();  
        
        mtabHost.addTab(mtabHost.newTabSpec("����").setIndicator("����",getResources().getDrawable(R.drawable.item01)).setContent(R.id.tab1));    
        mtabHost.addTab(mtabHost.newTabSpec("������").setIndicator("������",getResources().getDrawable(R.drawable.item02)).setContent(R.id.tab2));    
        mtabHost.addTab(mtabHost.newTabSpec("ר��").setIndicator("ר��",getResources().getDrawable(R.drawable.item03)).setContent(R.id.tab3));     
        mtabHost.addTab(mtabHost.newTabSpec("�������").setIndicator("�������",getResources().getDrawable(R.drawable.item04)).setContent(R.id.tab4));     
        mtabHost.setCurrentTab(0);
        
//        Resources res = getResources(); 
//        TabHost tabHost = getTabHost(); 
//        TabHost.TabSpec spec; 
//        Intent intent;  
//        intent = new Intent().setClass(this, ListActivity.class);
        
//        spec = tabHost.newTabSpec("����").setIndicator("����",
//                          res.getDrawable(R.drawable.item))
//                      .setContent(intent);
//        tabHost.addTab(spec);
//        
//        intent = new Intent().setClass(this, ArtistsActivity.class);
//        spec = tabHost.newTabSpec("������").setIndicator("������",
//                          res.getDrawable(R.drawable.artist))
//                      .setContent(intent);
//        tabHost.addTab(spec);
//
//        intent = new Intent().setClass(this, AlbumsActivity.class);
//        spec = tabHost.newTabSpec("ר��").setIndicator("ר��",
//                          res.getDrawable(R.drawable.album))
//                      .setContent(intent);
//        tabHost.addTab(spec);
//        intent = new Intent().setClass(this, SongsActivity.class);
//        spec = tabHost.newTabSpec("�������").setIndicator("�������",
//                          res.getDrawable(R.drawable.album))
//                      .setContent(intent);
//        tabHost.addTab(spec);
//        
//
//        tabHost.setCurrentTab(0);

    }
}