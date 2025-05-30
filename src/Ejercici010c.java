import java.util.Scanner;

public class Ejercicio9c {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Digite numero de preguntas");
       float preguntas = input.nextFloat();
       System.out.println("Digite respuestas correctas");
       float correctas = input.nextFloat();

       float division= (correctas/preguntas);
       float porcentaje=(division*100);

       if (porcentaje<50) {
        System.out.println(porcentaje+" esta fuera de nivel");
       }else if (porcentaje<75) {
        System.out.println(porcentaje+" nivel regular");
       }else if (porcentaje<90) {
        System.out.println(porcentaje+" nivel medio");
       }else if (porcentaje>90) {
        System.out.println(porcentaje+" nivel maximo");
       }
    }
}