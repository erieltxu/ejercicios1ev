import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hola, dime tu nombre por favor: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long entrada = System.currentTimeMillis();
		String nombre = in.readLine();
		long salida = System.currentTimeMillis();
		double segundos = (salida - entrada) / 1000d;
		System.out.printf("Hola, %s has tardado %.3f", nombre, segundos);

		}

}
