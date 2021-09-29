package JavaJungSuk;

public class Javajung4_15 {

	public static void main(String[] args) {
		
		int number = 12321;
		int tmp = number;
		
		int result = 0; //변수 number를 거꾸로 변환해서 담을 변수
		
		// 나머지 연산자를 사용하면 쉽다. (나머지 연산자를 잘 활용하자)
		// 10 % 으로 나누면 tmp 1 -> 2->3 ->2-> 1로 나머지가 나오고 
		// 이걸 result에서 * 10을 하면 역순으로 값이 바뀌면서 회문수가 된다. 
		
		while(tmp != 0) {
			
			result = result * 10 + tmp % 10;
			tmp /= 10;
	
		}
		
		if(number == result) {
			System.out.println(number +"는 회문수입니다.");
		}else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
		

	}

}
