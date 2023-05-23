package chapter10.ex07;

class Apple{
	String name;	//이름
	int price;		//가격
	int count;		// 개수

	Apple(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
}

class Banana{
	String name;	//이름
	int price;		//가격
	int count;		// 개수
	
	Banana(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
}

class Strawberry{
	String name;	//이름
	int price;		//가격
	int count;		// 개수
	
	Strawberry(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
}

public class Ex01 {
	
	//배열의 객체를 매개변수로 받아서 총 가격을 출력
	void totalPrice(Object[] obj) {
		
	}
	
	public static void main(String[] args) {
		/*
		 모든 클래스는 Object의 자식 클래스이다.
		 모든 클래스는 object의 타입으로 업캐스팅이 가능하다.
		 */
		
		/* 생성자를 통해서 각 객체의 값을 할당
		"사과" 2000 5
		"바나나" 4000 10
		"딸기" 5000 30
		
		
		*/
		
		//모든 객체를 Object 배열 안에 넣는다.
		
		Object[]obj = new Object[] {};
	
	}

}
