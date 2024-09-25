/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_rangos;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_17_RANGOS {

    public static void main(String[] args) {
        int califas;
        Scanner cap=new Scanner(System.in);
        System.out.println("digite la calificacion");
        califas=cap.nextInt();
        if (califas<0 || califas >100){
            System.out.println("califacion invalida");
        }else{
            System.out.println("calificacion valida");
        }
      
                
    }
}
