package studio3;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] numbers = new boolean[40];
		
		System.out.print("The prime numbers are 2 3 5 7 ");
		
			for(int i=2; i <numbers.length; i++) {
				if(i%2==0 || i%3==0 || i%5==0 || i%7==0) {
					numbers[i]=true;
				}
				
				else {
					numbers[i]=false;
					System.out.print(i+" ");
				}
				}
		}
	}

