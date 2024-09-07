package Model;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import Model.Bootcamp;
import java.util.Optional;

public class Aluno {

    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoFinalizados = new LinkedHashSet<>();


    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoFinalizados() {
        return conteudoFinalizados;
    }

    public void setConteudoFinalizados(Set<Conteudo> conteudoFinalizados) {
        this.conteudoFinalizados = conteudoFinalizados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.conteudoInscritos);
        hash = 29 * hash + Objects.hashCode(this.conteudoFinalizados);
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
        final Aluno other = (Aluno) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", conteudoInscritos=" + conteudoInscritos + ", conteudoFinalizados=" + conteudoFinalizados + '}';
    }

    
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoInscritos.addAll(bootcamp.getConteudoBootcamp());
        bootcamp.getAlunosInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudoFinalizados.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteudo");
        }
    }

    public double calcularTotalXP() {
        return this.conteudoFinalizados.stream()
                .mapToDouble(Conteudo::calcular_xp)
                .sum();
    }
    
    
}
