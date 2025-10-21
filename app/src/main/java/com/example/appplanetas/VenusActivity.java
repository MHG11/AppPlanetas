package com.example.appplanetas;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class VenusActivity extends AppCompatActivity {
    private EditText pesoText;
    private Button buttonCalcular;
    private TextView resultado;
    private ModelCalculo model;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_venus);
        pesoText = findViewById(R.id.peso);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        resultado = findViewById(R.id.resultado);
        progressBar = findViewById(R.id.progressBarVenus);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesoString = pesoText.getText().toString();

                if (pesoString.isEmpty()) {
                    Toast.makeText(VenusActivity.this, "Por favor, digite um valor.", Toast.LENGTH_SHORT).show();
                }

                double peso = Double.parseDouble(pesoString);
                progressBar.setVisibility(View.VISIBLE);
                resultado.setVisibility(View.GONE);

                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        model.calcularPesoMercurio(peso);
                        alterarPeso();

                        progressBar.setVisibility(View.GONE);
                        resultado.setVisibility(View.VISIBLE);
                    }
                }, 2000);

            }
        });
    }
    private void alterarPeso() {
        resultado.setText(String.format("Em Venus, seria %.2f kg.", model.getPesoCalculado()));
    }
}