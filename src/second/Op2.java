package second;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ������ p78
		
		int i =5, j;
		//++ 1�� ����
		j=i++;
		// ++i �� �ؾ� ���´�. i++ �ϸ� �ȵ�
		System.out.println("j="+j);//5
		
		// �Ŀ� ++i �� ����� ++ 5 =7
		j=++i;
		System.out.println("j="+j);//7
		
		
		// ���ҿ�����
		//�������״�� 
		j=i--;
		System.out.println("j="+j);//7
		//���ҵ�
		j=--i;
		System.out.println("j="+j);//5
	}

}