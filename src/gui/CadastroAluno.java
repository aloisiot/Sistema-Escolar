package gui;

import models.*;
import repositorys.AdministracaoVespertino;

import javax.swing.*;

/**
 * Tela para cadastro de novo Aluno
 */
public class CadastroAluno extends CadastroPessoa {

    private Aluno aluno;
    private Telefone telefoneAluno;
    private Email emailAl;
    private Endereco endereco = new Endereco();

    public CadastroAluno(Turma[] t){
        super("Cadastrar Aluno", t);

        super.botaoEnviar.addActionListener( event -> {

            // Recolhendo os dados inseridos
            String nomeAluno = nome.getText();
            String cpfAluno = cpf.getText();
            String numTelAluno = numTel.getText();
            String emailAluno = email.getText();
            TelefoneTipo telTipo = TelefoneTipo.WHATSAPP;
            char sexoAluno = 0;
            EmailTipo emailTipo = EmailTipo.PESSOAL;
            int cursoEscolhido = cursosOption.getSelectedIndex();

            // Define o sexo do aluno
            switch (sexoOptions.getSelectedIndex()){
                case 0: sexoAluno = 'M';
                break;

                case 1: sexoAluno = 'F';

            }

            // Define o tipo para o telefone
            switch (telefoneTipoOptions.getSelectedIndex()) {
                case 0: telTipo = TelefoneTipo.WHATSAPP;
                break;

                case 1: telTipo = TelefoneTipo.FIXO;
                break;

                case 2: telTipo = TelefoneTipo.CELULAR;
            }

            // Define o tipo para o email
            switch (emailTiposOptions.getSelectedIndex()){
                case 0: emailTipo = EmailTipo.PESSOAL;
                break;

                case 1: emailTipo = EmailTipo.PROFISSIONAL;
                break;

                case 2: emailTipo = EmailTipo.ACADEMICO;
            }

            // Apos preencher os dados pessoais do aluno é exibida uma janela para o cadastro do seu endereço
            CadastroEndereco cadastroEndereco = new CadastroEndereco(endereco);
            cadastroEndereco.setSize(360, 500);
            cadastroEndereco.setVisible(true);

            telefoneAluno = new Telefone(numTelAluno, telTipo);
            emailAl = new Email(emailAluno, emailTipo);
            aluno = new Aluno(Aluno.getNextId() ,nomeAluno, cpfAluno, sexoAluno, telefoneAluno, emailAl, endereco);

            // Incluindo o aluno no seu devido curso
            switch (cursosOption.getSelectedIndex()){
                case 0: t[0].addAluno(aluno);
                break;

                case 1: t[1].addAluno(aluno);
                break;

                case 2: t[2].addAluno(aluno);
            }

            // Imcrementa a contagem de alunos cadastrados;
            Aluno.incrementNextId();

            // Esconde a janela apos o cadastro ser concluido
            setVisible(false);

        });
    }

}
