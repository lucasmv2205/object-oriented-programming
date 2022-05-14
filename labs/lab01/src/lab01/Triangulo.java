/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.Objects;

/**
 *
 * @author lucas
 */
public class Triangulo {
    
    public Double lado1;
    public Double lado2;
    public Double lado3;
    public String tipo;

    public Triangulo(Double lado1, Double lado2, Double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }
    
    public void setTipo(String tipo) {
       this.tipo = tipo;
    }

    public Double getLado1() {
        return lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public Double getLado3() {
        return lado3;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void getTodosLados(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Perimetro: " + getPerimetro());
        System.out.println("lado 1: " + lado1);
        System.out.println("lado 2: " + lado2);
        System.out.println("lado 3: " + lado3+"\n");
    }
    
    public Double getPerimetro() {
        return lado3+lado2+lado1;
    }
    
    public String verificaTipo() {
        if(Objects.equals(lado1, lado2) && Objects.equals(lado2, lado3)){
            this.tipo = "equilatero";
            return "equilatero";
        }
        else if(!Objects.equals(lado1, lado2) && !Objects.equals(lado2, lado3) && !Objects.equals(lado1, lado3)){
            this.tipo = "escaleno";
            return "escaleno";
        }else{
           this.tipo = "Isosceles";
           return "isosceles";
        }
    }
    
}
