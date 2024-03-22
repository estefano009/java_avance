package com.POO;
import javax.swing.*;
public class Uso_Coche {
    public static void main(String[] args){
        //Coche Renault = new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
        //System.out.println(Renault.dime_largo());
        //System.out.println("Este coche tiene: "+ Renault.ruedas);

        Coche micoche = new Coche();

        micoche.establece_color(JOptionPane.showInputDialog("Introduce color: "));

        System.out.println(micoche.dime_datos_generales());

        //micoche.establece_color();
        System.out.println(micoche.dime_color());

        micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero? : "));
        System.out.println(micoche.dime_asientos());

        micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador? : "));
        System.out.println(micoche.dime_climatizador());

        System.out.println(micoche.dime_peso_coche(1000));

        System.out.println("EL PRECIO FINAL DEL COCHE ES : " + micoche.dime_precio_coche());






        //System.out.println(micoche.modificar_peso_plataforma(10000));
        micoche.modificar_peso_plataforma(100);
        int hola = micoche.peso_plataforma;
        System.out.println(hola);
    }

}
