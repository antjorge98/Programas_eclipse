package ejemplos_id;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double suma,num1,num2,num3,total;
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		Scanner leer=new Scanner (System.in);
		System.out.println("Ingrese el numero 1");
		num1=leer.nextDouble();
		System.out.println("Ingrese el numero 2");
		num2=leer.nextDouble();
		System.out.println("Ingrese el numero 3");
		num3=leer.nextDouble();
		
		suma=num1+num2+num3;
		
		if(suma>=1500) {
			total=(suma*0.11)+suma;
			System.out.println( "El total es: $"+ formateador.format (total));
		}	
			else {
				total=(suma*0.10)+suma;
				
				System.out.println("El total es: $"+ formateador.format (total));
	}

 }
}