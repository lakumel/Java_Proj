package chapter05.ex04;

public class Rectangle_Array_definition {

	public static void main(String[] args) {
		/*
		 다차원 배열은 2가지가 있다 : 2차원
		 -정방형 배열(2차원) : row, recode(행), 열(column, field)이 동일한 배열/ 행에 대해서 열수가 같은 것
		 -비정방형 배열(2차원) : row, recode(행), 열이 동일하지 않는 배열/ 행에 대해서 열수가 다른 것
		 참고로 행은 가로 열은 세로
		 */
		
		//1.2차원 배열 선언
		int[][] arr1 = new int[3][4]; 				//new int [3][4]에서 첫번째 앞에 들어가는 것은 행의 갯수(3)/ 4: 열의 갯수
													//행의 갯수 (0, 1, 2) 열의 갯수(0,1,2,3)
		//2. 2차원 배열에 값 넣기
		arr1[0][0] = 10; 				//arr1[행의 방번호][열의 방번호]
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[0][3] = 40;
		//arr1[0][4] = 50; 		//자바에서 오류를 예외라고 한다. 오류[예외] : 컴파일 오류가 있고 실행할때 오류가 나는 2가지가 있다.
		//오류발생					컴파일 오류는 이클립스에서 잡아준다. 실행시 오류는 실행할때 일어난다.
		
		arr1[1][0] = 100;
		arr1[1][1] = 200;
		arr1[1][2] = 300;
		arr1[1][3] = 400;

		arr1[2][0]=1000;
		arr1[2][1]=2000;
		arr1[2][2]=3000;
		arr1[2][3]=4000;
		
		//직접 방번호를 넣어서 출력을 한 경우
		System.out.println(arr1[2][2]);
		
		//for문을 사용해서 출력 : 
			//arr1.length  <==애가 1차원 배열일때는 열의 개수를 출력을 해준다. 
			//				<==2차원 배열일때는 행의 개수를 찍어준다.
			//arr1[0].length <== 행번호의 index 번호 0번행의 열의 개수 
		System.out.println(arr1.length); 		//출력하면 :3 : 행의 갯수	,2차원 배열일때 <===
		System.out.println(arr1[0].length); 	// 출력하면 : 4: 0번 행의 열의 갯수
		System.out.println(arr1[1].length); 	// 출력하면 : 4: 1번 행의 열의 갯수
		System.out.println(arr1[2].length); 	// 출력하면 : 4: 2번 행의 열의 갯수
		
		System.out.println("===2.2차원 배열을 for 문을 사용해서 출력=========");
		
		//for 문을 사용해서 arr1 배열의 값을 출력하기 : 이중 포문 : for문 안에 for문을 사용해서 출력
			//바깥쪽 for문은 행을 loop 돌림
			//FOR(행을 푸르) : 바깥쪽 FOR 	, arr1.length 사용
			//안쪽 포문은 열을 loop
			//FOR(열을 루프) : 안쪽 FOR 	, arr1[i].lenght 사용

		
		for(int i = 0 ; i <arr1.length; i++) { 		// i : 행의 방번호, 행의 index 번호
		
			for(int j = 0 ; j<arr1[i].length; j++) { 	//j:열의 번호, 열의 index 번호
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		

	}

}
