package day08;

public class SmartPhone extends Phone{
	
		public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

			public void internetSearch(){
				System.out.println("���ͳ��� �˻��մϴ�");
			}
		public static void main(String ar[]){
			SmartPhone smartphone=new SmartPhone("�ں���");
			smartphone.turnOn();
			smartphone.internetSearch();
			smartphone.turnOff();
			smartphone.telecom("LG U+");
			// �߻�Ŭ������ Ư¡���� new �����ڸ� �ٷ� ȣ���Ҽ�e���ٴ� ���� �ִ�.
			//Phone phone =new Phone("�ѽ¿�");
			//�Ʒ��� ���� �������� ����Ͽ� �ڽ�Ŭ������ �ν��Ͻ��� ȣ�Ⱑ���ϴ�.
			//Phone phone=smartphone;
		}

		@Override
		public void telecom(String telecom) {
			// TODO Auto-generated method stub
			System.out.println("telecom="+telecom);
		}

}
