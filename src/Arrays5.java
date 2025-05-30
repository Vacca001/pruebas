import java.util.Arrays;
import java.util.Random;

public class Arrays5 {
    public static void main(String[] args) {
        int[] vector = new int[10]; 
        Random random = new Random();

        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100) + 1; 
        }

        
        System.out.println("Vector original:");
        System.out.println(Arrays.toString(vector));

        
        Arrays.sort(vector);

        
        System.out.println("Vector ordenado:");
        System.out.println(Arrays.toString(vector));
    }
}