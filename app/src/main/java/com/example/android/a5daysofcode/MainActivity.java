package com.example.android.a5daysofcode;

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



    public void loadActivityB(View view) {
        Intent intentAtoB = new Intent(this, AboutALC.class);
        startActivity(intentAtoB);
    }

    public void loadActivityC(View view){
        Intent intentAtoC = new Intent(this, MyProfile.class);
        startActivity(intentAtoC);
    }
}
