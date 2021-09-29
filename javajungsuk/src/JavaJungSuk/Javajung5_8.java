package JavaJungSuk;

public class Javajung5_8 {

	public static void main(String[] args) {

		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int u = 0; u < answer.length; u++) {
			//counter 배열 안에 answer 배열을 담아준다. 
			//이 때, 인덱스는 0부터 시작이어서 -1을 해줘야 한다. 
			counter[answer[u] - 1]++; 
		}
		
		//counter의 길이를 i값으로 출력하고 counter[i] 값만큼 *을 찍어주면 된다. 
		//for문 별찍기와 유사한데 배열이라는 점만 생각하면 생각보다 어렵지 않다. 
		for (int i = 0; i < counter.length; i++) {

			System.out.println(counter[i]);
			
			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();		
		}

	}

}
