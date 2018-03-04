package day08;

public class Driver {
	void drive(Vehicle vehicle){
		vehicle.run();
		
		// 다운 캐스팅
		if(vehicle instanceof Bus){
		Bus bus = (Bus) vehicle; 
		bus.run();
		}
		//instanceof는 런타임시에 객체가 우변에 있는 클래스의 인스턴스가 맞는지 확인한다.
		else if(vehicle instanceof Taxi){
			Taxi taxi=(Taxi) vehicle;
			taxi.run();
			}
		//업 캐스팅
		//Vehicle v=(Vehicle) Bus
	}
}
