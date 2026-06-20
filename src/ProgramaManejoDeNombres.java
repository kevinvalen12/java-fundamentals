public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
         String intregrante1 = args[0];
        String intregrante2 = args[1];
        String intregrante3 = args[2];

        String nuevo1 = intregrante1.substring(1, 2).toUpperCase() + "." + intregrante1.substring(intregrante1.length() - 2);

        String nuevo2 = intregrante2.substring(1, 2).toUpperCase() + "." + intregrante2.substring(intregrante2.length() - 2);

        String nuevo3 = intregrante3.substring(1, 2).toUpperCase() + "." + intregrante3.substring(intregrante3.length() - 2);

        String resultado = nuevo1 + "_" + nuevo2 + "_" + nuevo3;

        System.out.println(resultado);
    }
}
