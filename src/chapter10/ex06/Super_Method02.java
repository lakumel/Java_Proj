package chapter10.ex06;

class E{
	E(){
		this(3);
		System.out.println("E의 생성자 - 1");
	}
	E(int a){
		System.out.println(a);
		System.out.println("E의 생성자 - 2");
	}
}
class F extends E{
	F(){
		this(33);
		System.out.println("F의 생성자 - 1");
	}
	F(int a){
		//super(); <== 이게 생략 되어 있다.
		System.out.println(a);
		System.out.println("F의 생성자 -2");
	}
}
public class Super_Method02 {
	public static void main(String[] args) {
		F f1 = new F();
		
		/*
	
		E의 생성자 - 2
		E의 생성자 - 1
		33
		F의 생성자 -2
		F의 생성자 - 1
		 */
		
	}

}