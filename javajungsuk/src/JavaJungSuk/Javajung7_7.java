package JavaJungSuk;

//코드의 실행했을 때 호출되는 생성자의 순서와 실행결과
/*
//Child() → Child(int x) → Parent() → Parent(int x) → Object()의 순서로 진행이 된다.
Child클래스의 안에 int x = 3000;이었지만, 인스턴스변수 x는 1000이 되었다. 
그리고 Parent클래스의 int x = 100; 이지만, 인스턴스 변수에 200을 넣어줘서 변수 x는 200이 된다. 
getX()는 조상인 Parent클래스에 정의된 것이라서, getX()에서 x는 Parent클래스의 인스턴스변수 x를 의미한다. 
그래서 x=200이 출력이 된다.
*/


class Parent {
	int x = 100; 

	Parent() {
		this(200); //클래스 Parent의 객체 int x를 호출.
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
