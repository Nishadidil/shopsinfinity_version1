package com.example.itemnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView new1 = findViewById(R.id.textView2);
        new1.setText(R.string.name1);

        TextView new2 = findViewById(R.id.text1);
        new2.setText(R.string.textq1);

        TextView new3 = findViewById(R.id.text2);
        new3.setText(R.string.name2);


        TextView new4 = findViewById(R.id.textView3);
        new4.setText(R.string.name3);

        TextView new5 = findViewById(R.id.textView4);
        new5.setText(R.string.name4);

        TextView new6 = findViewById(R.id.textView5);
        new6.setText(R.string.name5);

        TextView new7 = findViewById(R.id.textView6);
        new7.setText(R.string.name6);

        Button new8 = findViewById(R.id.button1);
        new8.setBottom(R.string.name7);
    }
}