package day08;

public class Driver {
	void drive(Vehicle vehicle){
		vehicle.run();
		
		// �ٿ� ĳ����
		if(vehicle instanceof Bus){
		Bus bus = (Bus) vehicle; 
		bus.run();
		}
		//instanceof�� ��Ÿ�ӽÿ� ��ü�� �캯�� �ִ� Ŭ������ �ν��Ͻ��� �´��� Ȯ���Ѵ�.
		else if(vehicle instanceof Taxi){
			Taxi taxi=(Taxi) vehicle;
			taxi.run();
			}
		//�� ĳ����
		//Vehicle v=(Vehicle) Bus
	}
}
