package step1;

import java.util.Scanner;

public class signInSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���(���̵�, ��ȭ��ȣ �̸� �ּ�), ��ü���, ����
				System.out.println("���� �����");
				
				Scanner sc =new Scanner(System.in);
				//���� �����
				
				boolean flag=true ;
				String i;
				String n;
				int j=0,k=0;
				

				
				while(flag) {
					System.out.println("���ϱ�");
					System.out.println("����");
					System.out.println("���ϱ�");
					System.out.println("������");
					System.out.println("����");
					
					i =sc.next();
					
					switch (i) {
						case "���ϱ�":
							System.out.println("���ڸ� �Է��ϼ��� : ");
							j=sc.nextInt();
							System.out.println("���ڸ� �Է��ϼ��� : ");
							k=sc.nextInt();
							System.out.println(j+k);
							break;
						 
						case "����":
							System.out.println("���ڸ� �Է��ϼ��� : ");
							j=sc.nextInt();
							System.out.println("���ڸ� �Է��ϼ��� : ");
							k=sc.nextInt();
							System.out.println(j-k);
							break;
						case "���ϱ�":
							System.out.println("���ڸ� �Է��ϼ��� : ");
							j=sc.nextInt();
							System.out.println("���ڸ� �Է��ϼ��� : ");
							k=sc.nextInt();
							System.out.println(j*k);
							break;
						case "������":
							System.out.println("���ڸ� �Է��ϼ��� : ");
							j=sc.nextInt();
							System.out.println("���ڸ� �Է��ϼ��� : ");
							k=sc.nextInt();
							System.out.println(j/k);
							break;
						case "����":
							flag=false;
							System.out.println("����");
						 break;
						 
						default:
							System.out.println("���� = ���ϱ�/����/���ϱ�/������/���� �߿���  �Է�");
					}//switch
					
					
					// ���̵� �̸� �ּ� ��ȭ��ȣ�� null���ΰ�� "����� ���ּ���" �ۼ��غ��� 
					
					
				}//while 
	}

}