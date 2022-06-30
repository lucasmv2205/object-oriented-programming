/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpolimorfismo;

/**
 *
 * @author lucas
 */
public class Quadrado extends FormaBidimensional {
    private int lado;

    public Quadrado(int lado, int x, int y, String cor) {
        super(x, y, cor);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public double obterArea(){
        double area = this.lado*this.lado;
        return area;
    }

    @Override
    public String toString() {
        return super.toString()+" Quadrado{" + "lado=" + lado + '}';
    }
}
