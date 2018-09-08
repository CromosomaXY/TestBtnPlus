package com.example.pisha.testbtnplus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    FloatingActionButton addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = findViewById(R.id.fab);

        addBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        if(v==addBtn){
            Intent intent = new Intent(this, CargaDatos.class);
            startActivity(intent);
        }

    }

}
