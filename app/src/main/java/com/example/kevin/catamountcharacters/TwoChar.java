package com.example.kevin.catamountcharacters;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class TwoChar extends ActionBarActivity {
    EditText charOne;
    EditText charTwo;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_two_char);

        charOne = (EditText)findViewById(R.id.getCharOneText);
        charTwo = (EditText)findViewById(R.id.getCharTwoText);
        go = (Button)findViewById(R.id.go_button);
    }

    public void go (View view) {
        Intent i = new Intent(TwoChar.this, DisplaySingle.class);
        startActivity(i);
    }
}
