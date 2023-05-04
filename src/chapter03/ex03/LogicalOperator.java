package chapter03.ex03;

public class LogicalOperator {
	public static void main(String[] args) {
	
		/*
		 논리 연산자 : 논리연산한 결과를 true, false    <==if, 에서 조건으로 처리됨
		 	&&(AND)   
		 	||(OR)
		 	^ (XOR)  : 앞뒤가 같을때 false를 리턴, 앞뒤가 다를때 true를 리턴
		 	! (NOT)
		 */
		
		
		//&& : AND 연산 <==논리 연산자가 연산한 결과값은 true나 false가 리턴이 된다.
		
		System.out.println(true && true); 		//true
		System.out.println(true && false); 		//false
		System.out.println(false && true); 		//false
		System.out.println(false && false); 	//false
				
		System.out.println("===================================");
		
		// || : OR 연산  :  둘중 하나라도 true면 true
		
		System.out.println(true || true); 		//true
		System.out.println(true ||false);  		//true
		System.out.println(false||true); 		//true
		System.out.println(false||false); 		//false
		
		System.out.println("==================================");
		
		// ^ (XOR) : 앞뒤의 값이 같을때 false (0), 앞뒤의 값이 다를때 true (1)
		System.out.println(true ^ true);		//false
		System.out.println(true ^ false);	  	//true
		System.out.println(false ^ true);		//true
		System.out.println(false ^false);		//false
		
		System.out.println("=================================");
		
		// !(NOT) : !true ==>false, !false ==>true
		System.out.println(!true);		//false
		System.out.println(!false);		//true
	
		System.out.println("=================================================");
		
		// 쇼트 서킷이 발생 될 수 있다.
			// -- 논리연산에서 앞의 값으로 결과 값을 유추 할 수 있는 경우 뒤의 내용을 무시해서 처리하지 않는다.
		
		// && 연산에서 false가 오면 뒤에는 어떤값이 와도 false가 나온다.
	
		System.out.println(true && true); 		//쇼트 서킷이 발생 되지 않는다.
		System.out.println(false && true); 		//쇼트 서킷이 발생 된다. 앞의 값이 false이면 뒤의 값은 확인 안해도 무조건 false
		System.out.println("===================================");
		
		// 예제 : AND 연산에서 쇼트 서킷이 발생되는 예제
		int val1 = 3;
		System.out.println(false && ++val1 > 6); 		//false 뒤에 값은 확인 안함 : &&
		
		System.out.println(val1); 	//3		<==쇼트 서킷 발생으로 3이 출력됨
		

		// ||: OR 연산에서  앞의 값이 true이면 쇼트 서킷이 발생됨
		System.out.println(true ||false);  		//쇼트 서킷이 발생됨
		System.out.println(false || true); 		//쇼트 서킷이 발생되지 않는다.
	
		// 쇼트 서킷을 방지하기 위한 방안 : 비트연산자를 사용한다. &,	| 		<=== 쇼트 서킷을 발생시키지 않는 연산자
		
		// 예제 : AND 연산에서 쇼트 서킷이 발생되는 예제
		int val2 = 3;
		System.out.println(false & ++val1 > 6); 	//false
		
		System.out.println(val1); 	//4		<==쇼트 서킷 방지한다.
		
		
	}
}
