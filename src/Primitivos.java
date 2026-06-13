public class Primitivos {
     /*
        ------------------------------------
            Tipo de datos primitivos
        ------------------------------------
        */

    // son un tipo de dato que solo tiene un valor

    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.print("numero byte el mas pequeño" + 7);
         // ver el valor se soporta byte
        System.out.print("tipo byte coresponde en byte a" + Byte.BYTES);
        System.out.print(" tipo byte coresponde en byte a " + Byte.SIZE);
        System.out.print(" valor maximo de un byte"  + Byte.MAX_VALUE);
        System.out.print("  rvalor minimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        // ver el valor se soporta short
        System.out.print(" tipo short coresponde en short a" + Short.BYTES);
        System.out.print(" tipo short coresponde en short a " + Short.SIZE);
        System.out.print(" valor maximo de un short"  + Short.MAX_VALUE);
        System.out.print(" valor minimo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.print("numero byte el mas pequeño" + numeroInt);
        // ver el valor se soporta Int
        System.out.print(" tipo Int coresponde en Int a" + Integer.BYTES);
        System.out.print(" tipo Int coresponde en Int a " + Integer.SIZE);
        System.out.print(" valor maximo de un Int"  + Integer.MAX_VALUE);
        System.out.print(" valor minimo de un Int " + Integer.MIN_VALUE);

        long numoerLong = 9223372036854775807L;
         System.out.print("numero Long el mas pequeño" + numoerLong);
        // ver el valor se soporta Int
        System.out.print(" tipo Long coresponde en Long a" + Long.BYTES);
        System.out.print(" tipo Long coresponde en Long a " + Long.SIZE);
        System.out.print(" valor maximo de un Long"  + Long.MAX_VALUE);
        System.out.print(" valor minimo de un Long " + Long.MIN_VALUE);

        var numieroVar = 9223372036854775808F;


    }
}
