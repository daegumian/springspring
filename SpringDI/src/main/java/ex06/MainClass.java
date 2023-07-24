package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//의존객체 자동주입 확인
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("autowired-context.xml");
		
		
		Airplane air = ctx.getBean(Airplane.class);
		air.getBattery().energy();
		
		
		Car car = ctx.getBean(Car.class);
		car.getBattery().energy();
		
		
	}
}
