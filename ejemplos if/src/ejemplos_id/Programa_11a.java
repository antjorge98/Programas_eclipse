package ejemplos_id;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Programa_11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double sueldo,s_max=0,sum=0, s_min=999999999, isr, total;
	    DecimalFormat formato = new DecimalFormat("###,###.##");
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese el numero de empleados: ");
		n=leer.nextInt();
		do {
			System.out.println("Ingrese el sueldo: ");
			sueldo=leer.nextDouble();
			sum=sueldo+sum;
			n=n-1;
		
			 
			if(sueldo>=s_max) {
				s_max=sueldo;
				
			}
			
			
			if (sueldo<=s_min) {
				s_min=sueldo;
			}
			
		}while (n>=1);
		isr=sum*0.33;
		total=sum;
		System.out.println("El total de la nomina es: "+formato.format(total));
		System.out.println("El ISR es: "+formato.format(isr));
		System.out.println("El sueldo maximo es: "+formato.format(s_max));
		System.out.println("El sueldo minimo es: "+formato.format(s_min));
		
	}
	
}
