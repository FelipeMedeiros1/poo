package poo.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Data
@EqualsAndHashCode
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public void inscricaoCurso(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum cunteúdo!");
        }

    }

    public double calcularPontuacao() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularPontos).sum();

    }

}
