package com.POO;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;

    String color;
    int peso_total;
    boolean asientos_cuero,climatizador;

    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }
    //ESTE ES UN METODO GETTER SIRVER CON SU INSTRUCCION RETURN , PARA QUE NOS PROPORCIONE LA INFORMACION DESEADA
    //EL METODO GETTER SIEMPRE DEVUELVE UN VALOR
    public String dime_largo() {
        return "El largo del coche es :" + largo;
    }

    //ESTE ES UN METODO SETTER SIRVE PARA MODIFICAR EL VALOR DE UNA PROPIEDAD
    public void establece_color(){
        color = "azul";
    }

    public String dime_color(){
        return "El color del coche es: " + color;
    }

}



