import java.util.Scanner;

public class URI1002 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();

		System.out.printf("A=%.4f\n", 3.14159*raio*raio);
	}
}
