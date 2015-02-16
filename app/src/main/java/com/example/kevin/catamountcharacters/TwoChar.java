package com.example.kevin.catamountcharacters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;

/**
 * This is the TwoChar activity, which is an interface that accepts two alpha numeric characters
 * and passed the values to the DisplayTwo activity.
 *
 * @author Kevin J James
 * @version 12.12.15
 */

public class TwoChar extends Activity {
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

    /**
     * This is the onClick method for the go button.
     *
     * @param view passed in view
     */
    public void go (View view) {
        String c1 = charOne.getText().toString();
        String c2 = charTwo.getText().toString();
        int len1 = c1.length();
        int len2 = c2.length();
        // Use regex to validate input
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        boolean isNotAlphaNumeric1 = p.matcher(c1).find();
        boolean isNotAlphaNumeric2 = p.matcher(c2).find();

        // Check for valid input
        if (isNotAlphaNumeric1 || isNotAlphaNumeric2) {
            Toast.makeText(getApplicationContext(), "Character is not alpha numeric!",
                    Toast.LENGTH_SHORT).show();
        } else if (len1 > 1 || len2 > 1) {
            Toast.makeText(getApplicationContext(), "Please enter exactly one character!",
                    Toast.LENGTH_SHORT).show();
        } else {
            // Pass in 'space' if nothing is entered
            if (len1 == 0)
                c1 = " ";
            if (len2 == 0)
                c2 = " ";
            Intent i = new Intent(TwoChar.this, DisplayTwo.class);
            i.putExtra("charOne", c1);
            i.putExtra("charTwo", c2);
            startActivity(i);
        }
    }
}
