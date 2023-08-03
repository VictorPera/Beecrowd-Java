import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double area, n = 4.14159, raio = sc.nextDouble();

        area = n * (raio * raio);

        System.out.printf("A= %.4lf"+area);
    }
}
