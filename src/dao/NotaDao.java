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
    ArrayList<Nota> listaNotas = new ArrayList<>();

    public NotaDao() {
        conexao = new Conexao();
        con = conexao.getConexao();
    }

    @Override
    public void adicionar(Nota nota) {
      //  throw new UnsupportedOperationException("Not supported yet.");

        listaNotas.add(nota);
    }

    @Override
    public void actualizar(Nota nota) {
        //throw new UnsupportedOperationException("Not supported yet.");
        listaNotas.set(nota.getId(), nota);
    }

    @Override
    public void eliminar(int id) {
        // throw new UnsupportedOperationException("Not supported yet."); 
        listaNotas.remove(id - 1);
    }

    @Override
    public ArrayList<Nota> listar() {
        try {
            String sql = "select * from nota";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
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
}
