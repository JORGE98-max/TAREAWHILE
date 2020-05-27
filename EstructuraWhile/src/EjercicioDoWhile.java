import java.util.Scanner;

public class EjercicioDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, sumnum;

		sumnum = 0;

		do {
			System.out.println("Ingrese el numero:");
			num = scan.nextInt();
			sumnum = sumnum + num;

		} while (num != 0);

		System.out.println("la suma de los numeros ingresados es : " + sumnum);

	}

}
