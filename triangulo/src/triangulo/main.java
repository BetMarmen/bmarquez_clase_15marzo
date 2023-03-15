package triangulo;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Clasificacion de triangulos");
		System.out.println("Ingrese los lados del triangulo");
		do {
		System.out.println("Primer lado");
		a= scan.nextInt();
		System.out.println("segundo lado");
		b= scan.nextInt();
		System.out.println("Tercer lado");
		c= scan.nextInt();}
		while(a<=0 || b<=0 || c<=0);
		
		if(a==b && a==c) {
			System.out.println("Es un triangulo equilatero\n");
		}
		else if(a==b || b==c || c==a) {
			System.out.println("Es un triangulo isosceles\n");
		}
		else if(a!=b && a!=c && b!=c) {
			System.out.println("Es un triangulo Escaleno");
		}
	}

}
