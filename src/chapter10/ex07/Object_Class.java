package chapter10.ex07;

class A{
		//class A extends Object 		: 최상위 클래스는 object클래스를 상속 받습니다.
	Integer a;
	String b;
	Double c;
	Boolean d;
	
	Object e;
}

class B extends A{
	
	int a = 10;
	int b = 20;
	int c = 30;
	
	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}

public class Object_Class {
	public static void main(String[] args) {
	
		/*
		 object 클래스 :
		 	- java.lang.Object
		 	- java.lang:(패키지) Object:(이름)
		 	- java.lang 패키지의 모든 클래스는 import 없이 사용할 수 있다.
		 	- 모든 자바 클래스는 object 클래스의 자식이됩니다.
		 	- 자바의 모든 클래스는 object 클래스의 선언된 메소드를 상속받는다.
		 	- toString() : 객체 자체를 출력할때 객체의 "패키지 주소@메모리주소"			<=== 재정의해서 많이 사용(객체의 필드에 저장된 값을 출력)
		 	- equals() : 기본적으로 stack 메모리의 주소를 비교 <==>재정의해서 Heap의 값을 비교하도록 설정
		 */
		
		A a =new A();

		System.out.println(a);
		System.out.println(a.toString()); 		//object 클래스의 . tostring
		
		B b =new B();
		System.out.println(b);
		System.out.println(b.toString());

	}
}
