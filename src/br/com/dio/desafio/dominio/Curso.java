package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
/*
 * Implementação do método de calcularXp, aplicado
 * para a classe dev na classe Main
 */
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


    public Curso() { //Construtor vazio
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
