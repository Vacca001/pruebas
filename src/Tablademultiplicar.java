
import java.util.Scanner;

public class Tablademultiplicar {
    //Escribe un programa que genere la tabla de multiplicar de un número ingresado por el usuario utilizando un ciclo for.
    public static void main(String[] args) {
        int numero;
        try ( //Se crea el scannner.
                Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese un numero");
            numero = input.nextInt();
            //Cerramos scanner.
        }
        for (int i = 1; i <= 10; i++) {

            int resultado = numero * i;

            System.out.println(numero + "*" + i + "=" + resultado);
        }

    }
}
