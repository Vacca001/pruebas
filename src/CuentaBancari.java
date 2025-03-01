public class CuentaBancari {
    public static void main(String[] args) {
        
        
        double saldoInicial = 1000; 
        double retiroPorSemana = 200; 
        int semanas = 4; 
        
      
        double totalRetirado = retiroPorSemana * semanas;
        
        
        double saldoFinal = saldoInicial - totalRetirado;
        
        
        System.out.println("el saldo final de la cuenta es de  $" + saldoFinal);
    }
    
}
