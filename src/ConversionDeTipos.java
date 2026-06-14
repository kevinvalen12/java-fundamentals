public class ConversionDeTipos {
    public static void main(String[] args) {

        // se puede tambien utilizar var 
        String numeroStri = "50";

        int numeroComvertido = Integer.parseInt(numeroStri);
        System.out.println("String comvertido int: " + numeroComvertido);

        String numeroDecimal = "235457.78E-3";
        double comvercionDecimal = Double.parseDouble(numeroDecimal);
        System.out.println("Srring comvertido: " + comvercionDecimal);

        String logicoStri = "FaLsE ";
        boolean comvercionBoolean = Boolean.parseBoolean(logicoStri);
        System.out.println(comvercionBoolean);

        // comvertir un entro
        int otroNumero = 100;
        String comvercionStri = Integer.toString(otroNumero);
        System.out.println("comvertir int a string: " + comvercionStri);

        comvercionStri = String.valueOf(otroNumero+10);
        System.out.println("comvertir int a string: " + comvercionStri);

        Double otroReaDouble = 12345.45E-5;
        String otroRealStri = Double.toString(otroReaDouble);
        System.out.println("comversion de Double a String: " + otroRealStri);

        otroRealStri = String.valueOf(1.23456F);
        System.out.println("comversion de Double a String: " + otroRealStri);

        // comvertir un int a short
        int i = 22767;
        // forsar la comversion 
        short s = (short)i;
        System.out.println(s + " tipo de dato " + ((Object) s).getClass().getSimpleName());
        System.out.println(Short.MAX_VALUE);
        long l = i;
        System.out.println(l + " tipo de dat0 " + ((Object) l).getClass().getSimpleName());
        
    }
}
  