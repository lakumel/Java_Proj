package chapter05.ex04;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
			arr1 = 4행 100열의 2차원 배열 방을 생성 하세요.
				0: 10의 배수만 저장 (0번째 행은 10의 배수만 저장
				1: 3의 배수만 저장
				2: 3의 배수이지만 6의 배수는 저장하지 말고 저장
				3: 7의 배수, 8의 배수 저장
				
				for 문을 통해서 출력
		 */
		//1.배열 선언
		int[][] arr1 = new int [4][100] ;
	
		System.out.println("행의 개수:" + arr1.length); 
		System.out.println("0 행의 열의 개수 : "+ arr1[0].length); 		//0번행의 열의 개수
		System.out.println("1 행의 열의 개수 : "+ arr1[1].length); 		//0번행의 열의 개수
		System.out.println("2 행의 열의 개수 : "+ arr1[2].length); 		//0번행의 열의 개수
		System.out.println("3 행의 열의 개수 : "+ arr1[3].length); 		//0번행의 열의 개수
			
		//2.배열의 각 행에 값을 저장
		for(int i =0; i<arr1.length; i++) {		//i는 행을 loop: 0, 1,2,3
			
			if(i==0) { 		//10의 배수를 저장함.
				for(int j =0, a=10; j <arr1[i].length; j++ ) { //j:열을 loop :0,1,2,3,...99
					//10의 배수를 저장하는 변수 선언
					
					arr1[i][j] = a;
					a +=10;
					
					}
				
				}else if(i==1) {//3의 배수 저장
					for(int j =0 , a=3;  j <arr1[i].length; j++, a+=3) { //j:열을 loop :0,1,2,3,...99
						//3의 배수를 저장하는 변수 선언
						//int a = 3; 	여기에 선언을 하면 오류가 난다.
						arr1[i][j]=a;
						//a+=3;
					}						

				}else if(i==2) {//3의 배수지만 6은 저장하지 말고
					for(int j =0, a =3;  j <arr1[i].length; a+=3) { //j:열을 loop :0,1,2,3,...99
						
						if(a%6==0)continue; 		//6의 배수는 저장하지 않고
						arr1[i][j]=a;
						j++;
					}	

				}else if(i==3) {//7의 배수 8의 배수 저장
					for(int j =0 , a= 1; j <arr1[i].length; a++ ) { //j:열을 loop :0,1,2,3,...99
						//각 방의 값을 저장하는 변수 선언 : a ;
						if(a%7==0||a%8==0) {
							arr1[i][j]=a;
							j++;
						}
					}
				}
		}
			//출력 구문
		

		for(int i= 0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] +" ");
			}
			System.out.println();
		}
	
	}

}
