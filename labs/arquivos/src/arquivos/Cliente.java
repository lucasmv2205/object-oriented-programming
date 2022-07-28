/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

/**
 *
 * @author Lucas Martins
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String DataNasc;
    private String email;

    public Cliente(String nome, String cpf, String DataNasc, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.DataNasc = DataNasc;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ";" + cpf + ";" + DataNasc + ";" + email;
    }
    
    
}
