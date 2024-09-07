package Model;

import java.time.LocalDate;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(int cargaHoraria, String titulo, String descricao) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcular_xp() {

        double xPmentoria = XP_PADRAO * cargaHoraria;
        return xPmentoria;
    }

    @Override
    public String toString() {
        return  "Titulo= '" + getTitulo() + '\''
                + ", Descrição= '" + getDescricao() + '\''
                + ", Carga Horaria= " + cargaHoraria
                + '}';

    }
}
