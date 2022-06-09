package banco;

public class Cliente {
    static int ct = 0;
    private String nome, CPF, telefone;
    private int idade;
    private Conta conta;
    private String usr,sen;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public void setSen(String sen) {
        this.sen = sen;
    }
    
    

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public Conta getConta() {
        return conta;
    }

    public String getUsr() {
        return usr;
    }

    public String getSen() {
        return sen;
    }
    
    void cadastraCliente(String n, String cpf, String t, int i, String u, String s, Conta c) {
        this.nome = n;
        this.CPF = cpf;
        this.telefone = t;
        this.idade = i;
        this.usr = u;
        this.sen = s;
        this.conta = c;
        ct++;
    }
    
}