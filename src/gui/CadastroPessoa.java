package gui;

import models.Turma;

import javax.swing.*;
import javax.swing.plaf.InternalFrameUI;
import java.awt.*;

public class CadastroPessoa extends JFrame {

    protected final JLabel nomeLabel = new JLabel("Nome: ");
    protected final JTextField nome = new JTextField(30);

    protected final JLabel cpfLabel = new JLabel("CPF");
    protected final JTextField cpf = new JTextField(30);

    protected final JLabel sexoLabel = new JLabel("Sexo: ");
    protected final String[] sexo = {"MASCULINO", "FEMININO"};
    protected final JComboBox<String> sexoOptions = new JComboBox<String>(sexo);


    protected final JLabel labelTelefone = new JLabel("Telefone:");
    protected final String[] telefoneTipos = {"WHATSAPP", "FIXO", "CELULAR"};
    protected final JComboBox<String> telefoneTipoOptions = new JComboBox<String>(telefoneTipos);
    protected final JTextField numTel = new JTextField(30);

    protected final JLabel labelEmail = new JLabel("Email:");
    protected final String[] emailTipos = {"PESSOAL", "PROFISSIONAL", "ACADEMICO"};
    protected final JComboBox<String> emailTiposOptions = new JComboBox<String>(emailTipos);
    protected final JTextField email = new JTextField(30);

    protected final JLabel labelCurso = new JLabel("Cursos:");
    protected final String[] cursos = {"ADMINISTRAÇÃO: tarde", "INFORMATICA: manha", "INGLES: noite"};
    protected final JComboBox<String> cursosOption = new JComboBox<String>(cursos);

    protected final JButton botaoEnviar = new JButton("Enviar");


    public CadastroPessoa(String titulo, Turma[] t){
        super(titulo);
        setLayout(new FlowLayout());
        setResizable(false);

        add(nomeLabel);
        add(nome);

        add(new JLabel("                                                                                                  "));
        add(cpfLabel);
        add(cpf);

        add(new JLabel("                                                                                                  "));
        add(sexoLabel);
        add(sexoOptions);

        add(new JLabel("                                                                                                  "));
        add(labelTelefone);
        add(telefoneTipoOptions);
        add(numTel);

        add(new JLabel("                                                                                                   "));
        add(labelEmail);
        add(emailTiposOptions);
        add(email);

        add(new JLabel("                                                                                                   "));
        add(labelCurso);
        add(cursosOption);

        add(new JLabel("                                                                                                   "));
        add(botaoEnviar);

    }
}
