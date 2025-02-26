package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class presentationV1 {
    public static void main(String[] args) {
        // Instanciation statique
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao); // Injection statique

        System.out.println("Résultat V1 : " + metier.calcul());
    }
}
