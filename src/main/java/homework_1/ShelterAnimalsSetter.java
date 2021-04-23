package homework_1;

import org.springframework.beans.factory.annotation.Autowired;

public class ShelterAnimalsSetter {
	private Cats cats;
	private Dogs dogs;
	
	@Autowired
	public void setCats(Cats cats) {
		this.cats = cats;
	}
	
	@Autowired
	public void setDogs(Dogs dogs) {
		this.dogs = dogs;
	}
}
