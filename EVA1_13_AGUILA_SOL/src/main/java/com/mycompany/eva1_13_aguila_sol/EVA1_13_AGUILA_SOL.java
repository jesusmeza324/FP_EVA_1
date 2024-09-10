/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_aguila_sol;

/**
 *
 * @author jesus
 */
public class EVA1_13_AGUILA_SOL {

    public static void main(String[] args) {
        //ALEATORIO herramienta que genera numeros aleatorios
        double valor= Math.random();
        //random genera valores >= 0 y < a 1
        if (valor<0.5){
            System.out.println("aguila");
        }
        else{
            System.out.println("sol");
        }
    }
}
