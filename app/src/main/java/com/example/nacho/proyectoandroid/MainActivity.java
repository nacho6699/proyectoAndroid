package com.example.nacho.proyectoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textoResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int contador=0;

    public void sumar(View vista){
        contador++;
        mostrar();
    }
    public void restar(View vista){
        contador--;
        mostrar();
    }
    public void reset(View vista){
        contador=0;
        mostrar();
    }
    public void recuperar(View vista){
        EditText recuperado = (EditText)findViewById(R.id.et_numero);
        contador = Integer.parseInt(recuperado.getText().toString());
        textoResultado.setText(""+contador);
    }
    public void mostrar(){
        textoResultado=(TextView)findViewById(R.id.tv_valor);
        textoResultado.setText(""+contador);

    }
}
