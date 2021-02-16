package com.crymzee.amina.sample_animation.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.crymzee.amina.sample_animation.R;

public class Movefragment extends Fragment implements Animation.AnimationListener{
    ImageView imageView;
    Button btnStart;
    View view;
    Animation animMove;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_move, container, false);
        imageView = (ImageView) v.findViewById(R.id.imgmove);
        btnStart = (Button)v.findViewById(R.id.btn_move);
        animMove = AnimationUtils.loadAnimation(getContext(), R.anim.move );


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                imageView.startAnimation(animMove);
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
