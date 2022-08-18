import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double x = 0;
        System.out.println("Ingrese un precio");
        x = sc.nextDouble();

        System.out.println(iva(x));
    }

    public static double iva(double precio){
        return precio + (0.12*precio);
    }
}
