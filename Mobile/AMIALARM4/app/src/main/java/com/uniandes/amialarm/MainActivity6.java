package com.uniandes.amialarm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity6 extends AppCompatActivity {


    private Button newcontactpopup_volver;
    private Button newcontactpopup_agregarlist;
    private AlertDialog.Builder dialogBuilder5, dialogBuilder6;
    private AlertDialog dialog5, dialog6;
    private Button newcontactpopup_quitarp2, newcontactpopup_quitarp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main6);



        final View contactPopupView= getLayoutInflater().inflate(R.layout.activity_main6, null);
        newcontactpopup_agregarlist=(Button) findViewById(R.id.Agregaralarp2);

        newcontactpopup_agregarlist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity5();

            }
        });

        newcontactpopup_volver=(Button) findViewById(R.id.volverp2);

        newcontactpopup_volver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity2();

            }
        });

        dialogBuilder5 = new AlertDialog.Builder(this);
        dialogBuilder5.setPositiveButton("Aceptar", null);
        dialogBuilder5.setNegativeButton("Cancelar", null);

        newcontactpopup_quitarp2=(Button) findViewById(R.id.quitarp2);

        newcontactpopup_quitarp2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog5= dialogBuilder5.create();
                dialog5.setMessage("El correo no es válido, por favor intente de nuevo");
                dialog5.show();
            }


        });

        dialogBuilder6 = new AlertDialog.Builder(this);
        dialogBuilder6.setPositiveButton("Aceptar", null);
        dialogBuilder6.setNegativeButton("Cancelar", null);

        newcontactpopup_quitarp3=(Button) findViewById(R.id.quitarp3);

        newcontactpopup_quitarp3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog6= dialogBuilder6.create();
                dialog6.setMessage("El correo no es válido, por favor intente de nuevo");
                dialog6.show();
            }


        });

    }

    public void openActivity5(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void openActivity2 (){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}