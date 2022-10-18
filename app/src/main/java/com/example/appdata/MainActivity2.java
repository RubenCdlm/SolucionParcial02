package com.example.appdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

     private TextView prod2;
     private TextView prod6;
     private TextView prod8;
     private TextView prod11;
     private TextView total;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        prod2 = (TextView) findViewById(R.id.prod2);
        prod6 = (TextView) findViewById(R.id.prod6);
        prod8 = (TextView) findViewById(R.id.prod8);
        prod11 = (TextView) findViewById(R.id.prod11);
        total = (TextView) findViewById(R.id.total);

        Bundle objEnviado = getIntent().getExtras();
        Usuario user = null;


        if(objEnviado != null){
            user = (Usuario) objEnviado.getSerializable("usuario");

            prod2.setText('$'+String.valueOf(mult(250000000,user.getferrari1())));
            int valor = mult(250000000,user.getferrari1());
            prod6.setText('$'+String.valueOf(mult(120000000,user.getbmw1())));
            int valor1 = mult(120000000,user.getbmw1());
            prod8.setText('$'+String.valueOf(mult(60000000,user.getMazda1())));
            int valor2 = mult(60000000,user.getMazda1());
            prod11.setText('$'+String.valueOf(mult(80000000,user.getVolvo1())));
            int valor3 = mult(80000000,user.getVolvo1());

            total.setText('$'+String.valueOf(valor+valor1+valor2+valor3));
        }

    }
        public int mult(int x, int y){
            if(y == 0 || x == 0)
                return 0;
            if(y == 1)
                return x;
            return x + mult(x,y-1);
        }


    public void regresar(View view){
        finish();
    }
}