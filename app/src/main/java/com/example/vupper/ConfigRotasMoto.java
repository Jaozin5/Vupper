package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConfigRotasMoto extends AppCompatActivity {

    Button botaoAdicionarRota;

    EditText editTextCidade, editTextBairro, editTextDestino, editTextHorario;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_rotas_moto);

        Context context = getApplicationContext();
        CharSequence text = "Rota Adicionada!";
        int duration = Toast.LENGTH_SHORT;

        botaoAdicionarRota = findViewById(R.id.buttonAdicionarRota);

        editTextBairro = findViewById(R.id.editTextBairro);
        editTextCidade = findViewById(R.id.editTextCidade);
        editTextDestino = findViewById(R.id.editTextDestino);
        editTextHorario = findViewById(R.id.editTextHorario);

        botaoAdicionarRota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                editTextBairro.setText("");
                editTextCidade.setText("");
                editTextDestino.setText("");
                editTextHorario.setText("");
                editTextCidade.requestFocus();
            }
        });



    }
}