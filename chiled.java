package day08;

public class chiled extends parents {

	chiled() {
		super();
	}

	
	public void print(String b) {
		
		chiled.super.print("ss");
		super.print(b);
		System.out.println(b + "�ٺ��Դϴ�.");
	}

	public static void main(String ar[]) {
		chiled c = new chiled();
		c.print("����");


	} // ��ü --> ������� �ǹ� 

}
