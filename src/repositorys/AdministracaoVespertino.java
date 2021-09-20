package repositorys;

import models.*;

public class AdministracaoVespertino extends Turma {

    private Curso curso = new Curso(NomeCurso.ADMINISTRACAO, Turno.NOTURNO, 299.99);

    public AdministracaoVespertino(){
        super();
        setCurso(curso);
        setNomeTurma();
    }
}
