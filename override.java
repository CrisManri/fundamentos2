package calculadorainterface;

public class override implements operacionesin{

	@Override
	public double suma(double... numeros) {
		int resultado=0;
		for(double numero:numeros) {
			
			resultado+=numero;
		}
		return resultado;
	}

	@Override
	public double resta(double... numeros) {
		
		int resultado=0;
		for(double numero:numeros) {
			
			resultado-=numero;
		}
		return resultado;
	}

	
}
