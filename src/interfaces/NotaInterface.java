
package interfaces;

import classes.Nota;
import java.lang.reflect.Array;
import java.util.ArrayList;


public interface NotaInterface {
    public abstract boolean adicionar(Nota nota);
    public abstract boolean actualizar(Nota nota);
    public abstract boolean eliminar(int id);
    public abstract ArrayList<Nota> listar();
}
