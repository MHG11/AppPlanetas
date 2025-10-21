package com.example.appplanetas;

public class ModelCalculo {

    private double pesoCalculado;
    private static final double PESO_MERCURIO = 0.38;
    private static final double PESO_VENUS = 0.90;
    private static final double PESO_TERRA = 1.0;
    private static final double PESO_MARTE = 0.38;
    private static final double PESO_JUPITER = 2.53;
    private static final double PESO_SATURNO = 1.06;
    private static final double PESO_URANO = 0.90;
    private static final double PESO_NETUNO = 1.14;

    public double getPesoCalculado(){
        return pesoCalculado;
    }

    public void setPesoCalculado(double pesoCalculado){
        this.pesoCalculado = pesoCalculado;
    }

    public void calcularPesoMercurio(double peso){
        pesoCalculado = peso * PESO_MERCURIO;
    }

    public void calcularPesoVenus(double peso){
        pesoCalculado = peso * PESO_VENUS;
    }
    public void calcularPesoTerra(double peso){
        pesoCalculado = peso * PESO_TERRA;
    }
    public void calcularPesoMarte(double peso){
        pesoCalculado = peso * PESO_MARTE;
    }
    public void calcularPesoJupiter(double peso){
        pesoCalculado = peso * PESO_JUPITER;
    }
    public void calcularPesoSaturno(double peso){
        pesoCalculado = peso * PESO_SATURNO;
    }
    public void calcularPesoUrano(double peso){
        pesoCalculado = peso * PESO_URANO;
    }
    public void calcularPesoNetuno(double peso){
        pesoCalculado = peso * PESO_NETUNO;
    }


}
