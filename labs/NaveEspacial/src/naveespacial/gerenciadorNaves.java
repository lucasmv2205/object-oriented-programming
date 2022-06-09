/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naveespacial;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class gerenciadorNaves {
    ArrayList <Nave> ListaNaves = new ArrayList();
    
    public void cadastrarNave(String nome){
        Nave a;
        a = new Nave(nome);
        ListaNaves.add(a);
    }
    
    public void listarNaves(){
        for(Nave nave: ListaNaves){
            System.out.println(nave.toString());
            if(nave.getVelocidade() == 0){
                System.out.println("Nave inoperante");
            }
        }
    }
    
    public Nave naveMaisRapida(Nave n1, Nave n2){
        if(n1.getVelocidade() > n2.getVelocidade()){
            return n1;
        }
        if(n1.getVelocidade() == n2.getVelocidade()){
            System.out.println("naves possuem velocidades iguais");
            return null;
        }
        return n2;
    }
    
    public Nave buscaPeloNome(String nome){
        for(Nave nave: ListaNaves){
            if(nave.getNome().equals(nome)){
                return nave;
            }
        }
        return null;
    }
    
}
