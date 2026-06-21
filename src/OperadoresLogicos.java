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

    public boolean relacionDeIgualdad() {
        boolean resulatdo = i == j && k > l;
        return resulatdo;
    }

    

    public void mostrarResulatdos() {
        System.out.println("i == j && k > j: " + relacionDeIgualdad());
        
    }

    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127E-7f;
        double l = 2.1413E3;
        boolean m = false;

        OperadoresLogicos operLogicos = new OperadoresLogicos(i, j, k, l, m); 

        operLogicos.mostrarResulatdos();
    }
}
