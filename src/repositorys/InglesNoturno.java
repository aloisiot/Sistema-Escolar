package repositorys;

import models.*;

public class InglesNoturno extends Turma {

    private Curso curso = new Curso(NomeCurso.INGLES, Turno.NOTURNO, 299.99);

    public InglesNoturno(){
        super();
        setCurso(curso);
        setNomeTurma();
    }
}
