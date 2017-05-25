package com.s10576019.cyel.githubtest4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButtonStart(View view) {
        Intent intent = new Intent(this, Page亦軒.class);
        startActivity(intent);
    }
}
