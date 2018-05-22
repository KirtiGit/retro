package com.example.lenovo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.myapplication.R;

public class Secondlargest extends AppCompatActivity
{

    final int demoString[] = {1,21,20,2,5,19};

    int holdvari,second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        holdvari=demoString[0];
        second=holdvari;
        for (int aDemoString : demoString) {

            if (holdvari < aDemoString) {
                second=holdvari;
                holdvari = aDemoString;
            }
        }
    }
}
