/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Soma2Numeros {
       public static void main(String a[]){
           
        System.out.println("Insira 2 numeros: ");        
        
        Scanner num = new Scanner(System.in);
        Double x = num.nextDouble();
        Double y = num.nextDouble();
        
        Double soma = x + y;
        System.out.println("Soma: " + soma);
        
    }
}
