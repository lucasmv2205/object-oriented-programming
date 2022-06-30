/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpolimorfismo;

/**
 *
 * @author lucas
 */
public class Cubo extends FormaTridimensional {
    private int lado;

    public Cubo(int lado, int x, int y, int z, String cor) {
        super(x, y, z, cor);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public double obterVolume(){
        double volume = this.lado*this.lado*this.lado;
        
        return volume;
    }

    @Override
    public String toString() {
        return super.toString()+" Cubo{" + "lado=" + lado + '}';
    } 
    
}
