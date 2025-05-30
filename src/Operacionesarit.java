
import java.util.Scanner;

public class Operacionesarit {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese el primer numero: ");
            int numberOne = input.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            int numberTwo = input.nextInt();
            
            int suma = numberOne+numberTwo;
            int resta = numberOne-numberTwo;
            int multiplicacion =numberOne*numberTwo;
            int divicion = numberOne/numberTwo;
            int modulo = numberOne%numberTwo;
            
            System.out.println("suma: " + suma);
            System.out.println("resta: " + resta);
            System.out.println("multiplicacion: " + multiplicacion);
            System.out.println("divicion: " + divicion);
            System.out.println("modulo: " + modulo);
        }

    }
}
