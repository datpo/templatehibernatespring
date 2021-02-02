package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dao.HistoryDao;
import entity.FrequenUseApp;
import entity.RequestHistoryOfUser;
import services.TestService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SignHistoryController {
	
	@Autowired
	TestService testService;
	@Autowired
	HistoryDao historyDao;

	@GetMapping("/getinfo")
	public List<FrequenUseApp> get(){
		return historyDao.findFrequen();
	}
	
	@PostMapping("/historyofuser")
	public List<FrequenUseApp> post(@RequestBody RequestHistoryOfUser requestHistoryOfUser){
		
		return historyDao.findFrequen(requestHistoryOfUser.getStartDate(), requestHistoryOfUser.getEndDate());
	}
	
}
