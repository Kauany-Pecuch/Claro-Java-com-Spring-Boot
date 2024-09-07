package Model;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria(LocalDate data, String titulo, String descricao) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcular_xp() {

        double xP_mentoria = XP_PADRAO + 20d;
        return xP_mentoria;
    }

    @Override
    public String toString() {
        return "Titulo= '" + getTitulo() + '\''
                + ", Descrição= '" + getDescricao() + '\''
                + ", Carga Horaria= " + data
                + '}';

    }
}
