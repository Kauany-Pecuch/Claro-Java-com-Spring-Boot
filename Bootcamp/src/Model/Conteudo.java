
package Model;

public abstract class Conteudo {

    protected final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public abstract double calcular_xp(); 

    @Override
    public String toString() {
        return  "XP= " + XP_PADRAO + ", Titulo= " + titulo + ", Descrição=" + descricao + '}';
    }
    
    
}


