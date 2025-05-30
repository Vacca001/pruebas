
import java.util.Scanner;

public class Numerofactorial {
    public static void main(String[] args) {
        int number;
        //se ingresa el numero.
        try ( //Se crea el scanner.
                Scanner numero = new Scanner(System.in)) {
            //se ingresa el numero.
            System.out.println("ingrese el numero:");
            number = numero.nextInt();
            //cerramo el scanner.
        }
        int factorial = 1;
        int i = 1;

        //Se crea el while.
        while ( i <= number) {
          factorial *= i;
          i++;

        }
      
        System.out.println("EL factorial de " + number + " es: " + factorial);
    }
}
