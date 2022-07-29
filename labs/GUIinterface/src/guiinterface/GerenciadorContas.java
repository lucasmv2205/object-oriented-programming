/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiinterface;

import static guiinterface.CadastroDados.gContas;
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
public class GerenciadorContas {
    ArrayList <Conta> ListaContas = new ArrayList();
    
    public void cadastrarConta(String nome, int cpf, String nascimento, String sexo, int numeroConta, String senha, String email, boolean noticias){
        Conta a;
        a = new Conta(nome, cpf, nascimento, sexo, numeroConta, senha, email, noticias);
        ListaContas.add(a);
    }
    
}
