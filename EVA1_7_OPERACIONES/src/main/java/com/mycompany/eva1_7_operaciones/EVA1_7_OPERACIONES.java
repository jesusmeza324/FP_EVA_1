/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_operaciones;

/**
 *
 * @author jesus
 */
public class EVA1_7_OPERACIONES {

    public static void main(String[] args) {
       //OPERACIONES ARITMETICAS
       int x = 10;
       int y = 5;
       //declaracion de variables del mismo tipo
       int suma, resta, divi, multi;
       //suma y resta
       suma = x + y;
       System.out.println("suma de x + y:");
       System.out.println(suma);
       resta = x - y;
       System.out.println("resta de x - y:");
       System.out.println(resta);
       multi = x * y;
       System.out.println("multiplicacion de x * y:");
       System.out.println(multi);
       //division ---> el manejo de tipos de datos
       //si divides entre enteros java da entero
       divi = x / y;
       System.out.println("division de x / y:");
       System.out.println(divi);
       //cambiamos los valores de x y
       x = 5;
       y = 2;
       divi = x / y;
       System.out.println("division x(5) / y(2)");
       System.out.println(divi);
       double val1 = 11;
       double val2 = 3;
       double diviD;
       diviD = val1 / val2;
       System.out.println("division entre # decimales");
       System.out.println(diviD);
    }
}
