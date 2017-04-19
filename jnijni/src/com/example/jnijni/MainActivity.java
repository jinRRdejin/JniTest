package com.example.jnijni;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
	public TextView tv;
	
	 static {
	        System.loadLibrary("TestNdk");
	    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv = (TextView) findViewById(R.id.tv);
        String str = testjni.AddStr("test", "test");
        tv.setText(str);
       
    }
    
}
