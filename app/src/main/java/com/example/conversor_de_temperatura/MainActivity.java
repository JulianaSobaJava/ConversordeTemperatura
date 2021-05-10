package com.example.conversor_de_temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double c=0;
    double f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void conversor(View v){
        TextView textView = findViewById(R.id.conv);
        c = Double.parseDouble(textView.getText().toString());
        f= c * 1.8 + 32;
        TextView res = findViewById(R.id.fa);
        res.setText(f + " Fº");
    }
}