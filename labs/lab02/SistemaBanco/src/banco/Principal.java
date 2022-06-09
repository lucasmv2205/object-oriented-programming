package banco;

import java.util.Scanner;

public class Principal {
    
    static Cliente[] clientes = new Cliente[10];
    
    static Cliente logar(Scanner sc) {
        System.out.print("Usuario: ");
        String usr = sc.nextLine();
        System.out.print("Senha: ");
        String sen = sc.nextLine();
        for (int i=0;i<Cliente.ct;i++)
            if ((clientes[i].getUsr().equals(usr))&&(clientes[i].getSen().equals(sen)))
                return clientes[i];
        return null;
    }
    
    static Conta buscaConta(int num) {
        for (int i=0;i<Cliente.ct;i++)
            if (clientes[i].getConta().getNum() == num)
                return clientes[i].getConta();
        return null;
    }
    
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int op = -1;
        int contClientes = 0;
        
        while (op != 10) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Saldo");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Relatorio");
            System.out.println("7 - Relatorio clientes negativados");
            System.out.println("8 - Relatorio clientes entre intervalo de idades");
            System.out.println("9 - Distancia entre 2 pontoss");
            System.out.println("10 - Sair");
            op = sc.nextInt();
            sc.nextLine();
            String tipo;
            float saldo;
            String nome, CPF, telefone;
            int idade;
            String usr,sen;
            Cliente c;
            
            switch(op) {
                case 1:
                    System.out.print("Tipo da Conta: ");
                    tipo = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    saldo = sc.nextFloat();
                    sc.nextLine();                    
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("CPF: ");
                    CPF = sc.nextLine();
                    System.out.print("Telefone: ");
                    telefone = sc.nextLine();
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Usuario: ");
                    usr = sc.nextLine();
                    System.out.print("Senha: ");
                    sen = sc.nextLine();
                    Conta c1 = new Conta();
                    c1.cadastraConta(tipo, saldo);
                    Cliente cli1 = new Cliente();
                    cli1.cadastraCliente(nome, CPF, telefone, idade, usr, sen, c1);
                    clientes[contClientes] = cli1;
                    contClientes++;
                    break;
                case 2:
                    c = logar(sc);
                    if (c != null) {
                        System.out.println(c.getConta().mostraSaldo());
                    }else
                        System.out.println("Acesso negado.");
                    break;
                case 3:
                    c = logar(sc);
                    if (c != null) {
                        System.out.print("Valor: ");
                        Float valor = sc.nextFloat();
                        if (c.getConta().sacar(valor))
                            System.out.println("Saque realizado com sucesso.");
                        else
                            System.out.println("Erro ao realizar o saque.");
                    }
                    break;
                case 4:
                    c = logar(sc);
                    if (c != null) {
                        System.out.print("Valor: ");
                        Float valor = sc.nextFloat();
                        if (c.getConta().depositar(valor))
                            System.out.println("Deposito realizado com sucesso.");
                        else
                            System.out.println("Erro ao realizar o saque.");
                    }
                    break;
                case 5:
                    c = logar(sc);
                    if (c != null) {
                        System.out.print("Num conta destino: ");
                        int n = sc.nextInt();
                        System.out.print("Valor: ");
                        Float valor = sc.nextFloat();
                        Conta temp = buscaConta(n);
                        if (temp != null)
                            c.getConta().transferir(valor,temp);
                        else
                            System.out.println("Conta destino inexistente!");
                    }
                    break;
                case 6:
                    for (int i=0;i<Cliente.ct;i++) {
                        System.out.print(clientes[i].getConta().getNum()+" ");
                        System.out.print(clientes[i].getNome()+" ");
                        System.out.println(clientes[i].getConta().getSaldo());
                    }
                    break;
                case 7:
                    System.out.println("=== Clientes negativados ===");
                    for (int i=0;i<Cliente.ct;i++) {
                        if(clientes[i].getConta().ehNegativo()){
                            System.out.print(clientes[i].getConta().getNum()+" ");
                            System.out.print(clientes[i].getNome()+" ");
                            System.out.println(clientes[i].getConta().getSaldo());
                        }                        
                    }
                    break;
                case 8:
                    System.out.print("Idade 1: ");
                    int idade_1 = sc.nextInt();
                    System.out.print("Idade 2: ");
                    int idade_2 = sc.nextInt();
                    System.out.println("=== Clientes entre "+ idade_1 + " e "+idade_2+" anos ===");
                    for (int i=0;i<Cliente.ct;i++) {
                        if(clientes[i].getIdade() >= idade_1 && clientes[i].getIdade() <= idade_2){
                            System.out.print(clientes[i].getConta().getNum()+" ");
                            System.out.print(clientes[i].getNome()+" ");
                            System.out.println(clientes[i].getConta().getSaldo());
                        }                        
                    }
                    break;
                case 9:
                    Ponto p1 = new Ponto();
                    Ponto p2 = new Ponto(2, 2);
                    double dist = p2.distancia(p1);
                    System.out.println("Ponto 1:  "+p1.toString());
                    System.out.println("Ponto 2:  "+p2.toString());
                    System.out.println("Distancia entre os 2 pontos "+dist);
                    break;
                        
            }
        }
    }
}