package second;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p119
		int grade;
		Scanner sc = new Scanner(System.in);		
		System.out.println("학년을 입력하세요 : ");
		grade=sc.nextInt();
		
		
		switch(grade) {
		case 1:
		System.out.println("1학년");
		break;
		case 2:
		System.out.println("2학년");
		break;
		case 3:
		System.out.println("3학년");
		break;
		case 4:
		System.out.println("4학년");
		break;
		case 5:
		System.out.println("5학년");
		break;
		case 6:
		System.out.println("6학년");
		break;
		default:
			System.out.println("1-6숫자를 입력하세요");

		}
	}

}
