package com.example.my_application_211b048;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void load(View view) {
        ImageView im = findViewById(R.id.imageView);
        im.setImageResource(R.drawable.plus);
        TextView input1 = findViewById(R.id.input1);
        TextView input2 = findViewById(R.id.input2);
        TextView textView = findViewById(R.id.textView3);
        int a = Integer.parseInt(input1.getText().toString());
        int b = Integer.parseInt(input2.getText().toString());
        int sum = a + b;
        textView.setText(String.valueOf(sum));
        Log.i("add", "Add is Done");
        Toast.makeText(this, "You added Two Numbers", Toast.LENGTH_SHORT).show();
    }

    public void load1(View view) {
        ImageView im = findViewById(R.id.imageView);
        im.setImageResource(R.drawable.minus);
        TextView input1 = findViewById(R.id.input1);
        TextView input2 = findViewById(R.id.input2);
        TextView textView = findViewById(R.id.textView3);
        int a = Integer.parseInt(input1.getText().toString());
        int b = Integer.parseInt(input2.getText().toString());
        int diffrence1 = a - b;
        textView.setText(String.valueOf(diffrence1));
        Log.i("substract", "Substraction is Done");
        Toast.makeText(this, "You Substract two Numbers", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}