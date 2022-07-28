/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

/**
 *
 * @author lucas
 */
public class Empregado implements Comparable {
    private String cpf;
    private int idade;
    private double salario;

    public Empregado(String cpf, int idade, double salario) {
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" + "cpf=" + cpf + ", idade=" + idade + ", salario=" + salario + '}';
    }
    
    @Override
    public int compareTo(Object outroEmpregado) {
        if (this.idade < ((Empregado)outroEmpregado).getIdade()) {
            return -1;
        }
        if (this.idade > ((Empregado)outroEmpregado).getIdade()) {
            return 1;
        }
        return 0;
    }
}
