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
		Vip vip1 = new Vip();
		Poliza datos[] = new Poliza [150];
		
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
					System.out.println("Ingrese el codigo de poliza: ");
					int codigoPolizaIngresado = entrada1.nextInt();
					general1.setCodigoPoliza(codigoPolizaIngresado);
					System.out.println("Ingrese el valor de poliza: ");
					int valorPolizaIngresado = entrada1.nextInt();
					general1.setValorPoliza(valorPolizaIngresado);
					System.out.println("Ingrese el codigo de descuento: ");
					int codigoDescuentoIngresado = entrada1.nextInt();
					general1.setCodigoDescuento(codigoDescuentoIngresado);
					System.out.println("Ingrese el numero de seguro: ");
					int numeroSeguroIngresado = entrada1.nextInt();
					general1.setNumeroSeguro(numeroSeguroIngresado);									
				} else {
					System.out.println("Ingrese su nombre: ");
					String nombreIngresado = entrada1.nextLine();
					vip1.setNombre(nombreIngresado);
					System.out.println("Ingrese la descripcion: ");
					String descripcionIngresada = entrada1.nextLine();
					vip1.setDescripcion(descripcionIngresada);
					System.out.println("Ingrese el año de vigencia: ");
					int anioVigenciaIngresado = entrada1.nextInt();
					vip1.setAnioVigencia(anioVigenciaIngresado);
					System.out.println("Ingrese el codigo de poliza: ");
					int codigoPolizaIngresado = entrada1.nextInt();
					vip1.setCodigoPoliza(codigoPolizaIngresado);
					System.out.println("Ingrese el codigo de poliza: ");
					int valorPolizaIngresado = entrada1.nextInt();
					vip1.setValorPoliza(valorPolizaIngresado);
					System.out.println("Ingrese el codigo de descuento: ");
					int beneficioIngresado = entrada1.nextInt();
					vip1.setBeneficio(beneficioIngresado);
				}
			case 2:
				//actualizar valor
				System.out.println("Ingrese el codigo de poliza a cambiar: ");
				int codigoPolizaCambiar = entrada1.nextInt();
				for (int i = 0; i <= datos.length; i++) {
					Poliza poliza = datos[i];
					boolean busqueda = poliza.get
					if (busqueda == true) {
						System.out.println("Ingrese el nuevo código de su póliza: ");
						int codigoPoliza2 = entrada1.nextInt();
						poliza.setCodigoPoliza(codigoPoliza2);
						
					} else {
						System.out.println("No se ha encontrado su póliza...");
					}
					
				}
				
			case 3:
				//consultar
				System.out.println("Ingrese el codigo de poliza a buscar: ");
				int codigPolizaCambiar = entrada1.nextInt();
				
				
			case 4:
				//imprimir
				
				
			}
			
		}while (opcion==5);
	}

}
