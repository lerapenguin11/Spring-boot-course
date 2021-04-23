package homework_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Cats nameCats() {
		return new Cats();
	}
	
	@Bean
	public Dogs nameDogs() {
		return new Dogs();
	}
	
	 @Bean
	    public ShelterAnimalsConstructor shelterAnimalsConstructor() {
	        return new ShelterAnimalsConstructor(nameCats(), nameDogs());
	 }
}
