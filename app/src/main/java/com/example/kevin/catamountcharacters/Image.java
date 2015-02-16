package com.example.kevin.catamountcharacters;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * This is the Image activity, which has five buttons and passes a string value upon button click to
 * the DisplaySingle activity.
 *
 * @author Kevin J James
 * @version 12.12.15
 */

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
    public void cat_btn (View view) {
        String c = "catamount";
        Intent i = new Intent(Image.this, DisplaySingle.class);
        i.putExtra("singleChar", c);
        startActivity(i);
    }

    /**
     * This is the method for the button clicks on the image activity
     *
     * @param view passed in view.
     */
    public void tower_btn (View view) {
        String c = "tower";
        Intent i = new Intent(Image.this, DisplaySingle.class);
        i.putExtra("singleChar", c);
        startActivity(i);
    }

    /**
     * This is the method for the button clicks on the image activity
     *
     * @param view passed in view.
     */
    public void comp_btn (View view) {
        String c = "computer";
        Intent i = new Intent(Image.this, DisplaySingle.class);
        i.putExtra("singleChar", c);
        startActivity(i);
    }

    /**
     * This is the method for the button clicks on the image activity
     *
     * @param view passed in view.
     */
    public void science_btn (View view) {
        String c = "science";
        Intent i = new Intent(Image.this, DisplaySingle.class);
        i.putExtra("singleChar", c);
        startActivity(i);
    }

    /**
     * This is the method for the button clicks on the image activity
     *
     * @param view passed in view.
     */
    public void cs_btn (View view) {
        String c = "2013";
        Intent i = new Intent(Image.this, DisplaySingle.class);
        i.putExtra("singleChar", c);
        startActivity(i);
    }
}
