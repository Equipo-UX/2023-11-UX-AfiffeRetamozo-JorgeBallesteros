package com.uniandes.amialarm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private Button newcontactpopup_inicio;
    private Button newcontactpopup_crear_cuenta;
    private Button newcontactpopup_password;
    boolean pressed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setPositiveButton("Aceptar", null);
        final View contactPopupView= getLayoutInflater().inflate(R.layout.activity_main, null);
        newcontactpopup_inicio=(Button) findViewById(R.id.button5);

        newcontactpopup_inicio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!pressed){
                    dialog= dialogBuilder.create();
                    dialog.setMessage("Los datos ingresados no son válidos, por favor intente de nuevo");
                    dialogBuilder.setPositiveButton("Aceptar", null);//second parameter used for onclicklistener
                    dialog.show();
                    pressed = true;

                }else {
                    openActivity2();
                }

                }
        });


        newcontactpopup_crear_cuenta=(Button) findViewById(R.id.button2);
        newcontactpopup_crear_cuenta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity3();

            }
        });

        newcontactpopup_password=(Button) findViewById(R.id.button3);
        newcontactpopup_password.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActivity4();

            }
        });

    }
    public void openActivity2 (){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openActivity3 (){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void openActivity4 (){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}