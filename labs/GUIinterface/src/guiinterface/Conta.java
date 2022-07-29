/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiinterface;

/**
 *
 * @author lucas
 */
public class Conta {
    private String nome;
    private int cpf;
    private String nascimento;
    private String sexo;
    private int numeroConta;
    private String senha;
    private String email;
    private boolean noticias;

    public Conta(String nome, int cpf, String nascimento, String sexo, int numeroConta, String senha, String email, boolean noticias) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.email = email;
        this.noticias = noticias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Conta{" + "nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + ", sexo=" + sexo + ", numeroConta=" + numeroConta + ", senha=" + senha + ", email=" + email + " noticias = " + noticias + '}';
    }
    
    public String toCsv(){
        
        return nome + ";" +  cpf + ";" +  nascimento + ";" + sexo + ";" + numeroConta + ";" + senha + ";" + email + ";" + noticias;
    }
    
    
    
}
