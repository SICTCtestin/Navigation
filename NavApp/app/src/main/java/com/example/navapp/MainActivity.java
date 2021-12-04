package com.example.navapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
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
    ImageView clickableMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        automotiveBTN=findViewById(R.id.automotiveBTN);
        automotiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                automotiveMap();
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.white));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        graphicBTN=findViewById(R.id.graphicBTN);
        graphicBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                graphicMap();
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        culinaryBTN=findViewById(R.id.culinaryBTN);
        culinaryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                culinaryMap();
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        dieselBTN=findViewById(R.id.dieselBTN);
        dieselBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dieselMap();
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        veterinaryBTN=findViewById(R.id.veterinaryBTN);
        veterinaryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                veterinaryMap();
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        collisionBTN=findViewById(R.id.collisionBTN);
        collisionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collisionMap();
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        radioBTN=findViewById(R.id.radioBTN);
        radioBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioMap();
                radioBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        weldingBTN=findViewById(R.id.weldingBTN);
        weldingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weldingMap();
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        engineeringBTN=findViewById(R.id.precisionBTN);
        engineeringBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                precisionMap();
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        csBTN=findViewById(R.id.engineeringBTN);
        csBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                engineeringMap();
                csBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        cnBTN=findViewById(R.id.manuBTN);
        cnBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                matinenceMap();
                cnBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        hvacBTN=findViewById(R.id.csBTN);
        hvacBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                csMap();
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        safetyBTN=findViewById(R.id.electricityBTN);
        safetyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                electricityMap();
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        precisionBTN=findViewById(R.id.cnBTN);
        precisionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                networkMap();
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        manufacturingBTN=findViewById(R.id.constructionBTN);
        manufacturingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buildingTradesMap();
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        electricityBTN=findViewById(R.id.hvacBTN);
        electricityBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hvacMap();
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        constructionBTN=findViewById(R.id.healthBTN);
        constructionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthScienceMap();
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                healthBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        healthBTN=findViewById(R.id.safetyBTN);
        healthBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                publicSafetyMap();
                healthBTN.setBackgroundColor(getResources().getColor(R.color.white));
                automotiveBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                culinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                dieselBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                veterinaryBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                collisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                radioBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                weldingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                engineeringBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                csBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                cnBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                hvacBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                safetyBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                precisionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                manufacturingBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                electricityBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                constructionBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
                graphicBTN.setBackgroundColor(getResources().getColor(R.color.transparent));
            }
        });
        clickableMap=findViewById(R.id.mapView);
        clickableMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,pop.class));
            }
        });

        image=findViewById(R.id.mapView);
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