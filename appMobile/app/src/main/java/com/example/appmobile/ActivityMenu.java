package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class ActivityMenu extends AppCompatActivity {

    ImageView display, display2, display3, display4, display5, display6, display7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        display = findViewById(R.id.imageViewInfo);
        display2 = findViewById(R.id.imageViewRegister);
        display3 = findViewById(R.id.imageViewSearch);
        display4 = findViewById(R.id.imageViewContrato);
        display5 = findViewById(R.id.imageViewMap);
        display6 = findViewById(R.id.imageViewProfile);
        display7 = findViewById(R.id.imageViewContact);
        abrirTelaInfo();
        abrirTelaCadastro();
        abrirTelaConsulta();
        abrirTelaContrato();
        abrirTelaMapa();
        abrirTelaPerfil();
        abrirTelaContato();

    }

    public void abrirTelaContato() {
        display7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaContato = new Intent(getApplicationContext(), ActivityTelaContato.class);
                startActivity(telaContato);
            }
        });
    }

    public void abrirTelaPerfil() {
        display6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), ActivityPerfil.class);
                startActivity(telaPerfil);
            }
        });
    }

    public void abrirTelaMapa() {
        display5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMapa = new Intent(getApplicationContext(), ActivityMap.class);
                startActivity(telaMapa);
            }
        });
    }

    public void abrirTelaContrato() {
        display4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaContrato = new Intent(getApplicationContext(), ActivityContrato.class);
                startActivity(telaContrato);
            }
        });
    }


    public void abrirTelaConsulta() {
        display3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaConsulta = new Intent(getApplicationContext(), ActivitySearch.class);
                startActivity(telaConsulta);
            }
        });
    }

     public void abrirTelaCadastro() {
        display2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadastro = new Intent(getApplicationContext(), ActivityCadastro.class);
                startActivity(telaCadastro);
            }
        });
    }

    public void abrirTelaInfo() {
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaInfo = new Intent(getApplicationContext(), Info.class);
                startActivity(telaInfo);
            }
        });
    }

}