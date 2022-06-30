/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpolimorfismo;

/**
 *
 * @author lucas
 */
public class Tetraedro extends FormaTridimensional {
    private int alturaBase;
    private int base;
    private int altura;

    public Tetraedro(int alturaBase, int base, int altura, int x, int y, int z, String cor) {
        super(x, y, z, cor);
        this.alturaBase = alturaBase;
        this.base = base;
        this.altura = altura;
    }

    public int getAlturaBase() {
        return alturaBase;
    }

    public void setAlturaBase(int alturaBase) {
        this.alturaBase = alturaBase;
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
    public double obterVolume(){
        double area = this.base * this.alturaBase;
        double volume = area*this.altura;
        return volume;
    }

    @Override
    public String toString() {
        return super.toString()+" Tetraedro{" + "alturaBase=" + alturaBase + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
}
