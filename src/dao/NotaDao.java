package dao;

import classes.Nota;
import conexao.Conexao;
import interfaces.NotaInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class NotaDao implements NotaInterface {

    public Connection con;
    public Conexao conexao;

    public NotaDao() {
        conexao = new Conexao();
        con = conexao.getConexao();
    }

    @Override
    public boolean adicionar(Nota nota) {
        try {
            String sql = "insert into nota (titulo, descricao) values(?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nota.getTitulo());
            stmt.setString(2, nota.getDesc());
            stmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean actualizar(Nota nota) {
        try {
            String sql = "UPDATE nota SET titulo=?, descricao=? WHERE id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nota.getTitulo());
            stmt.setString(2, nota.getDesc());
            stmt.setInt(3, nota.getId());
            stmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {
        try {
            String sql = "delete from nota where id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList<Nota> listar() {
        try {
            String sql = "select * from nota";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Nota> listaNotas = new ArrayList<>();

            while (rs.next()) {
                Nota nota = new Nota();
                nota.setId(rs.getInt("id"));
                nota.setTitulo(rs.getString("titulo"));
                nota.setDesc(rs.getString("descricao"));
                listaNotas.add(nota);
            }
            return listaNotas;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }

    public Nota listarPorId(int id) {
        try {
            String sql = "select * from nota where id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Nota nota = new Nota();
            rs.next();
            nota.setId(rs.getInt("id"));
            nota.setTitulo(rs.getString("titulo"));
            nota.setDesc(rs.getString("descricao"));
            con.close();
            return nota;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}
