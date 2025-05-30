import java.util.Scanner;

public class ejercicio1c {
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero1 = input.nextInt();
        System.out.println("digite otro numero");
        int numero2 = input.nextInt();

        if (numero1>numero2) {
            System.out.println("se hace suma y resta");
            int suma = (numero1+numero2);
            int resta=(numero1-numero2);
            System.out.println("El total de la suma es "+suma+" total de la resta "+resta);
        }
        if (numero1<numero2) {
            System.out.println("Se multiplica y se divide");
            int multiplicacion = (numero1*numero2);
            double division = (numero1/numero2);
            System.out.println("el total de la multiplicacion es "+multiplicacion+ " el total de la division "+division);
        }
    }

    
    }

