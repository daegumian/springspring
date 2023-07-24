package ex06.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	//batter1 주입해주세요
	
	@Autowired
	@Qualifier("battery") //빈 이름을 강제 연결
	private IBattery battery;
	
	private Car() {};
	
	

	public Car(IBattery battery) {
		this.battery = battery;
	}
	
	//getter
	public IBattery getBattery() {
		return battery;
	}
	
	
}
