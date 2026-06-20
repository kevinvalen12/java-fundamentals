public class EjemploStringMetodoArreglos {
    public static void main(String[] args) {
        String pruebas = "camaa esta vija";
        char[] arrayPalabra = convertirArray(pruebas);
        int dato = obtenerCantidad(arrayPalabra);
        char[] datosUltimos = bucleParaArray(arrayPalabra, dato);
        int[] posicion = obtenerPosiciones(dato);
        
        
        for (int finalCompleto : posicion) {
            System.out.println("ver todo los datos: " + datosUltimos[finalCompleto]);
        }  
    }

    // Copia los datos a un nuevo array con el tamaño exacto
    public static char[] bucleParaArray(char[] arrayTodo, int dato) {
        char[] vacio = new char[dato];
        for (int i = 0; i < dato; i++) {
            vacio[i] = arrayTodo[i];
        }
        return vacio;
    }

    // Convierte un String en un array de tipo char
    public static char[] convertirArray(String pruebas) {
        return pruebas.toCharArray();
    }

    // Cuenta cuántas letras o espacios tiene el array
    public static Integer obtenerCantidad(char[] convertirArray) {
        return convertirArray.length;
    }
    
    // me falto Genera un array con los números de las posiciones
    public static int[] obtenerPosiciones(int tamaño) {
        int[] posiciones = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            posiciones[i] = i;
        }
        return posiciones;
    }
}
