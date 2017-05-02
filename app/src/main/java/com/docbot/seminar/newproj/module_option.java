package com.docbot.seminar.newproj;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class module_option extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_option);
    }
    public void Call(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void beat(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }

    public void bot(View view){


            Intent intent = new Intent(this,Main3Activity.class);
            startActivity(intent);
        }



}
