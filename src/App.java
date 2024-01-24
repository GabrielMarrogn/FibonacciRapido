import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        sc.close();

        double soma = Math.pow(((1 + Math.sqrt(5))/2),a);
        soma = soma - Math.pow(((1 - Math.sqrt(5))/2),a);
        soma = soma / Math.sqrt(5);

        System.out.printf("%.1f\n",soma);
    }
}
