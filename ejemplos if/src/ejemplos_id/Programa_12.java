package ejemplos_id;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Programa_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=0;
		double  cal, promedio,sum=0;
	    DecimalFormat formato = new DecimalFormat("###,###.##");
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese el numero de calificaciones: ");
		n=leer.nextInt();
		while(i<n) {
			System.out.println("Ingrese la calificacon: ");
			cal=leer.nextDouble();
			sum=cal+sum;
			i++;
		
			}
			
		promedio=sum/n;
		System.out.print("El promedio es: "+formato.format(promedio));
if(promedio>=0 && promedio<=49) {
	System.out.print(" Suspenso");
		}
if(promedio>=50 && promedio<=69) {
	System.out.print(" Aprobado");
}
if(promedio>=70 && promedio<=89) {
	System.out.print(" Notable");
}
if(promedio>=90 && promedio<=99) {
	System.out.print(" Sobresaliente");
}
if(promedio==100) {
	System.out.print(" Matricula de honor");
}
		
		
	}
	
}
