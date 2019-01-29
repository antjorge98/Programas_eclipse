package ejemplos_id;

import java.util.Scanner;

public class Programa_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner leer= new Scanner(System.in);
		    String nombre;
		    int edad;
		    System.out.println("Ingrese su nombre: ");
		     nombre=leer.nextLine();
		    System.out.println("Ingrese su edad: ");
		     edad=leer.nextInt();
		     if(edad>=18){
		    	 System.out.println(nombre+" es mayor de edad con "+edad+" años");
			     
		     }
		     else {
		    	 System.out.println(nombre+" es menor de edad con "+edad+" años");
		     }
		     
	}

}
