/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05;

/**
 *
 * @author lucas
 */
public class Lab05 {
    public static GerenciadorFuncionario gFuncionario = new GerenciadorFuncionario();
    public static GerenciadorVeiculos gVeiculo = new GerenciadorVeiculos();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gFuncionario.cadastrarGerente("Lucas", "1234", 6000.0);
        gFuncionario.cadastrarAssistente("Joao", "312", 3000.0);
        gFuncionario.cadastrarVendedor("Pedro", "4132", 4000.0, 2000);        
        gFuncionario.cadastrarAssistente("Millena", "534", 3000.0);
        gFuncionario.cadastrarVendedor("Harlem", "321", 4000.0, 980);
        
        //gFuncionario.folhaSalarial();
        
        //stem.out.println("\n");
        
        //gFuncionario.mediaSalarial();
        
        gVeiculo.cadastrarAviao("boeing", "737", "vermelho", 900.0);
        gVeiculo.cadastrarAviao("boeing", "737", "prata", 1200.0);
        gVeiculo.cadastrarAviao("boeing", "737", "prata", 20.0);
        
        gVeiculo.cadastrarCarro("volvo", "xc60", "vermelho", 250.0);
        gVeiculo.cadastrarCarro("volvo", "xc60", "prata", 1500.0);
        gVeiculo.cadastrarCarro("volvo", "xc60", "vermelho", 400.0);
        
        gVeiculo.vermelhoMaisPotente();
        gVeiculo.vermelhoMenosPotente();
        
        
        
    }
    
}
