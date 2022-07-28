/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Lucas Martins
 */
public class Arquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner entrada = new Scanner(new File("C:\\Users\\lucas\\projetosJava\\arquivos\\src\\arquivos\\clientes.txt"));
        while(entrada.hasNext()){
            try
            {
                System.out.printf("\n%s", entrada.next());
                System.out.println("");
            }
            catch(NoSuchElementException excecaoElemento)
            {
                System.err.println("Arquivo com formato incorreto"+excecaoElemento);
                entrada.close();
                System.exit(1);
            }
        }
        
    }
    
}
