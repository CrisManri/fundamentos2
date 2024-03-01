package numeros;
import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
	 Scanner numero = new Scanner(System.in);
	 System.out.print("ingrese el primer numero: ");
	 double Num1= numero.nextDouble();
	 
	 System.out.print("ingrese el segundo numero: ");
	 double Num2= numero.nextDouble();
	 
	 System.out.println("que operacion desea realizar");
	 System.out.println("1:Suma");
	 System.out.println("2:Resta");
	 System.out.println("3:Multiplicacion");
	 System.out.println("4:division");
	 
	int operación= numero.nextInt();
	double resultado = 0;
	
	switch(operación){
		
				case 1:
					resultado = Num1 + Num2;
					break;
				case 2:
					resultado = Num1 - Num2;
		   			break;
				case 3:
					resultado = Num1 * Num2;
					break;
				case 4:
					if(Num2 !=0) {
					resultado = Num1 / Num2;
					}
				     else {
						System.out.print("no se puede dicidir entre cero");
						return;
					}
					break;
				default:
					System.out.print("opcion no valida");
					return;
		}
		System.out.print("el resultado es :" +resultado);
	
	}
}

		
		

