package com.example.may10_labtask_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView; // Add this import statement

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewCookie;
    private TextView textViewHungry; // Change here
    private Button buttonEatCookie;

    private boolean isFull = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imageViewCookie = findViewById(R.id.imageViewCookie);
        textViewHungry = findViewById(R.id.textViewHungry); // Change here
        buttonEatCookie = findViewById(R.id.buttonEatCookie);
    }

    public void onEatCookieClicked(View view) {
        if (!isFull) {
            imageViewCookie.setImageResource(R.mipmap.full);
            buttonEatCookie.setText("DONE");
            textViewHungry.setText("I'm so full");
            isFull = true;
        } else {
            // Handle 'Done' state if needed
        }
    }
}
