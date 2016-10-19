package com.coayo.alquiler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by cice on 18/10/16.
 */

public class Auth extends Activity {
    private TextView login;
   //private TextView pass;
    private String extra_login ;
    //private String extra_pass;
    private Button Alta;
    private ImageButton imageButtonEntrega;
    private ImageButton imageButtonLoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // se lanza el xml de la vista
        setContentView(R.layout.auth);

        Intent intent = getIntent();

        final String ext_login = intent.getStringExtra(extra_login);
        //String ext_pass = intent.getStringExtra(extra_pass);//parece deben coincidir nombre de las variabes del Bundle pasadas entre clases


        Button Alta = (Button) findViewById(R.id.imageButtonAlta);

        Alta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Auth.this, formulario.class);
                intent.putExtra(extra_login, ext_login);
                // intent.putExtra(extra_pass, passEntrada.getText().toString());
                startActivity(intent);

            }
        });
    }

    }

//}
