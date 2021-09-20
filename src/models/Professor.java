package models;

public class Professor extends Pessoa{

    private static int nextId = 1; // Simula id auto incrementavel
    private Double valorHora;
    private FormacaoAcademica formacaoAcademica;

    public Professor(int id, String nome, String cpf, char sexo, Telefone telefone, Email email, Endereco endereco, Double valorHora, FormacaoAcademica formacaoAcademica) {
        super(id, nome, cpf, sexo, telefone, email, endereco);
        this.valorHora = valorHora;
        this.formacaoAcademica = formacaoAcademica;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public FormacaoAcademica getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void incrementNextId(){
        nextId++;
    }
}
