package ahorcado;
import java.util.Scanner;
public class Ahorcado extends juego {
	public Ahorcado(String palabraSecreta) {
		super(palabraSecreta);
	
	}

	public static void main(String[]args) {		
		


		Scanner Scanner = new Scanner(System.in);
        String[] palabras = {"carro", "programar", "camino", "ordenador", "objetos"};
        String Elegirpalabra = palabras[(int) (Math.random() * palabras.length)];
        juego juego = new juego(Elegirpalabra);

        while (!juego.estaTerminado()) {
            System.out.println("Palabra: " + juego.mostrarPalabra());
            System.out.println("Letras adivinadas: " + juego.letrasAdivinadas());
            System.out.print("Ingresa una letra: ");
            char letra = Scanner.nextLine().charAt(0);
            juego.intentar(letra);
        }

        if (juego.gano()) {
            System.out.println("¡Felicidades! Has ganado. La palabra era: " + Elegirpalabra);
        } else {
            System.out.println("¡Oh no! Te has quedado sin intentos. La palabra era: " + Elegirpalabra);
        }
    }
}
