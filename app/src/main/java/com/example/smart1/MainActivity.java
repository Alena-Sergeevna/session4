package com.example.smart1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
/* import android.widget.TextView; */

import com.example.smart1.databinding.ActivityMainBinding;

public class MainActivity extends Activity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Thread logoTimer = new Thread(() -> {
            try
            {
                int logoTimer1 = 0;
                while(logoTimer1 < 5000)
                {
                    Thread.sleep(100);
                    logoTimer1 = logoTimer1 +100;
                };
                startActivity(new Intent("com.tutorial.CLEARSCREEN"));
            }
            catch (InterruptedException e)
            {
                // TODO: автоматически сгенерированный блок catch.
                e.printStackTrace();
            }
            finally
            {
                finish();
            }
        });
        logoTimer.start();

    }

}