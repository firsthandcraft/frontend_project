package second;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//else if ��
		int jumsu;
		
		//Ű���带 console�� �Է��ϰ� �ϴ� �Լ�
		Scanner sc = new Scanner(System.in);
		//ctrl + shift + O
		
		System.out.println("������ �Է��ϼ��� : ");
		
		//������ �ڷ������� Ű���带 ���� ���� �޾ƿ��� ��
		jumsu=sc.nextInt();
		
		//ABCD...
		if(jumsu>=90) {
			System.out.println("A");
		} else if(jumsu>=80) {
			System.out.println("B");
		} else if(jumsu>=70) {
			System.out.println("C");
		} else if(jumsu>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		//Ű����� ���ڸ� �Է� �޾Ƽ� �������� ������� 
		
		//Ű����� ���ڸ� �Է� �޾Ƽ� ¦������ Ȧ������ 
		
		// Ű����κ��� 2���� ���ڸ� �Է¹޾Ƽ� �ִ밪�� �ּҰ��� ���
		
		
		int score = 85;
		char grade = (score >90) ? 'A' : ((score >80) ? 'B' :'C');
		System.out.println(score+grade);
	}

}