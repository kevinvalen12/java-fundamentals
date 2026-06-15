public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Gusman";

        // concat retorna una nueva instacia no modifica a curso 
        String resultado = curso.concat(profesor);
        System.out.println(curso);
        System.out.println(resultado);
        System.out.println(curso == resultado);

        // expreciones lambda
        String resulatdoDos = curso.transform(c -> {
            return c + " con " + profesor;
        });

        System.out.println(resulatdoDos);

        String resulatdoTres = resulatdoDos.replace("a", "A");
        System.out.println(resulatdoTres);
    }
}  