/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_pantalla_de_inicio;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_15_PANTALLA_DE_INICIO {

    public static void main(String[] args) {
        //constantes
        final String USUARIO="Admin";
        final String CONTRASEÑA="Admin";
        //final double Pi=3.1416;
        
        String usuario, contraseña;
       
       
        Scanner cap= new Scanner(System.in);
        System.out.println("Inserte el usuario");
        usuario = cap.nextLine();
        System.out.println("digite sus contraseña");
        contraseña = cap.nextLine();
        //como validamos el acceso
        if (usuario.equals(USUARIO) && contraseña.equals(CONTRASEÑA)){
        System.out.println("Acceso concedido");
        
    } else {
            System.out.println("acceso denegado");
       
        }
        
    }
}
