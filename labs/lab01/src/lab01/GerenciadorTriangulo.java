/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class GerenciadorTriangulo {
    ArrayList<Triangulo> listaTriangulos = new ArrayList();

    public void cadastrarTriangulo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite lado 1");
        Double lado1 = input.nextDouble();
        System.out.println("Digite lado 2");
        Double lado2 = input.nextDouble();
        System.out.println("Digite lado 3");
        Double lado3 = input.nextDouble();
        Triangulo t = new Triangulo(lado1, lado2, lado3);
        t.verificaTipo();
        listaTriangulos.add(t);
    }
    
    public void mostrarTodosTriangulos(){
        for(Triangulo p: listaTriangulos){
            p.getTodosLados();
        }
    }
    
    public Triangulo getTrianguloMaiorPerimetro(){
        int maior = 0;
        Triangulo t = null;
        for(Triangulo p: listaTriangulos){
            if(p.getPerimetro() >= maior){
                t = p;
            }
        }
        
        return t;
    }
    
    public int numeroTriangulosEquilateros(){
        int i = 0;
        for(Triangulo p: listaTriangulos){
            if(p.getTipo().equals("equilatero")){
                i++;
            }
        }
        return i;
    }
}
