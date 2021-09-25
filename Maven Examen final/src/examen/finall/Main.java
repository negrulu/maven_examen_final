package examen.finall;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		Scanner entradaOpcion = new Scanner(System.in);
		Scanner entradaOpcionPoliza = new Scanner(System.in);
		
		int opcion;
		int opcionP;
		General general1 = new General();
		
		do {
			System.out.println("ASEGURADORA DEL SUR, elija una opción:");
			System.out.println("1.Ingresar Póliza");
			System.out.println("2.Actualizar Valor");
			System.out.println("3.Consultar Póliza");
			System.out.println("4.Imprimir Reporte");
			System.out.println("5.Salir");
			opcion = entradaOpcion.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Ingrese que tipo de poliza quiere ingresar");
				System.out.println("1. Poliza general");
				System.out.println("2. Poliza Vip");
				opcionP = entradaOpcionPoliza.nextInt();
				if(opcionP==1) {
					System.out.println("Ingrese su nombre: ");
					String nombreIngresado = entrada1.nextLine();
					general1.setNombre(nombreIngresado);
					System.out.println("Ingrese la descripcion: ");
					String descripcionIngresada = entrada1.nextLine();
					general1.setDescripcion(descripcionIngresada);
					System.out.println("Ingrese el año de vigencia: ");
					int anioVigenciaIngresado = entrada1.nextInt();
					general1.setAnioVigencia(anioVigenciaIngresado);
					
					
				} else {
					
				}
			}
			
		}while (opcion==5);
	}

}
