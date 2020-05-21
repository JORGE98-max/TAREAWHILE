
public class TAREAPROM {

	public static void main(String[] args) {

		int i, prom, sumpar, sumimpar, contador;
		prom = 0;
		sumpar = 0;
		sumimpar = 0;
		contador = 0;
		i = 0;

		while (i <= 270) {

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