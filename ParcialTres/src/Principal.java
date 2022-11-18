//importar la biblioteca Scanner de Java
import java.util.Scanner;

//clase principal con modificador de acceso publico
public class Principal {
	
	//método principal
	public static void main(String[] args) {
		
		//capturar información ingresada por el usuario
		Scanner sc = new Scanner(System.in);
		
		//escribir en pantalla
		System.out.println("Bienvenido");
		System.out.println("Digite el número correspondiente al salario que quiera conocer: ");
		System.out.println("1. Desarrollador Backend");
		System.out.println("2. Desarrollador Frontend");
		System.out.println("");
		
		System.out.println("Digite una de las opciones anteriores:s");
		char input = sc.next().charAt(0);
		
		//menú para usuario
		switch (input) {
		//caso 1
		case '1': OperacionEmpleado b = new DesarrolladorBackend();
		System.out.println(b.devolverSalario());
			break;
			
		//caso 2
		case '2': OperacionEmpleado f = new DesarrolladorFrontend();
		System.out.println(f.devolverSalario());
		break;
		
		//caso por default
		default: System.out.println("DIGITE UNA OPCIÓN VÁLIDA");
			break;
		}
		
	}
}
