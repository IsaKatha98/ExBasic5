package exbasic5;

import java.util.Scanner;

public class ExBasic5 {

	public static void main(String[] args) {
		
	//Creo el escáner
		
		Scanner sc= new Scanner (System.in);

	//Declaro la variable radio, longitud y área
		double radio;
		double longitud;
		double area;
	
	//Le pido al usuario que introduzca el radio
		System.out.print("Introduzca el radio de la circunferencia y pulse Intro: ");
		
	//Guardamos el número introducido
		radio=sc.nextDouble();

	//Calculamos la variable longitud
		longitud= 2*radio*Math.PI;
		
	//Calculamos el área
		area= Math.PI*radio*radio;
		
	//Mostramos el resultado
		System.out.println("La longitud de la circunferencia es: "+longitud+" um.");
		System.out.println("La longitud del área de la circunferencia es: "+area+" um.");

	}

}
