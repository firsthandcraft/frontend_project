package second;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int i;
		Scanner sc = new Scanner(System.in);
		i=sc.nextInt();
		
		
		//Ű����� ���ڸ� �Է� �޾Ƽ� �������� ������� 
		if(i<0) {
			System.out.println("����");
		} else  if(i>0){
			System.out.println("���");
		} else {
			System.out.println("0");
		}


		
		
	}

}