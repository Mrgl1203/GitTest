package com.example.a30291.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //aaaaaaaaaaaaaaaaaaaaa
        //xiugai
        //develop create
        //develop create2
        tv = findViewById(R.id.tvText);
    }


    public void translate(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, 500,
                Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF,500 );
        translateAnimation.setDuration(1000);
        tv.startAnimation(translateAnimation);
    }
}
