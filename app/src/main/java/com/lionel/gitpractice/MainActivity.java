package com.lionel.gitpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("<>", "master 3");
        Log.d("<>", "develop 9 on website");


        Log.d("<>", "feature1 done -->  feature1 fixed");
        Log.d("<>", "feature1.1.1 done");

        Log.d("<>", "feature2.a done");
        Log.d("<>", "feature2.1 done");

        Log.d("<>", "feature3 done --> feature3 fixed");

        Log.d("<>", "feature 4 done");
        Log.d("<>", "feature 4.1 done");

        Log.d("<>", "feature 5 done");
    }
}
