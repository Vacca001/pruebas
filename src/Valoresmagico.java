public class Valoresmagico {
    //porcentaje del descuento de 0.15
    //porcentaje del iva de 0.19
    public static void main(String[] args) {
                double precioBase = 100;
                double descuento = precioBase * 0.15; // Valor mágico
                double iva = precioBase * 0.19; // Valor mágico
                double precioFinal = precioBase - descuento + iva;
                System.out.println("El precio final es: " + precioFinal);
       }
  } 




