package ex06.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Airplane {

	//batter2 주입해주세요
	@Autowired
	@Qualifier("bat2") //빈 이름을 강제 연결
	private IBattery battery;
	
	public Airplane() {};
	
	public IBattery getBattery() {
		return battery;
	}

	public void setBattery(IBattery battery) {
		this.battery = battery;
	}
	
	
}
