package JavaJungSuk;

public class Javajung5_3 {

	public static void main(String[] args) {
		
		int [] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		//Ǯ� �� Ǯ��
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		int d = arr[3];
		int e = arr[4];
		
		//sum = a+b+c+d+e;
		
		//�������� �迭�� ���̸� ��ŭ �̾Ƽ� ���ϱ�.
		for(int i = 0; i <arr.length; i ++) {
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);

	}

}
