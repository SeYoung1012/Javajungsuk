package JavaJungSuk;

public class Javajung5_4 {

	public static void main(String[] args) {

		int[][] arr = {

				{ 5, 5, 5, 5, 5 }, 
				{ 10, 10, 10, 10, 10 },
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}

		};
		
		int total = 0;
		float average = 0;
		
		//�켱 2�� �迭�̴ϱ� ��ø ������ �Ἥ 2�� �迭�� 
		//total ���� �ִ´�. 
		//�� �� j�������� arr[i]�� �־��־�� �Ѵ�!(��������)
		
		
		
		for(int i = 0; i < arr.length; i++) {
			for( int j = 0; j <arr[i].length; j++) {
				
				total += arr[i][j];
				
			}
			

		}
		//average���� ���ϱ� ���ؼ� ��Ż���� �켱 ������� �ϴµ� 
		//�迭�� ù��° �ε��� ���̿� ��ü���̸� ���ϰ� 
		//int arr �迭�� float�� ����ȯ ����� �Ҽ��� �ڸ����� ���� ��µȴ�. 
		average = total/ (float)(arr.length * arr[0].length);
		
		System.out.println("total=" + total);
		System.out.println("average =" + average);

	}

}
