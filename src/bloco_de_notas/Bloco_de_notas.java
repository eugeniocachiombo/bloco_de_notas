package bloco_de_notas;

import classes.Nota;
import dao.NotaDao;
import java.util.ArrayList;

public class Bloco_de_notas {
    
    public static void main(String[] args) {
        NotaDao notaDao = new NotaDao();
        ArrayList<Nota> lista = notaDao.listar();
        
        Nota nota = new Nota();
        nota.setId(lista.size() + 1);
        nota.setTitulo("Minha Angola");
        nota.setDesc("Angola é um país grande e belo");
        notaDao.adicionar(nota);   
        
        Nota nota2 = new Nota();
        nota2.setId(lista.size() + 1);
        nota2.setTitulo("Minha Angola II");
        nota2.setDesc("Angola é um país grande e belo II");
        notaDao.adicionar(nota2);
        
        Nota nota3 = new Nota();
        nota3.setId(1);
        nota3.setTitulo("Minha Angola Update");
        nota3.setDesc("Conteúdo modificado...");
        notaDao.actualizar(nota3);
        
        notaDao.eliminar(2);
        
        for (Nota info : lista) {
            System.out.println(info.getId());
        }
    }
    
}
