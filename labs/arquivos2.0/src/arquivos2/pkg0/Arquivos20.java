/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos2.pkg0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Lucas Martins
 */
public class Arquivos20 {
    public static GerenciadorCliente gClientes = new GerenciadorCliente();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        importarcsv("Clientes.txt");
        //System.out.println(gClientes.listaClientes);
        Cliente a = new Cliente("Eduardo","100","14/07/1998","@gmail");
        Cliente b = new Cliente("Andrei","1000","14/07/1994","@hotmail");
        gClientes.listaClientes.add(a);
        gClientes.listaClientes.add(b);
        System.out.println(gClientes.listaClientes.get(2).toCsv());
        for(int i=0; i< gClientes.listaClientes.size(); i++){
                System.out.println(gClientes.listaClientes.get(i).toCsv());
            }
        exportarCSV("clientes2.txt");
        //System.out.println("oioio");
    }
    
    public static void importarcsv(String NomeArq) throws FileNotFoundException{
        
        Scanner entrada = new Scanner(new File(NomeArq));
        
        while(entrada.hasNext()){
        
            try{
                   String linha = entrada.nextLine();
                   String info[] = linha.split(";");
                   gClientes.listaClientes.add(new Cliente(info[0], info[1], info[2], info[3]));
            }

            catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto");
                entrada.close();
                System.exit(1);
            }
        }
    }
    
    public static void  exportarCSV(String nomeArq) throws IOException{
        try{
            File arquivo = new File(nomeArq);
            arquivo.createNewFile();
            //Escrever no arquivo
            FileWriter filewriter = new FileWriter(arquivo, false);
            PrintWriter writer = new PrintWriter(filewriter);
            for(int i=0; i< gClientes.listaClientes.size(); i++){
                writer.println(gClientes.listaClientes.get(i).toCsv());
            }
            writer.flush();
            writer.close();
            System.out.println("BORAAAAAA");
        }
        catch(IOException excecao){
            System.out.printf("\n%s Excecao: %s\n", excecao);
        }
        
        
    }
    
    
}
