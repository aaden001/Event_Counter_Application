package com.example.aadeniran.mathsgreat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    //Declaring variables
      Button  btnClick;
      Button btnReset;
      TextView textCount;


//setting up the onClick for the click button
public void clickbtn(View view)
    {

        btnClick = (Button)findViewById(R.id.clickbutton);
        textCount = (TextView) findViewById(R.id.textView);

        int textCountInt = Integer.parseInt(textCount.getText().toString());

//adds one on every click
       textCountInt++;


// Sets the integer value into string automatically
     textCount.setText(String.valueOf(textCountInt));


    //Log.i("Info",textCount.toString());
    // Log.i("Info","button cliked");

    }


    public void resetbtn(View view)
    {
        textCount = (TextView) findViewById(R.id.textView);
        btnReset = (Button) findViewById(R.id.resetbutton);

        int textCountInt = Integer.parseInt(textCount.getText().toString());

        textCountInt = 0;

        textCount.setText(String.valueOf(textCountInt));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}
