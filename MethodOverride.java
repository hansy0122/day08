package day08;

import java.util.Map;

class MehtodOverrid_sub{
	public void print(String str){
		System.out.println(str);
	}
}

public class MethodOverride extends MehtodOverrid_sub{

	public void print(String i){
		//super.print(i);
		// ���ڷ����� ����
		System.out.println("���");
	}
	
	class MehtodOverrid_sub{
		public void print(String str){
			System.out.println(str);
		}
	}

	
	
	public static void main(String ar[]){
		MethodOverride m=new MethodOverride();
		m.print("ll");
		
		//MehtodOverrid_sub parent = (MehtodOverrid_sub) m;
		//.parent.print("1");
		
		
		//MethodOverride.MehtodOverrid_sub
		//MethodOverride
	//	m.super.print("ss");
		
	}
	
	
}
