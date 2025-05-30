import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese el primer numero ");
        float numero1 = input.nextInt();
        System.out.println("ingrese el segundo numero ");
        float numero2 = input.nextInt();
        System.out.println("ingrese el tercer numero ");
        float numero3 = input.nextInt();
        float media = (numero1 + numero2 + numero3) / 3;
        System.out.print("el promedio es de " + media);

    }
}
