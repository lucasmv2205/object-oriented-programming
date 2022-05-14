/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01;

import java.util.Scanner;
import java.util.Arrays;  


/**
 *
 * @author lucas
 */
public class Lab01 {
    public static GerenciadorTriangulo gTriangulo = new GerenciadorTriangulo();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Triangulo t1 = new Triangulo(3.0, 4.0, 5.0);
       t1.verificaTipo();
       gTriangulo.listaTriangulos.add(t1);
       
       Triangulo t2 = new Triangulo(5.0, 5.0, 8.0);
       t2.verificaTipo();
       gTriangulo.listaTriangulos.add(t2);
       
       Triangulo t3 = new Triangulo(3.0, 3.0, 3.0);
       t3.verificaTipo();
       gTriangulo.listaTriangulos.add(t3);
       
       Triangulo t4 = new Triangulo(2.0, 2.0, 2.0);
       t4.verificaTipo();
       gTriangulo.listaTriangulos.add(t4);
       
       Triangulo t5 = new Triangulo(1.0, 2.0, 5.0);
       t4.verificaTipo();
       gTriangulo.listaTriangulos.add(t5);
       
       Triangulo t6 = new Triangulo(2.0, 7.0, 3.0);
       t6.verificaTipo();
       gTriangulo.listaTriangulos.add(t6);
       
       System.out.println("Digite 1 para inserir triangulo: \n");
       System.out.println("Digite 2 para ver triangulos cadastrados: \n");
       System.out.println("Digite 3 para ver a quantidade de triangulos equilateros: \n");
       System.out.println("Digite 4 para ver o triangulo com maior perimetro: \n");
       System.out.println("Digite 5 para ver a distancia entre 2 pontos: \n");
       Scanner input = new Scanner(System.in);
       Integer menu = input.nextInt();
       System.out.println("\n");
       if(menu == 1){
           gTriangulo.cadastrarTriangulo();
       }
       if(menu == 2){
           gTriangulo.mostrarTodosTriangulos();
       }
       if(menu == 3){
           System.out.println("Quantidade de triangulos equilateros: " + gTriangulo.numeroTriangulosEquilateros());
       }
       if(menu == 4){
           Triangulo tMaior = gTriangulo.getTrianguloMaiorPerimetro();
           System.out.println("\nTriangulo com maior perimetro: ");
           tMaior.getTodosLados();
       }
       if(menu == 5){
            System.out.println("Digite coordena x1");
            Double x1 = input.nextDouble();
            System.out.println("Digite coordena y1");
            Double y1 = input.nextDouble();
            System.out.println("Digite coordena x2");
            Double x2 = input.nextDouble();
            System.out.println("Digite coordena y2");
            Double y2 = input.nextDouble();
            Ponto p1 = new Ponto(x1, y1);
            Ponto p2 = new Ponto(x2, y2);
            System.out.println("Distancia entre os 2 pontos: 5"+p1.getDistancia2Pontos(p2.getX(), p2.getY()));
       }

    }
    
}
