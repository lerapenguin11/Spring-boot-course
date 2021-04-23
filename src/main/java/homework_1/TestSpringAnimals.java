package homework_1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestSpringAnimals {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                Config.class
        );
		ShelterAnimalsConstructor shelterAnimalsConstructor = 
				context.getBean("shelterAnimalsConstructor",ShelterAnimalsConstructor.class);
		
		System.out.println(shelterAnimalsConstructor.СhooseAnimal());
		
		context.close();
	}
}
