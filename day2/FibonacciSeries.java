package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range= 10;
		int firstNum= 0;
		int secNum=1;
		int sum;
		System.out.println(firstNum+ " " +secNum +" ");
		for (int i= 1; i<range ;i++) {
			sum= firstNum+secNum;
			System.out.println(sum);
		
		firstNum=secNum;
		secNum=sum;
		}

	}

}
