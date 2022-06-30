/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class GerenciadorFuncionario {
    ArrayList <Funcionario> ListaFuncionario = new ArrayList();
    private int cont_gerente;
    private int cont_assistente;
    private int cont_vendedor;
    
    public void cadastrarGerente(String nome, String matricula, double salario_base){
        Gerente a;
        a = new Gerente(nome, matricula, salario_base);
        ListaFuncionario.add(a);
        cont_gerente+=1;
    }
    
    public void cadastrarAssistente(String nome, String matricula, double salario_base){
        Assistente a;
        a = new Assistente(nome, matricula, salario_base);
        ListaFuncionario.add(a);
        cont_assistente +=1 ;
    }
    
    public void cadastrarVendedor(String nome, String matricula, double salario_base, double comissao){
        Vendedor a;
        a = new Vendedor(comissao, nome, matricula, salario_base);
        ListaFuncionario.add(a);
        cont_vendedor += 1;
    }
    
    public void folhaSalarial(){
        double total_final = 0;
        System.out.println("\n========FOLHA SALARIAL=======");
        for(Funcionario func: ListaFuncionario){
            total_final += func.calculaSalario();
            System.out.println(func.toString());
            System.out.println("\nsalario final: "+func.calculaSalario());
            System.out.println("\n");
        }
        System.out.println("========");
        System.out.println("\nSoma de todos os salarios finais: "+ total_final);
    }
    
    public void mediaSalarial(){
        double total_gerente = 0;
        double total_assistente = 0;
        double total_vendedor = 0;
        for(Funcionario func: ListaFuncionario){
            if(func instanceof Gerente){
                total_gerente += func.calculaSalario();
            }
            if(func instanceof Assistente){
                total_assistente += func.calculaSalario();
            }
            if(func instanceof Vendedor){
                total_vendedor += func.calculaSalario();
            }
        }
        System.out.println("\n========MEDIA SALARIAL======");
        System.out.println("\nMedia Gerente "+ total_gerente / cont_gerente);
        System.out.println("\nMedia Assistente "+ total_assistente / cont_assistente);
        System.out.println("\nMedia Vendedor "+ total_vendedor / cont_vendedor);
        System.out.println("\n==============");
    }
    

}
