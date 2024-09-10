/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
        int califas;
       Scanner captu=new Scanner(System.in);
       System.out.println("digite su calificacion");
      califas=captu.nextInt();
      if (califas>=70){
          System.out.println("aprobado");
      }
      else {
          System.out.println("no aprobo");
      }
    }
}
