/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_6_PELICULA {

    public static void main(String[] args) {
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        
        Scanner captu;
        captu = new Scanner (System.in);
        
        System.out.println("nombre de la pelicula:");
        nombre = captu.nextLine();
        System.out.println("genero:");
        genero = captu.nextLine();
        System.out.println("duracion:");
        duracion = captu.nextInt();
        System.out.println("reparto:");
        reparto = captu.nextLine();
        System.out.println("clasificacion:");
        clasificacion = captu.nextLine();
        
        
        
        
       
         
    }
}
