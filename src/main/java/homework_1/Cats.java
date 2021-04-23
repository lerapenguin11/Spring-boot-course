package homework_1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Cats implements Animals{
	private List<String> nameCats = new ArrayList<>();
	private Logger logger = Logger.getLogger(Cats.class.getName());
	
	{
		nameCats.add("Барсик");
		nameCats.add("Рыжик");
		nameCats.add("Пушок");
	}
	
	 @Override
	    public List<String> getNameAnimal() {
	        return nameCats;
	    }
	 
	 @PostConstruct
	 public void created() {
		 logger.info("Создан бин - кошка");
	 }
	 
	 @PreDestroy
	 public void destroy() {
		 logger.info("Разрушен бин - кошка");
	 }
}
