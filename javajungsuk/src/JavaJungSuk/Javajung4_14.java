package JavaJungSuk;

import java.util.Random;
import java.util.Scanner;

public class Javajung4_14 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		//Math.random�� �������� int�� ������ ������ �Ǽ������� ������ ������ ����ȯ ó���� �Ѵ�. 
		//�׸��� 100������ ���� (0���� ����) 99���� ������ ������ +1�� �� ���ش�. 
		
		int answer =  (int) (Math.random() * 100 + 1);
		int input = 0;
		int count = 0;

		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ���. :");
			input = scn.nextInt();

			if (input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���. ");
			} else if (input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ��� ");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("���� : " + input + " ������ :" + answer + "�õ� Ƚ�� :" + count);

			}

		} while (true);

	}

}
