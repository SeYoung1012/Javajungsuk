package JavaJungSuk;

public class Javajung5_8 {

	public static void main(String[] args) {

		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int u = 0; u < answer.length; u++) {
			//counter �迭 �ȿ� answer �迭�� ����ش�. 
			//�� ��, �ε����� 0���� �����̾ -1�� ����� �Ѵ�. 
			counter[answer[u] - 1]++; 
		}
		
		//counter�� ���̸� i������ ����ϰ� counter[i] ����ŭ *�� ����ָ� �ȴ�. 
		//for�� ������ �����ѵ� �迭�̶�� ���� �����ϸ� �������� ����� �ʴ�. 
		for (int i = 0; i < counter.length; i++) {

			System.out.println(counter[i]);
			
			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();		
		}

	}

}
