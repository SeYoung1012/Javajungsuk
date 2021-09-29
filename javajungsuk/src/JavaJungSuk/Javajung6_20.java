package JavaJungSuk;

public class Javajung6_20 {

	public static int[] shuffle (int [] arr) {
		
		//if문으로 매개변수로 어떤 값이 넘어오는 지 확인을 꼭 해야함. 
		if(arr == null || arr.length ==0) {
			return arr;
			
		}
		//for문으로 반복적으로 배열의 임의의 요소를 바꾼다. 반복횟수는 
		//너무 많으면 안되므로 그냥 곱하기 2로 했다. 
		
		for(int b = 0; b <arr.length*2; b++) {
			// 반복문으로 만들어낸 arr.leng값을 변수를 i와 j에 만들어야 함. 
			//배열 index 범위 내에서 임의의 두 값을 얻는다. 
			int i = (int)(Math.random() *arr.length);
			int j = (int)(Math.random() *arr.length);
			
			//tmp를 변수를 만들어서 i와 j에 섞인 arr배열을 넣는다. 
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
