package day08;

public class Methodoverloading {

	public void print(String str) {
		System.out.println(str);
	}

	public void print(int str) {
		System.out.println(str);
	}

	public void print(char str) {
		System.out.println(str);
	}

	public static void main(String ar[]) {

		Methodoverloading m=new Methodoverloading();
		
		m.print("³ª´Â");
		m.print(1);
		m.print((int)'a');
		
	}
}
