
public class Gugudanmain {
	//2 넣을시 2단들을 배열에 넣어서 반환하는 메서드
	public static int[] caculate(int times) {
		     //반환할타입  메서드이름 메서드가받을입력값(정수를 받으며 times라는 변수로 메서드 안에서 활용됨)
		int[] result = new int[9];  
		for(int i=0; i < result.length; i++) {
			result[i] = times * (i+1); 
		}
		return result;  // 일정 정수를 넣으면 그 수로된 구구단을 품은 배열을 반환함
	}          
	
					//메서드 명   받을 값(result라는 변수는 이 메서드에서만 쓰임)
	public static void print(int[] result) {
//출력위한 return이 없기에 void
		for (int i = 0; i<9; i++) {
			System.out.println(result[i]);
		
	}
	}

}
