package com.example.kevin.catamountcharacters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class SplashScreen extends Activity {
    final int PAUSE = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_0_splash_screen);

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent menu = new Intent(SplashScreen.this, MainMenu.class);
                startActivity(menu);

                // Close activity
                finish();
            }
            // Delay for 5 seconds
        }, PAUSE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
