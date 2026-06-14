import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemasNumericoScanner {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Ingrese un nuemro entero");
      String numString = scanner.nextLine();
      System.out.println("ingresa tu nombre");
      String tuNombre = scanner.nextLine();
      int numeroDecimal = 0;
      

      try{
        numeroDecimal = Integer.parseInt(numString);
      } catch(InputMismatchException e ) {
        System.out.println("Error debeb de ingresar un Numero");
        main(args);
        System.exit(0);
      }
      
      System.out.println("numeroDecimal = " + numeroDecimal);

      String nombre = metodoNombre(tuNombre);
      System.out.println("tu nombres es: " + nombre);
        
      // combertir un numero en binario
      String mensajeBinario = "numero binario de ";
      String mensajeComversionBinario = comvertirBinario(mensajeBinario, numeroDecimal);
      System.out.println(mensajeComversionBinario);

      String mensajeOctal = "numero octal de ";
      String mensajeCombercioOctal = comvertirOctal(mensajeOctal, numeroDecimal);
      System.out.println(mensajeCombercioOctal);

    
      String mensajeHex = "numoer hexadecimal "; 
      String mensajeCombertirHex = comvertirHex(mensajeHex, numeroDecimal);
      System.out.println(mensajeCombertirHex);
      

      String mensaje = mensajeSistemaNumerico(mensajeComversionBinario, mensajeCombercioOctal, mensajeCombertirHex);
      System.out.println(mensaje);
    }

    // cree este metodo aplican poco de concimiento de POO de typescriptah
    public static String metodoNombre(String nombre) {
        String nombreMayuscula = nombre.toUpperCase();
        return nombreMayuscula;
    }

    public static String comvertirBinario(String mensaje, int valorResivido) {
        return mensaje + valorResivido + " = " + Integer.toBinaryString(valorResivido);
    }

    public static String comvertirOctal(String mensaje, int valorResivido) {
        return mensaje + valorResivido + " = " + Integer.toOctalString(valorResivido);
    }

    public static String comvertirHex(String mensaje, int valorResivido) {
        return mensaje + valorResivido + " = " + Integer.toHexString(valorResivido);
    }

    public static String mensajeSistemaNumerico(String mensajeB, String mensajeO, String mensajeH) {
        String mensaje = mensajeB;
        char saltoLinea = '\n';
        mensaje += saltoLinea + mensajeO;
        mensaje += saltoLinea + mensajeH;

        return mensaje;
    } 
}
