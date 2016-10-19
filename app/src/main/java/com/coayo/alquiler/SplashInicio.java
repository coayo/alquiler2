package com.coayo.alquiler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by cice on 18/10/16.
 */

public class SplashInicio extends Activity {
    private final int DURACION_SPLASH = 3000; // 3 segundos
    @Override

    public void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        //System.out.println("se creo el file");
        setContentView(R.layout.splashinicio);

        new Handler().postDelayed(new Runnable(){
                                             public void run(){
                                                Intent intent = new Intent(SplashInicio.this, logo.class);
                                                startActivity(intent);
                                                finish();
                                                };

                                            },
                            DURACION_SPLASH);


    }

}
