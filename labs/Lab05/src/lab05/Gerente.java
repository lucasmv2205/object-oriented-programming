/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author lucas
 */
public class Gerente extends Funcionario {

    public Gerente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }
    
    @Override
    public double calculaSalario(){
        double salario = super.getSalario_base();
        double salario_final = 2*salario;
        
        return salario_final;
    }
}
    
