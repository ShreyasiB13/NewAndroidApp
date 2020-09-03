package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade (View view) {
        ImageView noddy = (ImageView) findViewById(R.id.noddy);
        ImageView oswald = (ImageView) findViewById(R.id.oswald);

        noddy.animate().alpha(0f).setDuration(2000);
        oswald.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}