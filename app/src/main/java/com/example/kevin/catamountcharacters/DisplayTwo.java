package com.example.kevin.catamountcharacters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * This is the DisplayTwo activity, which accepts two extras to display to the screen.
 *
 * @author Kevin J James
 * @version 12.12.15
 */

public class DisplayTwo extends Activity {
    String to_display1;
    String to_display2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6_display_two);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            to_display1 = extras.getString("charOne");
            to_display2 = extras.getString("charTwo");

            setImage(to_display1, 1);
            setImage(to_display2, 2);
        }
    }

    /**
     * This method will set the imageView with the desired image.
     *
     * @param iName given image name
     */
    public void setImage(String iName, int iNum) {
        ImageView i;
        if (iNum == 1) {
            i = (ImageView) this.findViewById(R.id.image1);
        } else {
            i = (ImageView) this.findViewById(R.id.image2);
        }

        switch (iName) {
            case "a":
                i.setImageResource(R.drawable.a_bl);
                break;
            case "b":
                i.setImageResource(R.drawable.b_bl);
                break;
            case "c":
                i.setImageResource(R.drawable.c_bl);
                break;
            case "d":
                i.setImageResource(R.drawable.d_bl);
                break;
            case "e":
                i.setImageResource(R.drawable.e_bl);
                break;
            case "f":
                i.setImageResource(R.drawable.f_bl);
                break;
            case "g":
                i.setImageResource(R.drawable.g_bl);
                break;
            case "h":
                i.setImageResource(R.drawable.h_bl);
                break;
            case "i":
                i.setImageResource(R.drawable.i_bl);
                break;
            case "j":
                i.setImageResource(R.drawable.j_bl);
                break;
            case "k":
                i.setImageResource(R.drawable.k_bl);
                break;
            case "l":
                i.setImageResource(R.drawable.l_bl);
                break;
            case "m":
                i.setImageResource(R.drawable.m_bl);
                break;
            case "n":
                i.setImageResource(R.drawable.n_bl);
                break;
            case "o":
                i.setImageResource(R.drawable.o_bl);
                break;
            case "p":
                i.setImageResource(R.drawable.p_bl);
                break;
            case "q":
                i.setImageResource(R.drawable.q_bl);
                break;
            case "r":
                i.setImageResource(R.drawable.r_bl);
                break;
            case "s":
                i.setImageResource(R.drawable.s_bl);
                break;
            case "t":
                i.setImageResource(R.drawable.t_bl);
                break;
            case "u":
                i.setImageResource(R.drawable.u_bl);
                break;
            case "v":
                i.setImageResource(R.drawable.v_bl);
                break;
            case "w":
                i.setImageResource(R.drawable.w_bl);
                break;
            case "x":
                i.setImageResource(R.drawable.x_bl);
                break;
            case "y":
                i.setImageResource(R.drawable.y_bl);
                break;
            case "z":
                i.setImageResource(R.drawable.z_bl);
                break;
            case " ":
                i.setImageResource(R.drawable.s_bl);
                break;
            case "0":
                i.setImageResource(R.drawable.n0_bl);
                break;
            case "1":
                i.setImageResource(R.drawable.n1_bl);
                break;
            case "2":
                i.setImageResource(R.drawable.n2_bl);
                break;
            case "3":
                i.setImageResource(R.drawable.n3_bl);
                break;
            case "4":
                i.setImageResource(R.drawable.n4_bl);
                break;
            case "5":
                i.setImageResource(R.drawable.n5_bl);
                break;
            case "6":
                i.setImageResource(R.drawable.n6_bl);
                break;
            case "7":
                i.setImageResource(R.drawable.n7_bl);
                break;
            case "8":
                i.setImageResource(R.drawable.n8_bl);
                break;
            case "9":
                i.setImageResource(R.drawable.n9_bl);
                break;
            case "catamount":
                i.setImageResource(R.drawable.cat);
                break;
            case "tower":
                i.setImageResource(R.drawable.tower);
                break;
            case "computer":
                i.setImageResource(R.drawable.computer);
                break;
            case "science":
                i.setImageResource(R.drawable.science);
                break;
            case "2013":
                i.setImageResource(R.drawable.cs467);
                break;
            default:
                i.setImageResource(R.drawable.space_bl);
                break;

        }
    }
}