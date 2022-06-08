/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojacomercial;

/**
 *
 * @author lucas
 */
public class Vendedor extends Funcionario {
    private float vendas;
    private float salario_base;

    public Vendedor(float vendas, float salario_base, String nome, String rg) {
        super(nome, rg);
        this.vendas = vendas;
        this.salario_base = salario_base;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(float salario_base) {
        this.salario_base = salario_base;
    }

    @Override
    public String toString() {
        return super.toString()+"Vendedor{" + "vendas=" + vendas + ", salario_base=" + salario_base + '}';
    }

    public void realizaVenda(float valor_venda){
        this.vendas += valor_venda;
    }
    
    public double getSalarioTotal(){
        double salarioTotal = this.salario_base + (this.vendas*0.5);
        this.vendas = 0;
        return salarioTotal;
    }
    
}
