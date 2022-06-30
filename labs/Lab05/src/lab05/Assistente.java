/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author lucas
 */
public class Assistente extends Funcionario {

    public Assistente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }
    
    @Override
    public double calculaSalario(){
        double salario_final = super.getSalario_base();
        
        return salario_final;
    }
    
}
