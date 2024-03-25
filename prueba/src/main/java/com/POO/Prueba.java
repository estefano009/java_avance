package com.POO;

public class Prueba {

    public static void main(String[] args){

        Empleados trabajador1 = new Empleados("Pepe");
        Empleados trabajador2 = new Empleados("Tuto");
        Empleados trabajador3 = new Empleados("Antonio");


        trabajador1.cambiaSeccion("RRHH"); //ESTADO INICIAL CAMBIA AL UTILIZAR EL SETTER
        trabajador1.cambiaNombre("ESTEFANO");

        System.out.println(trabajador1.devuelveDatos());
        //Empleados.Id++;
        System.out.println(trabajador2.devuelveDatos());
        //Empleados.Id++;
        System.out.println(trabajador3.devuelveDatos());


    }

}

class Empleados{

    public Empleados(String nom){
        nombre = nom;
        seccion="Administracion";
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public void cambiaSeccion(String seccion){ //METODO SETTER
        this.seccion = seccion;
    }
    public void cambiaNombre(String nombre){ //METODO SETTER
        //ESTE METODO ES PARA PROBAR EL FINAL NO SE PUEDE USAR O MODIFICAR EL DATO INICIAL
        //this.nombre = nombre;
    }

    public String devuelveDatos(){ //METODO GETTER
        return "El nombre es : " + nombre + " y la seccion es : " + seccion + " y el ID = "+Id;
    }

    //LA CLASE FINAL EN NOMBRE ES POR QUE NO SE PUEDE USAR MAS De 1 VEZ OSEA NOMBRE ES NOMB YA NO SE PUEDE MODIFICAR.
    private final String nombre;
    private String seccion;
    private int Id;
    //EL USO DEL STATIC ES PARA COMPARTIR ENTRE 2 OBJETOS O MAS UNA VARIABLE EJEMPLO EL ID DE LA CLASE PERSONA SE COMPARTE ENTRE AMBOS OBJETOS 1 y 2(TRABAJADOR1 Y TRABAJADOR2)
    private static int IdSiguiente=1;
}

