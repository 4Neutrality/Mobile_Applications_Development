package com.example.kevin.catamountcharacters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

/**
 * This is the SingleChar activity, which is an interface that accepts a single alpha numeric
 * character and passes the value to the DisplaySingle activity.
 *
 * @author Kevin J James
 * @version 12.12.15
 */

public class SingleChar extends Activity {
    EditText charOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_single_char);

        charOne = (EditText)findViewById(R.id.getSingleCharText);
    }

    /**
     * This is the onClick method for the go button.
     *
     * @param view passed in view
     */
    public void go (View view) {
        String c = charOne.getText().toString();
        int len = c.length();
        // Use regex to validate input
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        boolean isNotAlphaNumeric = p.matcher(c).find();

        //Check for valid input
        if (isNotAlphaNumeric) {
            Toast.makeText(getApplicationContext(), "Character is not alpha numeric!",
                    Toast.LENGTH_SHORT).show();
        } else if (len > 1) {
            Toast.makeText(getApplicationContext(), "Please enter exactly one character!",
                    Toast.LENGTH_SHORT).show();
        } else {
                // Pass in 'space' if nothing is entered
                if (len == 0)
                    c = " ";
                Intent i = new Intent(SingleChar.this, DisplaySingle.class);
                i.putExtra("singleChar", c);
                startActivity(i);
        }
    }
}
