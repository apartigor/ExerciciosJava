import java.util.Scanner;

public class ExFix03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[] nota = new double[5];

        System.out.println("Matrícula: ");
        int matric = ler.nextInt();
        ler.nextLine();
        System.out.println("Nome: ");
        String nome = ler.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota (" + (i + 1) + "): ");
            nota[i] = ler.nextDouble();
            while (nota[i] < 0 || nota[i] > 10) {
                System.out.println("Nota Invalida digite a nota entre 0 e 10");
                nota[i] = ler.nextDouble();
            }
        }

        System.out.println("Matrícula: " + matric);
        System.out.println("Nome: " + nome);
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota (" + (i + 1) + "): " + nota[i]);
        }
        ler.close();
    }
}
