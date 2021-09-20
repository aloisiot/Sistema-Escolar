package models;

public abstract class Pessoa implements Comparable{

    private int id;
    private String nome,
            cpf;
    private char sexo;
    private Telefone telefone;
    private Email email;
    private Endereco endereco;

    public Pessoa(int id, String nome, String cpf, char sexo, Telefone telefone, Email email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    // // Compara, com base no id, se dois Objetos de Classes que extendam Pessoa são iguais
    public boolean equals(Pessoa p){
        return this.getId() == p.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Compara, com base no id, dois Objetos de Classes que extendam Pessoa
    @Override
    public int compareTo(Object o) {

        Pessoa p = (Pessoa) o;
        return this.getId() - p.getId();
    }
}
