/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

/**
 *
 * @author lucas
 */
public class Operario extends Funcionario {
    private double salario_final;
    private double valor_producao;

    public Operario(double valor_producao, String nome, String cpf, String rg, int num_carteira, double salario_base) {
        super(nome, cpf, rg, num_carteira, salario_base);
        this.salario_final = salario_base + valor_producao;
        this.valor_producao = valor_producao;
    }

    @Override
    public String toString() {
        return super.toString()+" Operario{" + "salario_final=" + salario_final + ", valor_producao=" + valor_producao + '}';
    }

    public double getSalario_final() {
        return salario_final;
    }

    public double getValor_producao() {
        return valor_producao;
    }
    
    
    
}
