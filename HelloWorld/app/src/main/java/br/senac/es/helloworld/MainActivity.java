package br.senac.es.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int alturaEmCentimetro=0;

    double altura1 = 1;
    double altura2 = 2;
    double altura3 = 3;

    private String formataValorComDoisDigitos(double valor){
        return String.format(Locale.FRANCE, "%.2f",valor);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textMetros = (TextView) findViewById(R.id.textMetros);

        textMetros.setText(String.valueOf(alturaEmCentimetro));

        final TextView textAltura = (TextView) findViewById(R.id.textAltura);

        // textAltura.setText("asaasaa");

        final TextView textPes = (TextView) findViewById(R.id.textPes);

        final SeekBar seekBar = (SeekBar)findViewById(R.id.skMetros);



        seekBar.setMax(230);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    alturaEmCentimetro = progress;
                    String texto = formataValorComDoisDigitos(progress / 100.0);
                    texto += " m.";
                    textMetros.setText(texto);
                }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                textPes.setText("toque em converter");
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {



            }
        });
        
        final Button btmConverter = (Button) findViewById(R.id.btmConverter);
        btmConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alturaEmPes = alturaEmCentimetro / 30.40;
                String texto = formataValorComDoisDigitos(alturaEmPes);
                texto += "pé(s)";
                textPes.setText(texto);

            }
        });

        final TextView textMedia = (TextView) findViewById(R.id.textMedia);
        double media = altura1 + altura2 + altura3 / 3;
        String med = formataValorComDoisDigitos(media);
        med += "Med";



    }
}
