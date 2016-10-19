package com.coayo.alquiler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//import static com.coayo.alquiler.R.id.editName;

public class logo extends AppCompatActivity {
    private final String extra_login = "";
    private final String extra_pass = "";

    private EditText loginEntrada;
    private EditText passEntrada;

    private Button connection;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_logo);
        //System.out.println("se creo el LOGO");
            loginEntrada = (EditText) findViewById(R.id.editName);
            passEntrada = (EditText) findViewById(R.id.editPass);

            connection = (Button) findViewById(R.id.button2);
            connection.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.out.println("Entro al login" + loginEntrada.getText().toString());
                    // Evaluo la condicion de login == Pass +1
                    if ((loginEntrada.getText().toString()).equals(passEntrada.getText().toString() + "1")){

                        System.out.println("login correco");
                    goToNextActivity();}
                }


            });
    }

    private void goToNextActivity() {
        Intent intent= new Intent(logo.this, Auth.class);
        intent.putExtra(extra_login, loginEntrada.getText().toString());
        intent.putExtra(extra_pass, passEntrada.getText().toString());
        startActivity(intent);

    }

}
