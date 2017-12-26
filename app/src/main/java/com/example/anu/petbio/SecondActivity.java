package com.example.anu.petbio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private ImageView addimage;
    private TextView petname;
    private TextView petbio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        addimage =(ImageView) findViewById(R.id.petimageId);
        petname = (TextView) findViewById(R.id.nameId);
        petbio = (TextView) findViewById(R.id.bioid);

        extras=getIntent().getExtras();
        if(extras != null){
            String name= extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name,bio);
        }

    }

    public void setUp(String name, String bio){

        if(name.equals("Meow")){
            addimage.setImageDrawable(getResources().getDrawable(R.drawable.cattt));
            petname.setText(name);
            petbio.setText(bio);
        }else if(name.equals("Jimmy")){
            addimage.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            petname.setText(name);
            petbio.setText(bio);
        }}
}
