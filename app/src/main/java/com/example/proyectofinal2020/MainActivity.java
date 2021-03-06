package com.example.proyectofinal2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //ANIMACIONES SPLASH SCREEN
        Animation animArriba = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animAbajo = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        ImageView ivContacto = findViewById(R.id.ivContacto);
        TextView tvContacto = findViewById(R.id.tvContacto);
        ImageView ivIntegrantes = findViewById(R.id.ivIntegrantes);
        TextView tvIntegrantes = findViewById(R.id.tvIntegrantes);
        ImageView ivLogo = findViewById(R.id.ivLogo);

        ivContacto.setAnimation(animAbajo);
        tvContacto.setAnimation(animAbajo);
        ivIntegrantes.setAnimation(animAbajo);
        tvIntegrantes.setAnimation(animAbajo);
        ivLogo.setAnimation(animArriba);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, PrincipalActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}