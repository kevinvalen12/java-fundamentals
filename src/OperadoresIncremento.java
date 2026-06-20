public class OperadoresIncremento {
    public int i;
    public int j;

    public OperadoresIncremento(int i, int j) {
        this.i = i;
        this.j = j;
    }

    /*
        ----------------------------------
        ? METODOS PARA HACER REALIZAR OPERADORES INCREMENTO O DECREMENTO
        -----------------------------

        * para saber cuando necesita pasar lo parametro que va a recibir 
        * es cuando cuando en el objeto no tiene lo que necesiatas
    */

    
    public void incremento() {
        i++;
        ++j;
    }

    public void decremento() {
        i--;
        --j;
    }

    /* 
        -----------------------------------------
        ? METODO PARA IMPRIMIR LOS RESULTADOS DE 
        ------------------------------------------


        * un ejemplo cuando se requier pasar los parametros 
        * como el nombre no es en el objeto se entonce necesita recibir el parametro 
    */
    
    public void mostrarDatos(String incrementI, String IncrementJ) {
        System.out.println("\n" + incrementI);
        System.out.println("i = " + i + "\n");

        System.out.println("\n" + IncrementJ);
        System.out.println("j = " + j + "\n");

    }

    public static void main(String[] args) {
        int i = 45;
        int j = 65;
        String incrementpI = "incremento i";
        String incrementpJ = "incremento j";

        OperadoresIncremento operadoresIncremento = new OperadoresIncremento(i, j);

        operadoresIncremento.incremento();        
        operadoresIncremento.mostrarDatos(incrementpI, incrementpJ);
        
        operadoresIncremento.decremento();
        operadoresIncremento.mostrarDatos(incrementpI, incrementpJ);

    }
}
