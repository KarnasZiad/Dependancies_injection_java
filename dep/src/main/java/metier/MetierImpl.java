package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Couplage faible

    // Injection via le setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData() * 2; // Exemple de calcul
    }
}
