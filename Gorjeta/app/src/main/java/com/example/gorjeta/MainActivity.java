package com.example.gorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextView gorjeta,total;
    private SeekBar seek;
    private TextView valor_seek;
    private TextInputEditText valor_inicial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gorjeta=findViewById(R.id.Gorjeta);
        total=findViewById(R.id.Total);
        seek=findViewById(R.id.BarPorcentagem);
        valor_seek=findViewById(R.id.porcentagem);
        valor_inicial=findViewById(R.id.Valor_inicial);





        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                 /* String inicial = valor_inicial.getText().toString();

                if(inicial == null || inicial.equals("")){
                    Toast.makeText(getApplicationContext(),"Preencher valor inicial",Toast.LENGTH_SHORT).show();

                }else {
                    double aux_inicial=Double.parseDouble(valor_inicial.getText().toString());
                    valor_seek.setText(progress + "%");
                    double Dgorjeta, Dtotal;
                    Dgorjeta = (aux_inicial * progress) / 100;
                    Dtotal = aux_inicial + Dgorjeta;
                    gorjeta.setText("R$" + Dgorjeta);
                    total.setText("R$" + Dtotal);
                }*/
                valor_seek.setText(seekBar.getProgress() + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                String inicial = valor_inicial.getText().toString();

                if(inicial == null || inicial.equals("")){
                    Toast.makeText(getApplicationContext(),"Preencher valor inicial",Toast.LENGTH_SHORT).show();

                }else {
                    double aux_inicial=Double.parseDouble(valor_inicial.getText().toString());

                    double Dgorjeta, Dtotal;
                    Dgorjeta = (aux_inicial * seekBar.getProgress()) / 100;
                    Dtotal = aux_inicial + Dgorjeta;
                    gorjeta.setText("R$" + Dgorjeta);
                    total.setText("R$" + Dtotal);
                }
            }
        });
    }
}