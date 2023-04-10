package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button botaoTelaMotorista, botaoTelaUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoTelaMotorista = findViewById(R.id.buttonMotorista);
        botaoTelaUsuario = findViewById(R.id.buttonUsuario);

        botaoTelaMotorista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telaMotorista = new Intent(getApplicationContext(), TelaLoginMotorista.class);
                startActivity(telaMotorista);

            }
        });

        botaoTelaUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telaUsuario = new Intent(getApplicationContext(), TelaLoginUser.class);
                startActivity(telaUsuario);
            }
        });

    }
}