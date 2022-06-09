/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author facom
 */
public class Ponto {
    private float x = 0;
    private float y = 0;
    
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public double distancia(Ponto p2){
        double distancia;
        distancia = sqrt(pow(x - p2.getX(), 2) + pow(y - p2.getY(), 2));
        return distancia;
    }

    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
}
