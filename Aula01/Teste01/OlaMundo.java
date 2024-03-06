import java.util.Scanner;
class OlaMundo {
	public static void main(String [] args) {

		Scanner leitor = new Scanner(System.in);

		String msg = leitor.nextLine();
		int numero = leitor.nextInt();

		System.out.println(msg);
		System.out.println(numero);
		System.out.println("Olá meu mundo Java!");
	}
}