package impar_par;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Ingrese un numero para saber si es par o impar");
		System.out.println("Ingrese el numero");
		num = scan.nextInt();
		if (num%2==0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}

	}

}
