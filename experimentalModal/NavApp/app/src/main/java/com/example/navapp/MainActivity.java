package com.example.navapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
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


        graphicBTN=findViewById(R.id.graphicBTN);
        graphicBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                graphicMap();
            }
        });
        culinaryBTN=findViewById(R.id.culinaryBTN);
        culinaryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                culinaryMap();
            }
        });
        dieselBTN=findViewById(R.id.dieselBTN);
        dieselBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dieselMap();
            }
        });
        automotiveBTN=findViewById(R.id.automotiveBTN);
        automotiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                automotiveMap();
            }
        });
        veterinaryBTN=findViewById(R.id.veterinaryBTN);
        veterinaryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veterinaryMap();
            }
        });
        collisionBTN=findViewById(R.id.collisionBTN);
        collisionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collisionMap();
            }
        });
        radioBTN=findViewById(R.id.radioBTN);
        radioBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioMap();
            }
        });
        weldingBTN=findViewById(R.id.weldingBTN);
        weldingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weldingMap();
            }
        });
        engineeringBTN=findViewById(R.id.engineeringBTN);
        engineeringBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                engineeringMap();
            }
        });
        csBTN=findViewById(R.id.csBTN);
        csBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                csMap();
            }
        });
        cnBTN=findViewById(R.id.cnBTN);
        cnBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                networkMap();
            }
        });
        hvacBTN=findViewById(R.id.hvacBTN);
        hvacBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hvacMap();
            }
        });
        safetyBTN=findViewById(R.id.safetyBTN);
        safetyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                publicSafetyMap();
            }
        });
        precisionBTN=findViewById(R.id.precisionBTN);
        precisionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                precisionMap();
            }
        });
        manufacturingBTN=findViewById(R.id.manuBTN);
        manufacturingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                matinenceMap();
            }
        });
        electricityBTN=findViewById(R.id.electricityBTN);
        electricityBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                electricityMap();
            }
        });
        constructionBTN=findViewById(R.id.constructionBTN);
        constructionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buildingTradesMap();
            }
        });
        healthBTN=findViewById(R.id.healthBTN);
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