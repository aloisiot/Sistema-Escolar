package gui;

import models.*;

import javax.swing.*;
import java.text.Normalizer;

public class CadastroProfessor extends CadastroPessoa {

    // Componentes para atributos expecificos do professor;
    protected final JLabel labelValorHora = new JLabel("Valor por hora");
    protected final JTextField valorHora = new JTextField(30);

    // Componentes para atributos expecificos do professor;
    protected final JLabel labelFormacao = new JLabel("Cursos:");
    protected final String[] formacoes = {"SUPERIOR", "POS_GRADUACAO", "ESPECIALIZACAO", "MESTRADO"};
    protected final JComboBox<String> formacoesOption = new JComboBox<String>(cursos);

    private Professor professor;
    private Telefone telefoneProfessor;
    private Email emailProf;
    private Endereco endereco = new Endereco();

    public CadastroProfessor(Turma[] t){
        super("Cadastrar Professor", t);

        add(new JLabel("                                                                                                  "));
        add(labelValorHora);
        add(valorHora);

        add(new JLabel("                                                                                                  "));
        add(labelFormacao);
        add(formacoesOption);

        // Reposicionando botao
        add(new JLabel("                                                                                                   "));
        add(botaoEnviar);

        super.botaoEnviar.addActionListener( event -> {

            String msgErro = "";

            try{

                // Recolhendo os dados inseridos
                String nomeProfessor = nome.getText();
                String numTelProfessor = numTel.getText();
                String emailProfessor = email.getText();
                TelefoneTipo telTipo = TelefoneTipo.WHATSAPP;
                char sexoProfessor = 0;
                EmailTipo emailTipo = EmailTipo.PESSOAL;
                int cursoMinistrado = cursosOption.getSelectedIndex();
                FormacaoAcademica formacaoAc = FormacaoAcademica.SUPERIOR;
                double valorPorHora;

                //Validação
                String cpfProfessor;
                if(cpf.getText().matches("[0-9]+"))
                    cpfProfessor = cpf.getText();
                else {
                    msgErro = "O CPF deve conter apenas NUMEROS e um total de 11 digitos!";
                    throw new Throwable();
                }

                if(valorHora.getText().matches("[0-9]+.[0-9]+"))
                    valorPorHora = Double.valueOf(valorHora.getText());
                else {
                    msgErro = "Insira apenas numeros e o separador PONTO no campo valor hora";
                    throw new Throwable();
                }

                // Define o sexo do aluno
                switch (sexoOptions.getSelectedIndex()){
                    case 0: sexoProfessor = 'M';
                        break;

                    case 1: sexoProfessor = 'F';

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

                // Define a formação academica
                switch (formacoesOption.getSelectedIndex()){
                    case 0: formacaoAc = FormacaoAcademica.SUPERIOR;
                        break;

                    case 1: formacaoAc = FormacaoAcademica.POS_GRADUACAO;
                        break;

                    case 2: formacaoAc = FormacaoAcademica.ESPECIALIZACAO;
                        break;

                    case 3: formacaoAc = FormacaoAcademica.MESTRADO;

                }



                // Validação;
                telefoneProfessor = new Telefone(numTelProfessor, telTipo);
                if(!Telefone.validate(telefoneProfessor)) {
                    msgErro = "O telefone deve conter apenas numeros e, no maximo, 12 digitos!";
                    throw new Throwable();
                }

                // Validação;
                emailProf = new Email(emailProfessor, emailTipo);
                if(!Email.validate(emailProf)) {
                    msgErro = "Preencha o email corretamente!";
                    throw new Throwable();
                }

                // Apos preencher os dados pessoais do aluno é exibida uma janela para o cadastro do seu endereço
                CadastroEndereco cadastroEndereco = new CadastroEndereco(endereco);
                cadastroEndereco.setSize(360, 500);
                cadastroEndereco.setVisible(true);

                professor = new Professor(Professor.getNextId() ,nomeProfessor, cpfProfessor, sexoProfessor, telefoneProfessor, emailProf, endereco, valorPorHora, formacaoAc);

                // Incluindo o professor no seu devido curso
                switch (cursosOption.getSelectedIndex()){
                    case 0: t[0].setProfessor(professor);
                        break;

                    case 1: t[1].setProfessor(professor);
                        break;

                    case 2: t[2].setProfessor(professor);
                }

                // Imcrementa a contagem de professores cadastrados;
                Professor.incrementNextId();

                // Esconde a janela apos o cadastro ser concluido
                setVisible(false);


            } catch (Throwable err) {
                JOptionPane.showMessageDialog(null, "Revise o formunário. Algo não ocorreu como o esperado\n\n" + msgErro);
            }

        });
    }
}
