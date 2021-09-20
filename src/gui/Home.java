package gui;

import models.Turma;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame  {

    private final JButton cadastroAluno = new JButton("Cadastrar Novo Aluno");
    private final JButton cadastroProfessor = new JButton("Cadastrar Novo Professor");
    private final JButton cursoAdministacao = new JButton("Ver Curso de Administração");
    private final JButton cursoInformatica = new JButton("Ver Curso de Informatica");
    private final JButton cursoIngles = new JButton("Ver Curso de Ingles");

    public Home(Turma[] t){
        super("Home");
        setLayout(new FlowLayout());
        setResizable(false);

        cadastroAluno.setSize(380, 100);
        cadastroAluno.addActionListener( event -> {
            CadastroAluno cadastroAluno = new CadastroAluno(t);
            cadastroAluno.setSize(360, 520);
            cadastroAluno.setVisible(true);
        });

        cadastroProfessor.setSize(380, 60);
        cadastroProfessor.addActionListener( event -> {
            CadastroProfessor cadastroProfessor = new CadastroProfessor(t);
            cadastroProfessor.setSize(360, 630);
            cadastroProfessor.setVisible(true);
        });

        cursoAdministacao.setSize(100, 60);
        cursoAdministacao.addActionListener( event -> showInfoCurso(t, 0) );

        cursoInformatica.setSize(100, 60);
        cursoInformatica.addActionListener( event -> showInfoCurso(t, 1));

        cursoIngles.setSize(100, 60);
        cursoIngles.addActionListener( event -> showInfoCurso(t, 2));

        add(cadastroAluno);
        add(cadastroProfessor);
        add(cursoAdministacao);
        add(cursoInformatica);
        add(cursoIngles);

    }

    // Exibe as informações do curso em um modal
    private static void showInfoCurso(Turma[] t, int indiceturma) {

        String alunos = t[indiceturma].alunosToString();

        if(alunos == "") {
            alunos = "Ainda não há alunos cadastrados nesse curso";
        }

        try{
            JOptionPane.showMessageDialog(null,
                    String.format("Turma: %s\nProfessor: %s\nMensalidade: %s\n\nAlunos: \n%s",
                            t[indiceturma].getNomeTurma(),
                            t[indiceturma].getProfessor().getNome(),
                            t[indiceturma].getCurso().getMensalidade(),
                            alunos
                    )
            );
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Ops!! parece que os dados nao foram preenchidos corretamente.\nMas não se preoculpe, ja estamos trabalhando no tratamento desse tipo de exções!!");
        }

    }
}
