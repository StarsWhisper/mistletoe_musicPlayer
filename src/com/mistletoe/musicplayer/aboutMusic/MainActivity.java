package com.mistletoe.musicplayer.aboutMusic;


import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends TabActivity {
	
	private TabHost mtabHost;
	private long exitTime = 0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
        		WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.mytab);
       
        Intent intent;  
        
        mtabHost=getTabHost();  
        intent = new Intent().setClass(this, ListActivity.class);
        mtabHost.addTab(mtabHost.newTabSpec("音乐").setIndicator("音乐",getResources().getDrawable(R.drawable.item01)).setContent(R.id.tab1).setContent(intent));    
        intent = new Intent().setClass(this, ArtistsActivity.class);
        mtabHost.addTab(mtabHost.newTabSpec("艺术家").setIndicator("艺术家",getResources().getDrawable(R.drawable.item02)).setContent(R.id.tab2).setContent(intent));    
        intent = new Intent().setClass(this, AlbumsActivity.class);
        mtabHost.addTab(mtabHost.newTabSpec("专辑").setIndicator("专辑",getResources().getDrawable(R.drawable.item03)).setContent(R.id.tab3).setContent(intent));     
        intent = new Intent().setClass(this, SongsActivity.class);
        mtabHost.addTab(mtabHost.newTabSpec("最近播放").setIndicator("最近播放",getResources().getDrawable(R.drawable.item04)).setContent(R.id.tab4).setContent(intent));     
        mtabHost.setCurrentTab(0);
        
//        Resources res = getResources(); 
//        TabHost tabHost = getTabHost(); 
//        TabHost.TabSpec spec; 
//        Intent intent;  
//        intent = new Intent().setClass(this, ListActivity.class);
//        
//        spec = tabHost.newTabSpec("音乐").setIndicator("音乐",
//                          res.getDrawable(R.drawable.item))
//                      .setContent(intent);
//        tabHost.addTab(spec);
//        
//        intent = new Intent().setClass(this, ArtistsActivity.class);
//        spec = tabHost.newTabSpec("艺术家").setIndicator("艺术家",
//                          res.getDrawable(R.drawable.artist))
//                      .setContent(intent);
//        tabHost.addTab(spec);
//
//        intent = new Intent().setClass(this, AlbumsActivity.class);
//        spec = tabHost.newTabSpec("专辑").setIndicator("专辑",
//                          res.getDrawable(R.drawable.album))
//                      .setContent(intent);
//        tabHost.addTab(spec);
//        intent = new Intent().setClass(this, SongsActivity.class);
//        spec = tabHost.newTabSpec("最近播放").setIndicator("最近播放",
//                          res.getDrawable(R.drawable.album))
//                      .setContent(intent);
//        tabHost.addTab(spec);
//        
//
//        tabHost.setCurrentTab(0);

    }
    
    public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if(keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN){   
	        if((System.currentTimeMillis()-exitTime) > 2000){  
	            Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT).show();                                
	            exitTime = System.currentTimeMillis();   
	        } else {
	            finish();
	            System.exit(0);
	        }
	        return true;   
	    }
	    return super.onKeyDown(keyCode, event);
	}
}