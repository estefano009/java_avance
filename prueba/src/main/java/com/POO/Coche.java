package com.POO;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    protected int peso_plataforma;

    private String color;
    private int peso_total;
    private boolean asientos_cuero,climatizador;

    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }
    //ESTE ES UN METODO GETTER SIRVER CON SU INSTRUCCION RETURN , PARA QUE NOS PROPORCIONE LA INFORMACION DESEADA
    //EL METODO GETTER SIEMPRE DEVUELVE UN VALOR
    public String dime_datos_generales() {
        return "La plataforma del vehiculo tiene:" + ruedas + "ruedas" +
                ". Mide" + largo/1000 + "Metros con un ancho de " + ancho +
                " cm y un peso de plataforma de " + peso_plataforma + " KG";
    }

    //ESTE ES UN METODO SETTER SIRVE PARA MODIFICAR EL VALOR DE UNA PROPIEDAD
    public void establece_color(String color_coche){
        //color = "azul";
        color=color_coche;
    }

    public String dime_color(){
        return "El color del coche es: " + color;
    }


    public void configura_asientos(String asientos_cuero){ //UN SETTER TIPO BOOLEAN
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero=true;
        }else {
            this.asientos_cuero=false;
        }
    }


    public String dime_asientos(){ //UN GETTER PARA RETORNOR QUE TIPO DE ASIENTO TIENE
        if(asientos_cuero==true){
            return "El coche tiene asiento de cuero";
        }else {
            return "El coche tiene asientos de serie";
        }
    }

    public void configura_climatizador(String climatizador){ //SETTER CAMBIAR EL VALOR DE LAS PROPIEDADES
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else {
            this.climatizador=false;
        }
    }
    public String dime_climatizador(){ //GETTER PARA OBTENER EL VALOR DE LAS PROPIEDADES
        if (climatizador==true){
            return "El coche incorpora climatizador";
        }else {
            return "El coche lleva aire acondicionado";
        }
    }

    public String dime_peso_coche(int peso_carroceria){ //METODO GETTER + SETTER
        //int peso_carroceria=500;

        peso_total = peso_plataforma+peso_carroceria;

        if(asientos_cuero==true){
            peso_total = peso_total+50;
        }if(climatizador==true) {
            peso_total = peso_total+20;
        }
        return "EL peso del coche es " + peso_total;
    }

    public int dime_precio_coche(){
        int precio_final=10000;
        if(asientos_cuero==true){
            precio_final+=2000;
        }if (climatizador==true){
            precio_final+=1500;
        }

        return precio_final;
    }




    //UN SETTER PARA REALIZAR LA MODIFICACION DEL PESO PLATAFORMA
    public void modificar_peso_plataforma(int cambiar_peso_plataforma){
         peso_plataforma = cambiar_peso_plataforma;
    }

}



