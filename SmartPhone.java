package day08;

public class SmartPhone extends Phone{
	
		public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

			public void internetSearch(){
				System.out.println("인터넷을 검색합니다");
			}
		public static void main(String ar[]){
			SmartPhone smartphone=new SmartPhone("박보검");
			smartphone.turnOn();
			smartphone.internetSearch();
			smartphone.turnOff();
			smartphone.telecom("LG U+");
			// 추상클래스의 특징으로 new 생성자를 바로 호출할수e없다는 점이 있다.
			//Phone phone =new Phone("한승엽");
			//아래와 같이 다형성을 사용하여 자식클래스의 인스턴스로 호출가능하다.
			//Phone phone=smartphone;
		}

		@Override
		public void telecom(String telecom) {
			// TODO Auto-generated method stub
			System.out.println("telecom="+telecom);
		}

}
