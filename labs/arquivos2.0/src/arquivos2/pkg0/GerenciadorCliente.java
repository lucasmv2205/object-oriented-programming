/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos2.pkg0;

import java.util.ArrayList;

/**
 *
 * @author Lucas Martins
 */
public class GerenciadorCliente {
    ArrayList <Cliente> listaClientes = new ArrayList();
    
    public void cadastrarCliente(String nome, String cpf, String DataNasc, String email){
        Cliente a;
        a = new Cliente(nome, cpf, DataNasc, email);
        listaClientes.add(a);
    }
   
    
}
    
