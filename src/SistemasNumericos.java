public class SistemasNumericos {
    public static void main(String[] args) {

      int numeroDecimal = 500;
      System.out.println("numeroDecimal = " + numeroDecimal);

      // combertir un numero en binario
      System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

      // combertir un binario en a numerico
      //para dicr que este valor binario al incio se poner 0b
      int numeroBinario =  0b111110100;
      System.out.println(numeroBinario);

      System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));
      int numeroOctal = 0764;
      System.out.println(numeroOctal);

      System.out.println("numoer hexadecimal " + numeroDecimal + " = " + Integer.toHexString(numeroBinario));
      int numeroHex = 0x1f4;
      System.out.println(numeroHex);
    }
}
