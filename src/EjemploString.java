public class EjemploString {
    public static void main(String[] args) {
        // el estring parace un primitivo pero no lo es, es un objeto
        // es un tipo especial
        String curso = "Programación Java";
        String cursoDos = new String("programación java");

        boolean esIgual = curso == cursoDos;
        boolean esIgualDos = curso.equals(cursoDos);
        boolean esIgualTres = curso.equalsIgnoreCase(cursoDos);
        System.out.println(esIgual);
        System.out.println(esIgualDos);
        System.out.println(esIgualTres);
    }
}