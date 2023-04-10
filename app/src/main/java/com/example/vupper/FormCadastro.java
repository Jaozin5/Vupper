package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormCadastro extends AppCompatActivity {

    private TextView text_voltar_motorista;

    Button botao_ConfirmaCadMoto;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);


        IniciarComponentes();

        text_voltar_motorista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent voltarCadastroMotorista = new Intent(FormCadastro.this, TelaLoginMotorista.class);
                startActivity(voltarCadastroMotorista);
            }
        });

        botao_ConfirmaCadMoto = findViewById(R.id.buttonConfirmaCadMoto);

        botao_ConfirmaCadMoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MedidaSeguranca_CPF_Motorista.class);
                startActivity(intent);
            }
        });




    }

    private void IniciarComponentes(){
        text_voltar_motorista = findViewById(R.id.textVoltarCadastro);
    }
}