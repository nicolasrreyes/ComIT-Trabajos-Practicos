import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		
		int promedio = 0;
		int sumaNotas = 0;
		String[] apellidosAlumnos = new String[] {"MENDOZA","PIRLO", "SILVA" ,"RISSO","PINEDA" ,"TORRES","BERNARDEZ","GONZALEZ","GRASSI","PETRE","ALBORNOZ" ,"ROMERO" ,"HERRERA" ,"SANCHEZ" ,"CARDILLO" ,"SUAREZ","GASTACA","ESCOBAR","ACUÑA" ,"VEZULLA" ,"PAREDES" ,"LASCOITY","OJEDA","SANGUIN","VAZQUEZ","MILA","MASSOR","REYES","CARUGATI" ,"PEREYRA" ,"TORRES" ,"VALIN","SACHINI" ,"VARGAS","SANCHEZ","MONTERO","STORZ","PARRA" ,"MEGA","HOFNER","CITTAR","CAMPOS","LOPEZ","MARTINEZ","ALVAREZ","MORFESE","BANEGAS","MOYANO","LOPEZ","GIRALDE","ZUCATTO","GOMEZ","GARABENTO","LASTRA","AICARDI","CORDOBA","NINNI","CENTURION","QUIROGA","OLIVA" ,"SALINAS","PARDO","BROGGI","PEREYRA","AGÜERO","ALZAMENDI","FLORES","MOLINA","CAMPI","FLORES"};
		String[] nombresAlumnos = new String[] {"AXEL","STEFANO","ANGELINA","FRANCO","SOFIA","ISABELLA","AITANA","KEVIN","LUCRECIA","CATALINA","JUAN","SALVADOR","ERIK","DIEGO","MORENA","TEO","EMMA","TOMAS","NAYLA","DAMIAN","ELENA","PEDRO","CIRO","AMBAR","ZOE","LORENZO","THIAN","AMANDA","AINARA","NICOLE","MIRNA","MANUELA","OLIVIA","JULIAN","SALVADOR","SANTINO","MATIAS","JEREMIAS","NICOLAS","JULIA","LUCAS","DYLAN","VALENTIN","MARTINA","ABRIL","MIRKO","ISABEL","MAXIMO","ALMA","LUZ","JAZMIN","JULIAN","MAXIMO","NICOLAS","BENJAMIN","PEDRO","PAULINA","BRIANA","UMA","MILO","JULIETA","BENJAMIN","THIAGO","JAZMIN","MATILDE","IAN","FEDRA","AMBAR","PILAR","CATALINA"};
		int cantAlumnos = apellidosAlumnos.length;
		
		//,"THIAGO","MATEO","BAUTISTA"
		int[] notas = new int[cantAlumnos];
		
		
		obtenerNotas(apellidosAlumnos,nombresAlumnos,  notas);
		
		sumaNotas = sumaNotas(notas, cantAlumnos);
		
		promedio = (sumaNotas/cantAlumnos);
		
		System.out.println("***********************************************************");
		System.out.println("\t\t LA NOTA PROMEDIO ES DE:   \t\t "+ promedio);
		System.out.println();
		superanPromedio(nombresAlumnos,promedio,notas);
		System.out.println();
		System.out.println("*************************FIN*******************************")
		;
		
	}

	private static void obtenerNotas(String[] apellidosAlumnos,String[] nombresAlumnos, int[] notas){
		System.out.println("*********************Notas Alumnos*************************");	
		Random rand = new Random();		
		for(int i = 0; i <apellidosAlumnos.length; i++) {
			int nota = rand.nextInt(11);
			String mensaje = String.format("El alumno %s, %s obtuvo como nota : \t\t %s" , apellidosAlumnos[i],nombresAlumnos[i], nota);
			System.out.println(mensaje);
			notas[i] = nota;
		}
	}
	
	public static int sumaNotas(int[] notas, int sumaNotas) {
			sumaNotas = 0;
			for (int i = 0; i < notas.length; i++) {
				sumaNotas = sumaNotas + notas[i];
			}
			return sumaNotas;

			
		}
		
	public static void superanPromedio(String[] nombresAlumnos,int promedio,int[]notas) {
		System.out.println("*****************Superan el Promedio***********************");
		for(int i = 0; i<notas.length; i++) {
			if (notas[i]  > promedio) {
				String mensaje = String.format("El alumno %s supera el promedio: \t\t\t %s" , nombresAlumnos[i],notas[i]);
				System.out.println(mensaje);
				
			}
		}
		
		
		
		
		
		
	}
	
			
	
	
			
		}			
					
		
	
		
	


