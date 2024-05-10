package com.example.may10_labtask_1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPassword;
    private TextView textViewEnteredData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextPassword = findViewById(R.id.editTextPassword);
        textViewEnteredData = findViewById(R.id.textViewEnteredData);

        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        Button buttonReset = findViewById(R.id.buttonReset);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String password = editTextPassword.getText().toString();

                textViewEnteredData.setText("Entered Name: " + name + "\nEntered Password: " + password);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextName.setText("");
                editTextPassword.setText("");
                textViewEnteredData.setText("");
            }
        });
    }
}
