package ejemplos_id;

import java.util.Scanner;

public class Programa_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cal;
      Scanner leer= new Scanner (System.in);
      System.out.println("Ingrese su calificacion");
      cal=leer.nextInt();
      if (cal>=80)
      {
    	  System.out.println("Aprobado");
    	  
    	  
      }
      else {
		  System.out.println("reprobado");
	  }
      
	}

}
