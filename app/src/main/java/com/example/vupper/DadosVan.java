package com.example.vupper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class DadosVan extends AppCompatActivity {

    ImageView[] fotos = new ImageView[4];
    public ImageView fotoVan1, fotoVan2, fotoVan3, fotoVan4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_van);


        fotos[0] = findViewById(R.id.imageViewFotoVan1);
        fotos[1] = findViewById(R.id.imageViewFotoVan2);
        fotos[2] = findViewById(R.id.imageViewFotoVan3);
        fotos[3] = findViewById(R.id.imageViewFotoVan4);


        fotos[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                escolherFotoVan();

            }
        });

        fotos[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                escolherFotoVan();

            }
        });

        fotos[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                escolherFotoVan();

            }
        });

        fotos[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                escolherFotoVan();

            }
        });

    }

    private void escolherFotoVan(){
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 1000);
    }





    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == 1000){
            int c = 0;
            if (c == 0){
                fotos[c].setImageURI(data.getData());
            }

            fotos[c].setImageURI(data.getData());
            c++;

        }
    }



    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode){
            case 1001:{
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    escolherFotoVan();
                } else{
                    Toast.makeText(this, "Permissão Negada!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}