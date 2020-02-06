package dev.sofie.sidiaadmin.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import dev.sofie.admin.R;
import dev.sofie.sidiaadmin.helper.SharedPreferecesHelper;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (getSharedPreferences(SharedPreferecesHelper.SupirPreferences, 0).getString("id", null) != null) {
                    SplashActivity splashActivity = SplashActivity.this;
                    splashActivity.startActivity(new Intent(splashActivity.getApplicationContext(), MainActivity.class));
                } else {
                    SplashActivity splashActivity2 = SplashActivity.this;
                    splashActivity2.startActivity(new Intent(splashActivity2.getApplicationContext(), LoginActivity.class));
                }
                SplashActivity.this.finish();
            }
        }, 2500);
    }
}
