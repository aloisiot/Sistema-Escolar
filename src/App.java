import gui.Home;
import models.Turma;
import repositorys.AdministracaoVespertino;
import repositorys.InformaticaMatutino;
import repositorys.InglesNoturno;

import javax.swing.*;

public class App {

        public static AdministracaoVespertino administacao = new AdministracaoVespertino();
        public static InformaticaMatutino Informatica = new InformaticaMatutino();
        public static InglesNoturno Ingles = new InglesNoturno();

        public static Turma[] turmas = {administacao, Informatica, Ingles};

        public static void main(String[] args) {

        Home home = new Home(turmas);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(360, 220);
        home.setVisible(true);
    }
}
