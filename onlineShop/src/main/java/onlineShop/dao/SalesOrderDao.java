package onlineShop.dao;


import onlineShop.entity.SalesOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SalesOrderDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addSalesOrder(SalesOrder salesOrder) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(salesOrder);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}