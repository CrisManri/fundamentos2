package numeros;
import java.util.Scanner;
public class parcial {

	public static void main(String[] args) {
		//crear una aplicacion para ayudar al rey sabio a descubrir cual es el total de las fuerzas en combate y mostrar la baja total en filas de infanteria, caballeria y cballeria pesada
 Scanner bajas= new Scanner(System.in);
		int faccionA=1500,faccionB=1300;
		int bajas1lineaA=0,bajas2lineaA=0,bajas3lineaA=0;
		int bajas1lineaB=0,bajas2lineaB=0,bajas3lineaB=0;
		int totalbajasfacA=0,totalbajasfacB=0;
		int totalA=0,totalB=0;
		int TOTAL=0;
    //linea infanteria faccion A
 		System.out.println("faccion A : en la linea de infanteria: ");
 		System.out.print("cuantos muertos en batalla : ");
 		int muertos1= bajas.nextInt();
 		System.out.print("cuantos heridos de gravedad: ");
 		int heridos1= bajas.nextInt();
 		System.out.print("cuantos cuantos desertores : ");
 		int desertores1= bajas.nextInt();
 		bajas1lineaA =muertos1+heridos1+desertores1;
     //linea de caballeria faccion A
 		System.out.println("en  faccion A la linea de caballeria: ");
 		System.out.print("cuantos muertos  en batalla : ");
 		int muertos2= bajas.nextInt();
 		System.out.print("cuantos heridos de gravedad: ");
 		int heridos2= bajas.nextInt();
 		System.out.print("cuantos cuantos desertores : ");
 		int desertores2= bajas.nextInt();
 		bajas2lineaA =muertos2+heridos2+desertores2;
 	//linea de caballeria pesada
 		System.out.println("en faccion A la linea de caballeria pesada: ");
 		System.out.print("cuantos muertos  en batalla : ");
 		int muertos3= bajas.nextInt();
 		System.out.print("cuantos heridos de gravedad: ");
 		int heridos3= bajas.nextInt();
 		System.out.print("cuantos cuantos desertores : ");
 		int desertores3= bajas.nextInt();
 		bajas3lineaA =muertos3+heridos3+desertores3;
    totalbajasfacA= bajas1lineaA+bajas2lineaA+bajas3lineaA;
    totalA=faccionA-totalbajasfacA;
    
    
  //linea infanteria faccion b
		System.out.println("faccion B: en la linea de infanteria: ");
		System.out.print("cuantos muertos de infanteria en batalla : ");
		int muertos4= bajas.nextInt();
		System.out.print("cuantos heridos de gravedad: ");
		int heridos4= bajas.nextInt();
		System.out.print("cuantos cuantos desertores : ");
		int desertores4= bajas.nextInt();
		bajas1lineaB =muertos4+heridos4+desertores4;
 //linea de caballeria faccion A
		System.out.println("en la linea de caballeria: ");
		System.out.print("cuantos muertos  en batalla : ");
		int muertos5= bajas.nextInt();
		System.out.print("cuantos heridos de gravedad: ");
		int heridos5= bajas.nextInt();
		System.out.print("cuantos cuantos desertores : ");
		int desertores5= bajas.nextInt();
		bajas2lineaB =muertos5+heridos5+desertores5;
	//linea de caballeria pesada
		System.out.println("en la linea de caballeria pesada: ");
		System.out.print("cuantos muertos  en batalla : ");
		int muertos6= bajas.nextInt();
		System.out.print("cuantos heridos de gravedad: ");
		int heridos6= bajas.nextInt();
		System.out.print("cuantos cuantos desertores : ");
		int desertores6= bajas.nextInt();
		bajas3lineaB =muertos6+heridos6+desertores6;
totalbajasfacB= bajas1lineaB+bajas2lineaB+bajas3lineaB;
totalB=faccionB-totalbajasfacB;
TOTAL=totalA+totalB;
//total faccion A
System.out.println("la faccion A cuenta con un total de " +totalA+ " fuerzas en combate");
System.out.println("total de bajas de infanteria en faccion A: "+bajas1lineaA);
System.out.println("total de bajas de caballeria en faccion A: "+bajas2lineaA);
System.out.println("total de bajas de caballeria pesada en faccion A: "+bajas3lineaA);
//total faccion B
System.out.println("la faccion B cuenta con un total de " +totalB+ " fuerzas en combate");
System.out.println("total de bajas de infanteria en faccion B: "+bajas1lineaB);
System.out.println("total de bajas de caballeria en faccion B: "+bajas2lineaB);
System.out.println("total de bajas de caballeria pesada en faccion B: "+bajas3lineaB);
System.out.println("TOTAL DE LAS FUERZAS EN COMBATE DE AMBAS FACCIONES ES DE : "+TOTAL);
	}
	

}
