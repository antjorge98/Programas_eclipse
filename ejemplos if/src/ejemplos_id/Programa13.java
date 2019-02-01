package ejemplos_id;

import java.util.Scanner;

public class Programa_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=0, serie;
String r;
Scanner leer= new Scanner(System.in);
do {
System.out.println("Ingrese el limite de la serie: ");
serie=leer.nextInt();


 for(int i=0;i<=serie;i=i+2){
	 
	 
	 
	 System.out.println(i);
 }
 System.out.println("¿Desea hacer otra serie (s/n)? ");
 r=leer.next();
}while(r.equals("s"));
	}

}
