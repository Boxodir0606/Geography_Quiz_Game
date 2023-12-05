package uz.boxodir.testapp.testmvp.mvp.test.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.testapp.R;
import uz.boxodir.testapp.StartActivity;

public class SplashActivity extends AppCompatActivity {


    private final int SPLASH_DISPLAY_LENGTH = 4000;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.splashscreen));

        textAnimation();
        new Handler().postDelayed(() -> {

            Intent mainIntent = new Intent(SplashActivity.this, StartActivity.class);
            SplashActivity.this.startActivity(mainIntent);
            SplashActivity.this.finish();
        }, SPLASH_DISPLAY_LENGTH);
    }

    private void textAnimation() {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.text_animation);
        findViewById(R.id.textView6).clearAnimation();
        findViewById(R.id.textView6).startAnimation(a);

    }

}