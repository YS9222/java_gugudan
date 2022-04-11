
import java.util.Scanner;


public class Newgugudan {
	public static int[] calculate(int times) {
		int[] array = new int[9];
		for(int i = 0; i<array.length; i++) {
			array[i] = times * (i+1);	
		}
		return array;
	}
	public static void print(int[] b) {
		for(int p=0; p<b.length; p++) {
		System.out.println(b [p]);
	}
	}
	
	
	
	public static void main(String[] args) {
		
//		복습(배열)
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
//		int[] array = new int[9];
//		for(int i = 0; i<array.length; i++) {
//			array[i] = number * (i+1);	
//		}
		if(number<2) {
			System.out.println("숫자가 너무 작다");
		}else if(number>9) {
			System.out.println("숫자가 너무 크다");
		}else {
		int[] a = calculate(number);
		print(a);
		}
//		for(int p=0; p<array.length; p++) {
//			System.out.println(array[p]);
//		}
//			
			
		
		
		
		
		
		
		
//	// 요구사항1 88단
//	System.out.println("구구단 중 출력할 단은? : ");
//	Scanner scanner = new Scanner(System.in);
//	int number = scanner.nextInt();
//	
//	int[] result = new int[number];
//	for(int i = 0; i<result.length; i++ ) {
//		result[i] = number * (i+1);
//	}
//	for(int q = 0; q<result.length; q++ ) {
//		System.out.println(result[q]);
//	}
		
//		//요구사항2 ( 두개 숫자 받아서 xy단 구현 )
//	System.out.println("구구단 중 출력할 단은? :(,)");
//		Scanner scanner = new Scanner(System.in);
//		String inputValue = scanner.nextLine();
//		
//		String[] splitedValue = inputValue.split(",");
//		
//		int first = Integer.parseInt(splitedValue[0]);
//		int second = Integer.parseInt(splitedValue[1]);
//		
//		for(int i = 2; i<(first+1); i++ ) {
//			for(int q = 1; q<=second; q++) {
//				System.out.println(i * q);
//			}
//		}
		
		
//		//요구사항2-1 ( 두개 숫자 받아서 xy단 본인것만 구현 )
//	System.out.println("구구단 중 출력할 단은? :(,)");
//		Scanner scanner = new Scanner(System.in);
//		String inputValue = scanner.nextLine();
//		
//		String[] splitedValue = inputValue.split(",");
//		
//		int first = Integer.parseInt(splitedValue[0]);
//		int second = Integer.parseInt(splitedValue[1]);
//		int[] a = new int[second];
//		
//		for(int b = 0; b<second; b++) {
//			a[b] = first * (b+1);
//		}
//		
//		for(int q = 0; q<second; q++) {
//		System.out.println(a[q]);		//해당반복문을 위 반복문 안에 작성했다가 오류발생 
//										//왜냐하면 배열을 다 만들고 프린트하는게 아니라 b가 0일때 배열 뽑고,1일때 배열,2일때 배열을 따로뽑기때문
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
}
