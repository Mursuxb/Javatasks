package Week7_3.Dao;

import jakarta.persistence.EntityManager;
import Week7_3.Model.*;
import Week7_3.Datasource.MariaDbJpaConnection;


public class CurrencyDao {

    public void persist(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }

    public Currency find(String abbreviation) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        return em.find(Currency.class, abbreviation);
    }

    public void update(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.merge(currency);
        em.getTransaction().commit();
    }

    public void delete(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.remove(currency);
        em.getTransaction().commit();
    }

    public Currency[] findAllCurrencies() {
        EntityManager em = MariaDbJpaConnection.getInstance();
        return em.createQuery("FROM Currency ", Currency.class).getResultList().toArray(new Currency[0]);
    }

    public String[] findAllAbbreviations() {
        EntityManager em = MariaDbJpaConnection.getInstance();
        return em.createQuery("SELECT abbreviation FROM Currency ", String.class).getResultList().toArray(new String[0]);
    }
}
