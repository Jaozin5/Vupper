package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

public class MedidaSeguranca_CPF_Motorista extends AppCompatActivity {


    Button botaoProxTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medida_seguranca_cpf_motorista);

        botaoProxTela = findViewById(R.id.buttonProx);

        botaoProxTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proxTela = new Intent(getApplicationContext(), DadosPerfilMotorista.class);
                startActivity(proxTela);
            }
        });




    }

}