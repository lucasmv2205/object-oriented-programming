/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpolimorfismo;

/**
 *
 * @author lucas
 */
public class FormaTridimensional extends Forma {
    private int x;
    private int y;
    private int z;

    public FormaTridimensional(int x, int y, int z, String cor) {
        super(cor);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public double obterVolume(){
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+" FormaTridimensional{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
}
