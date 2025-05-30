
import java.util.Scanner;

public class Datosentradasalida {
    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("ingrese su nombre ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese su edad ");
                int edad = scanner.nextInt();
                System.out.println("Ingresa tu altura ");
                double altura = scanner.nextDouble();
                
                System.out.println("hola. " + nombre + ". tienes " + edad + " años y mides " + altura + " metros.");

                scanner.close();
            }

    }
    
}
