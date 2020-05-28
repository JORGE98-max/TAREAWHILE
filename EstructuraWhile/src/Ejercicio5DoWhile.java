import java.util.Scanner;

public class Ejercicio5DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x, y, z, cantidad, i;

		x = 0;
		y = 1;
		z = 1;
		i = 0;

		System.out.println("Cantidad de elementos a ingresar : ");
		cantidad = scan.nextInt();

		do {
			i++;
			z = x + y;
			System.out.println(z);
			x = y;
			y = z;

		} while (i < cantidad);

	}

}
