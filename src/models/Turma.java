package models;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nomeTurma;
    private Professor professor;
    private Curso curso;
    private List<Aluno> alunos = new ArrayList<>();

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void setNomeTurma() {
        this.nomeTurma = String.format("%s - %s", curso.getNome(), curso.getTurno());
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    // Retorna a lista de alunos ordenada pelo ID;
    public List<Aluno> getAlunos(){
        alunos.sort(Pessoa::compareTo);
        return alunos;
    }

    // Stringficando Lista de alunos
    public String alunosToString(){
        String result = "";
        this.alunos.sort(Pessoa::compareTo);

        for(int i = 0; i < this.alunos.size(); i++){
            result += String.format("%s - %s",
                    this.alunos.get(i).getId(),
                    this.alunos.get(i).getNome());
        }

        return result;
    }
}
