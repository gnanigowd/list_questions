package loops;

public class Perfect_number {

	public static void main(String[] args) {
		int number = 6;
		int sum = 0;
		int i = 1;
		for (i=1;i<number;i++) {
			if (number%i==0) {
				sum=sum+i;
				
			}
		}
		
		if (sum==number) {
			System.out.println(number +" is perfect");
		}else {
			System.out.println("not perfect number");
		}
		
		

	}

}
