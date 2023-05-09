package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaLoginMotorista extends AppCompatActivity {
    Button botaoVoltaTelaInicial;

    private TextView text_tela_cadastro_motorista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login_motorista);


        IniciarComponentes();

        botaoVoltaTelaInicial = findViewById(R.id.buttonVoltaInicial);
        botaoVoltaTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telaLogin = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(telaLogin);
            }
        });

        text_tela_cadastro_motorista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadastroMotorista = new Intent(TelaLoginMotorista.this, FormCadastro.class);
                startActivity(telaCadastroMotorista);
            }
        });
    }

    private void IniciarComponentes(){
        text_tela_cadastro_motorista = findViewById(R.id.textCadastroMotorista);
    }
}