package com.maggiexu.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int num1;
    private int num2;
    private int num3;
    private int points = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pickNumbers();
    }

    public void pickNumbers() {
        Button Button1 = (Button) findViewById(R.id.button1);
        Button Button2 = (Button) findViewById(R.id.button2);
        Button Button3 = (Button) findViewById(R.id.button3);
        Random randy = new Random();
        num1 = 0;
        num2 = 0;
        num3 = 0;
        while (num1 == num2 || num2 == num3 || num1 == num3) {
            num1 = randy.nextInt(100);
            num2 = randy.nextInt(100);
            num3 = randy.nextInt(100);
        }
        Button1.setText(String.valueOf(num1));
        Button2.setText(String.valueOf(num2));
        Button3.setText(String.valueOf(num3));
    }

    public void Clickbutton1(View view) {
        if(num1 > num2 && num1 > num3) {
            Toast.makeText(this,"Correct!", Toast.LENGTH_SHORT).show();
            points++;
        }
        else {
            Toast.makeText(this,"Wrong!", Toast.LENGTH_SHORT).show();
            points--;
        }
        TextView pointsview = (TextView) findViewById(R.id.pointsView);
        pointsview.setText("Points: " + points);
        pickNumbers();
    }

    public void Clickbutton2(View view) {
        if(num2 > num1 && num2 > num3) {
            Toast.makeText(this,"Correct!", Toast.LENGTH_SHORT).show();
            points++;
        }
        else {
            Toast.makeText(this,"Wrong!", Toast.LENGTH_SHORT).show();
            points--;
        }
        TextView pointsview = (TextView) findViewById(R.id.pointsView);
        pointsview.setText("Points: " + points);
        pickNumbers();
    }

    public void Clickbutton3(View view) {
        if(num3 > num1 && num3 > num2) {
            Toast.makeText(this,"Correct!", Toast.LENGTH_SHORT).show();
            points++;
        }
        else {
            Toast.makeText(this,"Wrong!", Toast.LENGTH_SHORT).show();
            points--;
        }
        TextView pointsview = (TextView) findViewById(R.id.pointsView);
        pointsview.setText("Points: " + points);
        pickNumbers();
    }
}
