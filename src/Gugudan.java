import java.util.Scanner; //5단용 for 입력받기


public class Gugudan {
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
	public static void print(int[] b) {
//출력위한 return이 없기에 void
		for (int i = 0; i<9; i++) {
			System.out.println(b[i]);
		
	}
	}
	       
	
	public static void main(String[] args) {
//		//6단
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i = i + 1; //i++ 로 표현해도 동일기능
//			
//		}
//		
//		//7단 for문
//		for(int j = 1; j<10; j++) {
//	// 변수선언+시작위치  조건   행동 
//			System.out.println(j * 7);
//		}

		
		//8, 9단 조건문 (2에서 9까지만 받아서 반복문으로 구구단 실행)
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in); //입력받기
//        int number = scanner.nextInt();
//		System.out.println("사용자가 입력한값은 " + number);
//		
//		if(number < 2) {
//			System.out.println("입력값이 잘못됨");
//		} else if(number>9) {
//			System.out.println("입력값이 잘못됨");
//		} else {
//			for(int q = 1; q<10; q++) {
//				System.out.println(number * q);	
//		}
//		}
		
		
//여러개의 데이터를 하나의 변수안에 넣어 다룰때 - 배열
		
//		int[] result1 = new int[9];  //result라는 9개의 정수데이터를 담는 배열
//		for(int i=0; i < result1.length; i++) {
//			result1[i] = 2 * (i+1); //반복하면서 result1배열에 2단의 9개 데이터 저장 
//		}
//		
//		for(int i=0; i< result1.length; i++) {
//			System.out.println(result1[i]);
//		}
		
//반복막기위해 메서드 활용   메서드 = 함수 (특정값 넣으면 로직구현후 결과값 전달함)
//		int[] result1 = caculate(3);  //위에서 구현된 caculate라는 메서드 통한 배열값
//		print(result1);
//		
//		int[] result2 = caculate(4);
//		print(result2);
//		
//		int[] result3 = caculate(5);
//		print(result3);
//		
//		//이러 반복 해결위해 
//		for(int i = 2; i<10; i++) {
//			int[] result = caculate(i);
//			print(result);
//		}

//타 클래스활용하여 메서드 이용

		for(int i = 2; i<10; i++) {
			int[] a = Gugudanmain.caculate(i); //다른 클래의 메서드 호출위해서는 
			Gugudanmain.print(a); 			     //타클래스명.메서드명
		}                                      //클래스명은 대문자, 메서드는 소문자 시작인 관례

	}
				

//반복막기위해 이중for 문 활용
//		int[] result1 = new int[9];  //정수형의 배열 생성 result1[0]~[8] 칸 생성
//		
//		for (int ju = 2; ju<10; ju++) {   // 2~9단 반복위한 반복문
//		for(int i=0; i < result1.length; i++) {  //rsult1.length는 9(위의 배열지정에서 정해짐)
//			result1[i] = ju * (i+1);  //result[0]~[8] 까지 2단의 값 넣기
//									//아래에서 sout통해 2단이 출력되면 ju=3 통해 2단지워지고 3단데이터 들어감
//		}
//		
//		for(int i=0; i< result1.length; i++) {
//			System.out.println(result1[i]);
//		}
//		}

		
		
		//2단
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
		//3단 변수 활용 
//		System.out.println("4단");
//		int result = 4 * 1; 
//		System.out.println(result);
//		result = 4 * 2; 
//		System.out.println(result);
//		result = 4 * 3; 
//		System.out.println(result);
//		result = 4 * 4; 
//		System.out.println(result);
//		result = 4 * 5; 
//		System.out.println(result);
//		result = 4 * 6; 
//		System.out.println(result);
//		result = 4 * 7; 
//		System.out.println(result);
//		result = 4 * 8; 
//		System.out.println(result);
//		result = 4 * 9; 
//		System.out.println(result);
		//5단 클래스 활용
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in); //입력받기
//        int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
	
	} 

