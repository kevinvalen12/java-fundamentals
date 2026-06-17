public class EjemploStringExtencionArchivo {

    public static void main(String[] args) {
        String archivo = "alguna.imagen.json";
        
        int cantidadCaracteres = cantidadDecaracteres(archivo);
        System.out.println("archivo.length()" + cantidadCaracteres); 
        
        String caractereUltimos = ultimosCaracteres(archivo);
        System.out.println("archivo.substring(14)" + caractereUltimos);

        String autoUltimos = ultimosCaracteresAuto(archivo);
        System.out.println("archivo.substring(archivo.length()-4)" + autoUltimos);

        String obtenerArchivo = ultimosCaracte(archivo);
        System.out.println(obtenerArchivo);

        String obtenerUltimoFin = caracteFin(archivo);
        System.out.println(obtenerUltimoFin);
    }

    public static Integer cantidadDecaracteres(String archivo) {
        return archivo.length();
    }

    public static String ultimosCaracteres(String archivo) {
        return archivo.substring(14);
    }

    public static String ultimosCaracteresAuto(String archivo) {
        return archivo.substring(archivo.length()-4);
    }

    // metodo para obtener lo valores despues el punto
    public static String ultimosCaracte(String archivo) {
        int posicionPunto = punto(archivo);
        return archivo.substring(posicionPunto);
    }

    // metodo para otener la posicion del punto
    public static Integer punto(String archivo) {
        return archivo.indexOf(".");
    }

    public static String caracteFin(String archivo) {
        int posicionPunto = puntoMejor(archivo);
        return archivo.substring(posicionPunto);
    }
    
    // pero puede fallar si el punto mucho antes para eso se puede utilizar lastINdexOf
    public static Integer puntoMejor(String archivo) {
        // busco la ultima currencia
        return archivo.lastIndexOf(".");
    }

    // ABSTRACCIÓN ->  Ocultar los detalles complicados y mostrar solo lo que importa.
    // es no mostrar la complejidad de un metodo 

    // ENCAPSULAMIENTO -> Esconder los datos internos y controlar cómo se accede a ellos.
}
     
    