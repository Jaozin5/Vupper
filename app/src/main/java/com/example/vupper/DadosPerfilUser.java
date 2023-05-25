package com.example.vupper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class DadosPerfilUser extends AppCompatActivity {

    public ImageView imageViewFotoPerfilUser;

    public Button botaoImportarImagemUser;

    Button botaoContinue;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_perfil_user);

        imageViewFotoPerfilUser = findViewById(R.id.imageViewImagePerfilUser);
        botaoImportarImagemUser = findViewById(R.id.buttonImportarImagemUser);

        botaoImportarImagemUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                escolherFotoPerfilUser();
            }
        });

        botaoContinue = findViewById(R.id.buttonContinuar);
        botaoContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent continuarUser = new Intent(getApplicationContext(), DadosUsuario.class);
                continuarUser.putExtra("FotoMoto", String.valueOf(imageViewFotoPerfilUser));
                startActivity(continuarUser);
            }
        });

    }

    private void escolherFotoPerfilUser(){
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == 1000){
            imageViewFotoPerfilUser.setImageURI(data.getData());
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode){
            case 1001:{
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    escolherFotoPerfilUser();
                } else{
                    Toast.makeText(this, "Permissão Negada!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }


}