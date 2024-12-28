
package classes;

public class Nota {
    private int id;
    private String titulo;
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public String toString(){
        return " º " + this.getTitulo()
                  //  + " ... Desc: " + this.getDesc()
                    + " <---> Data: 20-12-2024";
    }
}
