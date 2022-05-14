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
public class Cliente {
    public String nome;
    public String cpf;
    public int idade;
    public String telefone;
    
    public void CadastroCliente(String nome, String cpf, int idade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    public void MostrarDadosCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
    }
    
    public static void main(String a[]){
        System.out.println("Insira dados do cliente: \n");
        Scanner input = new Scanner(System.in);
        System.out.println("\nNome:");
        String nome = input.next();
        System.out.println("\nCpf:");
        String cpf = input.next();
        System.out.println("\nIdade:");
        Integer idade = input.nextInt();
        System.out.println("\nTelefone:");
        String telefone = input.next();
        
        Cliente c1 = new Cliente();
        
        c1.CadastroCliente(nome, cpf, idade, telefone);
        System.out.println("\n");
        c1.MostrarDadosCliente();
    }
}
