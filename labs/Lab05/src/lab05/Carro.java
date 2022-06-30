/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author lucas
 */
public class Carro implements Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private double potencia;

    public Carro(String marca, String modelo, String cor, double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
    }
    
    @Override
    public String marca(){
       return this.marca;
    }

    @Override
    public String modelo() {
        return this.modelo;
    }

    @Override
    public String cor() {
        return this.cor;
    }

    @Override
    public double potencia() {
        return this.potencia;
    }


    @Override
    public void mostraDados() {
        System.out.println("\nCarro{" + "marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + '}');
        System.out.println("potencia "+ this.potencia());
    }
}
