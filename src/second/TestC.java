package second;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두개의 숫자를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		int j=sc.nextInt();
		
		int max, min;//최대값, 최소값을 저장할 변수 선언

		// 키보드로부터 2개의 숫자를 입력받아서 최대값과 최소값을 출력	
		if(i>j) {
			max = i;
			min = j;
			System.out.println("최대값 : "+i);
			System.out.println("최소값 : "+j );

		} else  if(i==j){
			System.out.println("똑같다");
		} else {
			max = j;
			min = i;
			System.out.println("최대값 : "+j );
			System.out.println("최소값 : "+i );

		}
		
	
	}

}
