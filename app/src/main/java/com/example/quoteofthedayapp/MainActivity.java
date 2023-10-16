package com.example.quoteofthedayapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private Button refreshButton;
    private Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        refreshButton = findViewById(R.id.refreshButton);
        shareButton = findViewById(R.id.shareButton);


        updateQuote();


        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuote();
            }
        });

        // Share button click event
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentQuote = quoteTextView.getText().toString();
                // Implement code to share the quote via messaging or social media here
            }
        });
    }

    private void updateQuote() {

        String randomQuote = "Talk is cheap. Show me the code. - Linus Torvalds";
        String randomQuote1 = "Code is like humor. When you have to explain it, it’s bad";
        quoteTextView.setText(randomQuote);
        quoteTextView.setText(randomQuote1);
    }
}

