/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author lucas
 */
public class Conta {
    private String nome;
    private double saldo;
    private int numero;

    public Conta(String nome, double saldo, int numero) throws SaldoException {
        if ((nome == null)||(nome.isEmpty())){
            throw new NullPointerException("Nome nao pode ser nulo!");
        }
        if (saldo < 100){
            throw new SaldoException("Saldo tem que ser de pelo menos 100 reais!");
        }
        this.nome = nome;
        this.saldo = saldo;
        this.numero = numero;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta{" + "nome=" + nome + ", saldo=" + saldo + ", numero=" + numero + '}';
    }
    
    public void sacar(double valor) throws SaldoException {
        if(this.saldo < valor){
            //erro -> saldo ficara negativado
            throw new SaldoException("Saldo insuficiente!");
        }
        else if(valor < 0){
            //erro -> sacar valor negativo
            throw new SaldoException("Nao e possivel sacar valores negativos!");
        }else{
            this.saldo = this.saldo - valor;
        }
    }
    
    public void depositar(double valor) throws SaldoException{
        if(valor < 0){
            //erro -> sacar valor negativo
            throw new SaldoException("Nao e possivel depositar valores negativos!");
        }
        this.saldo = this.saldo + valor;
    }
        
}
