package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button myButton;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.myButton);
        myTextView = findViewById(R.id.myTextView);

        myButton.setTextColor(Color.YELLOW);
        myButton.setBackgroundColor(Color.GRAY);
        myButton.setText("No");
        final Boolean[] what = {false};

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!what[0]) {
                    myTextView.setTextColor(Color.RED);

                    myTextView.setText(R.string.my_text);

                    myButton.setTextColor(Color.WHITE);
                    myButton.setBackgroundColor(Color.BLACK);
                    myButton.setText("Yes");

                }

                else {
                    myTextView.setText("Are you dumb?");
                    myButton.setText("No");
                }

                what[0] = !what[0];

            }
        });
    }


}
