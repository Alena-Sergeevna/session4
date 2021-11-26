package com.example.smart1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.smart1.databinding.ActivityLoginBinding;

public class LoginActivity extends Activity {

    private TextView mTextView;
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}