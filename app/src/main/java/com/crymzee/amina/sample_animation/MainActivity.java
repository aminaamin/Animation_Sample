package com.crymzee.amina.sample_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.animation.AlphaAnimation;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Animation fade_out_anim, fade_in_anim;
    TextView tv_fade_in ,tv_fade_out;
    ImageView fade_out_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_fade_in = findViewById(R.id.fade_in_tv);
        tv_fade_out = findViewById(R.id.fade_out_tv);
        fade_out_iv = findViewById(R.id.img_fade_out);

       /* fade_in_anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        fade_out_anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);*/
        //tv_fade_in.setAnimation(fade_in_anim);
        tv_fade_in.setOnClickListener(this);
        tv_fade_out.setOnClickListener(this);
      //  fade_out_anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
       // fade_out_iv.setAnimation(fade_out_anim);
      //  fade_out_iv.setOnClickListener(this);

       /* AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000);
        alphaAnimation.setRepeatCount(5);
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        fade_out_iv.startAnimation(alphaAnimation);
        ObjectAnimator fadeOut = ObjectAnimator.ofFloat(fade_out_iv, "alpha", 1f, 0);
        fadeOut.setDuration(2000);
        fadeOut.start();
        fade_out_iv.clearAnimation();*/

    }

    @Override
    public void onClick(View view) {
        if (view == tv_fade_in) {
            //tv_fade_in.setAnimation(fade_in_anim);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000);
            alphaAnimation.setRepeatCount(1);
            alphaAnimation.setRepeatMode(Animation.REVERSE);
            fade_out_iv.startAnimation(alphaAnimation);
        }
        if (view == tv_fade_out) {
            //tv_fade_out.setAnimation(fade_out_anim);
            ObjectAnimator fadeOut = ObjectAnimator.ofFloat(fade_out_iv, "alpha", 1f, 0);
            fadeOut.setDuration(2000);
            fadeOut.start();
        }
    }
}