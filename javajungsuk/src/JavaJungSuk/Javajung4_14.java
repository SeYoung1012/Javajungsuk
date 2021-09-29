package JavaJungSuk;

import java.util.Random;
import java.util.Scanner;

public class Javajung4_14 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		//Math.random을 쓸때에는 int를 써주지 않으면 실수값까지 나오기 때문에 형변환 처리를 한다. 
		//그리고 100까지만 쓰면 (0부터 시작) 99까지 나오기 때문에 +1을 꼭 해준다. 
		
		int answer =  (int) (Math.random() * 100 + 1);
		int input = 0;
		int count = 0;

		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요. :");
			input = scn.nextInt();

			if (input < answer) {
				System.out.println("더 큰 수를 입력하세요. ");
			} else if (input > answer) {
				System.out.println("더 작은 수를 입력하세요 ");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("정답 : " + input + " 랜덤값 :" + answer + "시도 횟수 :" + count);

			}

		} while (true);

	}

}
