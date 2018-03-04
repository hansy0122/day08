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

// 메소드는 메소드 영역에 미리 올라감. 
// new() ~~ 는 동적할당. 
