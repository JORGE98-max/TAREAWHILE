import java.util.Scanner;

public class Ejercicio4DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, cantidad;
		double sueldo, sum;
		sum = 0;
		i = 1;

		System.out.println("Ingrese la cantidad de meses ahorrados : ");
		cantidad = scan.nextInt();

		do {
			System.out.println("Ingrese el deposito del mes " + i + " : ");
			sueldo = scan.nextInt();
			i += 1;
			sum = sum + sueldo;
		} while (i <= cantidad);

		System.out.println("Usted ahorro " + sum + " $ en " + cantidad + " meses");

	}

}
