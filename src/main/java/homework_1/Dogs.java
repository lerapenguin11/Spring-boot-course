package homework_1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Dogs implements Animals{
private List<String> nameDogs = new ArrayList<>();
private Logger logger = Logger.getLogger(Dogs.class.getName());

	{
		nameDogs.add("Шарик");
		nameDogs.add("Тузик");
		nameDogs.add("Бим");
	}
	
	 @Override
	    public List<String> getNameAnimal() {
	        return nameDogs;
	    }
	 
	 @PostConstruct
	 public void created() {
		 logger.info("Создан бин - собака");
	 }
	 
	 @PreDestroy
	 public void destroy() {
		 logger.info("Разрушен бин - собака");
	 }
}
