package com.uniandes.amialarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    private Button newcontactpopup_cancelaralarmami;
    private Button newcontactpopup_agregaralarami;
    private AlertDialog.Builder dialogBuilder4;
    private AlertDialog dialog4;
    boolean pressed3 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main5);

        dialogBuilder4 = new AlertDialog.Builder(this);
        dialogBuilder4.setPositiveButton("Aceptar", null);
        final View contactPopupView= getLayoutInflater().inflate(R.layout.activity_main5, null);
        newcontactpopup_agregaralarami=(Button) findViewById(R.id.Agregaralarami);

        newcontactpopup_agregaralarami.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(!pressed3){
                    dialog4= dialogBuilder4.create();
                    dialog4.setMessage("El correo no es válido, por favor intente de nuevo");
                    dialog4.show();
                    pressed3=true;
                }else {

                    dialog4= dialogBuilder4.create();
                    dialog4.setMessage("Se ha enviado un correo para confirmar, por favor revise su buzón, no olvide revisar la bandeja de no deseados");
                    dialogBuilder4.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }


                    });
                    dialog4.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            openActivity6();
                        }
                    }, 3000);   //3 seconds
                }
            }
        });

        newcontactpopup_cancelaralarmami=(Button) findViewById(R.id.cancelaralarmami);

        newcontactpopup_cancelaralarmami.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity6();
            }
        });

    }
        public void openActivity6 (){
            Intent intent = new Intent(this, MainActivity6.class);
            startActivity(intent);
        }
}


