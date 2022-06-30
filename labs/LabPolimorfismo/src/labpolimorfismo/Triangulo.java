/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpolimorfismo;

/**
 *
 * @author lucas
 */
public class Triangulo extends FormaBidimensional {
    private int base;
    private int altura;

    public Triangulo(int base, int altura, int x, int y, String cor) {
        super(x, y, cor);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double obterArea(){
        double area = this.base * this.altura;
        return area;
    }

    @Override
    public String toString() {
        return super.toString()+" Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    } 
    
}
