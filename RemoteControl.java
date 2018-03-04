package day08;

public interface RemoteControl {
	//java 1.7���� interface�� ��� , �߻�޼��常 �����Ҽ�����.
	public static final int MAX_VOLUME=10; //snake case 
	int MIN_VOLUME=0; // �ʴԵ� ����� interface ���� �ڵ������� public static final �� ����.
	
	//�������̽��� ������ �����ϸ� public ���� ��. 
	//�߻� �޼ҵ�             
	public void tunrOn();                       //public abstract�� �ڵ������� �� ( �����Ǿ� ����.)
	void trunOff();
	public abstract void setVolume(int Volume);
	
	
	
	//java1.8 ���� ����Ʈ �޼���
	//interface������ default �޼ҵ�� �������������ǹ�(packaged�� �ǹ̰� �ƴϴ�) �⺻������ ���ԵǾ��ִ� method��� �ǹ�.
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("���� ó���մϴ�");
		}else{
			System.out.println("�Ҹ� �� ó���մϴ�.");
		}	
	}
	
	//java 1.8 ���� static ���� �޼��� 
	static void changeBattery(){ // �Ϲ� static method ó�� �����θ����� ����ϸ� �ȴ�.
		System.out.println("�������� ��ȯ�մϴ�.");
		
	}
	
	
	
	
}
