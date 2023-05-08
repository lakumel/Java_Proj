package chapter04.ex01;

import java.util.Scanner;

public class Ex002 {
	public static void main(String[] args) {
		// 1.Scanner 등록(<ctrl = Shif + o>)

		Scanner sc = new Scanner(System.in);

		// 프로그램 선택 변수
		int select; // 1. 학점의 합계/평균 , 2.홀수, 짝수 확인하는 프로그램, 3.같은 이름을 식별

		// 국어/영어/수학 점수를 인풋 받는 변수 선언
		int kor;
		int eng;
		int math;

		// 정수 값을 인풋 받아서 홀수 인지 짝수인지 확인하는 프로그램에 사용하는 변수
		int a;

		// 두 변수의 값을 받아서 같은 이름인지 확인하는 프로그램
		String aName;
		String bName;

		System.out.println("============================================");
		System.out.println("1.학점의 합계/평균  | 2. 홀수/짝수 | 3.같은 이름 식별");
		System.out.println("=============================================");

		// 사용자로 부터 프로그램 선택
		System.out.println("위 프로그램 번호를 입력 하세요>>>>");
		select = sc.nextInt();

		// if 조건으로 프로그램을 실행
		if (1 == select) {
			// 스캐너로 부터 국어/영어/수학 인풋 받아서 합계와 평균을 출력
			System.out.println("1번 항목을 출력 했습니다.");
			System.out.println("콘솔에 국어 영어 수학 점수를 공백/엔터로 정수값으로 넣어주세요>>>>");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			int sum = kor+eng+math;		//sum 지역변수:블락 네에서만 사용됨
			double avg = sum/3.0;		//avg 평균 :double
					
			System.out.printf("입력한 국어 영어 수학의 합계는 %d이고 평균은 %5.2f입니다. 1\n\n", sum, avg);

		} else if (2 == select) {
			// a 변수에 정수값을 인풋 받아서 홀수인지 짝수인지
			System.out.println("2번 항목을 출력 했습니다.");
			System.out.println("정수값 하나를 입력 하세요 >>>");
			a =sc.nextInt();
			
			//삼합 연산자의 경우
			System.out.println((a % 2==0) ? "짝수 입니다." : "홀수 입니다.");
			
		} else if (3 == select) {
			// aName, bName 두 변수의 문자열을 인풋 받아서 같은 이름인지 식별
			System.out.println("3번 항목을 출력 했습니다.");
			System.out.println("문자열 2개를 공백/엔터로 구분해서 입력해 주세요>>>");
			aName = sc.next(); 
			bName = sc.next();
			
			if (aName.equals(bName)) {		//String 에서 두 값을 비교하는것이 equals<==Heap 에 저장된 값
				System.out.println("두 값은 같은 값입니다.");
			}else {
				System.out.println("두 값은 다른 값입니다.");
			}
			
			
			
		}

		// 12시 20분까지

		// 스캐너 종료 : 사용후 메모리에서 제거
		sc.close();

	}

}
