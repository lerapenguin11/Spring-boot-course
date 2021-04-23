package homework_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringStudents {
	static ApplicationContext context = new AnnotationConfigApplicationContext(
			DependenceLookUp.class, StudentsPrototype.class, 
			StudentsRequest.class, StudentsSingleton.class);
	
	public static void main(String[] args) {
		/* Ответ на вопрос чем отличается Dependency Injection от Dependency LookUp
		 * 
		 * Dependency Injection: зависимости передаются в объект извне. т.е. 
		 * тот кто создает объект, тот ему зависимости и предоставляет. 
		 * Dependency Lookup: зависимости объекту не передаются извне. 
		 * объект сам решает как и когда ему запросить зависимости
		 */
		DependenceLookUp dependenceLookUp = context.getBean(DependenceLookUp.class);
		System.out.println(dependenceLookUp.university("Иван"));
		/* Создание двух бинов: studentsPrototype1, studentsPrototype2 
		 * со scope("prototype")
		 */
		StudentsPrototype studentsPrototype1 = dependenceLookUp.createStudent();
		StudentsPrototype studentsPrototype2 = dependenceLookUp.createStudent();
		System.out.println("Являются ли эти два бина одинаковыми: " + 
		(studentsPrototype1==studentsPrototype2));
		System.out.println("studentsPrototype1: " + studentsPrototype1);
		System.out.println("studentsPrototype2: " + studentsPrototype2);
		/* Создание двух бинов: studentsSingleton1, studentsSingleton2 
		 * со scope("singleton")
		 */
		StudentsSingleton studentsSingleton1 = context.getBean(StudentsSingleton.class);
		StudentsSingleton studentsSingleton2 = context.getBean(StudentsSingleton.class);
		System.out.println("Являются ли эти два бина одинаковыми: " + 
				(studentsSingleton1==studentsSingleton2));
				System.out.println("studentsSingleton1: " + studentsSingleton1);
				System.out.println("studentsSingleton2: " + studentsSingleton2);
				/* Создание двух бинов: studentsRequest1, studentsRequest2 
				 * со @RequestScope
				 */
		StudentsRequest studentsRequest1 = context.getBean(StudentsRequest.class);
		StudentsRequest studentsRequest2 = context.getBean(StudentsRequest.class);
		System.out.println("Являются ли эти два бина одинаковыми: " + 
				(studentsRequest1==studentsRequest2));
				System.out.println("studentsRequest1: " + studentsRequest1);
				System.out.println("studentsRequest2: " + studentsRequest2);
		/* Ответ на вопрос почему по умолчанию scope singleton
		 * 
		 * Я думаю, scope по умолчанию singleton, потому что это наиболее подходящий тип,
		 * т.к. singleton bean создаётся в единственном экземпляре на весь контекст и 
		 * ссылка на этот экземпляр подсовывается каждому другому бину, 
		 * который просит эту зависимость
		 */
	}
}
