/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TestaValor {
    public static void main(String[] args){
        boolean correto = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nInsira um valor float");
        int cont = 0;
        
        
        while(!correto){
            String valor = sc.nextLine();
            try {
                Float f = new Float(valor);
                correto = true;
            } catch (NumberFormatException nfe) {
                if(cont > 1){
                    System.out.println("excedeu o limite de tentativas");
                    break;
                }else{
                    cont++;
                    System.out.println("Valor invalido");
                    System.out.println("Insira outro valor");
                }
                
                
            }
        }
    }
}
