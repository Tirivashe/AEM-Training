
public class T_06_GetMaxNumber {

	public static void main(String[] args) {
		int result = getMaxNumber(20, 20,41);
		System.out.print(result);

	}
	
	public static int getMaxNumber(int a, int b, int c){
		if(a > 0 && b > 0 && c > 0){
			if(a >= b && a >= c) return a;
			else if(b >= a && b >= c) return b;
			else return c;
		}
		return -1;
	}

}
