import java.util.Scanner;

public class ejercicio7cc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite numero de 1 o 2 o 3 cifras");
        int numero = input.nextInt();

        if (numero<10) {
            System.out.println("Tiene un solo digito");
        }else if (numero<100) {
            System.out.println("tiene dos digitos");
        }else if (numero<1000) {
            System.out.println("tiene 3 digitos");
            
        }else if (numero>999) {
            System.out.println("error");
        }
    }
}
