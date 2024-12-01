package com.example.assignment2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CheckBoxActivity extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3;
    Button showSelectedButton;
    TextView selectedBooksText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        showSelectedButton = findViewById(R.id.showSelectedButton);
        selectedBooksText = findViewById(R.id.selectedBooksText);

        showSelectedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder selectedBooks = new StringBuilder("Selected Books: ");

                if (checkBox1.isChecked()) {
                    selectedBooks.append("\n").append(checkBox1.getText().toString());
                }
                if (checkBox2.isChecked()) {
                    selectedBooks.append("\n").append(checkBox2.getText().toString());
                }
                if (checkBox3.isChecked()) {
                    selectedBooks.append("\n").append(checkBox3.getText().toString());
                }

                selectedBooksText.setText(selectedBooks.toString());
            }
        });
    }
}
