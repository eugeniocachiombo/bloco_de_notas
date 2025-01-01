package conexao;

import classes.Nota;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conexao {

    public Connection getConexao() {
        try {
            String host = "jdbc:sqlite:" + getClass().getResource("/conexao/conexao.db");
            Connection con = DriverManager.getConnection(host);
            boolean tbl = this.criarTabela(con);
             if(tbl){
                System.out.println("Tabela criada");
                return con;
            }else{
                System.out.println("Erro ao criar tabela");
                return null;
             }
        } catch (Exception e) {
            System.out.println("Erro de conexão: " + e.getMessage());
            return null;
        }
    }

    public boolean criarTabela(Connection con) {
        try {
            String sql = "create table if not exists nota (\n"
                    + "    id Integer primary key AUTOINCREMENT,\n"
                    + "    titulo varchar,\n"
                    + "    descricao text,\n"
                    + "    criacao varchar default CURRENT_TIMESTAMP,\n"
                    + "    actualizacao varchar default CURRENT_TIMESTAMP\n"
                    + ");";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}
