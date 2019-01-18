//package src;

public class ConstantExam {
	
	public static void main(String[] args) {
	
		int a;
		
		a = 3;
		
		a = 5;
		
		
		// 상수를 선언할 때는 final로 선언
		final int B;	//상수는 보통 대문자로 표
		
		B = 3; 			//할당 가능
		
		//B = 5;		//재할당 불가
		
		
		// 이러한 상수를 언제 사용하는가??
		double circleArea;
		final double PI = 3.141592;
		circleArea = 3 * 3 * PI;
		
		
		//상수는 변수와 변수사이를 언더바로 구분 
		final int OIL_PRICE = 1450;
		
		int totalPrice = 50 * OIL_PRICE;
		System.out.println(totalPrice);
		
	}

}
