
public class TiendaRopa {
    public static void main(String[] args) {
        double precioCamiseta = 25;
        double precioPantalon = 30;

       
        double descuento = 0.15;
        double precioCamisetaConDescuento = precioCamiseta * ( descuento);
        double precioPantalonConDescuento = precioPantalon * ( descuento);

     
        double descuentoAdicional = 0.05;
        double precioSegundaCamiseta = precioCamisetaConDescuento * (descuentoAdicional);

        
        double precioTotal = precioCamisetaConDescuento + precioPantalonConDescuento + precioSegundaCamiseta;

       
        System.out.println("Precio camiseta con descuento: $" + precioCamisetaConDescuento);
        System.out.println("Precio pantalón con descuento: $" + precioPantalonConDescuento);
        System.out.println("Precio segunda camiseta con descuento adicional: $" + precioSegundaCamiseta);
        System.out.println("Precio total después de todos los descuentos: $" + precioTotal);
    }
    
}
