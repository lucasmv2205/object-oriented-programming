/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naveespacial;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class Nave {
    private String nome;
    private int velocidade;

    public Nave(String nome) {
        Random aleatorio = new Random();
        this.nome = nome;
        this.velocidade = aleatorio.nextInt((10 - 5) + 1) + 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Nave{" + "nome=" + nome + ", velocidade=" + velocidade + '}';
    }
    
}
