package com.crymzee.amina.sample_animation.Fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.crymzee.amina.sample_animation.R;

public class Bouncefragment extends Fragment implements Animation.AnimationListener{
    ImageView imageView;
    Button btnStart;
    View view;
    Animation animBounce;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_bounce, container, false);
        imageView = (ImageView) v.findViewById(R.id.imgbounce);
        btnStart = (Button)v.findViewById(R.id.btn_bounce);
        animBounce = AnimationUtils.loadAnimation(getContext(),
                R.anim.bounce );
        animBounce.setAnimationListener(this);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);

                imageView.startAnimation(animBounce);
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
