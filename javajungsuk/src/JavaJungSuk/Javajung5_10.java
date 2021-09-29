package JavaJungSuk;

public class Javajung5_10 {

	public static void main(String[] args) {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		// abcCode���� ���� 'a'�����ؼ� ���� 'z'������ ��ȣ�ڵ尡 ������� �����
		//�� �ֱ� ������ ���� 'a'�� ��ȣ�ڵ�� abcCode[0]�̰�, ���� 'c'�� ��ȣ�ڵ�� 
		//abcCode[2]�̴�
		//����ҹ��� ch�� ��ȣ�ڵ�� abcCode[ch-'a']�� ǥ��
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		
		String src = "abc123";
		String result = "";
		// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);

			if ('a' <= ch && ch <= 'z') {
				
				// 'a' <= ch && ch <='z'�� true�� �Ǿ� result+= abcCode[ch-'a'];�� ����ȴ�.
				
				result += abcCode[ch - 'a'];
			} else if ('0' <= ch && ch <= '9') {
				result += numCode[ch - '0'];
			}
			
		}

		System.out.println("src:" + src);
		System.out.println("result:" + result);

	}

}
