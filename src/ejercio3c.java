import java.util.Scanner;

public class ejercio3c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite un numero de uno o dos cifras");
        int numero = input.nextInt();

        if (numero<9) {
            System.out.println("tiene un digito");    
        }else if (numero<99) {
            System.out.println("tiene dos digitos");
        }
    }
}
