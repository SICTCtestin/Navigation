package com.example.navapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isPressed=false;


    Button graphicBTN;
    Button culinaryBTN;
    Button dieselBTN;
    Button automotiveBTN;
    Button veterinaryBTN;
    Button collisionBTN;
    Button radioBTN;
    Button weldingBTN;
    Button engineeringBTN;
    Button csBTN;
    Button cnBTN;
    Button hvacBTN;
    Button safetyBTN;
    Button precisionBTN;
    Button manufacturingBTN;
    Button electricityBTN;
    Button constructionBTN;
    Button healthBTN;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        graphicBTN=findViewById(R.id.button27);
        graphicBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                graphicMap();
            }
        });
        culinaryBTN=findViewById(R.id.button29);
        culinaryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                culinaryMap();
            }
        });
        dieselBTN=findViewById(R.id.button30);
        dieselBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dieselMap();
            }
        });
        automotiveBTN=findViewById(R.id.button31);
        automotiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                automotiveMap();
            }
        });
        veterinaryBTN=findViewById(R.id.button32);
        veterinaryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veterinaryMap();
            }
        });
        collisionBTN=findViewById(R.id.button33);
        collisionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collisionMap();
            }
        });
        radioBTN=findViewById(R.id.button34);
        radioBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioMap();
            }
        });
        weldingBTN=findViewById(R.id.button35);
        weldingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weldingMap();
            }
        });
        engineeringBTN=findViewById(R.id.button36);
        engineeringBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                engineeringMap();
            }
        });
        csBTN=findViewById(R.id.button37);
        csBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                csMap();
            }
        });
        cnBTN=findViewById(R.id.button38);
        cnBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                networkMap();
            }
        });
        hvacBTN=findViewById(R.id.button39);
        hvacBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hvacMap();
            }
        });
        safetyBTN=findViewById(R.id.button40);
        safetyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                publicSafetyMap();
            }
        });
        precisionBTN=findViewById(R.id.button41);
        precisionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                precisionMap();
            }
        });
        manufacturingBTN=findViewById(R.id.button42);
        manufacturingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                matinenceMap();
            }
        });
        electricityBTN=findViewById(R.id.button43);
        electricityBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                electricityMap();
            }
        });
        constructionBTN=findViewById(R.id.button44);
        constructionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buildingTradesMap();
            }
        });
        healthBTN=findViewById(R.id.button45);
        healthBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthScienceMap();
            }
        });
        image=findViewById(R.id.imageView);

    }
    private void graphicMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void collisionMap(){
        image.setImageResource(R.drawable.collisionmap);
    }
    private void csMap(){
        image.setImageResource(R.drawable.csmap);
    }
    private void culinaryMap(){
        image.setImageResource(R.drawable.culinarymap);
    }
    private void dieselMap(){
        image.setImageResource(R.drawable.dieselmap);
    }
    private void electricityMap(){
        image.setImageResource(R.drawable.electricitymap);
    }
    private void engineeringMap(){
        image.setImageResource(R.drawable.engineeringmap);
    }
    private void healthScienceMap(){
        image.setImageResource(R.drawable.healthsciencemap);
    }
    private void hvacMap(){
        image.setImageResource(R.drawable.hvacmap);
    }
    private void matinenceMap(){
        image.setImageResource(R.drawable.matinencemap);
    }
    private void networkMap(){
        image.setImageResource(R.drawable.networkmap);
    }
    private void precisionMap(){
        image.setImageResource(R.drawable.precisionmap);
    }
    private void publicSafetyMap(){
        image.setImageResource(R.drawable.publicsafetymap);
    }
    private void radioMap(){
        image.setImageResource(R.drawable.radiomap);
    }
    private void weldingMap(){
        image.setImageResource(R.drawable.weldingmap);
    }
    private void buildingTradesMap(){
        image.setImageResource(R.drawable.buildingtradesmap);
    }
    private void automotiveMap(){
        image.setImageResource(R.drawable.automotiveservicemap);
    }
    private void veterinaryMap(){
        image.setImageResource(R.drawable.agmap);
    }

}