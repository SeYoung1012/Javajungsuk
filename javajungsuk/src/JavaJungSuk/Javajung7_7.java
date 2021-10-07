package JavaJungSuk;

//�ڵ��� �������� �� ȣ��Ǵ� �������� ������ ������
/*
//Child() �� Child(int x) �� Parent() �� Parent(int x) �� Object()�� ������ ������ �ȴ�.
ChildŬ������ �ȿ� int x = 3000;�̾�����, �ν��Ͻ����� x�� 1000�� �Ǿ���. 
�׸��� ParentŬ������ int x = 100; ������, �ν��Ͻ� ������ 200�� �־��༭ ���� x�� 200�� �ȴ�. 
getX()�� ������ ParentŬ������ ���ǵ� ���̶�, getX()���� x�� ParentŬ������ �ν��Ͻ����� x�� �ǹ��Ѵ�. 
�׷��� x=200�� ����� �ȴ�.
*/


class Parent {
	int x = 100; 

	Parent() {
		this(200); //Ŭ���� Parent�� ��ü int x�� ȣ��.
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
	}

	Child(int x) {
		this.x = x;
	}
}

public class Javajung7_7 {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println("x=" + c.getX());
	}

}
