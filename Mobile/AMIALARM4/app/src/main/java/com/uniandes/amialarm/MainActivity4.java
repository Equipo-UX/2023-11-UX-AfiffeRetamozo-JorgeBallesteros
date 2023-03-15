package com.uniandes.amialarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {
    private Button newcontactpopup_recuperar;
    private AlertDialog dialog3;
    boolean pressed2 = false;
    private AlertDialog.Builder dialogBuilder3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main4);

        dialogBuilder3 = new AlertDialog.Builder(this);
        dialogBuilder3.setPositiveButton("Aceptar", null);

        final View contactPopupView= getLayoutInflater().inflate(R.layout.activity_main4, null);
        newcontactpopup_recuperar=(Button) findViewById(R.id.recuperar);
        newcontactpopup_recuperar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!pressed2){
                    dialog3= dialogBuilder3.create();
                    dialog3.setMessage("Los datos ingresados no son válidos, por favor intente de nuevo");
                    dialogBuilder3.setPositiveButton("Aceptar", null);//second parameter used for onclicklistener
                    dialog3.show();
                    pressed2 = true;

                }else{
                    dialog3= dialogBuilder3.create();
                    dialog3.setMessage("Se ha enviado un correo para confirmar, por favor revise su buzón, no olvide revisar la bandeja de no deseados");
                    dialogBuilder3.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });//second parameter used for onclicklistener
                    dialog3.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            openActivity1();
                        }
                    }, 3000);   //5 seconds

                }

            }
        });

    };
    public void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}