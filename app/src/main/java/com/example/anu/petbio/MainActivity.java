package com.example.anu.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        catView = (ImageView) findViewById(R.id.catView);
        dogView = (ImageView) findViewById(R.id.dogView);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.catView:
                // go to second activity
                Intent catIntent = new Intent(MainActivity.this,SecondActivity.class);
                catIntent.putExtra("name","Meow");
                catIntent.putExtra("bio","Great cat. Loves people and meows a lot");
                startActivity(catIntent);
                //Toast.makeText(MainActivity.this,"Cat!",Toast.LENGTH_LONG).show();
                break;
            case R.id.dogView:
                // go to second activity
                Intent dogIntent = new Intent(MainActivity.this,SecondActivity.class);
                dogIntent.putExtra("name","Jimmy");
                dogIntent.putExtra("bio","Great dog. Loves people and barks a lot");
                startActivity(dogIntent);
                //Toast.makeText(MainActivity.this,"Dog!",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
