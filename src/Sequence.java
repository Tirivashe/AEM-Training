
public class Sequence {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++){
			for(int j = 5-i; j > 1; j--){
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 6; i >= 1; i--){
			for(int j = 6; j > i; j--){
				System.out.print(" ");
			}
			for(int j = 1; j< i; j++){
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}
