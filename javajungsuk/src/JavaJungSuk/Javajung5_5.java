package JavaJungSuk;

public class Javajung5_5 {

	public static void main(String[] args) {
		
		int [] ballArr = {1,2,3,4,5,6,7,8,9};
		int [] ball3 = new int[3];
		
		//배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다. 20번 반복
		
		
		for(int x = 0; x <20; x++) {
			int i = (int)(Math.random() * ballArr.length); //0~8 까지
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
		
			//변수 tmp로 i번째 요소와 j번째 요소를 값을 서로 바꾸는 코드가 들어가야 한다.
			// tmp를 이용해서 배열의 i번째 요소(ballArr[i])와 j번째 요소(ballArr[j])
			//의 값을 서로 바꾸는 코드가 들어가야 한다.
			//배열의 크기인 ballArr.length값이 9이므로 변수 i와 j에 0~8 사이의
			///임의의 값이 저장된다. 
			
			//처음에 배열된 값을 tmp에 저장한다. tmp에는 ballArr인덱스값들이 뒤섞인다. 
			tmp = ballArr[i]; 
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		
			
			
		}
		
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다. 
		//배열 복사는 System.arraycopy
		//baLLArr[0]에서 세개의 값을 ball3[0]으로 3개의 값을 복사. 
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		
		for(int i = 0; i <ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		
		
		

	}

}
