/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author lucas
 */
public class Lab07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Empregado> ListaEmpregados = new ArrayList();
        Map<Integer,Empregado> listaHashEmpregado;
        listaHashEmpregado = new HashMap<Integer,Empregado>();
        
        Empregado emp = new Empregado("123",18, 4000);
        ListaEmpregados.add(emp);
        listaHashEmpregado.put(18,emp);
        
        emp = new Empregado("123",17, 4000);
        ListaEmpregados.add(emp);
        listaHashEmpregado.put(17,emp);
        
        emp = new Empregado("123",21, 4000);
        ListaEmpregados.add(emp);
        listaHashEmpregado.put(21,emp);
        
        emp = new Empregado("123",16, 4000);
        ListaEmpregados.add(emp);
        listaHashEmpregado.put(16,emp);
        
        emp = new Empregado("123",40, 4000);
        ListaEmpregados.add(emp);
        listaHashEmpregado.put(40,emp);
        
        System.out.println("\n======ArrayList=====\n");
        
        Collections.sort(ListaEmpregados);
        Iterator<Empregado> iter = ListaEmpregados.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
        
        System.out.println("\n======Hashmap=====\n");
        listaHashEmpregado.values().forEach(empregado -> System.out.println(empregado));
        
        System.out.println("\n======Matriz 200x200=====\n");
        int cont = 0;
//        ArrayList <ArrayList<Integer>> matriz = new ArrayList<ArrayList<Integer>>();
        ArrayList linhas = new ArrayList();
        ArrayList colunas = new ArrayList();
        for(int i = 0; i < 12; i++){
            linhas.add(cont);
            cont++;
            if(cont == 255)
                cont = 0;
        }
        for(int i = 0; i<linhas.size(); i++){
            System.out.println(linhas.get(i));
        }
//        for (int i = 0; i < 200; i++) {
//            for (int j = 0; j < 200; j++) {
//                if(cont == 255)
//                    cont = 0;
//                matriz.get(i).add(cont);
//                cont++;
//            }
//        }
//        for (int i = 0; i < 200; i++) {
//            for (int j = 0; j < 200; j++) {
//                System.out.println(matriz.get(i).get(j));
//            }
//            System.out.println("\n");
//        }
    }
    
}
