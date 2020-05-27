import java.util.Scanner;

public class Ejercicio2DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, cantidad, sum, i;
		i = 1;
		
		sum = 0;
		
		System.out.println("Ingrese la cantidad de numeros: ");
		cantidad = scan.nextInt();
		
		do {
			i++;
			System.out.println(" Ingrese el numero ");
			num = scan.nextInt();
			
			sum = sum + num;
			
		}
		while( i <= cantidad );
		
		System.out.println("la suma es: "+sum);
		

	}

}
