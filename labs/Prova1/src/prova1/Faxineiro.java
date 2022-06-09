/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

/**
 *
 * @author lucas
 */
public class Faxineiro extends Funcionario {
    private double salario_final;

    public Faxineiro(String nome, String cpf, String rg, int num_carteira, double salario_base) {
        super(nome, cpf, rg, num_carteira, salario_base);
        this.salario_final = salario_base;
    }

    public double getSalario_final() {
        return salario_final;
    }

    @Override
    public String toString() {
        return super.toString()+" Faxineiro{" + "salario_final=" + salario_final + '}';
    }
    
    
}
