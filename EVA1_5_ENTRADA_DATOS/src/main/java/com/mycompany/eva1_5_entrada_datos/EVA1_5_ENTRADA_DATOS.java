/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_5_ENTRADA_DATOS {

    public static void main(String[] args) {
       //daclaramos variables.
       String marca;
       String modelo;
       int year;
       double precio;
       //¿como se captura?
       //SCANNER 
       //herramienta -->clase ; nos proporcionan muchas herramientas.
       //importar el escaner asignar variable y crear la herramienta.
       Scanner captu;
       captu = new Scanner (System.in);//esto es crear la herramienta
       //hay que darle instrucciones al usuario
       System.out.println("introduce la marca del vehiculo:");
       //capturamos --> una asignacion
       marca = captu.nextLine(); //les regresa el texto hasta que le demos enter
       
       System.out.println("introduce el modelo del vehiculo");
       modelo = captu.nextLine();
       System.out.println("introduce el año del vehiculo");
       year = captu.nextInt();//cambia segun el tipo de variable
       System.out.println("introduce el precio del vehiculo");
       precio = captu.nextDouble();
       
       System.out.println("Datos capturados---------------");
       System.out.println(marca);
       System.out.println(modelo);
       System.out.println(year);
       System.out.println(precio);
       
      
       
             
       
    }
}
