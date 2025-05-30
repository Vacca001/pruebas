import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        double [] notas = new double [5];

        System.out.println("ingrese las 5 notas del alumno (entre 0 y 10):");
        for (int i =0; i < notas.length; i++){
            do {
                System.out.println("nota"+(i + 1)+":");
                notas[i]=Scanner.nextDouble();
                if (notas[i] < 0|| notas[i]>10){
                    System.out.println("error: la nota debe estar entre 0 y 10.");

                }
            }while (notas[i]<0|| notas[i]>10);
        }
        double suma =0;
        double notaMaxima=notas[0];
        double notaMinima=notas[0];

        for (double nota : notas){
            suma += nota;
            if (nota > notaMaxima){
                notaMaxima=nota;
            }
            if (nota < notaMinima){
                notaMinima = nota;
            }
        }
        double notaMedia=suma/ notas.length;

        System.out.println("\nNotas ingresadas:");
        for (double nota :notas){
            System.out.println(nota +"");

        }
        System.out.println("\nNota media: " + notaMedia);
        System.out.println("nota mas alta "+ notaMaxima);
        System.out.println("nota mas baja"+ notaMinima);


        Scanner.close();
        
    }
}
