package repositorys;

import models.*;

public class InformaticaMatutino extends Turma {

    private Curso curso = new Curso(NomeCurso.INFORMATICA, Turno.MATUTINO, 398.00);

    public InformaticaMatutino(){
        super();
        setCurso(curso);
        setNomeTurma();
    }
}
