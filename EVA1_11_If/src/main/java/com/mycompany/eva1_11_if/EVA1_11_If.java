/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_11_If {

    public static void main(String[] args) {
        //condicional 
        // logica booleana----> operaciones verdadero y falso
        //solicitar la edad
        int edad;
        Scanner captu= new Scanner(System.in);
        System.out.println("cual es su edad?");
        edad=captu.nextInt();
        //determinar si la persona es adulto o no
        //mayor o igual a 18 años operador logico 
        // >  mayor que
        // > menor que
        // == igual que
        // != diferente que 
        //< menor igual que
       //> mayor igual que
       // ! negacion (not)
       // && y (and)
       //|| o (or)
       //sin son varias instrucciones agruparlas con llaves
       if(edad >= 18){ 
       System.out.println("es adulto");
       
       }//bloque para verdadero y uno para falso
       else {//bloque falso
           System.out.println("menor de edad");
       
       }
           
           
       
        
        
        
        
        
    }
}
