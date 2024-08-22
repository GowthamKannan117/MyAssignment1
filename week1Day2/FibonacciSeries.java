package week1Day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 0;
		int b= 1;
		int range= 8;
		for (int i = 0; i <= range-1; i++) 
		{
			System.out.print(a + " ");
			int c= a+b;

			a = b;
			b = c;
		}
	}

}
