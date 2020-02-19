package practical;

public class max_number {

	public static void main(String[] args) {
		int array1 []= new int[] {50, 40, 23, 70, 56, 12, 5, 10, 7};
		int max = 0;
		int var = 0;
		for (var = 0;var<array1.length;var++) {
			if (array1[var] > max){
			max = array1[var];
			
//			System.out.print( max );	
		}
			
	}
		System.out.println(max);

}
}
