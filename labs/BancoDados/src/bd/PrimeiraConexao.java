
package bd;

import base.Conta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrimeiraConexao {
    
    public static void main(String a[]) {
        
        String url = "jdbc:postgresql://localhost:5432/DBPOO";
        String user = "postgres";
        String password = "abc123";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String query = "";
        Scanner sc = new Scanner(System.in);
        //Passo 01
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver OK");
        }catch (Exception e) {
            System.out.println("Erro Driver");
            return;
        }
        
        try {
            //Passo 2
            conn = DriverManager.getConnection(url,user,password);
            //Criando objeto para transações do Passo 3
            stmt = conn.createStatement();
            int op = 0;
            do {
                System.out.println("1 - Inserir conta");
                System.out.println("2 - Ver contas inseridas");
                System.out.print("OPÇÃO: ");
                op = sc.nextInt();
                sc.nextLine();
                switch (op) {
                    case 1:
                        System.out.print("- Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("- Num: ");
                        int num = sc.nextInt();
                        System.out.print("- Saldo: ");
                        double saldo = sc.nextDouble();
                        Conta c = new Conta(nome,num,saldo);
                        query = "insert into \"TabelaConta\" (num,nome,saldo) values "
                        + "("+c.num+",'"+c.usuario+"',"+c.saldo+")";
                        //Passo 3
                        int r = stmt.executeUpdate(query);
                        //Passo 4
                        System.out.println(" --> "+r);
                        break;
                    case 2:
                        query = "select * from \"TabelaConta\"";
                        //Passo 3
                        rs = stmt.executeQuery(query);
                        //Passo 4
                        while (rs.next()) {
                            System.out.println(rs.getString("num")
                                    + " - " + rs.getString("nome")
                                    + ": "+rs.getString("saldo"));
                        }
                }
            }while (op != 3);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            //Passo 5
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            }
            catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
    
}
