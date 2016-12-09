package com.example.s_mario.lekcja2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String KEY_TEXT="key_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle b = getIntent().getExtras();
        String text = b.getString(KEY_TEXT, "");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(text);

    }
}
