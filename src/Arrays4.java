import java.util.Scanner;
public class Arrays4{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10]; 
        int contador = 0;

        
        System.out.println("Ingrese números para llenar el vector (Ingrese un número negativo para detenerse):");
        while (contador < vector.length) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; 
            }

            vector[contador] = numero;
            contador++;
        }

    
        System.out.println("\nElementos del vector:");
        for (int i = 0; i < contador; i++) {
            System.out.print(vector[i] + " ");
        }
        
        
        scanner.close();
    }
}
