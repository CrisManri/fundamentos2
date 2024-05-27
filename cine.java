package calculadora;

import java.util.Scanner;

public class cine {

	static Scanner leer = new Scanner(System.in);
	static int desocupado = 0;
	static int ocupado = 1;
	static int filas = 8;
	static int columnas = 8;
	static int[][] tablero = new int[filas][columnas];

	public cine() {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tablero[i][j] = desocupado;
			}
		}
	}

	public static void mostrarSala() {
		System.out.println("Estado actual de la sala de cine:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (tablero[i][j] == desocupado) {
					System.out.print("O ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}

	}

	public static void reservarAsiento() {
		System.out.print("Ingrese El Numero De Asientos Que Desea Reserbar");
		int numAsientos = leer.nextInt();

		for (int b = 0; b < numAsientos; b++)

			while (true) {
				System.out.print("Ingrese el número de fila (1-" + filas + "): ");
				int fila = leer.nextInt();
				System.out.print("Ingrese el número de columna (1-" + columnas + "): ");
				int asiento = leer.nextInt();

				if (fila < 1 || fila > filas || asiento < 1 || asiento > columnas) {
					System.out.println("Selección inválida. Por favor, intente de nuevo.");

				}

				if (tablero[fila - 1][asiento - 1] == ocupado) {
					System.out.println("Lo siento, ese asiento ya está ocupado. Por favor, seleccione otro.");
				} else {
					tablero[fila - 1][asiento - 1] = ocupado;
					System.out.println("¡Asiento reservado con éxito!");
					break;
				}
			}
	}

	public static void cancelarReserva() {

		while (true) {
			System.out.print("Ingrese el número de fila (1-" + filas + "): ");
			int fila = leer.nextInt();
			System.out.print("Ingrese el número de la columna (1-" + columnas + "): ");
			int asiento = leer.nextInt();

			if (fila < 1 || fila > filas || asiento < 1 || asiento > columnas) {
				System.out.println("Selección inválida. Por favor, intente de nuevo.");
				continue;
			}

			if (tablero[fila - 1][asiento - 1] == desocupado) {
				System.out.println("Este asiento ya está disponible. No se puede cancelar la reserva.");
			} else {
				tablero[fila - 1][asiento - 1] = desocupado;
				System.out.println("¡Reserva cancelada con éxito!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		cinne cine = new cinne();
		while (true) {
			System.out.println("\n1. Mostrar sala de cine");
			System.out.println("2. Reservar asiento");
			System.out.println("3. Cancelar reserva");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");
			int opcion = leer.nextInt();

			switch (opcion) {
			case 1:
				mostrarSala();
				break;
			case 2:
				reservarAsiento();
				break;
			case 3:
				cancelarReserva();
				break;
			case 4:
				System.out.println("¡Hasta luego!");
				System.exit(0);
			default:
				System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
			}
		}
	}
}
