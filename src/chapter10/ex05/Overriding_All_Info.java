package chapter10.ex05;

class C{	// 부모 클래스
	
	//필드 : 오버라이딩 되지 않는다. 자식과 완전히 별개이다.
	
	int m = 3;
	static int n = 30;
	
	//인스턴스 필드 : 오버라이딩 된다.
	void print() {
		System.out.println("C");
	}
	
	//정적 필드 : 오버라이딩 되지 않는다. 부모 자식은 별개로 작동
	static void print3() {
		System.out.println("C");
	}
}


class D extends C{//자식 클래스
	
	//필드 : 오버라이딩 되지 않는다.
	int m = 4;
	static int n = 40;
	
	void print() {
		System.out.println("D");
	}
	//정적 필드 : 오버라이딩 되지 않는다. 부모 자식은 별개로 작동
	static void print3() {
		System.out.println("D");
	}
}

public class Overriding_All_Info {

	public static void main(String[] args) {

		//
		C c1 = new D();
		System.out.println(c1.m); 		// 3
		System.out.println(c1.n);		// 30
		c1.print();						//D 		<<===오버라이딩 되어서 자식의 메소드가 출력
		c1.print3();					//C
		
		System.out.println("======================");
		//다운 캐스팅
		D d1 = (D)c1;
		System.out.println(d1.m);		//4
		System.out.println(d1.n);		//40
		d1.print();						//D
		d1.print3();					//D
		
	}

}
