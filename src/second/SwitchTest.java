package second;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p119
		int grade;
		Scanner sc = new Scanner(System.in);		
		System.out.println("�г��� �Է��ϼ��� : ");
		grade=sc.nextInt();
		
		
		switch(grade) {
		case 1:
		System.out.println("1�г�");
		break;
		case 2:
		System.out.println("2�г�");
		break;
		case 3:
		System.out.println("3�г�");
		break;
		case 4:
		System.out.println("4�г�");
		break;
		case 5:
		System.out.println("5�г�");
		break;
		case 6:
		System.out.println("6�г�");
		break;
		default:
			System.out.println("1-6���ڸ� �Է��ϼ���");

		}
	}

}