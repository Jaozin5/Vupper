package com.example.vupper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormCadastroUser extends AppCompatActivity {

    private TextView textViewVoltarCadUser;

    Button botaoConfirmaCadUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro_user);


        textViewVoltarCadUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent voltaCadUser = new Intent(FormCadastroUser.this , TelaLoginUser.class);
                startActivity(voltaCadUser);
            }
        });

        botaoConfirmaCadUser = findViewById(R.id.buttonConfirmaCadUser);

        botaoConfirmaCadUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent confirmaCadUser = new Intent(getApplicationContext(), Medida_seguranca_cpf_user.class);
                startActivity(confirmaCadUser);

            }
        });

    }
}