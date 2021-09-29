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
		
		//우선 2차 배열이니까 중첩 포문을 써서 2차 배열을 
		//total 값에 넣는다. 
		//이 때 j포문에는 arr[i]를 넣어주어야 한다!(잊지말자)
		
		
		
		for(int i = 0; i < arr.length; i++) {
			for( int j = 0; j <arr[i].length; j++) {
				
				total += arr[i][j];
				
			}
			

		}
		//average값을 구하기 위해선 토탈값을 우선 나누어야 하는데 
		//배열의 첫번째 인덱스 길이와 전체길이를 곱하고 
		//int arr 배열을 float로 형변환 해줘야 소수점 자리까지 값이 출력된다. 
		average = total/ (float)(arr.length * arr[0].length);
		
		System.out.println("total=" + total);
		System.out.println("average =" + average);

	}

}
