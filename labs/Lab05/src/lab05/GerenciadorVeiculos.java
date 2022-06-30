/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class GerenciadorVeiculos {
    ArrayList <Veiculo> ListaVeiculos = new ArrayList();
    
    public void cadastrarCarro(String marca, String modelo, String cor, double potencia){
        Carro a;
        a = new Carro(marca, modelo, cor, potencia);
        ListaVeiculos.add(a);
    }
    
    public void cadastrarAviao(String marca, String modelo, String cor, double potencia){
        Aviao a;
        a = new Aviao(marca, modelo, cor, potencia);
        ListaVeiculos.add(a);
    }
    
    public void vermelhoMaisPotente(){
        double maior_potencia = 0;
        Veiculo veiculoMaisPotente = null;
        for(Veiculo veiculo: ListaVeiculos){
            if(veiculo.cor().equals("vermelho")){
                if(veiculo.potencia() > maior_potencia){
                    maior_potencia = veiculo.potencia();
                    veiculoMaisPotente = veiculo;
                }
            }
        }
        System.out.println("\n=====Veiculo vermelho mais potente: ======");
        if(veiculoMaisPotente != null){
            veiculoMaisPotente.mostraDados();
        }
    }
    
    
    public void vermelhoMenosPotente(){
        double menor_potencia = 999999999.0;
        Veiculo veiculoMenosPotente = null;
        for(Veiculo veiculo: ListaVeiculos){
            if(veiculo.cor().equals("vermelho")){
                if(veiculo.potencia() < menor_potencia){
                    menor_potencia = veiculo.potencia();
                    veiculoMenosPotente = veiculo;
                }
            }
        }
        System.out.println("\n=====Veiculo vermelho menos potente: =====");
        if(veiculoMenosPotente != null){
            veiculoMenosPotente.mostraDados();
        }
    }
    
}
