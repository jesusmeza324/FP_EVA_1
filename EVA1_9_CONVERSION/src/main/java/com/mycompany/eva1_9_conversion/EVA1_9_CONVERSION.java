/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_conversion;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_9_CONVERSION {

    public static void main(String[] args) {
        double fr, cent, kl;
        Scanner captu = new Scanner(System.in);
        System.out.println("F a C");
        System.out.println("de la temperatura en farenheit: ");
        fr = captu.nextDouble();
        cent= (fr-32)/1.8;
        System.out.println("grados centigrados= " + cent + " C");
        
         System.out.println("C a F");
        
        System.out.println("de la temperatura en centigrados:");
        cent = captu.nextDouble();
        fr = cent*1.8+32;
        System.out.println("grados farenheit=" + fr + " F");
        
        System.out.println("C a K");
        
        System.out.println("de la temperatura en centigrados");
        cent = captu.nextDouble();
        kl = cent+273.15;
        System.out.println("la temperatura en kelvin=" + kl + "K");
        
        
        
        
        
        
    }
}
