package com.uniandes.amialarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    private Button agreamialarm, cancelaramialarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        getSupportActionBar().hide();


        final View contactPopupView= getLayoutInflater().inflate(R.layout.activity_main8, null);
        agreamialarm=(Button) findViewById(R.id.Agregaramialarm);

        agreamialarm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity7();

            }
        });

        cancelaramialarm=(Button) findViewById(R.id.cancelaramialarm);

        cancelaramialarm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity7();

            }
        });
    }

    public void openActivity7 (){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
}