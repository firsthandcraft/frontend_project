package second;

import java.util.Scanner;

public class El {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두개의 숫자를 입력하세요 : ");
		int a;
		int b;
		String c;
		
		Scanner sc = new Scanner(System.in);		

		System.out.println("숫자를 입력하세요 : ");
		a=sc.nextInt();
		System.out.println("숫자를 입력하세요 : ");
		b=sc.nextInt();
		
		System.out.println("부호를 입력하세요 : ");
		c=sc.next();

		//사칙연산 계산기 만들기
		if(c.equals("+")) {
			System.out.println(a+b);
		} else if(c.equals("-")) {
			System.out.println(a-b);			
		}  else if(c.equals("*")) {
			System.out.println(a*b);			
		}  else if(c.equals("/")) {
				System.out.println((float)a/b);			
			} 	
	}

}
