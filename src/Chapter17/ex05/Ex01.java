package Chapter17.ex05;

import java.util.LinkedHashMap;
import java.util.Map;

class Student{//애가 map : key : 중복되면 안됨, equals(), hashcode()
	
	int stuID;		//중복되면 안되도록 처리,
	String stuName;
	
}


public class Ex01 {
	public static void main(String[] args) {
		
		//Key : Student , Value
		Map<Student, String>linkMap = new LinkedHashMap();
		linkMap.put(1111, "홍길동");
		linkMap.put(1122, "홍길동");
		linkMap.put(1123, "홍길동");
		linkMap.put(1131, "홍길동");
		
		
		System.out.println(linkMap);
		
		
		
		
		
		
	}

}
