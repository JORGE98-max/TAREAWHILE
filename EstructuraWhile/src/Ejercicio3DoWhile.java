import java.util.Scanner;

public class Ejercicio3DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int edad, i, prom, cantidad, sum;
		
		sum = 0;

		prom = 0;

		i = 1;
		System.out.println("Ingrese la cantidad de edades: ");
		cantidad = scan.nextInt();
		do {

			System.out.println("Ingrese la edad " + i);
			edad = scan.nextInt();
			i += 1;
			sum = sum + edad;
			prom = sum / i;
		} while (i <= cantidad);

		System.out.println("El promedio de las edades ingresadas es : " + prom);

	}

}
