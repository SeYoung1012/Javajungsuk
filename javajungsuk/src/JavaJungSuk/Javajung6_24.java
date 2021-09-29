package JavaJungSuk;

public class Javajung6_24 {
	
	//value가 양수면 그대로 반환, 음수면 -value값을 반환하면 된다. 
	//if문으로 간결하게 풀수 있음.
	public static int abs(int value) {
		
		if(value >= 0) {
			return value;
		}else {
			return -value; 
		}

	}

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));

	}

}
