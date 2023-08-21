import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble(), area, n = 3.14159;

        area = raio * raio * n;

        System.out.printf("A=%.4f" + area);
        sc.close(); 
    }
}
