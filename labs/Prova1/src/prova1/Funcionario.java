/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

/**
 *
 * @author lucas
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private int num_carteira;
    private double salario_base;

    public Funcionario(String nome, String cpf, String rg, int num_carteira, double salario_base) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.num_carteira = num_carteira;
        this.salario_base = salario_base;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", num_carteira=" + num_carteira + ", salario_base=" + salario_base + '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public int getNum_carteira() {
        return num_carteira;
    }

    public double getSalario_base() {
        return salario_base;
    }
    
    
    
}
