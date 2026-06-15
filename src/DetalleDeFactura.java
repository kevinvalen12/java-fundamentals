import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la factura");
        String nombreFacura = scanner.nextLine();
        
        double primerPrecio = 0;
        double segundoPrecio = 0;

        try {
            System.out.println("Primer valor de factura");
            primerPrecio = scanner.nextDouble();
            System.out.println("segundo valor de factura");
            segundoPrecio = scanner.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println("Error debeb de ingresar un Numero Double");
            main(args);
            System.exit(0);
        }

        double sumaDeProdcutos = sumaTotal(primerPrecio, segundoPrecio);
        double ivaProducto = iva(sumaDeProdcutos);
        double precioTotal =  sumaTotalIva(sumaDeProdcutos, ivaProducto);

        System.out.println("La Factura" + nombreFacura + " verduraproducto de oficina tiene un total bruto de " + 
        sumaDeProdcutos + " con el inpuesto de " +  ivaProducto + " y el monto después de impuesto es de " + precioTotal);
        
    }

    public static Double sumaTotal(double valorUno, double valorDos){
        return valorUno + valorDos;
    }

    public static Double iva(double totalProducto) {
        double iva = 0.19;
        return totalProducto * iva;
    }

    public static Double sumaTotalIva(double total, double iva) {
        return total + iva;
    }
}
