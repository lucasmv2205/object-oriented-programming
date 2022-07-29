/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiinterface;

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
 * @author lucas
 */
public class GerenciadorArquivosContas {
    public static void  escreveTXT(String nomeArq, ArrayList<Conta> ListaContas) throws IOException{
        try{
            File arquivo = new File(nomeArq);
            arquivo.createNewFile();
            //Escrever no arquivo
            FileWriter filewriter = new FileWriter(arquivo, false);
            PrintWriter writer = new PrintWriter(filewriter);
            for(int i=0; i< ListaContas.size(); i++){
                writer.println(ListaContas.get(i).toCsv());
            }
            writer.flush();
            writer.close();
            //System.out.println("BORAAAAAA");
        }
        catch(IOException excecao){
            System.out.printf("\n%s Excecao: %s\n", excecao);
        }         
    }
    
    public static ArrayList<Conta> importaTXT(String NomeArq) throws FileNotFoundException{
        
        Scanner entrada = new Scanner(new File(NomeArq));
        ArrayList<Conta> ret = new ArrayList<>();
        
        while(entrada.hasNext()){
        
            try{
                   String linha = entrada.nextLine();
                   String info[] = linha.split(";");
                   boolean noticias = "true".equals(info[7]);
                   ret.add(new Conta(info[0], Integer.parseInt(info[1]), info[2], info[3], Integer.parseInt(info[4]), info[5], info[6], noticias));
            }

            catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto");
                entrada.close();
                System.exit(1);
            }
        }
        
        return ret;
    }
}
