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

import com.crymzee.amina.sample_animation.R;


public class ZoomInfragment extends Fragment  implements Animation.AnimationListener{

    ImageView imageView;
    Button btnStart;

    Animation animZoomIn;
    private static final String TAG = "ZoomInfragment";
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_zoom_in, container, false);
        Log.i(TAG, "onCreateView: ");
        imageView = v.findViewById(R.id.imagezoomin);
        btnStart =v.findViewById(R.id.btnZoomIN);
        animZoomIn = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in);
        animZoomIn.setAnimationListener(this);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.startAnimation(animZoomIn);
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
