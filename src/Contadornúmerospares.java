public class Contadornúmerospares {
    public static void main(String[] args) {
        //se extablece un contador.
        int contador = 0;

        //se crea el for.
        for (int inicio = 1; inicio <= 100; inicio++) {
            if (inicio % 2 == 0) {
                System.out.println(" numero par: " + inicio);
                contador ++;
            }
        }

        //se imprime el resultado.
        System.out.println("Los cantidad numeros primos entre 1 y 100 son: " + contador);
    }
    
}
