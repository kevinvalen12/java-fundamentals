public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Gusman";

        String detalle = curso + "con el instructor " + profesor;
        System.out.println(detalle);

        // concatencion enteros
        int numoerA = 10;
        int numeroB = 5;

        // como hay una cadena primero contanerara todo osea que no sumara ni a y b
        // respuesata = Programación Javacon el instructor Andres Gusman105
        // las expreciones se va evalueando de izquierda a derecha
        System.out.println(detalle + numoerA + numeroB);

        // utilizando lo parenticis sumara los valores
        // siempre los parenticis tiene preferencia
        System.out.println(detalle + (numoerA + numeroB));
    
        System.out.println(numoerA + numeroB + detalle);

        // otra forma de concatenacion
        // los string son imutables 
        // inmutable es aquel cuyo estado, valor o contenido no se puede modificar después de haber sido creado
        String detalleDos = curso.concat(" " + profesor);
        String detalleTres = curso.concat(" con ".concat(profesor));
        String detalleCuatro = curso.concat(" con ").concat(profesor);
        System.out.println(detalleDos);
        System.out.println(detalleTres);
        System.out.println(detalleCuatro);
    }
}  