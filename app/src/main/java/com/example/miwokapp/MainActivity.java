package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView numbers,colors,family,phrases ;
public static int backG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers =(TextView)findViewById(R.id.numbers);
        family =(TextView)findViewById(R.id.family);
        colors =(TextView)findViewById(R.id.colors);
        phrases =(TextView)findViewById(R.id.phrases);
        numbers.setOnClickListener(this);
        family.setOnClickListener(this);
        colors.setOnClickListener(this);
        phrases.setOnClickListener(this);
        ArrayList<String> restaurantsToTry = new ArrayList<String>();
        restaurantsToTry.add("Morning Cafe");
        restaurantsToTry.add("BBQ Time");
        restaurantsToTry.remove("Morning Cafe");
        int numberOfRestaurants = restaurantsToTry.size();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.numbers:
                Intent intent1 =new Intent(this,NumbersActivity.class);
                backG =R.color.category_numbers;
                startActivity(intent1);
                break;
            case R.id.family:
                Intent intent2 =new Intent(this,FamilyActivity.class);
                backG =R.color.category_family;
                startActivity(intent2);
                break;
            case R.id.colors:
                Intent intent3 =new Intent(this,ColorsActivity.class);
                backG =R.color.category_colors;
                startActivity(intent3);
                break;
            case R.id.phrases:
                Intent intent4 =new Intent(this,PhrasesActivity.class);
                backG =R.color.category_phrases;
                startActivity(intent4);
                break;
        }
    }
}