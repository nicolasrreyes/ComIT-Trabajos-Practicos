/*Ejercicio 7
Se recibe una solicitud de ingreso a un trabajo, en respuesta a un aviso
publicado en una p�gina web. En dicha solicitud se especifica: edad en a�os
del as�rante, experiencia en el oficio, tambi�n expresada en a�os, y
remuneraci�n estimativa a percibir mensualmente. La empresa usa los
siguientes criterios de selecci�n:
la edad debe estar entre 18 y 35 a�os inclusive en ambos extremos del
intervalo, sino ser� rechazado.
la experiencia menor a los 3 a�os debe estimar una remuneraci�n debajo
de los $50000 mensuales, sino ser� rechazado.
si la edad del solicitante es mayor a los 32 a�os, deber� tener como m�nimo
6 a�os de experiencia; si la experiencia es menor a los 6 a�os y mayor a 3
a�os, se lo tomar� en forma condicional. En cualquier otro caso se lo
rechazar�.
Realizar un programa que permita decidir a partir de los datos del aspirante si
fue seleccionado definitivamente, en forma condicional, o rechazado. Imprimir
un mensaje que indique lo ocurrido.
*/
import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int edad;
		int experiencia = 0;
		double remuneracion = 0;
		boolean aceptado = true;
		String mensaje;

		

			System.out.println("Ingrese su edad");
			edad = scan.nextInt();
			System.out.println("Ingrese experiencia en a�os");
			experiencia = scan.nextInt();
			System.out.println("Ingrese remuneracion pretendida");
			remuneracion = scan.nextDouble();
	
			if (edad>=18 && edad <=35) {
				if (edad >32 && (experiencia >6))
					System.out.println("Su solicitud fue aceptada");
				else if (experiencia <3 && (remuneracion <5000))
					System.out.println("Su solicitud fue aceptada");
				else if ((edad>= 32 && (experiencia<6)&& (experiencia>=3)))
						System.out.println("Su solicitud fue aceptada de manera condicional");
				else if ((edad >=32 && edad <=35)&& (experiencia>=6))
					System.out.println("Su solicitud fue aceptada");
				else if (edad <32)
					System.out.println("Su solicitud fue aceptada");
				else System.out.println("SU solicitud fue rechazada");
			}
			else System.out.println("Su solicitud fue rechazada");
			}
	
			
			
			
			
			
			
	}

			
		
			
					
			
						
