package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button checkBoxButton = findViewById(R.id.btn_checkbox);
        Button radioButton = findViewById(R.id.btn_radiobutton);
        Button ratingBarButton = findViewById(R.id.btn_ratingbar);
        Button seekBarButton = findViewById(R.id.btn_seekbar);
        Button switchButton = findViewById(R.id.btn_switch);

        checkBoxButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CheckBoxActivity.class)));
        radioButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RadioButtonActivity.class)));
        ratingBarButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RatingBarActivity.class)));
        seekBarButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SeekBarActivity.class)));
        switchButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SwitchActivity.class)));
    }
}
