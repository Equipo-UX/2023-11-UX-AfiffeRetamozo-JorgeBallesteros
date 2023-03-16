package com.uniandes.amialarm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    private Button agregarcrearalarma;
    private Button guardar, cancelar, quitar4;
    private AlertDialog.Builder dialogBuilder11 ;
    private AlertDialog dialog11;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        getSupportActionBar().hide();



        final View contactPopupView= getLayoutInflater().inflate(R.layout.activity_main7, null);
        guardar=(Button) findViewById(R.id.guardar);

        guardar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity2();

            }
        });

        cancelar=(Button) findViewById(R.id.cancelar);

        cancelar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity2();

            }
        });

        agregarcrearalarma=(Button) findViewById(R.id.AlarmAmigoami2);

        agregarcrearalarma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity8();

            }
        });

        dialogBuilder11 = new AlertDialog.Builder(this);
        dialogBuilder11.setPositiveButton("Aceptar", null);
        dialogBuilder11.setNegativeButton("Cancelar", null);

        quitar4=(Button) findViewById(R.id.quitar4);

        quitar4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog11= dialogBuilder11.create();
                dialog11.setMessage("¿Está seguro de quitar este correo?");
                dialog11.show();
            }

        });

    }

    public void openActivity2 (){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openActivity8 (){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}
