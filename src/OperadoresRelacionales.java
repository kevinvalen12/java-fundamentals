public class OperadoresRelacionales {
    public int i;
    public byte j;
    public float k;
    public double l;
    public boolean m;

    public OperadoresRelacionales(
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

    public boolean relacionDeIgualdad() {
        boolean resulatdo = i == j;
        return resulatdo;
    }

    public boolean negacion() {
        return !relacionDeIgualdad();
    }

    public boolean relacionDeNegacion() {
        boolean resulatdo = i != j;
        return resulatdo;
    }

    public boolean comparacionBooleanos() {
        boolean resulatdo = m == true;
        return resulatdo;
    }

    public boolean negacionBooleanos() {
        boolean resulatdo = m != true;
        return resulatdo; 
    }

    public boolean mayorQue() {
        boolean resulatdo = i > j;
        return resulatdo;
    }

    public boolean menorQue() {
        boolean resulatdo = j < i;
        return resulatdo;
    }

    public boolean mayorIgualQue() {
        boolean resulatdo = l >= k;
        return resulatdo;
    }

    public boolean menorIgualQue() {
        boolean resulatdo = l <= k;
        return resulatdo;
    }

    public void mostrarResulatdos() {
        System.out.println("i == j: " + relacionDeIgualdad());
        System.out.println("negacion " + negacion());
        System.out.println("i != j: " + relacionDeNegacion());
        System.out.println("m == true: " + comparacionBooleanos());
        System.out.println("i != true: " + negacionBooleanos());
        System.out.println("i > j: " + mayorQue());
        System.out.println("i < j: " + menorQue());
        System.out.println("i >= j: " + mayorIgualQue());
        System.out.println("i <= j: " + menorIgualQue());
    }

    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127E-7f;
        double l = 2.1413E3;
        boolean m = false;

        OperadoresRelacionales operRelacional = new OperadoresRelacionales(i, j, k, l, m); 

        /*
            ? yo pensabe que tiena que llamar el metodo relacionDeIgualdad() para que se ejecutara pero
            * porque el metodo mostrarResulatdos() hay se ejecuta lo llama e se ejecuta 

            ! operRelacional.relacionDeIgualdad()
            * System.out.println("i == j: " + relacionDeIgualdad());
        */
        operRelacional.mostrarResulatdos();
    }
}
