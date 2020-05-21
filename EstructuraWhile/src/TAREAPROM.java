import java.util.Scanner;

public class TAREAPROM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i, prom, sumpar, sumimpar, contador, num;
		prom = 0;
		sumpar = 0;
		sumimpar = 0;
		contador = 0;
		i = 0;
		
		System.out.println("Ingrese un numero: ");
		num = scan.nextInt();

		while (i <= num) {

			i += 1;

			if (i % 2 == 0) {
				contador+=1;

				sumpar = sumpar + i; // sumpar = 2;
				prom = sumpar / contador;
			} else {

				sumimpar = sumimpar + i;   // sumimpar = 1
			}

		}

		System.out.println("el promedio de los pares es: " + prom);
		System.out.println("La suma de los impares es: " + sumimpar);

	}

}