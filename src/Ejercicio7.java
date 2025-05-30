import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("digita un numero hasta de 3 cifras");
        double numero = scanner.nextInt();
        if (numero > 0 || numero < 10) {
            System.out.println("tiene 1 cifra");
        } 
        else if (numero>10 || numero<100) {
            System.out.println("Tiene 2 cifras");
            
        }
        else if (numero>0 || numero <1000) {
            System.out.println("tiene 3 cifras");
            
        }
        else if (numero>0 || numero<10000) {
            System.out.println("Escriba numero de 3 cifras.");

        }
         
        
        
    }
}
