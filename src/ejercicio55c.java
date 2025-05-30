import java.util.Scanner;

public class ejercicio4c {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escriba un numero");
        int numero1 = scanner.nextInt();
        System.out.println("Escriba otro numero");
        int numero2 = scanner.nextInt();
        if (numero1>numero2) {
            System.out.println(numero1+" es numero mayor que "+numero2);

        } 
        if (numero1<numero2) {
            System.out.println(numero2+" es mayor que "+numero1);
        }
            
        
    }
}
