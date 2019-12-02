import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Nota de matem�ticas: ");
		float notaExamenM = Float.parseFloat(in.readLine());
		System.out.print("Nota del primer trabajo de matem�ticas: ");
		float notaTrabajo1M = Float.parseFloat(in.readLine());
		System.out.print("Nota del segundo trabajo de matem�ticas: ");
		float notaTrabajo2M = Float.parseFloat(in.readLine());
		System.out.print("Nota del tercer trabajo de matem�ticas: ");
		float notaTrabajo3M = Float.parseFloat(in.readLine());
		float notaMatematicas = notaExamenM * 0.9f + ((notaTrabajo1M + notaTrabajo2M + notaTrabajo3M) / 3f) * 0.1f;
		
		System.out.print("Nota de f�sica: ");
		float notaExamenF = Float.parseFloat(in.readLine());
		System.out.print("Nota del primer trabajo de f�sica: ");
		float notaTrabajo1F = Float.parseFloat(in.readLine());
		System.out.print("Nota del segundo trabajo de f�sica: ");
		float notaTrabajo2F = Float.parseFloat(in.readLine());
		float notaFisica = notaExamenF * 0.8f + ((notaTrabajo1F + notaTrabajo2F) / 2f) * 0.2f;
		
		System.out.print("Nota de qu�mica: ");
		float notaExamenQ = Float.parseFloat(in.readLine());
		System.out.print("Nota del primer trabajo de qu�mica: ");
		float notaTrabajo1Q = Float.parseFloat(in.readLine());
		System.out.print("Nota del segundo trabajo de qu�mica: ");
		float notaTrabajo2Q = Float.parseFloat(in.readLine());
		System.out.print("Nota del tercer trabajo de qu�mica: ");
		float notaTrabajo3Q = Float.parseFloat(in.readLine());
		float notaQuimica = notaExamenQ * 0.85f + ((notaTrabajo1Q + notaTrabajo2Q + notaTrabajo3Q) / 3f) * 0.15f;
		
		System.out.printf("Nota de matem�ticas: %.2f\n", notaMatematicas);
		System.out.printf("Nota de f�sica: %.2f\n", notaFisica);
		System.out.printf("Nota de qu�mica: %.2f\n", notaQuimica);
		System.out.printf("Nota media global: %.2f\n", ((notaMatematicas + notaFisica + notaQuimica) / 3));
	}

}
