package ahorcado;

public class juego {
	  private String elegirpalabra;
	    private StringBuilder palabraActual;
	    private int intentosMaximos = 6;
	    private int intentosRestantes;
	    private StringBuilder letrasAdivinadas;

	    public juego(String elegirpalabra) {
	        this.elegirpalabra = elegirpalabra;
	        palabraActual = new StringBuilder("_".repeat(elegirpalabra.length()));
	        intentosRestantes = intentosMaximos;
	        letrasAdivinadas = new StringBuilder();
	    }

	    public void intentar(char letra) {
	        if (letrasAdivinadas.indexOf(String.valueOf(letra)) != -1) {
	            System.out.println("Ya has intentado esta letra. Intenta con otra.");
	            return;
	        }

	        letrasAdivinadas.append(letra).append(" ");

	        if (elegirpalabra.indexOf(letra) != -1) {
	            for (int i = 0; i < elegirpalabra.length(); i++) {
	                if (elegirpalabra.charAt(i) == letra) {
	                    palabraActual.setCharAt(i, letra);
	                }
	            }
	        } else {
	            intentosRestantes--;
	            System.out.println("¡Incorrecto! Te quedan " + intentosRestantes + " intentos.");
	        }
	    }

	    public String mostrarPalabra() {
	        return palabraActual.toString();
	    }

	    public String letrasAdivinadas() {
	        return letrasAdivinadas.toString();
	    }

	    public boolean estaTerminado() {
	        return intentosRestantes <= 0 || palabraActual.indexOf("_") == -1;
	    }

	    public boolean gano() {
	        return palabraActual.indexOf("_") == -1;
	    }
	}


