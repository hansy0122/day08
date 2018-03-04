package day08;

public interface RemoteControl {
	//java 1.7기준 interface는 상수 , 추상메서드만 포함할수있음.
	public static final int MAX_VOLUME=10; //snake case 
	int MIN_VOLUME=0; // 너님도 상수임 interface 에는 자동적으로 public static final 를 포함.
	
	//인터페이스는 무조건 생략하면 public 으로 들어감. 
	//추상 메소드             
	public void tunrOn();                       //public abstract가 자동적으로 들어감 ( 생략되어 있음.)
	void trunOff();
	public abstract void setVolume(int Volume);
	
	
	
	//java1.8 기준 디폴트 메서드
	//interface에서의 default 메소드는 접근제한자적의미(packaged의 의미가 아니다) 기본적으로 포함되어있는 method라는 의미.
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음 처리합니다");
		}else{
			System.out.println("소리 켬 처리합니다.");
		}	
	}
	
	//java 1.8 기준 static 정적 메서드 
	static void changeBattery(){ // 일반 static method 처럼 절대경로명으로 사용하면 된다.
		System.out.println("건전지를 교환합니다.");
		
	}
	
	
	
	
}
