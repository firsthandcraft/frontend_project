package second;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증가 감소 연산자 p78
		
		int i =5, j;
		//++ 1씩 증가
		j=i++;
		// ++i 로 해야 나온다. i++ 하면 안됨
		System.out.println("j="+j);//5
		
		// 후에 ++i 를 만들면 ++ 5 =7
		j=++i;
		System.out.println("j="+j);//7
		
		
		// 감소연산자
		//기존값그대로 
		j=i--;
		System.out.println("j="+j);//7
		//감소됨
		j=--i;
		System.out.println("j="+j);//5
	}

}
