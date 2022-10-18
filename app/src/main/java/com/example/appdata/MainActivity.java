package com.example.appdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bmw;
    private EditText ferrari;
    private EditText Mazda;
    private EditText Volvo;
    private Button buttonEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmw = (EditText) findViewById(R.id.bmw);
        ferrari = (EditText) findViewById(R.id.ferrari);
        Mazda = (EditText) findViewById(R.id.Mazda);
        Volvo = (EditText) findViewById(R.id.Volvo);
        buttonEnviar = (Button) findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validar()){
                    int bmw1 = Integer.parseInt(bmw.getText().toString());
                    int ferrari1 = Integer.parseInt(ferrari.getText().toString());
                    int Mazda1 = Integer.parseInt(Mazda.getText().toString());
                    int Volvo1 = Integer.parseInt(Volvo.getText().toString());


                    Usuario u = new Usuario(bmw1,ferrari1,Mazda1,Volvo1);

                    Intent miIntent = new Intent (MainActivity.this,MainActivity2.class);

                    Bundle bundle = new Bundle();
                    bundle.putSerializable("usuario",u);

                    miIntent.putExtras(bundle);
                    startActivity(miIntent);
                }
            }
        });
    }
    public boolean validar() {
        boolean result = true;

        String valor = bmw.getText().toString();
        String valor1 = ferrari.getText().toString();
        String valor2 = Mazda.getText().toString();
        String valor3 = Volvo.getText().toString();

        if(valor.isEmpty()){
            bmw.setError("Este campo no puede quedar vacio");
            result = false;
        }
        if(valor1.isEmpty()){
            ferrari.setError("Este campo no puede quedar vacio");
            result = false;
        }
        if(valor2.isEmpty()){
            Mazda.setError("Este campo no puede quedar vacio");
            result = false;
        }
        if(valor3.isEmpty()){
            Volvo.setError("Este campo no puede quedar vacio");
            result = false;
        }
        return result;
    }

}
