import javax.swing.JOptionPane;

public class SistemasNumericos {
    public static void main(String[] args) {

      String numString =JOptionPane.showInputDialog(null, "Ingrese un nuemro entero");
      String tuNombre = JOptionPane.showInputDialog("ingresa tu nombre");
      int numeroDecimal = 0;
      

      try{
        numeroDecimal = Integer.parseInt(numString);
      } catch(NumberFormatException e ) {
        JOptionPane.showMessageDialog(null, "Error debeb de ingresar un Numero");
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

      // combertir un binario en a numerico
      //para dicr que este valor binario al incio se poner 0b
      int numeroBinario =  0b111110100;
      System.out.println(numeroBinario);

      String mensajeOctal = "numero octal de ";
      String mensajeCombercioOctal = comvertirOctal(mensajeOctal, numeroDecimal);
      System.out.println(mensajeCombercioOctal);
      int numeroOctal = 0764;
      System.out.println(numeroOctal);
    
      String mensajeHex = "numoer hexadecimal "; 
      String mensajeCombertirHex = comvertirHex(mensajeHex, numeroDecimal);
      System.out.println(mensajeCombertirHex);
      int numeroHex = 0x1f4;
      System.out.println(numeroHex);

      String mensaje = mensajeSistemaNumerico(mensajeComversionBinario, mensajeCombercioOctal, mensajeCombertirHex);
      JOptionPane.showMessageDialog(null, mensaje);
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
