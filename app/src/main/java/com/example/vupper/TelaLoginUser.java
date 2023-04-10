package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaLoginUser extends AppCompatActivity {

    Button botaoVoltaTelaInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login_user);


        botaoVoltaTelaInicial = findViewById(R.id.buttonVoltarInicial);
        botaoVoltaTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telaLogin = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(telaLogin);
            }
        });

    }
}