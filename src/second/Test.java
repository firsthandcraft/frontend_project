package second;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요 : ");
		int i;
		Scanner sc = new Scanner(System.in);
		i=sc.nextInt();
		
		
		//키보드로 숫자를 입력 받아서 음수인지 양수인지 
		if(i<0) {
			System.out.println("음수");
		} else  if(i>0){
			System.out.println("양수");
		} else {
			System.out.println("0");
		}


		
		
	}

}
