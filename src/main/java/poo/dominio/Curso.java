package poo.dominio;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString(callSuper = true)
public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularPontos() {
        return PONTUACAO * cargaHoraria;
    }
}
