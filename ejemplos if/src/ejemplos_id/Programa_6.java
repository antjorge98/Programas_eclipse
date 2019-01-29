package ejemplos_id;

import java.util.Scanner;

public class Programa_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		num=leer.nextDouble();
		num=num%2;
		if(num!=0) {
			System.out.println("impar");			
		}
		else {
			System.out.println("par");	
		}
		
	}

}
