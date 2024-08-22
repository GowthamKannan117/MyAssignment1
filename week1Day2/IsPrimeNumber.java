package week1Day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 101;

		for (int i = 2; i <= num-1; i++) {
	
			if(num%i==0) {

				System.out.println("Is Not a Prime Number");
				
					break;
				}else{
					System.out.println("Is a Prime Number");
					break;
				}
			}	
		}			
	}

