/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

/**
 *
 * @author lucas
 */
public class Comissionado extends Funcionario {
    private double salario_final;
    private double vendas;
    private double percentual_comissao;

    public Comissionado(double vendas, double percentual_comissao, String nome, String cpf, String rg, int num_carteira, double salario_base) {
        super(nome, cpf, rg, num_carteira, salario_base);
        this.salario_final = salario_base + (percentual_comissao*vendas);
        this.vendas = vendas;
        this.percentual_comissao = percentual_comissao;
    }

    @Override
    public String toString() {
        return super.toString()+" Comissionado{" + "salario_final=" + salario_final + ", vendas=" + vendas + ", percentual_comissao=" + percentual_comissao + '}';
    }

    public double getSalario_final() {
        return salario_final;
    }

    public double getVendas() {
        return vendas;
    }

    public double getPercentual_comissao() {
        return percentual_comissao;
    }
    
    
}
