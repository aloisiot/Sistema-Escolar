package models;

public class Curso {

    private NomeCurso nome;
    private Turno turno;
    private Double mensalidade;

    public Curso(NomeCurso nome, Turno turno, Double mensalidade) {
        this.nome = nome;
        this.turno = turno;
        this.mensalidade = mensalidade;
    }

    public NomeCurso getNome() {
        return nome;
    }

    public void setNome(NomeCurso nome) {
        this.nome = nome;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
