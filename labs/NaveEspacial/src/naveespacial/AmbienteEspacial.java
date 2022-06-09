/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naveespacial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class AmbienteEspacial {
    public static gerenciadorNaves gNave = new gerenciadorNaves();
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op = -1;
        
        while(op != 20){
            System.out.println("=== MENU ===");
            System.out.println("1 - Cadastrar Nave");
            System.out.println("2 - Exibir naves");
            System.out.println("3 - Comparar naves");
            System.out.println("20 - sair");
            
            String nome;
            
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op){
                case 1:
                    System.out.print("Nome da nave: ");
                    nome = sc.nextLine();
                    if(gNave.ListaNaves.size() >= 3){
                        System.out.println("Superpopulação de Naves");
                        for(Nave nave: gNave.ListaNaves){
                            nave.setNome("nave com defeito");
                            nave.setVelocidade(0);
                        }
                    }else{
                        gNave.cadastrarNave(nome);
                    }
                    break;
                case 2:
                    System.out.println("Lista de naves: ");
                    gNave.listarNaves();
                    break;
                case 3:
                    System.out.println("Nave mais rápida: ");
                    System.out.print("Nome da nave 1: ");
                    String nome1 = sc.nextLine();
                    Nave n1 = gNave.buscaPeloNome(nome1);
                    System.out.print("Nome da nave 2: ");
                    String nome2 = sc.nextLine();
                    Nave n2 = gNave.buscaPeloNome(nome2);
                    Nave naveMaisRapida = gNave.naveMaisRapida(n1, n2);
                    if(naveMaisRapida != null){
                        System.out.println("Nave mais rapida e: "+ naveMaisRapida.toString());
                    }
                    break;
            }
        }
    }
}
