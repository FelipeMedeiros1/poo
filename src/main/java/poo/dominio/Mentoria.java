package poo.dominio;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
@ToString(callSuper = true)
@Data
public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularPontos() {
        return PONTUACAO + 20d;
    }
}
