public class EjemploStringValidar {
    public static void main(String[] args) {
        
        String curso = null;

        boolean esNull = curso == null;
        System.out.println(esNull);

        if(esNull) {
            curso = " Programación java";
        }

        // retorna un inetero con la cantidad de caracteres
        boolean esVacio = curso.length() == 0;
        System.out.println(esVacio);
        
        boolean esVacioDos = curso.isEmpty();
        System.out.println(esVacioDos);
        
        boolean esBlaco = curso.isBlank();
        System.out.println(esBlaco);
        
        // retorna true si esta vacio o tiene un espacio en blanco
        // pero tiene un poblema si el inico tiene un espacio lo va retornar true
        if(esBlaco) {
            System.out.println(curso.toUpperCase()); 
            //System.out.println(curso.concat(" Bienvenido al  curso ".concat(curso)));
            System.out.println("Bienvenido al  curso ".concat(curso));
        }
        
        
    
    }
}
