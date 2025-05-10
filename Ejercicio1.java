public class Ejercicio1 {

    



public static void intercambiar(int a, int b) {
    int tempa = a;
    a=b ;
    b = tempa;
    System.out.println("Dentro del metodo : a = " + a + ", b = " + b);
}
public static void main(String[] args) {
    int a = 5;
        int b = 10;
        System.out.println("Antes de llamar al método: a = " + a + ", b = " + b);
        intercambiar(a, b);
        System.out.println("Después de llamar al método: a = " + a + ", b = " + b);
    }



}



 

