package chapter04.ex02;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		/*
		 1.Scanner로 정수 1,2,3을 인풋 받아서 
		  1 : "금메달 입니다."
		  2 : "은메달 입니다."
		  3 : "동메달 입니다."
		  그외 모든 정수를 인풋 받으면 : "메달이 없습니다."
		  ==================================
		  2.Scanner 로 문자열 "gold" , 'silver", "bronze"
		    "gold" 	 : "금메달 입니다."
		    "silver" : "은메달 입니다."
		    "bronze" : "동메달 입니다."
		   그외 모든 정수를 인풋 받으면 : "메달이 없습니다."
		  ==================================
		 */
		
		Scanner sc= new Scanner(System.in);
		
		int medal1;
		System.out.println("정수 값을 입력해 주세요 >>>");
		
		medal1 =sc.nextInt();
		switch(medal1) {
		case 1 :
			System.out.println("금메달 입니다.");
			break;
		case 2 :
			System.out.println("은메달 입니다.");
			break;
		case 3 :
			System.out.println("동메달 입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
		}
		
		System.out.println("=======================");
		
		String medal2;
		System.out.println("gold silver bronze 중 하나의 문자열을 입력하세요>>>>");
		medal2 = sc.next();
		
		switch(medal2) {
		case "gold" : case "Gold" : case "GOLD" :
			System.out.println("금메달입니다.");
			break;
		case  "silver" : case "Silver" : case "SILVER":
			System.out.println("은메달 입니다.");
			break;		
		case  "bronze" : case "Bronze" : case "BRONZE":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		sc.close();
		
		
	}

}
