/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Dvd extends Midia {
    private ArrayList listaAtores;
    private String diretor;
    private String duracao;
    private int classificacao_etaria;
    //ArrayList <Dvd> listaAtores = new ArrayList();

    public Dvd(ArrayList listaAtores, String diretor, String duracao, int classificacao_etaria, String nome, String genero, String ano_prod, int qtd_copias, float preco) {
        super(nome, "video", genero, ano_prod, qtd_copias, preco);
        this.listaAtores = listaAtores;
        this.diretor = diretor;
        this.duracao = duracao;
        this.classificacao_etaria = classificacao_etaria;
    }

    public ArrayList getListaAtores() {
        return listaAtores;
    }

    public void setListaAtores(ArrayList listaAtores) {
        this.listaAtores = listaAtores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getClassificacao_etaria() {
        return classificacao_etaria;
    }

    public void setClassificacao_etaria(int classificacao_etaria) {
        this.classificacao_etaria = classificacao_etaria;
    }    

    @Override
    public String toString() {
        return super.toString() +"Dvd{" + "listaAtores=" + listaAtores + ", diretor=" + diretor + ", duracao=" + duracao + ", classificacao_etaria=" + classificacao_etaria + '}';
    }
    
    
    
}
