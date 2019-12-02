import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Conversor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Cambio de divisa euros/dolares");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Euros: ");
		float euros = Float.parseFloat(in.readLine());
		System.out.print("a cuanto está el cambio: ");
		float tipo = Float.parseFloat(in.readLine());
		System.out.printf("Dolares: %.2f\n", euros * tipo);

	}

}
