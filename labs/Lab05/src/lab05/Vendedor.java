/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author lucas
 */
public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(double comissao, String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.toString() + " Vendedor{" + "comissao=" + comissao + '}';
    }
    
    @Override
    public double calculaSalario(){
        double salario = super.getSalario_base();
        double salario_final = this.comissao + salario;
        
        return salario_final;
    }
    
}
