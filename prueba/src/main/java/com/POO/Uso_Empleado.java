package com.POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

    public static void main(String[] args){
        /*
        Empleado empleado1 = new Empleado("Yared",6000,2024,03,20);

        Empleado empleado2 = new Empleado("David",7000,2024,03,20);

        Empleado empleado3 = new Empleado("Pablo",1200,2024,03,20);

        empleado1.subeSueldo(10);
        empleado2.subeSueldo(15);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: " + empleado1.dame_nombre() + " Su sueldo es : " + empleado1.dame_sueldo() + " Año de Alta de Contrato: "+ empleado1.dame_fechaContrato());
        System.out.println("Nombre: " + empleado2.dame_nombre() + " Su sueldo es : " + empleado2.dame_sueldo() + " Año de Alta de Contrato: "+ empleado2.dame_fechaContrato());
        System.out.println("Nombre: " + empleado3.dame_nombre() + " Su sueldo es : " + empleado3.dame_sueldo() + " Año de Alta de Contrato: "+ empleado3.dame_fechaContrato()); */

        Empleado[] misEmpleados = new Empleado[3];
        misEmpleados[0]=new Empleado("Yared",6000,2024,03,20);
        misEmpleados[1]=new Empleado("David",7000,2024,03,20);
        misEmpleados[2]=new Empleado("Pablo",1200,2024,03,20);

        //BUCLE FOR PARA SUBIR EL SUELDO A LOS 3 DATOS DEL ARRAY
        /*for(int i=0;i<3;i++){
            misEmpleados[i].subeSueldo(10);
        }


        //BUCLE FOR PARA LISTAR  A LOS 3 DATOS DEL ARRAY
           for(int i=0;i<3;i++){
            System.out.println("Nombre: " + misEmpleados[i].dame_nombre() +
                               "Sueldo : " + misEmpleados[i].dame_sueldo() +
                               "Fecha de Alta : " + misEmpleados[i].dame_fechaContrato());
        }*/



        //BUCLE FOR MEJORADO PARA SUBIR EL SUELDO A LOS 3 DATOS DEL ARRAY
        for(Empleado e: misEmpleados){
            e.subeSueldo(10);
        }
        //BUCLE FOR MEJORADO PARA LISTAR A LOS 3 DATOS DEL ARRAY
        for(Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.dame_nombre() +
                    " Sueldo : " + e.dame_sueldo() +
                    " Fecha de Alta : " + e.dame_fechaContrato());
        }


    }
}


class Empleado{

    public Empleado(String nom, double sue , int anio ,int mes , int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
        altaContrato = calendario.getTime();

    }

    public String dame_nombre(){//GETTER
        return nombre;
    }

    public double dame_sueldo(){//GETTER
        return sueldo;
    }

    public Date dame_fechaContrato(){//GETTER
        return altaContrato;
    }

    public void subeSueldo(double porcentaje){//SETTER

        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;

}
