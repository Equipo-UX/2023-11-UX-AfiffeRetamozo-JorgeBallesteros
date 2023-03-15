package com.uniandes.amialarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    private Button newcontactpopup_salir, newcontactpopup_alarma;
    private Button newcontactpopup_alarmaamigo, newcontactpopup_copiar, newcontactpopup_copiar2, newcontactpopup_quitar1, newcontactpopup_quitar2;
    private AlertDialog.Builder dialogBuilder7, dialogBuilder8, dialogBuilder9, dialogBuilder10 ;
    private AlertDialog dialog7, dialog8, dialog9, dialog10;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        final View contactPopupView= getLayoutInflater().inflate(R.layout.activity_main2, null);
        newcontactpopup_salir=(Button) findViewById(R.id.button6);

        newcontactpopup_salir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity1();

            }
        });

        newcontactpopup_alarmaamigo=(Button) findViewById(R.id.AlarmAmigo);

        newcontactpopup_alarmaamigo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity5();

            }
        });

        newcontactpopup_alarma=(Button) findViewById(R.id.alarmaccami);

        newcontactpopup_alarma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity7();

            }
        });


        ImageView img =(ImageView) findViewById(R.id.campana1);

        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity9();

            }
        });

        ImageView img2 =(ImageView) findViewById(R.id.campana2);

        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity9();

            }
        });

        dialogBuilder7 = new AlertDialog.Builder(this);
        dialogBuilder7.setPositiveButton("Aceptar", null);

        newcontactpopup_copiar=(Button) findViewById(R.id.copiar);

        newcontactpopup_copiar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog7= dialogBuilder7.create();
                dialog7.setMessage("Alarma copiada correctamente");
                dialog7.show();
            }


        });

        dialogBuilder8 = new AlertDialog.Builder(this);
        dialogBuilder8.setPositiveButton("Aceptar", null);

        newcontactpopup_copiar2=(Button) findViewById(R.id.copiar2);

        newcontactpopup_copiar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog8= dialogBuilder8.create();
                dialog8.setMessage("Alarma copiada correctamente");
                dialog8.show();
            }


        });

        dialogBuilder9 = new AlertDialog.Builder(this);
        dialogBuilder9.setPositiveButton("Aceptar", null);

        newcontactpopup_quitar1=(Button) findViewById(R.id.quitar1);

        newcontactpopup_quitar1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog9= dialogBuilder9.create();
                dialog9.setMessage("¿Está seguro de quitar esta alarma?");
                dialog9.show();
            }


        });

        dialogBuilder10 = new AlertDialog.Builder(this);
        dialogBuilder10.setPositiveButton("Aceptar", null);

        newcontactpopup_quitar2=(Button) findViewById(R.id.quitar2);

        newcontactpopup_quitar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog10= dialogBuilder10.create();
                dialog10.setMessage("¿Está seguro de quitar esta alarma?");
                dialog10.show();
            }


        });


    }

    public void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }

    public void openActivity5(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);


    }
    public void openActivity7(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);


    }

    public void openActivity9(){
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);


    }

}