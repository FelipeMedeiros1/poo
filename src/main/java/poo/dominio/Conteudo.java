package poo.dominio;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public abstract class Conteudo {

    protected static final double PONTUACAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularPontos();

}
