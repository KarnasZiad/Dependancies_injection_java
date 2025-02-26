package presentation;

import dao.IDao;
import metier.MetierImpl;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class presentationV2 {
    public static void main(String[] args) {
        try {
            // Charger la configuration
            Properties properties = new Properties();
            properties.load(new FileInputStream("dep/src/main/resources/config.properties"));

            // Charger dynamiquement la classe DAO
            String daoClass = properties.getProperty("dao.class");
            IDao dao = (IDao) Class.forName(daoClass).newInstance();

            // Injection dynamique
            MetierImpl metier = new MetierImpl();
            metier.setDao(dao);

            System.out.println("Résultat V2 : " + metier.calcul());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
