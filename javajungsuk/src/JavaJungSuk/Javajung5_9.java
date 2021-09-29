package JavaJungSuk;

public class Javajung5_9 {

	public static void main(String[] args) {

		char[][] star = { { '*', '*', ' ', ' ', ' ' }, 
							{ '*', '*', ' ', ' ', ' ' }, 
							{ '*', '*', '*', '*', '*' },
							{ '*', '*', '*', '*', '*' } };
		char[][] result = new char[star[0].length][star.length];
		
		//2차원 배열의 방향을 회전시켜서 생각해보자.
		//행의 배열을 star.length 길이고, 열의 배열은 stat[i].length로 구하기
		
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		//'i+y = star.length-1'이니까, 'y = star.length-1-i'
		
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {

				int x = j;

				int y = star.length - 1 - i;

				result[x][y] = star[i][j];

			}

		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

	}

}
