import java.util.Scanner;

public class forloop {
	public static void main(String[]args) {
		//for normal
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("ingrese dos numeros cualquiera");
		int termino2 = sc.nextInt(), termino3 = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("soy n veces "+n);
		}
		int[] myArr = {n,termino2,termino3};
		//for each
		for (int recorre : myArr) {
			System.out.println("estoy en un foreach "+recorre);
		}
	}
