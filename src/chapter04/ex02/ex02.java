package chapter04.ex02;

public class ex02 {
	public static void main(String[] args) {
		/*
		 
		 switch : <== 기본적으로 case문 내에서 break; 를 사용한다.
		 	--if 문은 참()일 경우 실행 블락{}을 실행후 break; 가 자동으로 작동
		 	-- switch 문은 실행후 해당 블락을 빠져나오지 않는다. 강제로 해당 블락을 빠져 나오도록 break; 넣어줘야 한다.
		 	
		 	break; <== if, switch, for, while, do while 문의 실행블락 {} 내에서 실행블락을 빠져나올때 사용
		 */
		
		
		//1.switch 문에서 break; 를 사용하지 않는 경우 switch의 값이 case로 점프해서 출력후 모두 출력
		
		int val1 = 2;
		
				//스위치 블락=>{} 
		switch (val1) {				//
		
		case 1 :
			System.out.println("A");
		case 2 :
			System.out.println("B");
		case 3:
			System.out.println("C");
		case 4:
			System.out.println("D");
		default :
			System.out.println("f");		//case에 값이 존재하지 않는 경우, if else if else와 같다.
		}
		
		System.out.println("========================");
		
		//2.switch문에서 break;를 사용하지 않는 경우
		
		int val2 = 4;
		switch (val2) {
		case 1 :
			System.out.println("A");
			break;
		case 2 :
			System.out.println("B");
			break;
		case 3 :
			System.out.println("C");
			break;
		case 4 :
			System.out.println("D");
			break;
		default:			//case에 존재하지 않으면 default 의 내용이 출력됨
			System.out.println("F");
			//break;			//default 에서는 break;를 사용하지 않아도 됨
		}
		
		
		// switch 문은 if else if 문으로 변환됨
		System.out.println("==switch 문을 if else if 문으로 변환 ===");
		if(val2 == 1) {
			System.out.println("A");
		}else if(val2 ==2) {
			System.out.println("B");
		}else if(val2 ==3) {
			System.out.println("C");
		}else if(val2==4) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
	