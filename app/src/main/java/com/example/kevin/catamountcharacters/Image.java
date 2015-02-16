package com.example.kevin.catamountcharacters;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Image extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_image);
    }

    /**
     * This is the method for the button clicks on the image activity
     *
     * @param view passed in view.
     */
    public void displayImage (View view) {
        Intent i = new Intent(Image.this, DisplaySingle.class);
        startActivity(i);
    }
}
