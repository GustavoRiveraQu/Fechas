package cl.grivera;
import java.util.*;

public class CalculoFechas {

	public static void main(String[] args) {
	
		//ingreso de variables
		String edad1;
		String edad2;
		int anio1;
		int mes1;
		int dia1;
		int anio2;
		int mes2;
		int dia2;
		String persona1 = "persona 1 es mayor";
		String persona2 = "persona 2 es mayor";
		
		
		//Ingreso de Fechas 
		
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
		edad1= ingreso.next();
		System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
		edad2= ingreso.next();
		
		//Pasar de String a INT
		
		 anio1 = Integer.parseInt(edad1.substring(6,10));
		 mes1 =  Integer.parseInt(edad1.substring(3,5));
		 dia1 =  Integer.parseInt(edad1.substring(0,2));
		 anio2 = Integer.parseInt(edad2.substring(6,10));
		 mes2 =  Integer.parseInt(edad2.substring(3,5));
		 dia2 =  Integer.parseInt(edad2.substring(0,2));
		 
		//Comparador 
		 
		 if(anio1<anio2) {
			 System.out.println(persona1);
		 }
		 else if (anio2<anio1) {
			 System.out.println(persona2);			 
		 }
		 else if (mes1<mes2) {
			 System.out.println(persona1);
		 }
		 else if (mes2<mes1) {
			 System.out.println(persona2);
		 }
		 else if (dia1<dia2) {
			 System.out.println(persona1);
		 }
		 else if (dia2<dia1) {
			 System.out.println(persona2);
		 }
		
		 else {
			 System.out.println("Tienen la Misma Edad");
		 }


		
		

	}

}
