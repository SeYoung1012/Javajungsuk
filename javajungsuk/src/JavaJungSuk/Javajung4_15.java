package JavaJungSuk;

public class Javajung4_15 {

	public static void main(String[] args) {
		
		int number = 12321;
		int tmp = number;
		
		int result = 0; //���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		// ������ �����ڸ� ����ϸ� ����. (������ �����ڸ� �� Ȱ������)
		// 10 % ���� ������ tmp 1 -> 2->3 ->2-> 1�� �������� ������ 
		// �̰� result���� * 10�� �ϸ� �������� ���� �ٲ�鼭 ȸ������ �ȴ�. 
		
		while(tmp != 0) {
			
			result = result * 10 + tmp % 10;
			tmp /= 10;
	
		}
		
		if(number == result) {
			System.out.println(number +"�� ȸ�����Դϴ�.");
		}else {
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
		}
		

	}

}
