package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        return Math.random() * 100; // Simule une valeur de données
    }
}

