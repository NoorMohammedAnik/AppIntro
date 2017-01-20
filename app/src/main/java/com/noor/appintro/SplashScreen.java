package com.noor.appintro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    //duration of splash screen in mile second
    private static int SplashTimeOut=4000; //in mili seconds
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        actionBar =getSupportActionBar();
        actionBar.hide();


        //Post delayed for main activity
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                //After 4 seconds ,start this activity
                Intent intent=new Intent(SplashScreen.this,Activity_Navigation_Drawer.class);
                startActivity(intent);

                //closing this activity.
                finish();

            }
        }, SplashTimeOut);



    }
}
