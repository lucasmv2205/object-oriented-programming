/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author lucas
 */
public class MaquinaPassagem {
    private int preco;
    private int quantidadeTotal;
    private int total;

    public MaquinaPassagem(int preco) {
        this.preco = preco;
        this.quantidadeTotal = 0;
        this.total = 0;
    }
    
    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public int getTotal() {
        return total;
    }
    
    public int insereDinheiro(int dinheiroInserido){
        if(dinheiroInserido == 1 || dinheiroInserido == 2){
            this.quantidadeTotal += dinheiroInserido;
            this.total += dinheiroInserido;
            return 1;
        }else return 0;
        
    }
    
    public int emitePassagem(){
        if(this.quantidadeTotal == this.preco){
            return 1;
        }
        if(this.quantidadeTotal >= this.preco){
            int troco = this.quantidadeTotal - this.preco;
            System.out.println("Seu troco: "+troco+" reais");
            this.quantidadeTotal = 0;
            return 1;
        }
        return 0;
    }
    
}
