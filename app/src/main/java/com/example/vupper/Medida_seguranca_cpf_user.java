package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Medida_seguranca_cpf_user extends AppCompatActivity {

    Button botaoProximaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medida_seguranca_cpf_user);

        IniciarComponentes();

        botaoProximaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proxTelaDadosUser = new Intent(Medida_seguranca_cpf_user.this, DadosPerfilUser.class);
                startActivity(proxTelaDadosUser);
            }
        });
    }

    private void IniciarComponentes() {
        botaoProximaTela = findViewById(R.id.buttonProx2);
    }
}

