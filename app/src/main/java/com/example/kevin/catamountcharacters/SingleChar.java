package com.example.kevin.catamountcharacters;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SingleChar extends ActionBarActivity {
    EditText charOne;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_single_char);

        charOne = (EditText)findViewById(R.id.getSingleCharText);
        go = (Button)findViewById(R.id.go_button);
    }

    public void go (View view) {
        Intent i = new Intent(SingleChar.this, DisplaySingle.class);
        startActivity(i);
    }
}
