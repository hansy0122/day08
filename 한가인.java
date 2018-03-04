package day08;

public class 한가인 extends 여자{

	@Override
	public void 출산() {
		// TODO Auto-generated method stub
		System.out.println("아이 한명 출산");
	}

		public static void main(String ar[]){
			한가인 한가인=new 한가인();
			한가인.식사(); // 위에서 이미 구체화
			한가인.출산(); // 여기서 구체화
			한가인.잠(); // 여기서 구체화
		}

		@Override
		public void 잠() {
			// TODO Auto-generated method stub
			System.out.println("계속 잠");
		}
}
