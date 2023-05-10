package chapter05.ex02;

import java.util.Scanner;

public class Ex01 {
			public static void main(String[] args) {
				
				
				Scanner sc = new Scanner(System.in);
				
				//변수선언
				int [] arr1; 				//배열변수 : arr1 		<==선언
				int n ;						//프로그램을 선언하는 변수(1,2,3,4)
				int idx;					//idx(index) <-배열 변수에서 방의 크기를 저장하는 변수
				
				do {
				
			//배열에 저장후 출력	
			System.out.println("========================================================");	
			System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");	
			System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수 만 빼고 저장후 출력");	
			System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 지정하는데 그 중 6의 배수인 경우 빼고 저장후 출력");	
			System.out.println("4.프로그램 종료");	
			System.out.println("========================================================");	
			
			System.out.println("1~4번까지 번호를 입력 하세요>>>>>>");
			n = sc.nextInt();	
				
				if(n==1) {
					System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
					System.out.println("숫자를 입력해 주세요>>>");
					idx = sc.nextInt();
					//배열 방을 생성
					arr1 = new int[idx];			//콘솔에서 입력 받아서 배열 방 크기를 지정
					
					//배열방의 for 문을 사용해서 7의 배수와 8의 배수를 배열방에 저장
					int a = 0; 		//배열 방의 번호
					for(int i=0; ; i++) { 				//i = 배열의 방에 저장되는 7의 배수와 8의 배수의 값
						if(i%7==0 || i%8==0) {
							arr1[a] = i;
						}
							
						a++; 				//a변수는 배열의 방 번호
						if(a==idx)break;
					}
					
					//for문을 사용해서 배열의 각 방의 내용을 출력
					for(int i =0; i<arr1.length; i++) {
						System.out.print(arr1[i] + " ");
					}
					System.out.print("\n \n");
							
					
								
				
				
					
				}else if(n==2) {
					System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수 만 빼고 저장후 출력");
					
				}else if(n==3) {
					System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 지정하는데 그 중 6의 배수인 경우 빼고 저장후 출력");
				
				
				
				
				}else if(n==4) {
					System.out.println(" 4. 프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력 했습니다.(1~ 4번까지의 정수를 입력해주세요)");
				}

			} while (true);
			
			System.out.println("While 문을 빠져 나왔습니다. 프로그램이 종료 되었습니다.");
			sc.close();  
				

			
				
			}
}
