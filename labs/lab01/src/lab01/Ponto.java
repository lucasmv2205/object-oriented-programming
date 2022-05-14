/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author lucas
 */
public class Ponto {
    public Double x;
    public Double y;

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }  
    
    public Double getDistancia2Pontos(Double x0, Double y0){
        double distancia = Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2));
        return distancia;
    }
    
}
