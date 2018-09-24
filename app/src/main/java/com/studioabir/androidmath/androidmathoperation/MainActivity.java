package com.studioabir.androidmath.androidmathoperation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.studioabir.mymath.abirmath.abirmath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int result = abirmath.Division(10, 50);
        Toast.makeText(MainActivity.this, String.valueOf("Our Result is: "+result),Toast.LENGTH_LONG).show();


    }
}
