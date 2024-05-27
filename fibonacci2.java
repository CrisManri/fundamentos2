package fibonacci;

import java.util.Scanner;

public class fibonacci2 {

	
	
	public static int fibonacci (int n){
		
		int a=0,b=1,opera=0;
		
			for(int i=1;i<=n;i++) {
				System.out.print(a+" ");
				opera=a+b;
				a=b;
				b=opera;
			}
		
	return opera;
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("ingresa el numero para la secuencia");
			int n=leer.nextInt();
			int serie=fibonacci(n);
		System.out.print("el numero resultado es "+serie);
	

	
	}
		
	}
