public class recursion {
	public static void main(String[]args) {
		trianguloRecursivo(7);
	}
	public static void trianguloRecursivo(int num) {
		if (num<1) {
			
		}else {
			for (int i = 0; i < num; i++) {
				System.out.print("*");
			}
			System.out.println();
			trianguloRecursivo(num-1);
		}
	}
}
