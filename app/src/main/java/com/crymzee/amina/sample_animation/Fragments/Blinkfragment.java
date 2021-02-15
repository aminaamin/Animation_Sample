package com.crymzee.amina.sample_animation.Fragments;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.AnimationUtils;

import com.crymzee.amina.sample_animation.R;


public class Blinkfragment extends Fragment  implements Animation.AnimationListener{

    ImageView imageView;
    Button btnStart;
    View view;
    Animation animBlink;
    private static final String TAG = "blinkfragment";
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_blink, container, false);
        Log.i(TAG, "onCreateView: ");
        imageView = v.findViewById(R.id.imageblink);
        btnStart =v.findViewById(R.id.btnStart);
        animBlink = AnimationUtils.loadAnimation(getContext(), R.anim.blink);
        animBlink.setAnimationListener(this);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animBlink);
            }
        });
        return v;
    }
    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
