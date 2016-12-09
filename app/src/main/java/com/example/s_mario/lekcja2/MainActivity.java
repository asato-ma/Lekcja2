package com.example.s_mario.lekcja2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean isSecondFragment = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction()
            .add(R.id.fragment_container, new FirstFragment())
            .commit();
    }


    public void onReplaceBtnClick(View view) {
        if (isSecondFragment) {
        getFragmentManager().beginTransaction()
                .add(R.id.fragment_container, new SecondFragment())
                .commit();
    } else {
            getFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new FirstFragment())
                    .commit();
        }

        isSecondFragment = !isSecondFragment;
        }
}
