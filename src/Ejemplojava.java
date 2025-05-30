import java.util.Scanner;

public class Ejemplojava {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("hola mundo");
        System.out.print("Imgrese su nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = input. nextInt();

        System.out.println("hola, " + nombre + ", Tienes" + edad + " años. ");

        System.out.println("Chupame las bolas");
        
    }
}
