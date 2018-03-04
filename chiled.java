package day08;

public class chiled extends parents {

	chiled() {
		super();
	}

	
	public void print(String b) {
		
		chiled.super.print("ss");
		super.print(b);
		System.out.println(b + "바보입니다.");
	}

	public static void main(String ar[]) {
		chiled c = new chiled();
		c.print("나는");


	} // 객체 --> 참조라는 의미 

}
