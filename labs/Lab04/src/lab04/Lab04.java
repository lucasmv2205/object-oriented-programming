/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Dvd> listaDvds = new ArrayList();
        ArrayList <Cd> listaCds = new ArrayList();
        ArrayList <Vhs> ListaVhs = new ArrayList();
        
        Scanner sc = new Scanner(System.in);
        int op = -1;
        
        while(op != 7){
            System.out.println("=== MENU ===");
            System.out.println("1 - Cadastrar Cd"); //feito
            System.out.println("2 - Cadastrar Dvd"); //feito
            System.out.println("3 - Cadastrar vhs");
            System.out.println("4 - Listar Cds"); //feito
            System.out.println("5 - Listar Dvds"); //feito
            System.out.println("6 - Listar Vhss");
            System.out.println("7 - sair");
            
            String nome;
            String genero;
            String ano_prod;
            int qtd_copias;
            float preco;
            
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1:
                    System.out.print("Nome do cd: ");
                    nome = sc.nextLine();
                    System.out.print("Nome do cantor: ");
                    String nome_cantor = sc.nextLine();
                    System.out.print("Quantidade de faixas: ");
                    int qtd_faixas = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Genero: ");
                    genero = sc.nextLine();
                    System.out.print("Ano de producao: ");
                    ano_prod = sc.nextLine();
                    System.out.print("Quantidade de copias: ");
                    qtd_copias = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Preco: ");
                    preco = sc.nextFloat();
                    sc.nextLine();
                    Cd c = new Cd(nome_cantor, qtd_faixas, nome, genero, ano_prod, qtd_copias, preco);
                    listaCds.add(c);
                    break;
                case 2:
                    System.out.print("Nome do dvd: ");
                    nome = sc.nextLine();
                    System.out.print("Nome do diretor: ");
                    String nome_diretor = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Genero: ");
                    genero = sc.nextLine();
                    System.out.print("Ano de producao: ");
                    ano_prod = sc.nextLine();
                    System.out.print("Duracao: ");
                    String duracao = sc.nextLine();
                    System.out.print("Quantidade de copias: ");
                    qtd_copias = sc.nextInt();
                    System.out.print("Classificacao etaria: ");
                    int class_etaria = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Preco: ");
                    preco = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Quantos atores deseja incluir no filme: ");
                    int qtd_atores = sc.nextInt();
                    sc.nextLine();
                    ArrayList <String> ListaAtores = new ArrayList();
                    for(int i = 0; i<qtd_atores; i++){
                        System.out.print("Nome: ");
                        String nome_ator = sc.nextLine();
                        ListaAtores.add(nome_ator);
                    }
                    Dvd d = new Dvd(ListaAtores, nome_diretor, duracao, class_etaria, nome, genero, ano_prod, qtd_copias, preco);
                    listaDvds.add(d);
                    break;
                case 4:
                    for(Cd cd: listaCds){
                        System.out.println(cd.toString());
                    }
                    break;
                case 5:
                    for(Dvd dvd: listaDvds){
                        System.out.println(dvd.toString());
                    }
                    break;
            }
        }
        
    }
    
}
