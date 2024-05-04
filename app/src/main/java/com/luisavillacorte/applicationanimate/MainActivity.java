package com.luisavillacorte.applicationanimate;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.IdentityHashMap;

public class MainActivity extends AppCompatActivity {

    ObjectAnimator animator;
    ScaleAnimation animationScale;
    AlphaAnimation animationAlpha;
    TranslateAnimation animationTrans;
    Path efecto;

    Button btnAnimate;
    Button btnAnimates;
    Button btnAn;
    ImageView imgLauren;
    ImageView libroBad;
    ImageView libroJosh;
    ImageView libroFall;
    TextView nombreLa;
    TextView txtMed;
    TextView bad;
    TextView falling;
    TextView josh;
    TextView txtBiogra;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bad=findViewById(R.id.bad);
        animationTrans = new TranslateAnimation(0,0,0,-50);
        animationTrans.setDuration(500);
        animationTrans.setRepeatCount(3);
        animationTrans.setRepeatMode(Animation.REVERSE);
        bad.startAnimation(animationTrans);

        falling=findViewById(R.id.falling);
        animationTrans = new TranslateAnimation(0,0,0,-50);
        animationTrans.setDuration(500);
        animationTrans.setRepeatCount(3);
        animationTrans.setRepeatMode(Animation.REVERSE);
        falling.startAnimation(animationTrans);

        josh=findViewById(R.id.josh);
        animationTrans = new TranslateAnimation(0,0,0,-50);
        animationTrans.setDuration(500);
        animationTrans.setRepeatCount(3);
        animationTrans.setRepeatMode(Animation.REVERSE);
        josh.startAnimation(animationTrans);

        nombreLa=findViewById(R.id.nombreLa);
        animationAlpha = new AlphaAnimation(0,1);
        animationAlpha.setDuration(3000);
        animationAlpha.setFillAfter(true);
        nombreLa.startAnimation(animationAlpha);

        txtMed=findViewById(R.id.txtMed);
        animationAlpha = new AlphaAnimation(0,1);
        animationAlpha.setDuration(3000);
        animationAlpha.setFillAfter(true);
        txtMed.startAnimation(animationAlpha);

        imgLauren=findViewById(R.id.imgLauren);
        animationTrans = new TranslateAnimation(1000, 0, 0,0);
        animationTrans.setDuration(1000);
        animationTrans.setFillAfter(true);
        imgLauren.startAnimation(animationTrans);

        txtBiogra=findViewById(R.id.txtBiogra);
        efecto = new Path();
        efecto.moveTo(0,0);
        efecto.quadTo(300,400,500,0);
        animator = ObjectAnimator.ofFloat(txtBiogra, View.X, View.Y, efecto);
        animator.setDuration(2000);
        animator.start();



        libroBad=findViewById(R.id.libroBad);
        libroBad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationScale = new ScaleAnimation(2, 1.5f,2,1.5f,
                Animation.RELATIVE_TO_SELF,0.5f,
                        Animation.RELATIVE_TO_SELF,0.5f);
                animationScale.setDuration(200);
                animationScale.setFillAfter(true);
                libroBad.startAnimation(animationScale);

            }
        });

        libroFall=findViewById(R.id.libroFall);
        libroFall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationScale = new ScaleAnimation(2, 1.5f,2,1.5f,
                        Animation.RELATIVE_TO_SELF,0.5f,
                        Animation.RELATIVE_TO_SELF,0.5f);
                animationScale.setDuration(200);
                animationScale.setFillAfter(false);
                libroFall.startAnimation(animationScale);

            }
        });

        libroJosh=findViewById(R.id.libroJosh);
        libroJosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationScale = new ScaleAnimation(2, 1.5f,2,1.5f,
                        Animation.RELATIVE_TO_SELF,0.5f,
                        Animation.RELATIVE_TO_SELF,0.5f);
                animationScale.setDuration(200);
                animationScale.setFillAfter(true);
                libroJosh.startAnimation(animationScale);

            }
        });

        btnAnimate = findViewById(R.id.btnAnimate);
        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animator = ObjectAnimator.ofFloat(v, View.ROTATION,0,360);
                animator.setDuration(1000);
                animator.start();
            }

        });

        btnAn = findViewById(R.id.btnAn);
        animator = ObjectAnimator.ofArgb(this, "color", Color.BLUE, Color.RED, Color.BLACK);
        animator.setDuration(3000);
        animator.setInterpolator(new LinearInterpolator());
        btnAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animator.start();
            }
        });

        btnAnimates=findViewById(R.id.btnAnimates);
        btnAnimates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(MainActivity.this, Animate.class);
                startActivity(next);
            }
        });
    }
    public void setColor(int color){
        btnAn.setBackgroundColor(color);
    }






}