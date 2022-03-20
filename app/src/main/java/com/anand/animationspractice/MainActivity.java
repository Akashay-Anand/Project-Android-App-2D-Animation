/** Project by Akashay Anand
 *  we can use the methods of animate in any combination to create desired animation
 *
 * */
package com.anand.animationspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int i=0,j=0;
    public void fade_image(View view){  // see explanation 1
        Log.i("info","image pressed");  // printing this message on 'logcat' console if this function executes(onClick on image).
        ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
        ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
        if(i==0) {
            i = 1;
            iv1.animate().alpha(0).setDuration(2000);
            iv2.animate().setDuration(2000).alpha(1);  // we can use any combination
        }else{
            i=0;
            iv2.animate().alpha(0).setDuration(2000);
            iv1.animate().alpha(1).setDuration(2000);
        }
    }
    public void fade_button(View view){  // see explanation 1
        Button bt1 =(Button) findViewById(R.id.button1);
        Button bt2 = (Button) findViewById(R.id.button2);
        if(j==0){
            j=1;
            bt1.animate().alpha(0.3f).setDuration(1000);
            bt2.animate().alpha(1).setDuration(1000);
        }else{
            j=0;
            bt1.animate().alpha(1).setDuration(1000);
            bt2.animate().alpha(0.3f).setDuration(1000);
        }
    }
    public void animate_fun3(View view){
        ImageView iv3 = (ImageView) findViewById(R.id.image_3);
//        iv3.animate().setDuration(2000).alpha(0.3f);
        iv3.animate().translationYBy(1000).setDuration(3000);
    }
    public void animate_fun4(View view){
        ImageView iv4 = (ImageView) findViewById(R.id.image_4);
        iv4.animate().translationX(1000).setDuration(2000);

    }
    public void animate_fun5(View view){
        ImageView iv5 = (ImageView) findViewById(R.id.image_5);
        iv5.animate().rotation(540).setDuration(2000);  // value for rotation are in degree ; 180 = half rotation, 360 = complete rotation , respectively;

    }
    public void animate_fun6(View view){
        ImageView iv6 = (ImageView) findViewById(R.id.image_6);
        iv6.animate().scaleX(0.5f);  // change the size

    }
    public void animate_fun7(View view){
        ImageView iv7 = (ImageView) findViewById(R.id.image_7);
        iv7.animate().rotation(1800).alpha(0.1f).scaleX(0.4f).scaleY(0.4f).setDuration(1000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView s_iv = (ImageView) findViewById(R.id.starting_img);
        s_iv.setX(-1000);
        s_iv.animate().rotation(3600).translationX(0).setDuration(3000);

        s_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s_iv.animate().translationX(1000).rotation(360).setDuration(2000);
            }
        });
//        s_iv.animate().translationX(1500).setDuration(1000);
    }
}

/**
 *  [ Explanation 1 ] -- fade_image method
 *  we first linked image variable with their respective id
 *  'animate()' contains lots of method, and alpha() is one of them.
 *  alpha() values are either 0 or 1 ;at 0 invisible and at 1 visible
 *  setDuration() method takes time in milliseconds, So the value passed in it is time. that we impact fading time.  ex: 2000 = 2 second
 *  initially in xml we set 0 for alpha for 2nd image so that it is invisible and only 1st image is visible at the starting.
 *
 *  Note: This method works on every view i.e: imageview, button, textview etc.
 *
 * **/