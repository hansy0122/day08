package day08;

public abstract class Phone {
	public String owner;
	
	// abstract method --> abstract Ű���带 ���� �����ϸ� Ư¡�� �����{}�� ���ٴ� ���̴�. ������ �ڽ�Ŭ�������� �˾Ƽ� �����ϱ������̴�.
	public abstract void telecom(String telecom);
	
	public Phone(String owner){
		this.owner=owner;
	
	}
	
	public void turnOn(){
		System.out.println("on");
	}
	public void turnOff(){
		System.out.println("off");
	}
	
}
