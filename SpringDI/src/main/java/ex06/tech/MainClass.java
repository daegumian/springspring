package ex06.tech;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("homework-context.xml");
		
		Car car = ctx.getBean(Car.class);
		System.out.println(car.getBattery());
	}

}
