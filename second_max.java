package practical;

public class second_max {

	public static void main(String[] args) {
		int array1[] = new int[] { 50, 40, 23, 54, 5, 12, 56, 10, 70 };
		int max = 0;
		int var = 0;
				while (var < array1.length) {
			
			if (array1[var]>max) {
				max=array1[var];
				
				
			}
			var +=1;		
		}
		
//		System.out.println(max);
		int secmax = 0;
		int a = 0;
		while (a < array1.length) {
			
			if (array1[a]>secmax && max != array1[a]) {
				secmax = array1[a];
				}
			a +=1;		
			}
		System.out.println(secmax);
		}
}
