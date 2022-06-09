/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class GerenciadorFuncionario {
    Operario[] listaOperarios = new Operario[15];
    Comissionado[] listaComissionados = new Comissionado[15];
    Faxineiro[] listaFaxineiro = new Faxineiro[15];
    
    public void cadastrarOperario(double valor_prod, String nome, String cpf, String rg, int num_carteira, double salario_base, int contador){
        Operario a;
        a = new Operario(valor_prod, nome, cpf, rg, num_carteira, salario_base);
        listaOperarios[contador] = a;
    }
    
    public void cadastrarComissionado(double vendas, double percentual_comissao, String nome, String cpf, String rg, int num_carteira, double salario_base, int contador){
        Comissionado a;
        a = new Comissionado(vendas, percentual_comissao, nome, cpf, rg, num_carteira, salario_base);
        listaComissionados[contador] = a;
    }
    
    public void cadastrarFaxineiro(String nome, String cpf, String rg, int num_carteira, double salario_base, int contador){
        Faxineiro a;
        a = new Faxineiro(nome, cpf, rg, num_carteira, salario_base);
        listaFaxineiro[contador] = a;
    }
    
    public void listarOperarios(int contador){
        for(int i = 0; i<contador; i++){
            System.out.println(listaOperarios[i].toString());
            System.out.println("\n");
        }
    }
    
    public void listarComissionados(int contador){
        for(int i = 0; i<contador; i++){
            System.out.println(listaComissionados[i].toString());
            System.out.println("\n");
        }
    }
    
    public void listarFaxineiro(int contador){
        for(int i = 0; i<contador; i++){
            System.out.println(listaFaxineiro[i].toString());
            System.out.println("\n");
        }
    }
    
    public void folhaSalarial(int contador_op, int contador_com, int contador_fax){
        double total_op = 0;
        double total_com = 0;
        double total_fax = 0;
        double total_empresa = 0;
        
        for(int i = 0; i<contador_op; i++){
            total_op += listaOperarios[i].getSalario_final();
            System.out.println("Funcionario: "+listaOperarios[i].getNome());
            System.out.println("\nOperarios: Limpeza");
            System.out.println("\nSalario total: "+listaOperarios[i].getSalario_final());
            System.out.println("\n");
        }
        System.out.println("=====");
        for(int i = 0; i<contador_com; i++){
            total_com += listaComissionados[i].getSalario_final();
            System.out.println("Funcionario: "+listaComissionados[i].getNome());
            System.out.println("\nSetor: Comissionado");
            System.out.println("\nSalario total: "+listaComissionados[i].getSalario_final());
            System.out.println("\n");
        }
        System.out.println("=====");
        for(int i = 0; i<contador_fax; i++){
            total_fax += listaFaxineiro[i].getSalario_final();
            System.out.println("Funcionario: "+listaFaxineiro[i].getNome());
            System.out.println("\nSetor: Limpeza");
            System.out.println("\nSalario total: "+listaFaxineiro[i].getSalario_final());
            System.out.println("\n");
        }
        System.out.println("=====");
        
        total_empresa = total_op + total_com + total_fax;
        
        System.out.println("Folha da pagamentos da empresa por setor\n");
        System.out.println("Operarios: " + total_op);
        System.out.println("\nComissionados: " + total_com);
        System.out.println("\nFaxineiros: " + total_fax);
        System.out.println("=====");
        
        System.out.println("\nCusto total: " + total_empresa);
    }
}
