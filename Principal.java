package primeraParte;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("que nave deseas ver sus caracteristicas:"
				+ "1. lanzadera"
				+ "2. No tripulada "
				+ "3. tripulada"
				+ "4. Observatorio");
	int opcion = sc.nextInt();
	 switch(opcion) {
     case 1:
    	 System.out.println("nave lanzadera");
    	 Lanzadera lanzadera = new Lanzadera ("lanzadera" ,"nitrogeno", 2900,29000,32000);
     break;
     
     case 2:
    	 break;
     case 3:
    	 break;
     case 4:
    	 break;
    	 
    	 
	 }
	 sc.close();
	}
}
