
package classes;

public class Nota {
    private int id;
    private String titulo;
    private String desc;
    private String criacao;
    private String actualizacao;

    public String getCriacao() {
        return criacao;
    }

    public void setCriacao(String criacao) {
        this.criacao = criacao;
    }

    public String getActualizacao() {
        return actualizacao;
    }

    public void setActualizacao(String actualizacao) {
        this.actualizacao = actualizacao;
    }

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
                    + " ---- " + this.getActualizacao();
    }
}
