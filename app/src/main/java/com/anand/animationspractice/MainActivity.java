package com.anand.animationspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int i=0,j=0;
    public void fade_image(View view){
        Log.i("info","image pressed");
        ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
        ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
        if(i==0) {
            i = 1;
            iv1.animate().alpha(0).setDuration(2000);
            iv2.animate().setDuration(2000).alpha(1);
        }else{
            i=0;
            iv2.animate().alpha(0).setDuration(2000);
            iv1.animate().alpha(1).setDuration(2000);
        }
    }
    public void fade_button(View view){
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
        iv5.animate().rotation(540).setDuration(2000);

    }
    public void animate_fun6(View view){
        ImageView iv6 = (ImageView) findViewById(R.id.image_6);
        iv6.animate().scaleX(0.5f);

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