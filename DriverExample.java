package day08;

public class DriverExample {
	public static void main(String ar[]){
		Driver driver=new Driver();
		Bus bus =new Bus();
		Taxi taxi=new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}

// �޼ҵ�� �޼ҵ� ������ �̸� �ö�. 
// new() ~~ �� �����Ҵ�. 
