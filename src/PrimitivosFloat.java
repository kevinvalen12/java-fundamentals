public class PrimitivosFloat {
    // para que se puede utlizar un atributo o una variable de la clase
    // dentro de un metodo estatico el atributo tabien debe de ser estatico
    // por defeto default
    static float varFlotantePrueba;

    public static void main(String[] args) {

        System.out.print("-----------------------FLOUT-------------------------------------\n");
        // F le dice que es un valor de tipo flotante
        // E dice que corra la coma al aldo de la E se pone cuantas veces quiere correr la como
        // 1.5 se le conoce como matiza
        // el valor corespondiente se lle conoce como valor de punto fijo
        float realFloat = 0.00000000015F; // 1.5E-10F; 1.5e4F; 2.12E3F; 2120F
        char saltoDeLinea = '\n';
        System.out.print(realFloat + "\n");
        System.out.print("Float corresponde en byte A = " + Float.BYTES + "\n");
        System.out.print("floaat corresponde en bits a = " + Float.SIZE + saltoDeLinea);
        System.out.print("maximo valor para float = " + Float.MAX_VALUE + "\n");
        System.out.print("minimo valor para float = " + Float.MIN_VALUE + saltoDeLinea);

        System.out.print("\n\n-----------------------DOUBLE-------------------------------------\n");

        // por efecto es doble por eso no hay que indicarle que es un double al final
        double realDouble = 3.4028235E38;
        System.out.print("Double corresponde en byte A = " + Double.BYTES + "\n");
        System.out.print("Double corresponde en bits a = " + Double.SIZE + "\n");
        System.out.print("maximo valor para Double = " + Double.MAX_VALUE + "\n");
        System.out.print("minimo valor para Double = " + Double.MIN_VALUE + "\n");

        System.out.print("\n\n-----------------------VAR FLOAT-------------------------------------\n");
        var varFlotante = 3.2343F;
        var varFlotanteD = 3.2343;
        System.out.print("varFlotante = " + varFlotante + "\n");
        System.out.print("varFlotanteD = " + varFlotanteD);

        // si esto va a marcar ello porque si tiene que icializar
        /*
        float varFlotantePrueba;
        System.out.print(varFlotantePrueba);
        */
        System.out.print("\nvalor = " + varFlotantePrueba);
    }
}
