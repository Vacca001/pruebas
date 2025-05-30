import java.util.Scanner;

public class ejercicio2c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite nota");
        float numero1 = input.nextInt();
        System.out.println("digite nota");
        float numero2 = input.nextInt();
        System.out.println("digite nota");
        float numero3 = input.nextInt();

        float suma = (numero1+numero2+numero3);
        float division = (suma/3);
        System.out.println("El total de la nota es "+division);
        if (division>6) {
            System.out.println("Promocionado");
        }
    }
}
