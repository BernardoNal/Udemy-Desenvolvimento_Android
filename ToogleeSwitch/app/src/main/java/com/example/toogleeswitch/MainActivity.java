package com.example.toogleeswitch;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Switch senha;
    private ToggleButton toggle;

    private TextView rsul,Tseek;

    private ProgressBar barLinear,barCirc;
    private SeekBar seek;
    private int progresso =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        senha=findViewById(R.id.switch1);
        toggle=findViewById(R.id.toggleButton);
        rsul=findViewById(R.id.resultado);

        barCirc=findViewById(R.id.ProgressCirc);
        barLinear=findViewById(R.id.progressLinerar);
        barCirc.setVisibility(View.GONE);

        seek=findViewById(R.id.seekBar);
        Tseek=findViewById(R.id.textSeek);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                 Tseek.setText("Progresso:"+progress+" / "+seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void enviar(View view){
        String Switch ;
        String tog;
        if(senha.isChecked()){
            Switch="On";
        }else {
            Switch="OFF";
        }
        if(toggle.isChecked()){
            tog="ON";
        }else{
            tog="OFF";
        }
        rsul.setText("senha:"+Switch+"\ntoggle:"+tog);
       //Toast.makeText(getApplicationContext(),"Operação Salva",0).show();
        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.arrow_up_float);

        Toast toast =new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(imagem);
        toast.show();
    }
    public void mud(View view){
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);

        dialogo.setTitle("Mudança");
        dialogo.setMessage("VC realmente quer alterar");

        dialogo.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                rsul.setText("alterado");
            }

        });
        dialogo.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             Toast.makeText(getApplicationContext(),"vc não alterou",Toast.LENGTH_LONG).show();
            }
        });
        dialogo.create();
        dialogo.show();
    }
    public  void carregar(View view){

     this.progresso=this.progresso+1;
     barLinear.setProgress(this.progresso);

     barCirc.setVisibility(View.VISIBLE);

     if(this.progresso == 5){
         barCirc.setVisibility(View.GONE);
     }
        Tseek.setText("Escolhido:"+seek.getProgress()+" / "+seek.getMax());
     barLinear.setProgress(seek.getProgress());
    }
}