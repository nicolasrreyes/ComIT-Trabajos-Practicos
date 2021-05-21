//Se ingresa la cantidad de patentes de automotor que serán procesadas en un
//registro. Cada número de patente viene acompañada del valor del modelo del
//año correspondiente. Se desea calcular el impuesto que debe pagar cada
//dueño de acuerdo a la siguiente tabla:
//si tiene nro de patente menor de 1000000, paga el 5% del valor del modelo.
//si la patente está entre 1000000 y 2000000 se paga el 10% del valor del
//modelo.
//en cualquier otro caso, abona el 15% del valor del auto.
//Imprimir el impuesto abonado por cada dueño, el monto total recaudado con
//dicho impuesto por el Registro del Automotor, y cual fue el porcentaje de autos
//cuya numeración fue superior a 1300000


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main_Patentes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("######.##");
		
		int cantPatentes = 0;
		int patente;
		double valModelo = 0;
		double impuesto = 0;
		double total = 0;
		int cont = 0;
		String resultado = "";
		
		
		System.out.println("Ingrese la Cantidad a Patentes a Evaluar:  ");
		cantPatentes = scan.nextInt();
		for (int i = 1; i <= cantPatentes; i++) {
			patente = (int) ((Math.random() * ((2500000 - 750000) + 1)) + 750000);
			valModelo = (Math.random() * ((1000000 - 100000) + 1)) + 100000;
			if (patente < 1000000) {
				impuesto = valModelo * 0.05;
				System.out.println("N° Patente " +patente+"\tEl impuesto a pagar por su auto es de $ "+decimal.format(impuesto) 
				 						+ " un 5% del "+decimal.format(valModelo));
			} else if ((patente > 1000000) && (patente < 2000000)) {
				impuesto = valModelo * 0.1;
				System.out.println("N° Patente " +patente+"\tEl impuesto a pagar por su auto es de $ "+decimal.format(impuesto) 
				 						+ " un 10% del "+decimal.format(valModelo));
			} else if (patente > 2000000) {
				impuesto = valModelo * 0.15;
				System.out.println("N° Patente " +patente+"\tEl impuesto a pagar por su auto es de $ "+decimal.format(impuesto) 
				 						+ " un 15% del "+decimal.format(valModelo));
			} else {
				System.out.println("El monto es demasiado bajo para un automotor");
			}

			if (patente > 1300000)
				cont += 1;

			 
			total += patente;
		}
	
					
					System.out.println("\nEl monto total recaudado es por el Registro Automotor es de $" + decimal.format(total) + "\n");
					System.out.println("El porcentaje de patentes mayores a 1300000 fue de " + (int)((cont * 100)/cantPatentes) + "%");
		}
}			


