/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_23_bisiesto;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_23_BISIESTO {

    public static void main(String[] args) {
       
        //saber si es multiplo 4
        // verificar residuo es cero---> division exacta
        //modulo--->calculo del residuo---> %
        // no divisible entre 100
        int anio;
        Scanner cap=new Scanner(System.in);
        System.out.println("digite el anio");
        anio =cap.nextInt();
        if (anio%4==0 && anio%100!=0 || anio%400==0 ) {
            System.out.println("Anio bisiesto");
        }else{
            System.out.println("no es anio bisiesto");
        }
        
        
    }
}
