import java.util.Scanner;
public class MainApp {

public static void main(String[] args) {

	 Scanner scan = new Scanner(System.in);

	 		  inicioProgama();
	 		  figurasLista();
	 		  
	 		 
	 		  whileMenuFiguras(scan);
}


private static void whileMenuFiguras(Scanner scan) {
	boolean seleccion = true;
	
	while (seleccion = true)	 	
	 	{
	    switch(menu(scan)){

		case 1: figuraCirculo(scan);
	       	break;
		case 2: 
			figuraCuadrado(scan);  
			break;
		case 3: 
			figuraRectangulo(scan);
			break;
		case 4:
			figuraTriangulo(scan);
			break;
		case 5:
			figuraTrapecio(scan);
			break;
			default:
			System.out.println("Elija un numero valido"); ;
				break;
		}
		}
}


private static int menu(Scanner scan) {
	int seleccion = 0;
	seleccion = scan.nextInt();
	return seleccion;
}


private static void figurasLista() {
	System.out.println(" Seleccione una Figura Geometrica");
	System.out.println("1 - Circulo");
	System.out.println("2 - Cuadrado");
	System.out.println("3 - Rectangulo");
	System.out.println("4 - Triangulo");
	System.out.println("5 - Trapecio");
	System.out.println("Salir del Programa");
	
}

private static void figuraTrapecio(Scanner scan) {
	double altura, base1, base2, area;
	System.out.println("Has elegido el trapecio");
	System.out.println("Ingresa la base menor : ");
	base1 = scan.nextDouble();
	System.out.println("Ingresa la base mayor : ");
	base2 = scan.nextDouble();	System.out.println("Ingresa la altura : ");
	altura = scan.nextDouble();
	area = ((altura)*(base1 + base2))/2;
	System.out.println("El area del trapecio es " + area);
}





private static void figuraTriangulo(Scanner scan) {
	double base, altura, triangulo;     
	  System.out.println("Has elegido el triangulo");
	  System.out.print("Ingrese base:\t");
	  base = scan.nextDouble();
	  System.out.print("Ingrese altura:\t");
	  altura = scan.nextDouble();
	  triangulo = (base*altura)/2;
	  System.out.print("El area del Rectangulo es: "+triangulo);
}






private static void figuraRectangulo(Scanner scan) {
	double base, altura, rectangulo;     
    	System.out.println("Has elegido el Rectangulo");  
    	System.out.print("Ingrese base:\t");
    	base = scan.nextDouble();
    	System.out.print("Ingrese altura:\t");
    	altura = scan.nextDouble();
    	rectangulo = (base*altura);
    	System.out.print("El area del Rectangulo es: "+rectangulo);
}






private static void figuraCuadrado(Scanner scan) {
	double area; 
	System.out.println("Ingrese el lado de cuadrado : ");
	double lado=scan.nextDouble();         
	area= (lado*lado);
	System.out.println("El area del cuadrado es "+ area);
}

private static void figuraCirculo(Scanner scan) {
	double radio, area;
	   System.out.print("Ingrese el radio del circulo: ");
	   radio = scan.nextInt();
	   area = 3.14159*(radio*radio);
	   System.out.printf("El área del circulo es: %f",area);
}
	
		

private static void inicioProgama() {
	System.out.println("Pograma Figuras Geometricas");
	System.out.println("*****************************");
}
 	
}

 