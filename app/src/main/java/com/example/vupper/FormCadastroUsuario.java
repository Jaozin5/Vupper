package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormCadastroUsuario extends AppCompatActivity {

    private TextView textViewVoltarLoginUser;

    Button botaoConfirmarCadUser;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro_usuario);

        IniciarComponentes();

        textViewVoltarLoginUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarLoginUser = new Intent(FormCadastroUsuario.this, TelaLoginUser.class);
                startActivity(voltarLoginUser);
            }
        });

        botaoConfirmarCadUser = findViewById(R.id.buttonConfirmaCadUser);
        botaoConfirmarCadUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent confirmaCadUser = new Intent(getApplicationContext(), Medida_seguranca_cpf_user.class);
                startActivity(confirmaCadUser);
            }
        });


    }

    private void IniciarComponentes(){
        textViewVoltarLoginUser = findViewById(R.id.textViewVoltarLogUser);
    }


}