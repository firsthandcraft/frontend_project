package second;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//타입변환 
		//자동타입변환 promotion	
		int a =12,b=13;
		float c=0;
		c=(a+b)/2;
		//소수점이 발생한다. 
		System.out.println(c);
		
		//강제타입변환 casting - 거의 쓸일이 없다. 
		//실수에서 정수로 변환 할때
		float f =12.5f;
		//정수로 출력할때
		a=(int)f;
		System.out.println(a);
	}

}
