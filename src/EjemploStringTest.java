public class EjemploStringTest {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        // StringBuilder si es mutable puede ir cambiando
        StringBuilder sd = new StringBuilder(a);
        long calcualarTiempoCreacion = calcualarTiempo(a, b, c, sd);

        System.out.println(calcualarTiempoCreacion);
    }

    public static long calcualarTiempo(String a, String b, String c, StringBuilder sd){
        long inicio = System.currentTimeMillis();
        
        for(int i = 0; i < 1000; i++){
            c = c.concat(a).concat(b).concat("\n"); // 500 => 3ms, 1000 => 4ms
            //c += a + b; // 500 => 23ms, 1000 => 39ms
            //sd.append(a).append(b); // 500 => 0ms, 1000 => 1ms
        }
        
        long fincal = System.currentTimeMillis();


        return fincal - inicio;
    }
}