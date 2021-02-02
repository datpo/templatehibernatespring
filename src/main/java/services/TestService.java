package services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dao.HistoryDao;
import entity.SignHistory;

@Component
@Transactional
public class TestService {

	@Autowired(required=true)
	HistoryDao historyDao;
	
	public List<SignHistory> find(int id) {
		return historyDao.findById(id);
	}	
}
