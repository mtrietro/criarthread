package Principal;

import Model.Trabalhador;

public class Principal {

    public static void main(String args[]) {
        Trabalhador severino = new Trabalhador("sapato", 100);
        Trabalhador raimundo = new Trabalhador("bota", 500);
        Trabalhador geraldo = new Trabalhador("tenis", 100);
        geraldo.start();
        severino.start();
        raimundo.start();
    }
}
