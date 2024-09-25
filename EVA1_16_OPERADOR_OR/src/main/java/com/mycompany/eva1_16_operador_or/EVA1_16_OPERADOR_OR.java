/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_16_OPERADOR_OR {

    public static void main(String[] args) {
        int km, meses;
        
        Scanner cap=new Scanner(System.in);
        System.out.println("cuantos kilometros tiene su carro?");
        km=cap.nextInt();
        cap.nextLine();
        System.out.println("numero de meses");
        meses=cap.nextInt();
        cap.nextLine();
       
        
        if(km>=5000 || meses>=6){
            System.out.println("ocupa cambio de aceite");
        }
        else{
            System.out.println("no ocupa cambio de aceite");
        }
         
        
    }
}
