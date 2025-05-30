
import java.util.Scanner;

public class Medianumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         //Se le pide al usuario que ingrese tres numeros.
         System.out.println("introduce tres numeros");
         int numero1 = input.nextInt();
         int numero2 = input.nextInt();
         int numero3 = input.nextInt();
 
         //Se calcula la media de los tres numeros.
         int suma = numero1 + numero2 + numero3;
         double media = suma / 3;
 
         //Se imprime el resultado.
         System.out.println("lo numeros que se ingresaron fueron: " + numero1 + "," + numero2 + "," + numero3 + " y la media de los tres numeros es: " + media);
 
         //se cierra el scanner.
         input.close();
    }
}
