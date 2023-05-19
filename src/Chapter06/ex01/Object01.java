package Chapter06.ex01;

import java.util.Scanner;

//여기가 클래스 외부 블락(에 올 수 있는게 3가지): 1.패키지, 2.임포트(같은 패키지에 존재하지 않는 클래스는 import 해서 사용해야 한다.), 3.외부 클래스

public class Object01 {
	//여기는 클래스 내부 블락(에 올 수 있는게 3가지가 있다.):1.필드, 2. 메소드(함수), 3.생성자: 클래스 이름과 동일한 메소드(리턴타입이 없는)
	
	
	public Object01() {} //<===★생성자 :필드의 값을 초기화 시에 사용됨, 객체를 생성시 생성자를 호출한다.
			//기본 생성자 : 필드에서 생략될 수 있다.
	
	int a = 100; //<====필드 : 객체화를 해서 사용 가능	
	//클래스 내에서 선언된 클래스를 필드라고 하며 객체화를 해야 사용이 가능하다.
	int b =200;
	
	//메소드(함수를 메소드라고 한다.):호출시 작동됨		
	public void plus(int a, int b) {//접근 제어자 리턴타입 메소드명(인풋 매개변수, 인풋 매개변수) {	
		System.out.println(a + b);		//	실행블락;
	}										//}
	

	
	public static void main(String[] args) {
		//main method 블락	
		
		int a=10;			//지역변수(메소드 내부에서 선언된 변수)
					//메소드 안에서 선언이 된 변수를 지역 변수라고 한다.
		Scanner sc = new Scanner(System.in);
		
		
		//1.객체생성 : class를 틀로해서 메모리에 올라가는 인스턴스를 객체생성이라고 한다.
		//클래스(<==이거 쉽게 이야기를 하면 붕어빵틀 혹은 건축 설계도)<====>//클래스를 틀로해서 만들어진 것을 객체(오브젝트)라고 한다.
		
		Object01 oc1 = new Object01();
		// 클래스명 객체 =heap 영역에 객체 생성 생성자 호출;
		//  타입	 변수
		//앞에 오는 것은 클래스명
		//뒤에 오는 oc1이 객체
		//new가 메모리의 Heap 영역에 객체 생성
		//뒤에 오는 것이 생성자 호출;
		
		//2.객체의 필드의 값출력
			System.out.println(oc1.a); 		//객체의 a필드의 저장된 값을 출력
			System.out.println(oc1.b); 		//객체의 b필드의 저장된 값을 출력
		
		//3.객체의 메소드 호출
		oc1.plus(10, 20); 
		
		System.out.println("========================================================================");
		//class는 객체화를 해야 사용할 수 있다.
		//클래스는 붕어빵(객체)을 찍어내기 위한 하나의 붕어빵틀이며 "프로그램"<=====> 객체(인스턴스)는 붕어빵 틀을 기반으로 메모리에 로드된 붕어빵을 말한다.(하드디스크 안에 잠들어 있는 프로그램-프로세스)
		//하나의 객체(클래스)를 가지고 여러개의 객체를 생성할 수 있다.
		
		//두번째 객체 생성
		Object01 oc2 = new Object01();
		//클래스명(type) 객체(타입변수) = 힙영역에 저장   생성자 호출()기본생성자 호출
		
		//객체의 필드 값 수정 및 출력
		oc2.a = 500; 		//oc2 객체의 a 필드에 값을 500; 값을 할당
		oc2.b = 700; 		//oc2객체의 b 필드의 값을 700; 값을 할당
		
		System.out.println(oc2.a); 		//500
		System.out.println(oc2.b);		//700
		
		//메소드 호출
		oc2.plus(oc2.a, oc2.b);			//500+700=1200
		
	
	}

}
