/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiinterface;

import static guiinterface.CadastroDados.gContas;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class GUIinterface {
    public static GerenciadorArquivosContas gArqContas = new GerenciadorArquivosContas();
    public static GerenciadorContas gContas = new GerenciadorContas();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Conta> ret = new ArrayList<>();
        
        try {
            ret = gArqContas.importaTXT("dados.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUIinterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Conta conta: ret){
            System.out.println(conta.toCsv());
        }
        EscolheTipo2 a = new EscolheTipo2();
        a.setVisible(true);
    }
    
}





























