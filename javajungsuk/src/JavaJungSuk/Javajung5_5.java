package JavaJungSuk;

public class Javajung5_5 {

	public static void main(String[] args) {
		
		int [] ballArr = {1,2,3,4,5,6,7,8,9};
		int [] ball3 = new int[3];
		
		//�迭 ballArr�� ������ ��� 2���� ��� ��ġ�� �ٲ۴�. 20�� �ݺ�
		
		
		for(int x = 0; x <20; x++) {
			int i = (int)(Math.random() * ballArr.length); //0~8 ����
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
		
			//���� tmp�� i��° ��ҿ� j��° ��Ҹ� ���� ���� �ٲٴ� �ڵ尡 ���� �Ѵ�.
			// tmp�� �̿��ؼ� �迭�� i��° ���(ballArr[i])�� j��° ���(ballArr[j])
			//�� ���� ���� �ٲٴ� �ڵ尡 ���� �Ѵ�.
			//�迭�� ũ���� ballArr.length���� 9�̹Ƿ� ���� i�� j�� 0~8 ������
			///������ ���� ����ȴ�. 
			
			//ó���� �迭�� ���� tmp�� �����Ѵ�. tmp���� ballArr�ε��������� �ڼ��δ�. 
			tmp = ballArr[i]; 
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		
			
			
		}
		
		//�迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�. 
		//�迭 ����� System.arraycopy
		//baLLArr[0]���� ������ ���� ball3[0]���� 3���� ���� ����. 
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		
		for(int i = 0; i <ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		
		
		

	}

}
