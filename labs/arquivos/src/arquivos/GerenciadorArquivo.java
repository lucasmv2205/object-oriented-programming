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
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Lucas Martins
 */
public class GerenciadorArquivo {
    public void escreverArquivo(ArrayList Cliente) throws IOException{
        try{
            File arquivo = new File("C:\\Users\\lucas\\projetosJava\\arquivos\\src\\arquivos\\clientes.txt");
            arquivo.createNewFile();
            FileWriter filewriter = new FileWriter(arquivo, false);
            PrintWriter writer = new PrintWriter(filewriter);
            writer.println(Cliente);
            writer.flush();
            writer.close();
        }
        catch(IOException excecao){
            System.out.printf("Erro ao abrir arquivo %s\n", excecao);
        }
    }
    
    public void lerArquivo() throws FileNotFoundException{
        Scanner entrada = new Scanner(new File("C:\\Users\\lucas\\projetosJava\\arquivos\\src\\arquivos\\clientes.txt"));
        while(entrada.hasNext()){
            try{
                System.out.printf("\n%s", entrada.nextLine());
                System.out.println("");
            }
            catch(NoSuchElementException excecaoelemento){
                System.err.println("Arquivo com formato incorreto"+excecaoelemento);
                entrada.close();
                System.exit(1);
            }
        }
    }
}
