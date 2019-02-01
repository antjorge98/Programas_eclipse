package ejemplos_id;

import java.util.Scanner;

public class Programa_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double grados_c, grados_f;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese los grados fahrenheit");
		grados_f =leer.nextDouble();
		grados_c=(grados_f-32)/1.8;
		
		System.out.println("Esto equivale a: "+grados_c+" grados centigrados");
		

		
	}
}
