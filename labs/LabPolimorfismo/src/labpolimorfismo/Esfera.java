/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpolimorfismo;

/**
 *
 * @author lucas
 */
public class Esfera extends FormaTridimensional {
    private int raio;

    public Esfera(int raio, int x, int y, int z, String cor) {
        super(x, y, z, cor);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    @Override
    public double obterVolume(){
        double volume = 3.1415*(this.raio*this.raio*this.raio)*(4/3);
        return volume;
    }

    @Override
    public String toString() {
        return super.toString()+" Esfera{" + "raio=" + raio + '}';
    }
    
}
