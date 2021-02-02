package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import entity.FrequenUseApp;
import entity.SignHistory;
//@Repository(value = "customerDAO")
@Component
@Transactional(rollbackFor = Exception.class)
public class HistoryDao {
	
  @Autowired(required=true)
  private SessionFactory sessionFactory;
  
  
 
  public List<SignHistory> findById(final int id) {
    Session session = this.sessionFactory.getCurrentSession();
    String hql = "from SignHistory s group by s.ungdung, date(s.time)";
    Query query = session.createQuery(hql);
    return query.getResultList();
  }
  
  public List<FrequenUseApp> findFrequen() {
	  Session session = this.sessionFactory.getCurrentSession();
	  String hql = "select new entity.FrequenUseApp(count(h.ungdung), h.khachhang,date(h.time)) from SignHistory h group by h.ungdung, date(h.time)";
	  Query query = session.createQuery(hql);
	  return  query.getResultList();
  }
  public List<FrequenUseApp> findFrequen(String startDate, String endDate) {
	  Session session = this.sessionFactory.getCurrentSession();
	  String hql = "select new entity.FrequenUseApp(count(h.ungdung), h.khachhang,date(h.time)) from SignHistory h where date(h.time) between :startDate and :endDate"
	  		+ " group by h.ungdung, date(h.time)";
	  SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd",
              Locale.ENGLISH);  
	  Date sta =null;
	  Date end =null;
	try {
		sta = formatter1.parse(startDate);
		end = formatter1.parse(endDate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	  System.out.println("sta and end: " + sta + end);
	  Query query = session.createQuery(hql);
	 
	  query.setParameter("startDate", sta);
	  query.setParameter("endDate", end);
	  return  query.getResultList();
  }
  
}