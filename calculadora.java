package calculadorainterface;
import java.util.Random;
import java.util.Scanner;

public class calculadora {
	
	 public static void main(String[] args) {
		
	        pedirnumeros();
	        
	    }

	    public static void pedirnumeros() {
	    	Random random=new Random();
	    	 override calcular=new override();
	        Scanner leer = new Scanner(System.in);

	        System.out.println("Ingrese la cantidad de números que desea operar:");
	        int canNumeros = leer.nextInt();
	        double[] numeros = new double[canNumeros]; 

	        System.out.println("Ingrese " + canNumeros + " números separados por espacios:");
	        for (int i = 0; i < canNumeros; i++) {
	            numeros[i] = leer.nextDouble(); 
	        }

	        double resultado=0;
	        System.out.println("Ingrese la operación que desea realizar:");
	        System.out.println("1. Suma");
	        System.out.println("2. Matriz");
	        int operacion = leer.nextInt();

	        switch (operacion) {
	            case 1: 
	                  System.out.println("el resultado es "+calcular.suma(numeros));             
	                break;
	            case 2:
	            	int filas=0;
	            	int col=filas;
	      
	            	System.out.print("Ingrese el tamaño de la matriz: ");
	            	int tamaño=leer.nextInt();
	            	int matriz[][] = new int[tamaño][tamaño];

	        		for (int i = 0; i < filas; i++) {
	        			for (int j = 0; j < col; j++) {
	        				matriz[i][j] = random.nextInt(10);
	        			}
	        		}
	        		for (int i = 0; i < matriz.length; i++) {
	        			for (int j = 0; j < matriz[i].length; j++) {
	        				System.out.print(matriz[i][j] + " ");
	        			}
	        			System.out.println();
	        		}
	          
	        }

	       
	    
	    }
	}
