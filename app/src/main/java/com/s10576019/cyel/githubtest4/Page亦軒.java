package com.s10576019.cyel.githubtest4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Jim on 2017/5/25.
 */

//TODO 完成Page亦軒
public class Page亦軒 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_yishuan);
    }

    public void clickButtonStart(View view) {
        Intent intent = new Intent(this, Page劉濬.class);
        startActivity(intent);
    }
}
