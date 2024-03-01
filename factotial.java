package numeros;
import java.util.Scanner;
public class factotial {

	public static void main(String[] args) {
		
		Scanner leer =new Scanner(System.in);
		
int numero=0;
System.out.println("ingrese el numero que desea sacar el factorial:");
numero=leer.nextInt();
double factorial=1;
for (int i = 1; i <= numero; i++) {
    factorial *= i;
}
System.out.print("el resultado es: "+factorial);
	


	}

}
