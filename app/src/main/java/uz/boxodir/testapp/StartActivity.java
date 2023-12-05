package uz.boxodir.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.testapp.R;

import uz.boxodir.testapp.testmvp.mvp.test.mvp.TestActivity;
import uz.boxodir.testapp.testmvp.mvp.test.screen.InfoActivity;


public class StartActivity extends AppCompatActivity {

    private Button play;
    private Button share;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        animation = AnimationUtils.loadAnimation(this, R.anim.myanimation);


        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        init();
        sound();
    }

    private void init() {
        play = findViewById(R.id.play_btn);
        share = findViewById(R.id.info_ap);
    }

    private void sound() {
        play.setOnClickListener(view -> {
            play.startAnimation(animation);
            startActivity(new Intent(StartActivity.this, TestActivity.class));
        });

        share.setOnClickListener(v -> {
            share.startAnimation(animation);
            Intent intent = new Intent(this, InfoActivity.class);
            startActivity(intent);
        });

    }
}
