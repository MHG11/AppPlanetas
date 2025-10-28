package com.example.appplanetas;

public class ModelCalculo {

    private double pesoCalculado;
    private static final double FATOR_MERCURIO = 0.38;
    private static final double FATOR_VENUS = 0.90;
    private static final double FATOR_TERRA = 1.0;
    private static final double FATOR_MARTE = 0.38;
    private static final double FATOR_JUPITER = 2.53;
    private static final double FATOR_SATURNO = 1.06;
    private static final double FATOR_URANO = 0.90;
    private static final double FATOR_NETUNO = 1.14;

    public double getPesoCalculado() {
        return pesoCalculado;
    }

    public void calcularPesoPlaneta(double peso, String nomePlaneta) {
        double fator = 1.0; // Fator padrão (Terra)
        switch (nomePlaneta) {
            case "Mercúrio":
                fator = FATOR_MERCURIO;
                break;
            case "Vênus":
                fator = FATOR_VENUS;
                break;
            case "Terra":
                fator = FATOR_TERRA;
                break;
            case "Marte":
                fator = FATOR_MARTE;
                break;
            case "Júpiter":
                fator = FATOR_JUPITER;
                break;
            case "Saturno":
                fator = FATOR_SATURNO;
                break;
            case "Urano":
                fator = FATOR_URANO;
                break;
            case "Netuno":
                fator = FATOR_NETUNO;
                break;
        }
        this.pesoCalculado = peso * fator;
    }
}
