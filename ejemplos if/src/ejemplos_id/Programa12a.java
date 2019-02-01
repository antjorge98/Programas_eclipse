package ejemplos_id;

import java.util.Scanner;

public class Programa_12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double venta;
		int v1=0,v2=0,v3=0,n,i=0;
			String r;
		Scanner leer = new Scanner (System.in);
		System.out.println("Ingrese el numero de ventas: ");
		n=leer.nextInt();
		 while(i<n){
		System.out.println("Ingrese la venta: ");
		venta=leer.nextDouble();
		
		if(venta<=200) {
			v1++;
			
		}		
		
		if (venta>200 && venta<400) {
			v2++;
		}
			
		
		/*else {
			v3++;
		}*/
	i++;
		};
		
		System.out.println("Se hicieron "+n+ " ventas");
		System.out.println("Se hicieron "+v1+ " ventas de menos de $200");
		System.out.println("Se hicieron "+v2+ " ventas de mas de $200 y menos de $400");
		//System.out.println("Las demas ventas fueron "+v3);
	}

}
