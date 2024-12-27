
package interfaces;

import classes.Nota;
import java.lang.reflect.Array;
import java.util.ArrayList;


public interface NotaInterface {
    public abstract void adicionar(Nota nota);
    public abstract void actualizar(Nota nota);
    public abstract void eliminar(int id);
    public abstract ArrayList<Nota> listar();
}
