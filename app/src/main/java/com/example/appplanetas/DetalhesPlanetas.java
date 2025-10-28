package com.example.appplanetas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalhesPlanetas extends AppCompatActivity {

    private TextView nomePlanetaView;
    private TextView descricaoPlanetaView;
    private ImageView imageViewPlaneta;
    private EditText pesoText;
    private Button buttonCalcular;
    private TextView resultado;
    private ModelCalculo model;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_planetas);

        imageViewPlaneta = findViewById(R.id.imagemPlaneta);
        nomePlanetaView = findViewById(R.id.nomePlaneta);
        descricaoPlanetaView = findViewById(R.id.descricaoPlaneta);
        pesoText = findViewById(R.id.peso);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        resultado = findViewById(R.id.resultado);
        model = new ModelCalculo();
        progressBar = findViewById(R.id.progressBar);

        Intent intent = getIntent();
        String nomePlaneta = intent.getStringExtra("nomePlaneta");
        String descricaoPlaneta = intent.getStringExtra("descricaoPlaneta");
        String imagemPlaneta = intent.getStringExtra("imagemPlaneta");

        nomePlanetaView.setText(nomePlaneta);
        descricaoPlanetaView.setText(descricaoPlaneta);

        int idImagemPlaneta = getResources().getIdentifier(imagemPlaneta, "drawable", getPackageName());
        imageViewPlaneta.setImageResource(idImagemPlaneta);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesoString = pesoText.getText().toString();
                String nomePlaneta2 = nomePlanetaView.getText().toString();

                if (!pesoString.isEmpty()) {
                    progressBar.setVisibility(View.VISIBLE);
                    resultado.setVisibility(View.GONE);
                    double peso = Double.parseDouble(pesoString);

                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            model.calcularPesoPlaneta(peso, nomePlaneta2);
                            alterarPeso();
                            progressBar.setVisibility(View.GONE);
                            resultado.setVisibility(View.VISIBLE);

                        }
                    }, 2000);
                }
            }
        });
    }

    private void alterarPeso() {
        resultado.setText(String.format("Em %s, seu peso seria de %.2f kg.", nomePlanetaView.getText().toString(), model.getPesoCalculado()));
    }
}
