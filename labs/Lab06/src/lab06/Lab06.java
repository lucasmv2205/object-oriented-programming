/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Conta> ListaContas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int total = 0;
        
        System.out.println("Quantas contas deseja cadastrar: ");
        total = sc.nextInt();
        sc.nextLine();
        
        System.out.println("CADASTRO DE CONTAS: ");
        while(cont < total){
            try {
                System.out.println("\n\nNome: ");
                String nome_conta = sc.next();
                
                System.out.println("Numero da conta: ");
                int numero_conta = sc.nextInt();

                System.out.println("Saldo: ");
                double saldo_conta = sc.nextDouble();

                Conta c = new Conta(nome_conta, saldo_conta, numero_conta);
                ListaContas.add(c);
                cont++;
                System.out.println("contador: "+ cont);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
            catch (SaldoException e) {
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println("FORMATO INVALIDO!");
            }
        }
        
        try {
            ListaContas.get(0).depositar(-10);
            System.out.println(ListaContas.get(0).getSaldo());
        } catch (SaldoException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            ListaContas.get(0).sacar(600);
            System.out.println(ListaContas.get(0).getSaldo());
        }catch (SaldoException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
