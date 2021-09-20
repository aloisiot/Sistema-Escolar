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
        cursoAdministacao.addActionListener( event -> {
            JOptionPane.showMessageDialog(null,
                    String.format("Turma: %s\nProfessor: %s\nMensalidade: %s\n\nAlunos: \n%s",
                            t[0].getNomeTurma(),
                            t[0].getProfessor().getNome(),
                            t[0].getCurso().getMensalidade(),
                            t[0].alunosToString()
                    )
            );
        });

        cursoInformatica.setSize(100, 60);
        cursoInformatica.addActionListener( event -> {
            JOptionPane.showMessageDialog(null,
                    String.format("Turma: %s\nProfessor: %s\nMensalidade: %s\n\nAlunos: \n%s",
                            t[1].getNomeTurma(),
                            t[1].getProfessor().getNome(),
                            t[1].getCurso().getMensalidade(),
                            t[1].alunosToString()
                    )
            );
        });

        cursoIngles.setSize(100, 60);
        cursoIngles.addActionListener( event -> {
            JOptionPane.showMessageDialog(null,
                    String.format("Turma: %s\nProfessor: %s\nMensalidade: %s\n\nAlunos: \n%s",
                            t[2].getNomeTurma(),
                            t[2].getProfessor().getNome(),
                            t[2].getCurso().getMensalidade(),
                            t[2].alunosToString()
                    )
            );
        });

        add(cadastroAluno);
        add(cadastroProfessor);
        add(cursoAdministacao);
        add(cursoInformatica);
        add(cursoIngles);

    }
}
