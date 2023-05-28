public class metodoSobrecargado {
	public static void main(String[] args) {
		imprimir(10);
		imprimir("hola");
		imprimir("hola este es un numero", 30);
	}
	public static void imprimir(int numero) {
		System.out.println(numero);
	}
	public static void imprimir(String cadena) {
		System.out.println(cadena);
	}
	public static void imprimir(String cadena, int numero) {
		System.out.println(cadena + " : "+ numero);
	}
}
