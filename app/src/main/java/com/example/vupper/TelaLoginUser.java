package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaLoginUser extends AppCompatActivity {
    Button botaoVoltaTelaInicial;

    private TextView text_tela_cadastro_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login_user);


        IniciarComponente();

        botaoVoltaTelaInicial = findViewById(R.id.buttonVoltarInicial);
        botaoVoltaTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telaLogin = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(telaLogin);
            }
        });

        text_tela_cadastro_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadastroMotorista = new Intent(TelaLoginUser.this, FormCadastro.class);
                startActivity(telaCadastroMotorista);
            }
        });

    }

    private void IniciarComponente(){
        text_tela_cadastro_user = findViewById(R.id.textCadastroUsuario);
    }
}