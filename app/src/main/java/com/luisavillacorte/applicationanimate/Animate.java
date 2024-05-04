package com.luisavillacorte.applicationanimate;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animate extends AppCompatActivity {

    ImageView imgOso;
    Button btnZoomIn;
    Button btnZoomOut;
    Button btnFadeIn;
    Button btnFadeOut;
    Button btnSlideLeft;
    Button btnSlideRight;
    Button btnSlideUp;
    Button btnSlideDown;
    Button btnZoomInFadeIn;
    Button btnZoomOutFadeOut;
    Button btnRotate;
    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate);
imgOso= findViewById(R.id.imgOso);
btnZoomIn=findViewById(R.id.btnZoomIn);
btnZoomIn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
imgOso.startAnimation(AnimationUtils.loadAnimation(
        getApplicationContext(),
        R.anim.zoom_in
));
    }
});

btnZoomOut=findViewById(R.id.btnZoomOut);
btnZoomOut.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        imgOso.startAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.zoom_out
        ));
    }
});

        btnFadeIn=findViewById(R.id.btnFadeIn);
        btnFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgOso.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.fade_in
                ));
            }
        });

        btnFadeOut=findViewById(R.id.btnFadeOut);
        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgOso.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.fade_out
                ));
            }
        });

        btnSlideLeft=findViewById(R.id.btnSlideLeft);
        btnSlideLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgOso.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_left
                ));
            }
        });

        btnSlideRight=findViewById(R.id.btnSlideRight);
        btnSlideRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgOso.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_right
                ));
            }
        });

        btnSlideUp=findViewById(R.id.btnSlideUp);
        btnSlideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgOso.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_up
                ));
            }
        });

        btnSlideDown=findViewById(R.id.btnSlideDown);
        btnSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgOso.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_down
                ));
            }
        });

        btnZoomInFadeIn=findViewById(R.id.btnZoomInFadeIn);
        btnZoomInFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgOso.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_in_fade_in
                ));
            }
        });

        btnZoomOutFadeOut=findViewById(R.id.btnZoomOutFadeOut);
        btnZoomOutFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgOso.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.zoom_out_fade_out
                ));
            }
        });

        btnRotate=findViewById(R.id.btnRotate);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgOso.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.rotate
                ));
            }
        });

        btnMove=findViewById(R.id.btnMove);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgOso.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.move
                ));
            }
        });








    }
}