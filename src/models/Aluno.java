package models;

public class Aluno extends Pessoa{

    private static int nextId = 1; // Simula id auto incrementavel

    public Aluno(int id, String nome, String cpf, char sexo, Telefone telefone, Email email, Endereco endereco) {
        super(id, nome, cpf, sexo, telefone, email, endereco);
    }

    public static int getNextId() {
        return nextId;
    }

    public static void incrementNextId(){
        nextId++;
    }
}
