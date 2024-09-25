/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_tipo_haciendas;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_14_TIPO_HACIENDAS {

    public static void main(String[] args) {
        char tipo;
        Scanner captu=new Scanner(System.in);
        System.out.println("capture el tipo de persona F;fisica - M;moral");
        tipo = captu.nextLine().charAt(0);// se lee por la pocision del caracter en la cadena de texto
        System.out.println("el caracter es:" + tipo);
        if (tipo == 'F')
        {
           System.out.println("persona fisica");
        }
        else
            System.out.println("persona moral");
    }
}
