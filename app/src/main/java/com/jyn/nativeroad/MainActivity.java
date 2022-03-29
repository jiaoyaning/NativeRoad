package com.jyn.nativeroad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jyn.jni.NativeLib;
import com.jyn.nativeroad.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.text.setText(NativeLib.stringFromJNI());
    }
}