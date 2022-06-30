/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpolimorfismo;

/**
 *
 * @author lucas
 */
public class Circulo extends FormaBidimensional {
    private int raio;

    public Circulo(int raio, int x, int y, String cor) {
        super(x, y, cor);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    @Override
    public double obterArea(){
        double area = 3.1415 * (this.raio * this.raio);
        return area;
    }

    @Override
    public String toString() {
        return super.toString()+" Circulo{" + "raio=" + raio + '}';
    }
    
    
    
}
