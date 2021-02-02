import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import dao.CustomerDao;
import dao.HistoryDao;
import services.TestService;

@SpringBootApplication(scanBasePackages = {"dao", "entity", "services", "config", "controllers"})
//@ComponentScan({ "dao","entity" })

@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
    DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class Main implements CommandLineRunner{
	@Autowired(required=true)
	TestService test;
	@Autowired(required = true)
	CustomerDao customerDao;
	@Autowired(required = true)
	HistoryDao historyDao;
	
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

    @Override
    public void run(String... args) throws Exception {
//    	System.out.println("123 " + test.find(1));
    	System.out.println("123 " + historyDao.findFrequen("2020-09-29", "2020-10-29"));
    }
    

}