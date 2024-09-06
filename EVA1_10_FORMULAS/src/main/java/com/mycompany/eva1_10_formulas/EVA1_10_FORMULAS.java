/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_10_FORMULAS {

    public static void main(String[] args) {
        double VI, T, dist, a;
        Scanner captu= new Scanner (System.in);
        System.out.println("digite la velocidad inicial: ");
        VI=captu.nextDouble();
        System.out.println("digite el tiempo en segundos: ");
        T=captu.nextDouble();
        System.out.println("digite la aceleracion: ");
        a=captu.nextDouble();
       
        
        System.out.println("Los datos fueron: ");
        System.out.println("velocidad inicial:" + VI + "m/s");
        System.out.println("tiempo es:" + T + "S");
        System.out.println("aceleracion fue:" + a + "m/s2");
        dist = VI*T+a*(T*T)/2;
        System.out.println("el resultado es:" + dist + "M");
        
        
        
                
                
    }
}
