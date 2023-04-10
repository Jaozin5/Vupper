package com.example.vupper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class DadosPerfilMotorista extends AppCompatActivity {

    public ImageView imageViewFotoPerfil;
    public Button botaoCarregarImagem;

    Button botaoContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_perfil_moto);

        imageViewFotoPerfil = findViewById(R.id.imageViewFotoPerfilMoto);
        botaoCarregarImagem = findViewById(R.id.buttonImportarImagem);

        botaoCarregarImagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                escolherFotoPerfilMoto();

            }
        });

        botaoContinuar = findViewById(R.id.buttonContinue);

        botaoContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), DadosVan.class);
                startActivity(intent);
            }
        });
    }

    private void escolherFotoPerfilMoto(){

        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 1000);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == 1000){
            imageViewFotoPerfil.setImageURI(data.getData());
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode){
            case 1001:{
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    escolherFotoPerfilMoto();
                } else{
                    Toast.makeText(this, "Permissão Negada!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}