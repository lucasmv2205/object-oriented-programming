package banco;

public class Conta {    
    static int ct = 0;
    private String tipo;
    private float saldo;
    private int num;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNum() {
        return num;
    }
    
    
    
    void cadastraConta(String t, float s) {
        this.tipo = t;
        if (s >= 100)
            this.saldo = s;
        else
            this.saldo = 100;
        this.num = ct;
        ct++;
    }
    
    String mostraSaldo() {
        return "O saldo da conta num "+num+", do tipo ("+tipo+") eh "+saldo+" reais.";
    }
    
    boolean sacar(float valor) {
        saldo = saldo - valor;
        return true;
    }
    
    boolean depositar(float valor) {
        saldo += valor;
        return true;
    }
    
    boolean ehNegativo() {
        return (saldo < 0);
    }
    
    void transferir(float valor, Conta c) {
        if (sacar(valor)) {
            c.depositar(valor);
            System.out.println("Transferencia concluida.");
        } else
            System.out.println("Erro na operacao. Transferencia cancelada.");
    }

}