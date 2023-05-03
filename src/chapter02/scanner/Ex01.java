package chapter02.scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		
		//1. Scanner 등록
		//2. 아버님 이름 , 어머님 이름 , 형제 이름, 자신 이름			:sc.next();
			//아버님 나이, 어머님 나이, 형제 나이, 자신 나이			:sc.nextInt();
		//3.스캐너로 받은 변수의 값을 출력
		//4.전체 나이의 합계, 평균을 구해서 소수점 이하 2자리 까지만 출력%
		
		Scanner sc = new Scanner(System.in);
		
		String name1;		//아버님 이름		//단번에 출력 할거면 String name = "이름";
		String name2;		//어머님 이름
		String name3;		//형제 이름
		String name4;		//자신의 이름

	
		
		int age1 ;			//아버지 나이
		int age2 ;			//어머니 나이
		int age3 ;			//형제 나이
		int age4 ;			//자신의 나이
		
		System.out.println("아버지 이름 어머님 이름 형제 이름 자신의 이름을 공백을 구분해서 입력 하세요 >>>>");
		name1 = sc.next();
		name2 = sc.next();
		name3 = sc.next();
		name4 = sc.next();
		
		System.out.println("아버지의 나이 어머니의 나이 형제의 나이 자신의 나이를 공백을 구분하여 정수로 입력 하세요 >>>>");
		age1 = sc.nextInt();
		age2 = sc.nextInt();
		age3 = sc.nextInt();
		age4 = sc.nextInt();
		
		int sum = age1 + age2 + age3+ age4;
		double avg = sum/4.0;
		
		//변수의 값을 출력
		
		System.out.printf("아버지의 이름은 %s, 어머니의 이름은 %s, 형제의 이름은 %s 자신의 이름은 %s 이며\n\n", name1, name2, name3, name4);
		System.out.printf("아버지 나이는 %d, 어머니의 나이는 %d, 형제의 나이는 %d, 자신의 나이는 %d 입니다.\n\n", age1, age2, age3, age4);
		System.out.printf("가족의 나이 합은 %d 이며 평균값은 %5.2f입니다.\n", sum, avg );
		
		
			
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
