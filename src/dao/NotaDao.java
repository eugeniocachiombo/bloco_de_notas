
package dao;

import classes.Nota;
import interfaces.NotaInterface;
import java.util.ArrayList;


public class NotaDao implements NotaInterface{
    
    ArrayList<Nota> listaNotas = new ArrayList<>();

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
        //throw new UnsupportedOperationException("Not supported yet."); 
        return listaNotas;
    }
}
