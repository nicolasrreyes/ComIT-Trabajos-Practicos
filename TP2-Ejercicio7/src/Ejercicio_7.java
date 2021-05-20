/*Ejercicio 7
Se recibe una solicitud de ingreso a un trabajo, en respuesta a un aviso
publicado en una página web. En dicha solicitud se especifica: edad en años
del asírante, experiencia en el oficio, también expresada en años, y
remuneración estimativa a percibir mensualmente. La empresa usa los
siguientes criterios de selección:
la edad debe estar entre 18 y 35 años inclusive en ambos extremos del
intervalo, sino será rechazado.
la experiencia menor a los 3 años debe estimar una remuneración debajo
de los $50000 mensuales, sino será rechazado.
si la edad del solicitante es mayor a los 32 años, deberá tener como mínimo
6 años de experiencia; si la experiencia es menor a los 6 años y mayor a 3
años, se lo tomará en forma condicional. En cualquier otro caso se lo
rechazará.
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
			System.out.println("Ingrese experiencia en años");
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

			
		
			
					
			
						
