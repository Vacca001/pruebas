import java.util.Random;

public class Arrays1 {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10]; 
        Random random = new Random();

        
        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = random.nextInt(10) + 1; 
        }

        
        System.out.println("Número | Cuadrado | Cubo");
        System.out.println("------------------------");
        for (int num : vector_numeros) {
            System.out.printf("%6d | %8d | %4d%n", num, (num * num), (num * num * num));
        }
    }
}

    
