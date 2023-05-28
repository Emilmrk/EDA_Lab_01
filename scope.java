public class scope {
	public static void main(String [] args) {
		//las variables creadas dentro de llaves solos existen dentro de las mimas
		{
			int x=10;
		}
		int x=20;
		//	int b=10;
		//	int b=20; sin las llaves en este caso esto devuelve un error de duplicado
	}
}
