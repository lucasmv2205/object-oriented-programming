/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Prova1 {

    /**
     * @param args the command line arguments
     */
    public static GerenciadorFuncionario gFuncionario = new GerenciadorFuncionario();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op = -1;
        int cont_operarios = 0;
        int cont_comissionados = 0;
        int cont_faxineiros = 0;
        
        while(op != 4){
            System.out.println("=== MENU ===");
            System.out.println("1 - Cadastrar funcionario");
            System.out.println("2 - Listar funcionarios");
            System.out.println("3 - Exibir folha salarial");
            System.out.println("4 - sair");
            
            op = sc.nextInt();
            sc.nextLine();
            
            String nome;
            String cpf;
            String rg;
            int num_carteira;
            double salario_base;
            int tipo_func;
            
            switch (op){
                case 1:
                    
                    System.out.print("==Qual funcionario deseja cadastrar==");
                    System.out.println("\n1 - Cadastrar operario");
                    System.out.println("\n2 - Cadastrar comissionado");
                    System.out.println("\n3 - Cadastrar faxineiro");
                    tipo_func = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Entre com os dados do funcionario: ");
                    
                    System.out.println("Nome: ");
                    nome = sc.nextLine();
                    System.out.println("cpf: ");
                    cpf = sc.nextLine();
                    System.out.println("rg: ");
                    rg = sc.nextLine();
                    System.out.println("numero CTPS: ");
                    num_carteira = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Salario base: ");
                    salario_base = sc.nextDouble();
                    sc.nextLine();
                    
                    if(tipo_func == 1){
                        //criar operario
                        System.out.println("valor monetario de producao: ");
                        double valor_prod = sc.nextDouble();
                        sc.nextLine();
                        gFuncionario.cadastrarOperario(valor_prod, nome, cpf, rg, num_carteira, salario_base, cont_operarios);
                        cont_operarios = cont_operarios + 1;
                        
                    }
                    if(tipo_func == 2){
                        //criar comissionado
                        System.out.println("Quantidade de vendas: ");
                        double qtd_vendas = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("percentual(valores entre 0 e 1): ");
                        double percentual = sc.nextDouble();
                        sc.nextLine();
                        gFuncionario.cadastrarComissionado(qtd_vendas, percentual, nome, cpf, rg, num_carteira, salario_base, cont_comissionados);
                        cont_comissionados = cont_comissionados + 1;
                    }
                    if(tipo_func == 3){
                        //criar faxineiro
                        gFuncionario.cadastrarFaxineiro(nome, cpf, rg, num_carteira, salario_base, cont_faxineiros);
                        cont_faxineiros = cont_faxineiros + 1;
                    }
                    break;
                case 2:
                    System.out.print("==Qual funcionario deseja listar==");
                    System.out.println("\n1 - operario");
                    System.out.println("\n2 - comissionado");
                    System.out.println("\n3 - faxineiro");
                    tipo_func = sc.nextInt();
                    sc.nextLine();
                    if(tipo_func == 1){
                        //listar operarios
                        if(cont_operarios == 0){
                            System.out.println("Nenhum operario cadastrado");
                        }else{
                            gFuncionario.listarOperarios(cont_operarios);
                        }
                    }
                    if(tipo_func == 2){
                        //listar comissionados
                        if(cont_comissionados == 0){
                            System.out.println("Nenhum comissionado cadastrado");
                        }else{
                            gFuncionario.listarComissionados(cont_comissionados);
                        }
                    }
                    if(tipo_func == 3){
                        //listar faxineiro
                        if(cont_faxineiros == 0){
                            System.out.println("Nenhum faxineiro cadastrado");
                        }else{
                            gFuncionario.listarFaxineiro(cont_faxineiros);
                        }
                    }
                    break;
                case 3:
                    System.out.println("== Folha de pagamentos da empresa ==");
                    gFuncionario.folhaSalarial(cont_operarios, cont_comissionados, cont_faxineiros);
                    break;
            }
        }
    }
    
}
