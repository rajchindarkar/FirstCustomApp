package com.dc.msu.firstcustomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView msgTxtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msgTxtView = findViewById(R.id.textView);
    }

    public void displayMsg(View view) {
        msgTxtView.setText("Msg changed");
    }
    public void displayToast(View view) {
        Toast.makeText(getApplicationContext(),"Login Clicked !!",Toast.LENGTH_SHORT).show();
    }

}