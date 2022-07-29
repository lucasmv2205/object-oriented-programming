package base;

import java.io.Serializable;

public class Conta implements Serializable {
    public double saldo;
    public String usuario;
    public int num;
    
    public Conta(String u, int n, double s) {
        saldo = s;
        usuario = u;
        num = n;
    }
    
    @Override
    public String toString() {
        return "Nome: "+usuario+" - "+"Num: "+num+" - "+"Saldo: "+saldo+"\n";
    }

}
