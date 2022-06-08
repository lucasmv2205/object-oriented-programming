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
public class Vhs extends Dvd {
    private Boolean esta_rebobinada;

    public Vhs(Boolean esta_rebobinada, ArrayList listaAtores, String diretor, String duracao, int classificacao_etaria, String nome, String genero, String ano_prod, int qtd_copias, float preco) {
        super(listaAtores, diretor, duracao, classificacao_etaria, nome, genero, ano_prod, qtd_copias, preco);
        this.esta_rebobinada = esta_rebobinada;
    }

    public Boolean getEsta_rebobinada() {
        return esta_rebobinada;
    }

    public void setEsta_rebobinada(Boolean esta_rebobinada) {
        this.esta_rebobinada = esta_rebobinada;
    }

    @Override
    public String toString() {
        return super.toString()+"Vhs{" + "esta_rebobinada=" + esta_rebobinada + '}';
    }
    
    
    
}
