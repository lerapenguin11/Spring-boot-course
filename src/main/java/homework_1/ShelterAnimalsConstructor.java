package homework_1;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class ShelterAnimalsConstructor {
	private Logger logger = Logger.getLogger(ShelterAnimalsConstructor.class.getName());
	private Animals animal1;
	private Animals animal2;
	@Autowired
	 public ShelterAnimalsConstructor(@Qualifier("cats") Animals animal1,
			 @Qualifier("dogs") Animals animal2) {
		 this.animal1 = animal1;
		 this.animal2 = animal2;
	 }
	 
	 public String СhooseAnimal() {
	        return "Выбраны: " + animal1.getNameAnimal() + ", " + animal2.getNameAnimal();
	 }
	 
	 @PostConstruct
	 public void created() {
		 logger.info("Создан бин - приют для животных");
	 }
	 
	 @PreDestroy
	 public void destroy() {
		 logger.info("Разрушен бин - приют для животных");
	 }
}
