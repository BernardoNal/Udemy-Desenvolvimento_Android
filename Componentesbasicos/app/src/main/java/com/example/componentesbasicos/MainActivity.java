package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText textN;
    private TextInputEditText textE;
    private TextView resultado;

    private CheckBox green,red,blue;

    private RadioButton Masc,Fem;
    private RadioGroup Gsexo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textN = findViewById(R.id.nome);
        textE =findViewById(R.id.email);
        resultado = findViewById(R.id.resultado);

        green = findViewById(R.id.green);
        red =findViewById(R.id.red);
        blue = findViewById(R.id.blue);

        Masc =findViewById(R.id.M);
        Fem = findViewById(R.id.F);
        Gsexo = findViewById(R.id.GroupSexo);

        radiobutton();
    }
    public void radiobutton(){


        Gsexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if( checkedId == R.id.M ){
                    resultado.setText("Masculino");
                }else if( checkedId == R.id.F ){
                    resultado.setText("Feminino");
                }

            }
        });




    }
 public String check(){
     String cores ="";
     if(green.isChecked()){
         cores = cores+"\nverde";
     }
     if(red.isChecked()){
         cores = cores+"\nvermelho";
     }
     if(blue.isChecked()){
         cores = cores+"\nazul";
     }
     return cores;
 }
 public String sexo(){
        String sex ="";
     if(Masc.isChecked()){
         sex = Masc.getText().toString();
     }
     else if(Fem.isChecked()){
         sex = Fem.getText().toString();
     }
        return sex;
 }
    public void enviar (View view){


        String resu = textN.getText().toString();
        String resuE = textE.getText().toString();
        resultado.setText("nome:"+resu+"\nsexo:"+sexo()+"\nemail:"+resuE+check());
    }
    public void limpar (View view){

        textN.setText("");
        textE.setText("");
        resultado.setText("resultado:");
    }
}