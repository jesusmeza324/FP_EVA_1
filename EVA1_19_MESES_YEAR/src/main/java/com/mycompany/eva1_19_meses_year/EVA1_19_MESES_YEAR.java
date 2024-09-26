/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_meses_year;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_19_MESES_YEAR {

    public static void main(String[] args) {
        int mes;
        Scanner cap=new Scanner(System.in);
        System.out.println("numero correspondiente al mes(1-12)");
        mes = cap.nextInt();
        
        if (mes==1){
            System.out.println("enero");
            }
        else if (mes==2){
             System.out.println("febrero");
        }
        else if (mes==3){
             System.out.println("marzo");
        }
        else if (mes==4){
             System.out.println("abril");
        }
        else if (mes==5){
             System.out.println("mayo");
        }
        else if (mes==6){
             System.out.println("junio");
        }
        else if (mes==7){
             System.out.println("julio");
        }
        else if (mes==8){
             System.out.println("agosto");
        }
        else if (mes==9){
             System.out.println("septiembre");
        }
        else if (mes==10){
             System.out.println("octubre");
        }
        else if (mes==11){
             System.out.println("noviembre");
        }
        else if (mes==12){
             System.out.println("diciembre");
        }
        else{
            System.out.println("mes no valido");
        }
    }
}
