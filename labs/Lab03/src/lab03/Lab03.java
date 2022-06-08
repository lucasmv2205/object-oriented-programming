/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op = -1;
        System.out.print("Insira o preco da passagem: ");
        int preco = sc.nextInt();
        MaquinaPassagem m1 = new MaquinaPassagem(preco);
        
        while (op != 2){
            System.out.println("=== MENU ===");
            System.out.println("1- Comprar passagem");
            System.out.println("2- Sair");
            op = sc.nextInt();
            sc.nextLine();
            int dinheiroInserido = 0;
            int statusCompra = 0;
            int statusInsercao = 0;
            
            switch(op){
                case 1:
                    System.out.print("Insira "+ m1.getPreco()+ " reais para comprar a passagem ");
                    while(statusCompra !=1 ){
                        int valorCorrente = 0;
                        valorCorrente = sc.nextInt();
                        statusInsercao = m1.insereDinheiro(valorCorrente);
                        if(statusInsercao == 0){
                            System.out.println("\nInsira notas de 1 ou 2 reais: ");
                            valorCorrente = sc.nextInt();
                            statusInsercao = m1.insereDinheiro(valorCorrente);

                        }
                        if(statusInsercao == 1){
                            dinheiroInserido += valorCorrente;
                            statusCompra = m1.emitePassagem();
                            int diferenca = m1.getPreco() - dinheiroInserido;
                            if(diferenca > 0){
                                System.out.println("Faltam "+ diferenca+" reais para realizar a compra");
                            }
                        }
                    }
                    if(statusCompra == 1){
                        System.out.print("PASSAGEM EMITIDA\n");
                    }
                    break;
            }
        }
    }
    
}
