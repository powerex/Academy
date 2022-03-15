package dao;

import model.Trip;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateSessionFactoryUtil;

public class TripDao {
    public Trip findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Trip.class, id);
    }

    public void save(Trip user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }
}
