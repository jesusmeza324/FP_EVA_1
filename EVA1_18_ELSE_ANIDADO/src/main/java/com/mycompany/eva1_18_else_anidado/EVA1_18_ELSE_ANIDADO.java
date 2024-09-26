/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_else_anidado;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_18_ELSE_ANIDADO {

    public static void main(String[] args) {
        int dia;
        Scanner cap=new Scanner(System.in);
        System.out.println("numero correspondiente al dia(1-7)");
        dia = cap.nextInt();
        
        if (dia==1){
            System.out.println("lunes");
            }
        else if (dia==2){
             System.out.println("martes");
        }
        else if (dia==3){
             System.out.println("miercoles");
        }
        else if (dia==4){
             System.out.println("jueves");
        }
        else if (dia==5){
             System.out.println("viernes");
        }
        else if (dia==6){
             System.out.println("sabado");
        }
        else if (dia==7){
             System.out.println("domingo");
        }else{
            System.out.println("dia no valido");
        }
    }
}
