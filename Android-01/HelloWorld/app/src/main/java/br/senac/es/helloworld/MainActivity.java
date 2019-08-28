package br.senac.es.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        final TextView textMetros = (TextView) findViewById(R.id.textMetros);

        textMetros.setText("Olá Mundo");

        //final TextView textAltura = (TextView) findViewById(R.id.textAltura);

        // textAltura.setText("asaasaa");

        //final TextView textPes = (TextView) findViewById(R.id.textPes);

    }
}
