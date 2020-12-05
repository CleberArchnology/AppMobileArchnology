package com.example.appmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityCadastro extends AppCompatActivity {

    ImageView showCadastro, showCadastro2, showCadastro3;
    TextView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        showCadastro.findViewById(R.id.imageViewPartner);
        showCadastro2.findViewById(R.id.imageViewContract);
        showCadastro3.findViewById(R.id.imageViewClient);
        voltar = findViewById(R.id.textViewBackToMenuCadastro);
        abrirTelaCadastroSocio();
        abrirTelaCadastroContrato();
        abrirTelaCadastroCliente();
        voltarTelaMenu();

    }

    private void abrirTelaCadastroCliente() {
        showCadastro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCliente = new Intent(getApplicationContext(), ActivityCadastroCliente.class);
                startActivity(telaCliente);
            }
        });
    }

    private void abrirTelaCadastroContrato() {
        showCadastro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaContrato = new Intent(getApplicationContext(), ActivityCadastroContrato.class);
                startActivity(telaContrato);
            }
        });
    }

    private void abrirTelaCadastroSocio() {
        showCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaSocio = new Intent(getApplicationContext(), ActivityCadastroSocio.class);
                startActivity(telaSocio);
            }
        });
    }

    private void voltarTelaMenu() {
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(getApplicationContext(), ActivityMenu.class);
                startActivity(telaMenu);
            }
        });
    }
}


