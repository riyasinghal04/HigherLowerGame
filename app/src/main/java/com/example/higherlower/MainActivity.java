package com.example.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String s){
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();

    }

    public void guess(View view){

        EditText guessedText=(EditText)findViewById(R.id.text3);
        //Toast.makeText(MainActivity.this, guessedText.getText().toString(), Toast.LENGTH_LONG).show();

        int guessedInt= Integer.parseInt(guessedText.getText().toString());

        if(guessedInt>randomNumber)
        {
            makeToast("Lower! Try Again");
        }
        else if(guessedInt<randomNumber)
        {
            makeToast("Higher! Try Again");
        }
        else
        {
            makeToast("CORRECT! Play again!");
            Random rand=new Random();
            randomNumber=rand.nextInt(20)+1;

        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//generates the random number only when the app is launched
        Random rand=new Random();
        int randomNumber=rand.nextInt(20)+1; //number between 1 and 20
    }
}
