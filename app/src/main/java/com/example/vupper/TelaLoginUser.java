package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaLoginUser extends AppCompatActivity {
    Button botaoVoltarTelaInicial;

    Button botaoCriarContaUser;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login_user);


        //IniciarComponentes();

        botaoVoltarTelaInicial = findViewById(R.id.buttonVoltaInicial);
        botaoVoltarTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLogin = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(telaLogin);
            }
        });

        botaoCriarContaUser= findViewById(R.id.buttonCriarContaUser);
        botaoCriarContaUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent criarContaUser = new Intent(getApplicationContext(), FormCadastroUsuario.class);
                startActivity(criarContaUser);
            }
        });
    }


}