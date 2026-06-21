public class OperadoresLogicos {
    public int i;
    public byte j;
    public float k;
    public double l;
    public boolean m;

    public OperadoresLogicos(
        int i,
        byte j,
        float k,
        double l,
        boolean m
    ) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m; 

    }

    public boolean operadorAnd() {
        boolean resulatdo = i == j && k < l && !m;
        return resulatdo;
    }

    public boolean operadorOr() {
        boolean resulatdo = i == j || k < l;
        return resulatdo;
    }

    public boolean operadorAndOr() {
        boolean resultado = i == j && (k > l || !m);
        return resultado; 
    }

    public boolean bCuatro() {
        /*
            TODO: en este la mayoria de veces el codigo se ejecuta de izquierda a derecho
            TODO: como el AND(&&) tiene prioridad que el OR(||) primeor se ejecua
                            * k < l && !m  ! imverte el valor ya no seria false sino true 
            ? y el resultado para a hacer la comparacion con
                            * i == j ||

        */
        boolean resulatdo = i == j || k < l && !m;
        return resulatdo;
    }

    /*
        TODO: siempre va a tener prioridad el AND(&&) antes que OR(||)
    */
    public void mostrarResulatdos() {
        System.out.println("i == j && k < j && l && m == true: " + operadorAnd());
        System.out.println("i == j || k > l: " + operadorOr());
        System.out.println("i == j && k > l || m: " + operadorAndOr());
        System.out.println("i == j && k > l || m: " + bCuatro());
    }

    public static void main(String[] args) {
        int i = 3;
        byte j = 3;
        float k = 127E-7f;
        double l = 2.1413E3;
        boolean m = false;

        OperadoresLogicos operLogicos = new OperadoresLogicos(i, j, k, l, m); 

        operLogicos.mostrarResulatdos();
    }
}
