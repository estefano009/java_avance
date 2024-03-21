package com.POO;

public class Uso_Coche {
    public static void main(String[] args){
        //Coche Renault = new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
        //System.out.println(Renault.dime_largo());
        //System.out.println("Este coche tiene: "+ Renault.ruedas);

        Coche micoche = new Coche();

        micoche.establece_color();
        System.out.println(micoche.dime_color());



    }

}
