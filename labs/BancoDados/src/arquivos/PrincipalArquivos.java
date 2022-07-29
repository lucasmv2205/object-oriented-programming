package arquivos;

import base.Conta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PrincipalArquivos {
    
    public static ArrayList<Conta> leArquivoBin(String arquivo) {
        ObjectInputStream leitorObj = null;
        FileInputStream leitorArquivo = null;
        ArrayList<Conta> ret = new ArrayList<>();
        try {
            leitorArquivo = new FileInputStream(arquivo);
            leitorObj = new ObjectInputStream(leitorArquivo);
            boolean haRegistros = true;
            while (haRegistros) {
                try {
                    Conta c = (Conta)leitorObj.readObject();
                    ret.add(c);
                } catch(EOFException e) {
                    haRegistros = false;
                }
            }
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
        } finally {
                try {
                        if (leitorArquivo != null) leitorArquivo.close();
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }
        return ret;
    }
    
    public static void escreveArquivoBin(String arquivo, ArrayList<Conta> c) {
        FileOutputStream escritorArquivo = null;
        ObjectOutputStream escritorObj = null;
        try {
            escritorArquivo = new FileOutputStream(arquivo);
            escritorObj = new ObjectOutputStream(escritorArquivo);
            //escritorObj.writeObject(c); // SALVA O ARRAYLIST INTEIRO
            for (Conta ct : c) //SALVA OS ELEMENTOS DO ARRAYLIST SEPARADAMENTE
                escritorObj.writeObject((Conta)ct); //Tem que implementar a interface Serializable!
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (escritorArquivo != null) escritorArquivo.close();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
        }

    }
    
    public static ArrayList<Conta> leArquivoTxt(String arq) {
        String linha;
        BufferedReader arquivo = null; //Objeto leitor
        ArrayList<Conta> ret = new ArrayList<>();
        try{
            arquivo = new BufferedReader(new FileReader(new File(arq)));
            //Instanciação do objeto leitor
            while((linha = arquivo.readLine()) != null) {
                String info[] = linha.split(";");
                if ((info != null)&&(info.length != 0)) {
                    Conta c = new Conta(info[0],Integer.parseInt(info[1]),Float.parseFloat(info[2]));
                    ret.add(c);
                }
            }
             arquivo.close(); //fechamento do arquivo
           }catch (java.io.IOException e) {
                   System.out.println("File error: " + e.toString());
           }
        return ret;
    }
    
    public static void escreveArquivoTxt(String arquivo, ArrayList<Conta> c) {
        
        BufferedWriter escritor = null; //objeto escritor
        try{
            escritor = new BufferedWriter(new FileWriter(new File(arquivo)));
            for (Conta ct : c) {
                escritor.write(ct.usuario+";"+ct.num+";"+ct.saldo+"\n");
            }
            escritor.flush(); //descarga do buffer de escrita
            escritor.close(); //fechamento do arquivo
        } catch(IOException e){
                e.printStackTrace();
        }

    }
    
    public static void main(String a[]) {
        
        ArrayList<Conta> cs = new ArrayList<>();
        cs.add(new Conta("Jose Gustavo",12345,1256.45f));
        cs.add(new Conta("Ana",67890,6.00f));
        cs.add(new Conta("Carlos",79531,12.90f));
        cs.add(new Conta("Andrei",79531,12.90f));
        
        //UTILIZANDO ARQUIVOS TEXTO
        //escreveArquivoTxt("contas.txt",cs);        
        //ArrayList<Conta> cs2 = leArquivoTxt("contas.txt");
        //System.out.println(cs2);
        
        //UTILIZANDO ARQUIVOS BINÁRIOS
        escreveArquivoBin("testeContas.dat",cs);
        ArrayList<Conta> cs2 = leArquivoBin("testeContas.dat");
        System.out.println(cs2);
        
    }
    
}
