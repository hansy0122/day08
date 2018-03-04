package day08;

public class ÇÑ½Â¿± extends ³²ÀÚ {

	@Override
	public void ±º´ë() {
		// TODO Auto-generated method stub
		System.out.println("°øÀÍ");
	}
	
	public static void main(String ar[]){
		ÇÑ½Â¿± ÇÑ½Â¿±=new ÇÑ½Â¿±();
		ÇÑ½Â¿±.±º´ë();// ¿©±â¼­ ±¸Ã¼È­
		ÇÑ½Â¿±.½Ä»ç();// À§¿¡¼­ ±¸Ã¼È­
		ÇÑ½Â¿±.Àá();//¿©±â¼­ ±¸Ã¼È­
	}

	@Override
	public void Àá() {
		// TODO Auto-generated method stub
		System.out.println("¾È Àá");
	}

}
