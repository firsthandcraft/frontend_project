package second;

import java.util.Scanner;

public class El {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ΰ��� ���ڸ� �Է��ϼ��� : ");
		int a;
		int b;
		String c;
		
		Scanner sc = new Scanner(System.in);		

		System.out.println("���ڸ� �Է��ϼ��� : ");
		a=sc.nextInt();
		System.out.println("���ڸ� �Է��ϼ��� : ");
		b=sc.nextInt();
		
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		c=sc.next();

		//��Ģ���� ���� �����
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