public class Arrays {
	public static void main(String[] args) {
		//arreglo
		int [] arreglo = {1,2,3,4,5,6,7,8};
		//lectura de un arreglo
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		//arreglo bidimensional
		int [][] arregloBdimensional = new int[5][5];
		for (int i = 0; i < arregloBdimensional.length; i++) {
			for (int j = 0; j < arregloBdimensional[i].length; j++) {
				arregloBdimensional[i][j] = i+j;
			}
		}
	}
}
