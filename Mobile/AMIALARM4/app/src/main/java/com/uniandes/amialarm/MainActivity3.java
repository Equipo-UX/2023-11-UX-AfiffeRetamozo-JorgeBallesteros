package com.uniandes.amialarm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class MainActivity3 extends AppCompatActivity {

    private Button newcontactpopup_crear;
    private AlertDialog dialog2, dialog3;
    boolean pressed1 = false;
    private AlertDialog.Builder dialogBuilder2, dialogBuilder3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);

        dialogBuilder2 = new AlertDialog.Builder(this);
        dialogBuilder2.setPositiveButton("Aceptar", null);

        final View contactPopupView= getLayoutInflater().inflate(R.layout.activity_main3, null);
        newcontactpopup_crear=(Button) findViewById(R.id.crear);

        newcontactpopup_crear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!pressed1){
                    dialog2= dialogBuilder2.create();
                    dialog2.setMessage("Los datos ingresados no son válidos, por favor intente de nuevo");
                    dialogBuilder2.setPositiveButton("Aceptar", null);//second parameter used for onclicklistener
                    dialog2.show();
                    pressed1 = true;

                }else{
                    dialog2= dialogBuilder2.create();
                    dialog2.setMessage("Se ha enviado un correo para confirmar, por favor revise su buzón, no olvide revisar la bandeja de no deseados");
                    dialogBuilder2.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });//second parameter used for onclicklistener
                    dialog2.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            openActivity1();
                        }
                    }, 3000);   //3 seconds

                }

            }
        });

    };
        public void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}