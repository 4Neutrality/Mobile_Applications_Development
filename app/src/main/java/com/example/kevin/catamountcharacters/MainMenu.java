package com.example.kevin.catamountcharacters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_main_menu);
    }

    /**
     * This is the method for single character button click.
     *
     * @param view passed in view
     */
    public void oneLetter (View view) {
        Intent one = new Intent(MainMenu.this, SingleChar.class);
        startActivity(one);
    }

    /**
     * This is the method for two characters button click.
     *
     * @param view passed in view
     */
    public void twoLetter (View view) {
        Intent two = new Intent(MainMenu.this, TwoChar.class);
        startActivity(two);
    }

    /**
     * This is the method for image button click.
     *
     * @param view passed in view
     */
    public void image (View view) {
        Intent three = new Intent(MainMenu.this, Image.class);
        startActivity(three);
    }

    /**
     * This is the method for info button click.
     *
     * @param view passed in view
     */
    public void information (View view) {
        Intent four = new Intent(MainMenu.this, Info.class);
        startActivity(four);
    }
}
