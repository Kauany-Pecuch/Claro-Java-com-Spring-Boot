package Model;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Aluno> alunosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoBootcamp = new LinkedHashSet<>();

    public Bootcamp() {
    }

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public Set<Conteudo> getConteudoBootcamp() {
        return conteudoBootcamp;
    }

    public void setConteudoBootcamp(Set<Conteudo> conteudoBootcamp) {
        this.conteudoBootcamp = conteudoBootcamp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.descricao);
        hash = 17 * hash + Objects.hashCode(this.dataInicial);
        hash = 17 * hash + Objects.hashCode(this.dataFinal);
        hash = 17 * hash + Objects.hashCode(this.alunosInscritos);
        hash = 17 * hash + Objects.hashCode(this.conteudoBootcamp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bootcamp other = (Bootcamp) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataInicial, other.dataInicial)) {
            return false;
        }
        if (!Objects.equals(this.dataFinal, other.dataFinal)) {
            return false;
        }
        if (!Objects.equals(this.alunosInscritos, other.alunosInscritos)) {
            return false;
        }
        return Objects.equals(this.conteudoBootcamp, other.conteudoBootcamp);
    }

    @Override
    public String toString() {
        return "Bootcamp{" + "nome=" + nome + ", descricao=" + descricao + ", dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", alunosInscritos=" + alunosInscritos + ", conteudoBootcamp=" + conteudoBootcamp + '}';
    }

}
