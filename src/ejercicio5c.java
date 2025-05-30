import java.util.Scanner;

public class ejercicio5c {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese su sueldo");
    double numero = scanner.nextDouble();
    if (3000<numero) {
        System.out.println("Debe abonar impuestos");
    
            
        }
        if (numero<3000) {
            System.out.println("No debe de pagar impuestos");
        }
    }
    }

