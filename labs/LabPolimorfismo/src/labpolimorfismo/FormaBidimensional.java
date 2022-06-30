/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpolimorfismo;

/**
 *
 * @author lucas
 */
public class FormaBidimensional extends Forma {
    private int x;
    private int y;

    public FormaBidimensional(int x, int y, String cor) {
        super(cor);
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return super.toString()+" FormaBidimensional{" + "x=" + x + ", y=" + y + '}';
    }
    
    public double obterArea(){
        return 0;
    }
    
}
