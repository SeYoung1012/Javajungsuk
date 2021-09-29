package JavaJungSuk;

public class Javajung6_20 {

	public static int[] shuffle (int [] arr) {
		
		//if������ �Ű������� � ���� �Ѿ���� �� Ȯ���� �� �ؾ���. 
		if(arr == null || arr.length ==0) {
			return arr;
			
		}
		//for������ �ݺ������� �迭�� ������ ��Ҹ� �ٲ۴�. �ݺ�Ƚ���� 
		//�ʹ� ������ �ȵǹǷ� �׳� ���ϱ� 2�� �ߴ�. 
		
		for(int b = 0; b <arr.length*2; b++) {
			// �ݺ������� ���� arr.leng���� ������ i�� j�� ������ ��. 
			//�迭 index ���� ������ ������ �� ���� ��´�. 
			int i = (int)(Math.random() *arr.length);
			int j = (int)(Math.random() *arr.length);
			
			//tmp�� ������ ���� i�� j�� ���� arr�迭�� �ִ´�. 
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			
			
		}
		
		
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		

	}

}
