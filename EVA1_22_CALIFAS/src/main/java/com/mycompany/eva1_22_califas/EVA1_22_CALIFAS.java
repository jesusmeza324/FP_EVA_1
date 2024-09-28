/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_22_CALIFAS {

    public static void main(String[] args) {
        int califas;
        Scanner cap=new Scanner(System.in);
        System.out.println("digite la calificacion");
        califas=cap.nextInt();
        if (califas>=90 && califas<=100){
            System.out.println("A");
        }else if (califas>=80 && califas<=89){
            System.out.println("B");
        }
        else if (califas>=70 && califas<=79){
            System.out.println("C");
        }
        else if (califas>=60 && califas<=69){
            System.out.println("D");
        }
        else if (califas<60 && califas>=0){
            System.out.println("F");
        }else {
            System.out.println("calificacion no valida");
        }
                
    }
}
