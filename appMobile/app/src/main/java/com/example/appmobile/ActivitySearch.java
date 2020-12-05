package com.example.appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivitySearch extends AppCompatActivity {

    ImageView show, show2, show3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        show = findViewById(R.id.imageViewSearchPartner);
        show2 = findViewById(R.id.imageViewSearchContract);
        show3 = findViewById(R.id.imageViewSearchClient);
        abrirTelaSocio();
        abrirTelaContrato();
        abrirTelaCliente();

    }

    private void abrirTelaCliente() {
        show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCliente = new Intent(getApplicationContext(), ActivityConsultaCliente.class);
                startActivity(telaCliente);
            }
        });
    }

    private void abrirTelaContrato() {
        show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaContrato = new Intent(getApplicationContext(), ActivityConsultaContrato.class);
                startActivity(telaContrato);
            }
        });
    }

    private void abrirTelaSocio() {
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaSocio = new Intent(getApplicationContext(), ActivityConsultaSocio.class);
                startActivity(telaSocio);
            }
        });
    }
}