package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaLoginUser extends AppCompatActivity {
    Button botaoVoltarTelaInicial;

    private TextView textClickCadUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login_user);


        IniciarComponentes();

        botaoVoltarTelaInicial = findViewById(R.id.buttonVoltaInicial);
        botaoVoltarTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telaLogin = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(telaLogin);
            }
        });

        textClickCadUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadastro = new Intent(TelaLoginUser.this, FormCadastroUser.class);
                startActivity(telaCadastro);
            }
        });
    }

    private void IniciarComponentes(){
        textClickCadUser = findViewById(R.id.textCadastroUser);
    }
}