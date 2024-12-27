
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public Connection getConexao() {
        try {
            String host = "jdbc:sqlite:src/conexao/conexao.db";
            Connection con = DriverManager.getConnection(host);
            return con;
        } catch (Exception e) {
            System.out.println("Erro de conexão: " + e.getMessage());
            return null;
        }
    }
}
