package ejemplos_id;

import java.util.Scanner;

public class Programa_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int op;
double medida, equi;
	Scanner leer = new Scanner(System.in);

	
	
	do {
		System.out.println("1.- Pulgadas a centimetros");
		System.out.println("2.- Pies a centimetros");
		System.out.println("3.- Pies a pulgadas");
		System.out.println("4.- Finalizar");
		
		System.out.println("Dar opcion: ");
		op=leer.nextInt();
	switch(op){
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
  	  
    case 4:
    	
    	System.out.println("Si quiere una conversion eliga las otras opciones, gracias");
    	
  	  default:
  		  
  		  System.out.println("Entrada no valida");
  		  
  		  break;
}
    
	} while (op!=4);
	}

}
