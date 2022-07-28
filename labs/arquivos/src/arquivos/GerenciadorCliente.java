/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.util.ArrayList;

/**
 *
 * @author Lucas Martins
 */
public class GerenciadorCliente {
    ArrayList <Cliente> listaClientes = new ArrayList();
    ArrayList <String> listaClientesTexto = new ArrayList();
    
    public void cadastrarCliente(String nome, String cpf, String DataNasc, String email){
        Cliente a;
        a = new Cliente(nome, cpf, DataNasc, email);
        listaClientesTexto.add("\n"+nome+";"+cpf+";"+DataNasc+";"+email+"\n");
        listaClientes.add(new Cliente(nome, cpf, DataNasc, email));
    }
    
    public ArrayList<Cliente> mostrarClientes(){
        return listaClientes;
    }
    
}
