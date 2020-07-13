
public class T_05_SumOfMultiples {

	public static void main(String[] args) {
		
		int result = sumOfMultiples(23, -9, -19);
		System.out.print(result);
	}
	
	public static int sumOfMultiples(int a, int b, int c){
		if(roundOff(a) > 0 && roundOff(b) > 0 && roundOff(c) > 0) return roundOff(a) + roundOff(b) + roundOff(c);
		return -1;
	}
	
	public static int roundOff(int a){
		if(a % 10 != 0 && a > 0) return a + (10 - (a % 10));
		if(a % 10 == 0 && a > 0) return a;
		return -1;
	}

}
