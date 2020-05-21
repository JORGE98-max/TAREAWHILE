import java.util.Scanner;

public class Ejercicio1 {
	
	static int num;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int contador;
		contador = 0;
		
		System.out.println("Ingrese un numero: ");
		num = scan.nextInt();
		
		while(num > 0) {
			
			contador+=1;
			    if(num>0)
				System.out.println("Ingrese otro numero: ");
			    num = scan.nextInt();
			    
			    
			   
		}
		   System.out.println("Se introdujeron "+contador+" numeros ");		
			
		

	}
}

