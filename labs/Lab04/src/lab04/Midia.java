/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author lucas
 */
public class Midia {
    private String nome;
    private String tipo;
    private String genero;
    private String ano_prod;
    private int qtd_copias;
    private float preco;

    public Midia(String nome, String tipo, String genero, String ano_prod, int qtd_copias, float preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.ano_prod = ano_prod;
        this.qtd_copias = qtd_copias;
        this.preco = preco;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno_prod() {
        return ano_prod;
    }

    public void setAno_prod(String ano_prod) {
        this.ano_prod = ano_prod;
    }

    public int getQtd_copias() {
        return qtd_copias;
    }

    public void setQtd_copias(int qtd_copias) {
        this.qtd_copias = qtd_copias;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Midia{" + "nome=" + nome + ", tipo=" + tipo + ", genero=" + genero + ", ano_prod=" + ano_prod + ", qtd_copias=" + qtd_copias + ", preco=" + preco + '}';
    }
    
    
    
}
