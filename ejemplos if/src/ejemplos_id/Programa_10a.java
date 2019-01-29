package ejemplos_id;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Programa_10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,num=0;
		double precio,suma=0,total;
		Format form=new DecimalFormat("###,###.###");
       Scanner leer = new Scanner (System.in);
       System.out.println("Ingrese cuantos productos va a comprar: ");
	   n=leer.nextInt();
	   
       do {
    	   System.out.println("Ingrese el precio del producto: ");
    	   precio=leer.nextDouble();
    	   suma=precio+suma;
    	   num=num+1;
    	   
       }while(num!=n);
       
       if(suma>=1500) {
			total=(suma*0.11)+suma;
			System.out.println( "El total es: $"+ form.format (total));
		}	
			else {
				total=(suma*0.10)+suma;
				
				System.out.println("El total es: $"+ form.format (total));
	}
	}

}
