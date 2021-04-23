package homework_2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@RequestScope
public class StudentsRequest {
	private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
