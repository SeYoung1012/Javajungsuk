package JavaJungSuk;

public class Javajung5_6 {

	public static void main(String[] args) {
		//������ �����ڿ� ������ ������ 
		
		int [] coinUnit = { 500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " +money);
		
		for(int i = 0; i <= coinUnit.length; i++) {
			
		
			System.out.println(coinUnit[i]+"��:" +  money /coinUnit[i]);
			money = money % coinUnit[i];
			
		}
		
	}

}
