package day08;

public abstract class Phone {
	public String owner;
	
	// abstract method --> abstract 키워드를 통해 생서하며 특징은 내용부{}가 없다는 것이다. 이유는 자식클래스에서 알아서 구현하기위함이다.
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
