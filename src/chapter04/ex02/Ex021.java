package chapter04.ex02;

import java.util.Scanner;

public class Ex021 {
	public static void main(String[] args) {
		/*
		 스캐너로 월을 인풋 받습니다.(1~12월까지 정수를 인풋 받습니다.)
		 월을 인풋 받아서 해당월의 날짜를 출력 하는 프로그램 입니다.
		 
		 " 해당 월은 0월 이고, 0일까지 존재합니다." 
		
		참고 : 1,3,5,7,8,10,12월 	<== 31일까지 존재
			: 2					<== 28일
		 						<== 그 외는 30일
		 */
		
		Scanner sc = new Scanner(System.in);
		int month ; // 스캐너로 월요일을 인풋
		int day= 30 ; //day 변수에 초기값을 30으로 할당
		
		System.out.println("콘솔에 1 ~ 12 까지 정수를 입력하세요>>>");
		month = sc.nextInt();
		
		System.out.println("==1.case 문 내에서 출력 ===");
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;		// day = day +1;
			System.out.printf("해당월은 %d 이고, %d 까지 존재합니다. \n", month ,day);
			break;
		case 2:	
			day = 28;	// day = day -2
			System.out.printf("해당월은 %d 이고, %d 까지 존재합니다.\n", month ,day);
			break;
		default : 	
			System.out.printf("해당월은 %d 이고, %d 까지 존재합니다.\n", month ,day);
			break;
		}
	
		System.out.println("==1.case 문 밖에서 출력 ===");

		
		System.out.printf("해당월은 %d 이고, %d 까지 존재합니다. \n", month ,day);
		
		
		
		sc.close();
	}

}
