/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author lucas
 */
public class Cd extends Midia {
    private String cantor;
    private int qtd_faixas;

    public Cd(String cantor, int qtd_faixas, String nome, String genero, String ano_prod, int qtd_copias, float preco) {
        super(nome, "audio", genero, ano_prod, qtd_copias, preco);
        this.cantor = cantor;
        this.qtd_faixas = qtd_faixas;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public int getQtd_faixas() {
        return qtd_faixas;
    }

    public void setQtd_faixas(int qtd_faixas) {
        this.qtd_faixas = qtd_faixas;
    }

    @Override
    public String toString() {
        return super.toString()+"Cd{" + "cantor=" + cantor + ", qtd_faixas=" + qtd_faixas + '}';
    }
    
}
