package com.example.todoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        Button btnAdd = findViewById(R.id.addButton);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1 = new TextView(MainActivity.this);
                tv1.setText("Hello World");
                linearLayout.addView(tv1);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams((int)LinearLayout.LayoutParams.WRAP_CONTENT,(int)LinearLayout.LayoutParams.WRAP_CONTENT);
                tv1.setTextSize(34);
                linearLayout.setLayoutParams(params);

            }
        });

    }
}