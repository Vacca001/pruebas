
import java.util.Scanner;

public class Cartademenu {
    public static void main(String[] args) {

        // se crea el scanner menu.
       Scanner menu = new Scanner(System.in);
        //Se imprime el menu.
        System.out.println("MENU");
        System.out.println("1.) suma. ");
        System.out.println("2.) resta. ");
        System.out.println("3.) multiplicasion. ");
        System.out.println("4.) divicion. ");
        System.out.println("seleccione por su respectivo numero:");
        byte obcion = menu.nextByte();

        menu.close();

        byte number1 = 78;
        byte number2 = 42;
        //Se hace la estructura.
        switch (obcion) {
            case 1 -> {
                int suma = number1 + number2;
                System.out.println("La suma de " + number1 + "+" + number2 + " es de: " + suma);
            }
            case 2 -> {
                int resta = number1 - number2 ;
                System.out.println("La resta de " + number1 + "-" + number2 + " es de: " + resta);
            }
            case 3 -> {
                int multiplicasion = number1 * number2;
                System.out.println("la multiplicasion de " + number1 + "*" + number2 + " es de: " + multiplicasion);
            }
            case 4 -> {
                double divicion = number1 / number2;
                System.out.println("La divicion de " + number1 + "/" + number2 + " es de: " + divicion);
            }
                
            default -> System.out.println("obcion de menu incorrecta!!!!");
        }
    }
}
