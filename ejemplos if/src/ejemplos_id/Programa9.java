package ejemplos_id;

import java.util.Scanner;

public class Programa_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		double medida;
		Scanner leer=new Scanner (System.in);
		System.out.println("Seleccione una opcion");
		
		System.out.println("1.-Pulgadas a centimetros");
		System.out.println("2.-Pies a centimetros");
		System.out.println("3.-Pies a pulgadas");
		opcion=leer.nextInt();
		
		switch(opcion){
	      case 1:
	    	  
	    	  System.out.println("Ingrese las pulgadas");
	    	  medida=leer.nextDouble();
	    	  medida=medida*2.54;
	    	  System.out.println("Esto equivale a: "+medida+" centimetros");
	    	  break;
	    	  
	      case 2:
	    	  
	    	  System.out.println("Ingrese los pies");
	    	  medida=leer.nextDouble();
	    	  medida=medida*30.58;
	    	  System.out.println("Esto equivale a: "+medida+" centimetros");
	    	  break;
	    	  
	      case 3:
	    	  
	    	  System.out.println("Ingrese las pies");
	    	  medida=leer.nextDouble();
	    	  medida=medida*12;
	    	  System.out.println("Esto equivale a: "+medida+" pulgadas");
	    	  
	    	  break;
	    	  default:
	    		  System.out.println("Entrada no valida");
	    		  break;
	}
	}
}
