public class PrimitivosCaracteres {
    public static void main(String[] args) {

        // solo permite un caracter
        char caracter = 'A';
        char caracterD = '4';
        var caracterUnicode = '\u0040';
        char decimal = 64;
        System.out.print("Cracter " + caracter);
        System.out.print("Cracter " + caracterD + "\n");
        System.out.print("Cracter " + caracterUnicode + "\n");
        System.out.print("decimal = caracter  " + (decimal == caracterUnicode));

        char simbolo = '@';
        char espacio = '\u0020';
        char saltoDeLinea = '\n';
        char retorceso = '\b';
        char tabulador = '\t';
        char retornoCarro = '\r';
        //System.getProperty("line.separator")
        System.out.print("\nsimbolo = " + simbolo );
        System.out.print("\nsimbolo = caracter " + (simbolo == caracterUnicode));
        System.out.print("Double corresponde en \tbyte:" + System.lineSeparator() + Character.BYTES + saltoDeLinea);
        System.out.print("Character corresponde en bits:" + espacio + Character.SIZE + "\n");
        System.out.print("maximo valor para Character:" + espacio + Character.MAX_VALUE + saltoDeLinea);
        System.out.print("minimo valor para Character:" + espacio + Character.MIN_VALUE + "\n");
    }
}
