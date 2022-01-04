package com.example.alcoolxgasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText alcool,gaso;
    private TextView opcao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opcao=findViewById(R.id.op);
        alcool=findViewById(R.id.alcool);
        gaso=findViewById(R.id.gaso);
    }
    public void comparar(View view){
        String Palcool = alcool.getText().toString();
        String Pgasolina =gaso.getText().toString();
       if(validarDados(Palcool,Pgasolina)) {double GA,AL,calculo=0;
        GA= Double.parseDouble(Pgasolina);
        AL=Double.parseDouble(Palcool);
       calculo =AL/GA;
        if(calculo>=0.7){
            opcao.setText("Gasolina está melhor");
        }
        else {
            opcao.setText("Álcool está melhor");
        }}
       else{
           opcao.setText("Prencher os dados");
       }
    }
    public boolean validarDados(String al,String ga){
        Boolean validacao =true;
        if(al == null ||al.equals("")||ga == null||ga.equals("")){
            validacao=false;
        }
        return validacao;
    }
}