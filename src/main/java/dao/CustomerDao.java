package dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import entity.Customer;

@Component
@Transactional(rollbackFor = Exception.class)
public class CustomerDao {
	@Autowired(required = true)
	private SessionFactory sessionFactory;
	
	public List<Customer> getCustomerssad(){
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println("session: " + session.isConnected());
		String hql = "from Customer";
		Query query = session.createNativeQuery("select * from Customer", Customer.class);
//		return  query.getResultList();
//		return session.get(Customer.class, 1);
		return session.createNativeQuery("select * from Customer", Customer.class).list();
	}
	
	

}
