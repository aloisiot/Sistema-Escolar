package gui;

import models.Endereco;

import javax.swing.*;
import java.awt.*;

public class CadastroEndereco extends JFrame {

    private final JLabel logradouroLabel = new JLabel("Logradouro: ");
    private final JTextField logradouro = new JTextField(30);

    private final JLabel numeroLabel = new JLabel("Número: ");
    private final JTextField numero = new JTextField(30);

    private final JLabel bairroLabel = new JLabel("Bairro: ");
    private final JTextField bairro = new JTextField(30);

    private final JLabel cidadeLabel = new JLabel("Cidade: ");
    private final JTextField cidade = new JTextField(30);

    private final JLabel estadoLabel = new JLabel("Estado: ");
    private final JTextField estado = new JTextField(30);

    private final JLabel complementoLabel = new JLabel("Complemento: ");
    private final JTextField complemento = new JTextField(30);

    private final JButton botaoEnviar = new JButton("Enviar");

    // Recebe um endereco como parametro para que
    CadastroEndereco(Endereco endereco){

        super("Cadastrar endereço");
        setLayout(new FlowLayout());
        setResizable(false);

        add(logradouroLabel);
        add(logradouro);

        add(new JLabel("                                                                                                  "));
        add(numeroLabel);
        add(numero);

        add(new JLabel("                                                                                                  "));
        add(bairroLabel);
        add(bairro);

        add(new JLabel("                                                                                                  "));
        add(cidadeLabel);
        add(cidade);

        add(new JLabel("                                                                                                  "));
        add(estadoLabel);
        add(estado);

        add(new JLabel("                                                                                                  "));
        add(complementoLabel);
        add(complemento);

        add(new JLabel("                                                                                                   "));
        add(botaoEnviar);

        botaoEnviar.addActionListener( event ->{
                endereco.setNumero(Integer.valueOf(numero.getText()));
                endereco.setLogradouro(logradouro.getText());
                endereco.setBairro(bairro.getText());
                endereco.setCidade(cidade.getText());
                endereco.setComplemento(complemento.getText());

                // Esconde a janela apos o cadastro ser concluido
                setVisible(false);
        });

    }


}
