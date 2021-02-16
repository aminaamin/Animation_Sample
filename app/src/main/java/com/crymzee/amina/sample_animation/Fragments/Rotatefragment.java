package com.crymzee.amina.sample_animation.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.crymzee.amina.sample_animation.MainActivity;
import com.crymzee.amina.sample_animation.R;


public class Rotatefragment extends Fragment  implements Animation.AnimationListener{

    ImageView imageView;
    Button btnRClk,btnRAClk;

    Animation animClock, animAntiClock;
    private static final String TAG = "ZoomInfragment";
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_rotate, container, false);
        Log.i(TAG, "onCreateView: ");
        imageView = v.findViewById(R.id.imageRotate);
        btnRClk =v.findViewById(R.id.btnRClk);
        btnRAClk =v.findViewById(R.id.btnRAClk);
        animClock = AnimationUtils.loadAnimation(getContext(), R.anim.anim_clock_rotate);
        animAntiClock = AnimationUtils.loadAnimation(getContext(), R.anim.anim_anticlock_rotate);

        btnRClk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.startAnimation(animClock);
            }
        });

        btnRAClk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(animAntiClock);
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
